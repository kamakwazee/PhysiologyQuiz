package quiz;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

import vocab.VocabQuizButton;


public class MainMenu extends JPanel
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -564092572158988199L;
	private static JButton b;
	private static VocabQuizButton vq5,vq6,vq7;
	private static JCheckBox cb; //Color blind
	public static boolean colorblind = false;
	
	public MainMenu(Container pane)
	{
		JPanel panel = this;
		setLayout(null);
		
		cb = new JCheckBox("Color Blind Mode");
		cb.setBounds(100,50,cb.getMaximumSize().width,cb.getMaximumSize().height);
		cb.addItemListener(
			new ItemListener()
			{

				public void itemStateChanged(ItemEvent e) {
					
					if(cb.isSelected())
					{
						colorblind = true;
					}
					else
					{
						colorblind = false;
					}
					
				}
				
			}
		);
		add(cb);
		
		b = new JButton("Bones");
		b.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel,new BonesMenu(pane,colorblind));
					
				}
				
			}
			
		);
		
		b.setBounds(340,50,200,50);
		add(b);
		
		vq5 = new VocabQuizButton(pane,colorblind,"Chapter 5 Vocab Quiz",new File("resources" + File.separator + "Ch5Vocab.txt"));		
		vq5.setBounds(340,110,200,50);
		add((JButton)vq5);
		
		vq6 = new VocabQuizButton(pane, colorblind, "Chapter 6 Vocab Quiz", new File("resources" + File.separator + "Ch6Vocab.txt"));
		vq6.setBounds(340,170,200,50);
		add((JButton)vq6);
		
		vq7 = new VocabQuizButton(pane, colorblind, "Chapter 7 Vocab Quiz", new File("resources" + File.separator + "Ch7Vocab.txt"));
		vq7.setBounds(340,230,200,50);
		add((JButton)vq7);
		
	}
	
}