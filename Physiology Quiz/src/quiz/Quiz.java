package quiz;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import panels.Ch5Vocab;

public class Quiz{

	public static JFrame jf;
	public static JPanel mm;
	
	
	public static void main(String args[])
	{
		jf = new JFrame("Physiology Quiz");
		mm = new MainMenu(jf.getContentPane());
		mm.setBackground(Color.WHITE);
		jf.setSize(900,700);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBackground(Color.WHITE);
		jf.getContentPane().setBackground(Color.WHITE);
		jf.getContentPane().add(mm);
		jf.setVisible(true);
		
	}
	
	public static void setPanel(JPanel cp, JPanel np)
	{
		
		jf.remove(cp);
		jf.add(np);
		jf.revalidate();
		jf.repaint();
		
	}
	
	
}
