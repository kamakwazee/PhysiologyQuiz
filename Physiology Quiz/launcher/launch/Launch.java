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
			downloadVersion.Download(new URL("http://kamakwazee.net/bonequiz/version.txt"), new File("update.txt"), "Checking for Updates");
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File f = new File("version.txt");
		if(!f.exists())
		{
			
			try {
				Downloader downloadProgram = new Downloader("Downloading Bone Quiz");
				downloadProgram.setSize(620,300);
				downloadProgram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				downloadProgram.setVisible(true);
				downloadProgram.Download(new URL("http://kamakwazee.net/bonequiz/BoneQuiz.zip"),new File("BoneQuiz.zip"),"Downloading Bone Quiz");
				install();
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
				downloadUpdates.Download(new URL("http://kamakwazee.net/bonequiz/BoneQuiz.zip"), new File("BoneQuiz.zip"), "Downloading Updates");
				install();
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
				runProgram();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		

	}
	
	private static void install()
	{
		
		Installer installProgram = new Installer("Installing Bone Quiz","BoneQuiz.zip");
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
		
		File zip = new File("BoneQuiz.zip");
		
		do
		{
			
			zip.delete();
			
		}while(zip.exists());
		
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
