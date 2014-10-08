package quiz;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import panels.LateralSkull;


public class MainMenu extends JPanel
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -564092572158988199L;
	private static JButton ls,ss,is,as;
	
	public MainMenu(Container pane)
	{
		JPanel panel = this;
		setLayout(null);
		
		ls = new JButton("Lateral Skull");
		ls.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel,new LateralSkull(pane));
					
				}
				
			}
			
		);
		
		ls.setBounds(340,50,200,50);
		add(ls);
		
	}
	
}