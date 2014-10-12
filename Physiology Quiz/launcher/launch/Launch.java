package launch;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Launch {

	public static void main(String[] args) {
		String error, error2;
		
		try {
			Downloader downloadVersion = new Downloader("Checking for Updates");
			downloadVersion.setSize(620,300);
			downloadVersion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			downloadVersion.setVisible(true);
			downloadVersion.Download(new URL("http://kamakwazee.net/physiologyquiz/version.txt"), new File("update.txt"), "Checking for Updates");
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File f = new File("version.txt");
		if(!f.exists())
		{
			
			try {
				Downloader downloadProgram = new Downloader("Downloading Physiology Quiz");
				downloadProgram.setSize(620,300);
				downloadProgram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				downloadProgram.setVisible(true);
				downloadProgram.Download(new URL("http://kamakwazee.net/physiologyquiz/PhysiologyQuiz.zip"),new File("PhysiologyQuiz.zip"),"Downloading Physiology Quiz");
				install();
				removeFiles();
				runProgram();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else if(!(error = fileToString(f)).equals(error2 = fileToString(new File("update.txt"))))
		{
			
			try {
				Downloader downloadUpdates = new Downloader("Downloading Updates");
				downloadUpdates.setSize(620,300);
				downloadUpdates.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				downloadUpdates.setVisible(true);
				downloadUpdates.Download(new URL("http://kamakwazee.net/physiologyquiz/PhysiologyQuiz.zip"), new File("PhysiologyQuiz.zip"), "Downloading Updates");
				install();
				removeFiles();
				runProgram();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else if(error.equals("Error") || error2.equals("Error"))
		{
			
			JOptionPane.showMessageDialog(null, "Error! Please contact Tabor Kvasnicka!");
			
		}
		else
		{
			
			try {
				removeFiles();
				runProgram();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	private static void removeFiles()
	{
		
		File zip = new File("PhysiologyQuiz.zip");
		File update = new File("update.txt");
		
		do
		{
			
			zip.delete();
			update.delete();
			
		}while(zip.exists() || update.exists());
		
	}
	
	private static void install()
	{
		
		Installer installProgram = new Installer("Installing Physiology Quiz","PhysiologyQuiz.zip");
		final Object lock = new Object();
		Thread t = new Thread()
		{
			public void run()
			{
				synchronized(lock)
				{
					while(installProgram.isVisible())
					{
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		};
		t.start();
		
		installProgram.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent we)
			{
				synchronized(lock)
				{
					installProgram.setVisible(false);
					lock.notify();
				}
			}
		});
		
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	
	private static void runProgram() throws IOException
	{
		
		Runtime.getRuntime().exec("java quiz.Quiz");
		
	}
	
	private static String fileToString(File f)
	{
		try
		{
			Scanner scan = new Scanner(f);
			
			String s = "";
			
			while(scan.hasNextLine())
			{
				
				s += scan.nextLine();
				
			}
			
			scan.close();
			
			return(s);
			
		}
		catch(FileNotFoundException e)
		{
			
			e.printStackTrace();
			
			return("Error");
			
		}
		
	}

}
