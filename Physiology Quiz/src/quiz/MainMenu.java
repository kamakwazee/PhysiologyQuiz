package quiz;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

import panels.Ch5Vocab;
import panels.LateralSkull;


public class MainMenu extends JPanel
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -564092572158988199L;
	private static JButton ls,ss,is,as,vq, vd;
	private static JCheckBox cb; //Color blind
	private static boolean colorblind = false;
	
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
		
		ls = new JButton("Lateral Skull");
		ls.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel,new LateralSkull(pane,colorblind));
					
				}
				
			}
			
		);
		
		ls.setBounds(340,50,200,50);
		add(ls);
		
		vq = new JButton("Chapter 5 Vocab Quiz");
		vq.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel, new Ch5Vocab(pane,colorblind,false));
					
				}
				
			}
		);
		
		vq.setBounds(340,110,200,50);
		add(vq);
		
		vd = new JButton("Chapter 5 Definitions");
		vd.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel, new Ch5Vocab(pane,colorblind,true));
					
				}
				
			}
		);
		
		vd.setBounds(340,170,200,50);
		add(vd);
		
	}
	
}