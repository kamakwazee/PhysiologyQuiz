package launch;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.URL;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

import org.apache.commons.io.IOUtils;


public class Downloader extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4237530638084074684L;
	public static JProgressBar bar;
	public static double totalSize;
	public static long current;
	public static int percentage;
	public static int loop = 0;
	
	private static class ProgressListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			current = ((DownloadCountingOutputStream) e.getSource()).getByteCount();
            percentage = (int) Math.round((current/totalSize)*100);
			changeBar(percentage);
			
		}
		
	}

	public Downloader(String dn) throws IOException{
		super (dn);
		bar = new JProgressBar();
		add(bar, BorderLayout.CENTER);
	}
	
	public void Download(URL dl, File fl, String dn) throws IOException{
		OutputStream os = null;
		InputStream is = null;
		ProgressListener progressListener = new ProgressListener();
		try{
			os = new FileOutputStream(fl);
			is = dl.openStream();
			DownloadCountingOutputStream dcount = new DownloadCountingOutputStream(os);
			dcount.setListener(progressListener);
			totalSize = Double.parseDouble(dl.openConnection().getHeaderField("Content-Length"));
			IOUtils.copy(is, dcount);
		}catch(UnknownHostException uhe){
			System.out.println("Unknown Host. Notify the host to verify that the site is not down.");
		}catch(ConnectException ce){
			System.out.println("Connection to server couldn't be established. Check your connection or contact host.");
		}
		finally{
			if (os != null) { 
                os.close(); 
            }
            if (is != null) { 
                is.close(); 
            }
            finish(dn);
		}
	}
	
	public static void changeBar(int p){
		bar.setValue(p);
		bar.setStringPainted(true);
		bar.update(bar.getGraphics());
	}
	
	public void finish(String dn){
		System.out.println("Finished " + dn);
		setVisible(false);
		dispose();
	}
	
}
