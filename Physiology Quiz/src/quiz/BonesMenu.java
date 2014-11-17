package quiz;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import panels.AnteriorSkull;
import panels.Arm;
import panels.Foot;
import panels.Hand;
import panels.InferiorSkull;
import panels.LateralFetalSkull;
import panels.LateralSkull;
import panels.Leg;
import panels.Pelvis1;
import panels.Pelvis2;
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
	static JButton sg1,sg2,arm,hand,p1,p2,ls,lf,ss,sf,is,as,v,leg,foot,back;
	public static JPanel panel;
	private static Color cc, wc;
	
	
	public BonesMenu(Container pane, Color correctcolor, Color wrongcolor)
	{
		panel = this;
		setLayout(null);
		setBackground(Color.WHITE);
		pane.setBackground(Color.WHITE);
		cc = correctcolor;
		wc = wrongcolor;
		
		sg1 = new JButton("Shoulder Girdle 1");
		sg1.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel,new ShoulderGirdle1(pane,cc,wc));
					
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
					
					Quiz.setPanel(panel,new ShoulderGirdle2(pane,cc,wc));
					
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
					
					Quiz.setPanel(panel,new Arm(pane,cc,wc));
					
				}
				
			}
			
		);
		
		arm.setBounds(130,170,200,50);
		add(arm);
		
		hand = new JButton("Hand");
		hand.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel,new Hand(pane,cc,wc));
					
				}
				
			}
			
		);
		
		hand.setBounds(130,230,200,50);
		add(hand);
		
		p1 = new JButton("Pelvis 1");
		p1.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel,new Pelvis1(pane,cc,wc));
					
				}
				
			}
			
		);
		
		p1.setBounds(130,290,200,50);
		add(p1);
		
		p2 = new JButton("Pelvis 2");
		p2.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel,new Pelvis2(pane,cc,wc));
					
				}
				
			}
			
		);
		
		p2.setBounds(130,350,200,50);
		add(p2);
		
		ls = new JButton("Lateral Skull");
		ls.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel,new LateralSkull(pane,cc,wc));
					
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
					
					Quiz.setPanel(panel,new SuperiorSkull(pane,cc,wc));
					
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
					
					Quiz.setPanel(panel,new InferiorSkull(pane,cc,wc));
					
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
					
					Quiz.setPanel(panel,new AnteriorSkull(pane,cc,wc));
					
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
					
					Quiz.setPanel(panel,new Vertebra(pane,cc,wc));
					
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
					
					Quiz.setPanel(panel,new LateralFetalSkull(pane,cc,wc));
					
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
					
					Quiz.setPanel(panel,new SuperiorFetalSkull(pane,cc,wc));
					
				}
				
			}
			
		);
		
		sf.setBounds(550,110,200,50);
		add(sf);
		
		leg = new JButton("Leg");
		leg.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel,new Leg(pane,cc,wc));
					
				}
				
			}
			
		);
		
		leg.setBounds(550,170,200,50);
		add(leg);
		
		foot = new JButton("Foot");
		foot.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel,new Foot(pane,cc,wc));
					
				}
				
			}
			
		);
		
		foot.setBounds(550,230,200,50);
		add(foot);
		
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
