package panels;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import quiz.BonesMenu;
import quiz.Quiz;

public class Pelvis1 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8728922945762182962L;
	private static BufferedImage bi;
	private static JTextField cb,il,pu,is,bs,s,c,ic,sj,pb,a,ps;
	private static String cbs,ils,pus,iss,bss,ss,cs,ics,sjs,pbs,as,pss;
	private static Color cc, wc;
	private static JButton back, answers, reset;
	
	public Pelvis1(Container pane, Color correctcolor, Color wrongcolor)
	{
		JPanel panel = this;
		setLayout(null);
		setBackground(Color.WHITE);
		pane.setBackground(Color.WHITE);
		cc = correctcolor;
		wc = wrongcolor;
		
		try
		{
			File f = new File("resources" + File.separator + "Pelvis1.jpg");
			bi = ImageIO.read(f);
			
			cbs = "Coxal bone";
			ils = "Ilium";
			pus = "Pubis";
			iss = "Ischium";
			bss = "Base of sacrum";
			ss = "Sacrum";
			cs = "Coccyx";
			ics = "Iliac crest";
			sjs = "Sacroiliac joint";
			pbs = "Pelvic brim";
			as = "Acetabulum";
			pss = "Pubic symphysis";
			
			cb = new JTextField();
			cb.setBackground(Color.WHITE);
			cb.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(cb.getText().equalsIgnoreCase(cbs))
						{
							
							cb.setForeground(cc);
							cb.setBorder(null);
							cb.setEditable(false);
							
						}
						else
						{
							
							cb.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			cb.setBounds(60,305,100,25);
			add(cb);
			
			il = new JTextField();
			il.setBackground(Color.WHITE);
			il.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(il.getText().equalsIgnoreCase(ils))
						{
							
							il.setForeground(cc);
							il.setBorder(null);
							il.setEditable(false);
							
						}
						else
						{
							
							il.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			il.setBounds(180,280,50,25);
			add(il);
			
			pu = new JTextField();
			pu.setBackground(Color.WHITE);
			pu.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(pu.getText().equalsIgnoreCase(pus))
						{
							
							pu.setForeground(cc);
							pu.setBorder(null);
							pu.setEditable(false);
							
						}
						else
						{
							
							pu.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			pu.setBounds(220,370,50,25);
			add(pu);
			
			is = new JTextField();
			is.setBackground(Color.WHITE);
			is.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(is.getText().equalsIgnoreCase(iss))
						{
							
							is.setForeground(cc);
							is.setBorder(null);
							is.setEditable(false);
							
						}
						else
						{
							
							is.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			is.setBounds(210,440,70,25);
			add(is);
			
			bs = new JTextField();
			bs.setBackground(Color.WHITE);
			bs.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(bs.getText().equalsIgnoreCase(bss))
						{
							
							bs.setForeground(cc);
							bs.setBorder(null);
							bs.setEditable(false);
							
						}
						else
						{
							
							bs.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			bs.setBounds(390,120,130,25);
			add(bs);
			
			ic = new JTextField();
			ic.setBackground(Color.WHITE);
			ic.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(ic.getText().equalsIgnoreCase(ics))
						{
							
							ic.setForeground(cc);
							ic.setBorder(null);
							ic.setEditable(false);
							
						}
						else
						{
							
							ic.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			ic.setBounds(680,110,100,25);
			add(ic);
			
			sj = new JTextField();
			sj.setBackground(Color.WHITE);
			sj.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(sj.getText().equalsIgnoreCase(sjs))
						{
							
							sj.setForeground(cc);
							sj.setBorder(null);
							sj.setEditable(false);
							
						}
						else
						{
							
							sj.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			sj.setBounds(720,140,110,25);
			add(sj);
			
			pb = new JTextField();
			pb.setBackground(Color.WHITE);
			pb.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(pb.getText().equalsIgnoreCase(pbs))
						{
							
							pb.setForeground(cc);
							pb.setBorder(null);
							pb.setEditable(false);
							
						}
						else
						{
							
							pb.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			pb.setBounds(690,370,100,25);
			add(pb);
			
			a = new JTextField();
			a.setBackground(Color.WHITE);
			a.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(a.getText().equalsIgnoreCase(as))
						{
							
							a.setForeground(cc);
							a.setBorder(null);
							a.setEditable(false);
							
						}
						else
						{
							
							a.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			a.setBounds(690,400,100,25);
			add(a);
			
			ps = new JTextField();
			ps.setBackground(Color.WHITE);
			ps.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(ps.getText().equalsIgnoreCase(pss))
						{
							
							ps.setForeground(cc);
							ps.setBorder(null);
							ps.setEditable(false);
							
						}
						else
						{
							
							ps.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			ps.setBounds(690,465,120,25);
			add(ps);
			
			s = new JTextField();
			s.setBackground(Color.WHITE);
			s.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(s.getText().equalsIgnoreCase(ss))
						{
							
							s.setForeground(cc);
							s.setBorder(null);
							s.setEditable(false);
							
						}
						else
						{
							
							s.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			s.setBounds(340,325,60,25);
			add(s);
			
			c = new JTextField();
			c.setBackground(Color.WHITE);
			c.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(c.getText().equalsIgnoreCase(cs))
						{
							
							c.setForeground(cc);
							c.setBorder(null);
							c.setEditable(false);
							
						}
						else
						{
							
							c.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			c.setBounds(360,367,60,25);
			add(c);
			
			back = new JButton("Back");
			back.setBounds(750,600,100,50);
			back.addActionListener(
					
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						Quiz.setPanel(panel, BonesMenu.panel);
						
					}
					
				}
			
			);
			add(back);
			
			JTextField[] fields = new JTextField[]{cb,il,pu,is,bs,s,c,ic,sj,pb,a,ps};
			String[] strings = new String[]{cbs,ils,pus,iss,bss,ss,cs,ics,sjs,pbs,as,pss};
			for(JTextField field : fields)
			{
				field.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				field.addActionListener(
					new ActionListener()
					{
						
						public void actionPerformed(ActionEvent e)
						{
							for(int i = 0; i < fields.length; i++)
							{
								
								if((JTextField) e.getSource() == fields[i])
								{
									if(fields[i].getText().equalsIgnoreCase(strings[i]))
									{
										boolean found = false;
										
										for(int ii = i; ii < fields.length; ii++)
										{
											
											if(!found)
											{
												if(fields[ii].getText().equalsIgnoreCase(""))
												{
													fields[ii].requestFocusInWindow();
													found = true;
													
												}
											}
											
										}
										if(!found)
										{
											for(int ii = 0; ii < i; ii++)
											{
												if(!found)
												{
													if(fields[ii].getText().equals(""))
													{
														
														fields[ii].requestFocusInWindow();
														found = true;
														
													}
												}
												
											}
											
										}
									}
									
								}
								
							}
							
						}
						
					}
				);
			}
			
			answers = new JButton("Answers");
			answers.setBounds(640,600,100,50);
			answers.addActionListener(
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						for(int i = 0; i < fields.length; i++)
						{
							
							fields[i].setText(strings[i]);
							fields[i].setForeground(Color.BLACK);
							fields[i].setBorder(null);
							fields[i].setEditable(false);
							
						}
						
					}
					
					
					
				}
			);
			add(answers);
			
			reset = new JButton("Reset");
			reset.setBounds(530,600,100,50);
			reset.addActionListener(
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						for(JTextField field : fields)
						{
							
							field.setText("");
							field.setBorder(BorderFactory.createLineBorder(Color.BLACK));
							field.setForeground(Color.BLACK);
							field.setEditable(true);
							
						}
						
					}
					
					
					
				}
			);
			add(reset);
			
			
		}catch(IOException e)
		{
			
			e.printStackTrace();
			
		}
		
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.drawImage(bi,67,59,this);
		
	}

}
