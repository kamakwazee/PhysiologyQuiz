package quiz;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import panels.LateralSkull;

public class BonesMenu extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5986396967330163229L;
	static JButton ls,ss,is,as,back;
	public static JPanel panel;
	
	
	public BonesMenu(Container pane, boolean colorblind)
	{
		panel = this;
		setLayout(null);
		setBackground(Color.WHITE);
		pane.setBackground(Color.WHITE);
		
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
		
		back = new JButton("Back");
		back.setBounds(750,600,100,50);
		back.addActionListener(
				
			new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent e) {
					
					Quiz.setPanel(panel, Quiz.mm);
					
				}
				
			}
		
		);
		add(back);
		
	}

}
