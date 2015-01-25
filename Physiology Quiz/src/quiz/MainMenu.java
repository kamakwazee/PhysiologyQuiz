package quiz;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

import vocab.VocabQuizButton;


public class MainMenu extends JPanel
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -564092572158988199L;
	private static JButton b, ccb, wcb;
	public static Color cc, wc;
	private static VocabQuizButton vq5,vq6,vq7,vq8,vq9;;
	
	public MainMenu(Container pane)
	{
		JPanel panel = this;
		setLayout(null);
		cc = new Color(0,153,0);
		wc = Color.RED;
		
		ccb = new JButton("Correct Color");
		ccb.setForeground(cc);
		ccb.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					cc = JColorChooser.showDialog(MainMenu.this, "Choose Correct Color", cc);
					ccb.setForeground(cc);
					
				}
				
			}
		);
		ccb.setBounds(100,50,ccb.getMaximumSize().width,ccb.getMaximumSize().height);
		add(ccb);
		
		wcb = new JButton("Wrong Color");
		wcb.setForeground(wc);
		wcb.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					wc = JColorChooser.showDialog(MainMenu.this, "Choose Wrong Color", wc);
					wcb.setForeground(wc);
					
				}
				
			}
		);
		wcb.setBounds(100,60 + ccb.getMaximumSize().height,ccb.getMaximumSize().width,ccb.getMaximumSize().height);
		add(wcb);
		
		b = new JButton("Bones");
		b.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel,new BonesMenu(pane,cc,wc));
					
				}
				
			}
			
		);
		
		b.setBounds(340,50,200,50);
		add(b);
		
		vq5 = new VocabQuizButton(pane,"Chapter 5 Vocab Quiz",new File("resources" + File.separator + "Ch5Vocab.txt"));		
		vq5.setBounds(340,110,200,50);
		add((JButton)vq5);
		
		vq6 = new VocabQuizButton(pane, "Chapter 6 Vocab Quiz", new File("resources" + File.separator + "Ch6Vocab.txt"));
		vq6.setBounds(340,170,200,50);
		add((JButton)vq6);
		
		vq7 = new VocabQuizButton(pane, "Chapter 7 Vocab Quiz", new File("resources" + File.separator + "Ch7Vocab.txt"));
		vq7.setBounds(340,230,200,50);
		add((JButton)vq7);
		
		vq8 = new VocabQuizButton(pane, "Chapter 8 Vocab Quiz", new File("resources" + File.separator + "Ch8Vocab.txt"));
		vq8.setBounds(340,290,200,50);
		add((JButton)vq8);
		
		vq9 = new VocabQuizButton(pane, "Chapter 9 Vocab Quiz", new File("resources" + File.separator + "Ch9Vocab.txt"));
		vq9.setBounds(340,350,200,50);
		add((JButton)vq9);
		
	}
	
}