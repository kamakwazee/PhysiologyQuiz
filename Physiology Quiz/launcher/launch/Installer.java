package launch;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

public class Installer extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -537467660436744655L;
	public static JProgressBar bar;
	private static UnZipTask installtask;
	
	private class UnZipTask extends SwingWorker<Void, Integer>
	{
		
		private File source;
		private File target;
		private long totalBytes = 0L;
		private long copiedBytes = 0L;
		
		public UnZipTask(File source, File target)
		{
			this.source = source;
			this.target = target;
			
			changeBar(0);
		}

		@Override
		protected Void doInBackground() throws Exception {
			retrieveTotalBytes(source);
			unZipIt(source.getAbsolutePath(), target.getAbsolutePath());
			setProgress(100);
			return null;
		}
		
		public void retrieveTotalBytes(File sourceFile)
		{
			ZipInputStream zis;
			try {
				zis = new ZipInputStream(new FileInputStream(sourceFile));
				ZipEntry ze = zis.getNextEntry();
				
				while(ze != null)
				{
					if(!ze.isDirectory())
					{
						totalBytes += ze.getSize();
					}
					ze = zis.getNextEntry();
				}
				zis.closeEntry();
				zis.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		public void unZipIt(String zipFile, String outputFolder){
			
			
		     byte[] buffer = new byte[1024];
		 
		     try{
		    	//create output directory is not exists
		    	File folder = new File(outputFolder);
		    	if(!folder.exists()){
		    		folder.mkdir();
		    	}
		 
		    	//get the zip file content
		    	ZipInputStream zis = 
		    		new ZipInputStream(new FileInputStream(zipFile));
		    	//get the zipped file list entry
		    	ZipEntry ze = zis.getNextEntry();
		 
		    	while(ze!=null){
		    	   if(!ze.isDirectory())
		    	   {
			    	   String fileName = ze.getName();
			           File newFile = new File(outputFolder + File.separator + fileName);
			 
			 
			            //create all non exists folders
			            //else you will hit FileNotFoundException for compressed folder
			            new File(newFile.getParent()).mkdirs();
			 
			            FileOutputStream fos = new FileOutputStream(newFile);             
			 
			            int len;
			            while ((len = zis.read(buffer)) > 0) {
			            	fos.write(buffer, 0, len);
			            	copiedBytes += len;
			            	double progress = ((((double)copiedBytes / (double)totalBytes)) * 100);
			            	setProgress((int) progress);
			            }
			 
			            fos.close();
		    	   }
		    	   ze = zis.getNextEntry();
		    	}
		 
		        zis.closeEntry();
		    	zis.close();
		 
		    }catch(IOException ex){
		       ex.printStackTrace(); 
		    }
		}

		
	}

	private void terminate()
	{
		WindowEvent wev = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);
		setVisible(false);
		dispose();
	}
	
	public Installer(String n, String in)
	{
		super(n);
		setSize(640, 300);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		bar = new JProgressBar();
		add(bar,BorderLayout.CENTER);
		setVisible(true);
		
		Thread install = new Thread()
		{
			@Override
			public void run()
			{
				
				File source = new File(in);
				File target = new File(".");
				
				installtask = new UnZipTask(source, target);
				installtask.addPropertyChangeListener(new PropertyChangeListener()
				{
					@Override
					public void propertyChange(PropertyChangeEvent evt)
					{
						if("progress".equals(evt.getPropertyName()))
						{
							int progress = (Integer) evt.getNewValue();
							changeBar(progress);
							if(progress == 100)
							{
								terminate();
							}
						}
					}
				});
				installtask.execute();
			}
		};
		
		install.start();
	}
	
	public static void changeBar(int p)
	{
		
		bar.setValue(p);
		bar.setStringPainted(true);
		bar.update(bar.getGraphics());
		
	}

}
