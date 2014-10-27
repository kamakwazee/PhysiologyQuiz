package quiz;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import panels.AnteriorSkull;
import panels.Arm;
import panels.InferiorSkull;
import panels.LateralFetalSkull;
import panels.LateralSkull;
import panels.ShoulderGirdle1;
import panels.ShoulderGirdle2;
import panels.SuperiorFetalSkull;
import panels.SuperiorSkull;
import panels.Vertebra;

public class BonesMenu extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5986396967330163229L;
	static JButton sg1,sg2,arm,ls,lf,ss,sf,is,as,v,back;
	public static JPanel panel;
	
	
	public BonesMenu(Container pane, boolean colorblind)
	{
		panel = this;
		setLayout(null);
		setBackground(Color.WHITE);
		pane.setBackground(Color.WHITE);
		
		sg1 = new JButton("Shoulder Girdle 1");
		sg1.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel,new ShoulderGirdle1(pane,colorblind));
					
				}
				
			}
			
		);
		
		sg1.setBounds(130,50,200,50);
		add(sg1);
		
		sg2 = new JButton("Shoulder Girdle 2");
		sg2.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel,new ShoulderGirdle2(pane,colorblind));
					
				}
				
			}
			
		);
		
		sg2.setBounds(130,110,200,50);
		add(sg2);
		
		arm = new JButton("Arm");
		arm.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel,new Arm(pane,colorblind));
					
				}
				
			}
			
		);
		
		arm.setBounds(130,170,200,50);
		add(arm);
		
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
		
		ss = new JButton("Superior Skull");
		ss.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel,new SuperiorSkull(pane,colorblind));
					
				}
				
			}
			
		);
		
		ss.setBounds(340,110,200,50);
		add(ss);
		
		is = new JButton("Inferior Skull");
		is.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel,new InferiorSkull(pane,colorblind));
					
				}
				
			}
			
		);
		
		is.setBounds(340,170,200,50);
		add(is);
		
		as = new JButton("Anterior Skull");
		as.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel,new AnteriorSkull(pane,colorblind));
					
				}
				
			}
			
		);
		
		as.setBounds(340,230,200,50);
		add(as);
		
		v = new JButton("Vertebra");
		v.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel,new Vertebra(pane,colorblind));
					
				}
				
			}
			
		);
		
		v.setBounds(340,290,200,50);
		add(v);
		
		lf = new JButton("Lateral Fetal Skull");
		lf.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel,new LateralFetalSkull(pane,colorblind));
					
				}
				
			}
			
		);
		
		lf.setBounds(550,50,200,50);
		add(lf);
		
		sf = new JButton("Superior Fetal Skull");
		sf.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel,new SuperiorFetalSkull(pane,colorblind));
					
				}
				
			}
			
		);
		
		sf.setBounds(550,110,200,50);
		add(sf);
		
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
