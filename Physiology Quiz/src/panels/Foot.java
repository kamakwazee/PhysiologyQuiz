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

public class Foot extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2312507933996686238L;
	private static BufferedImage bi;
	private static JTextField mc,ic,n,t,ph,mt,ta,d,m,p,lc,cb,cn;
	private static String mcs,ics,ns,ts,phs,mts,tas,ds,ms,ps,lcs,cbs,cns;
	private static Color cc, wc;
	private static JButton back, answers, reset;
	
	public Foot(Container pane, Color correctcolor, Color wrongcolor)
	{
		JPanel panel = this;
		setLayout(null);
		setBackground(Color.WHITE);
		pane.setBackground(Color.WHITE);
		cc = correctcolor;
		wc = wrongcolor;
		
		try
		{
			File f = new File("resources" + File.separator + "Foot.jpg");
			bi = ImageIO.read(f);
			
			mcs = "Medial cuneiform";
			ics = "Intermediate cuneiform";
			ns = "Navicular";
			ts = "Talus";
			phs = "Phalanges";
			mts = "Metatarsals";
			tas = "Tarsals";
			ds = "Distal";
			ms = "Middle";
			ps = "Proximal";
			lcs = "Lateral cuneiform";
			cbs = "Cuboid";
			cns = "Calcaneus";
			
			mc = new JTextField();
			mc.setBackground(Color.WHITE);
			mc.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(mc.getText().equalsIgnoreCase(mcs))
						{
							
							mc.setForeground(cc);
							mc.setBorder(null);
							mc.setEditable(false);
							
						}
						else
						{
							
							mc.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			mc.setBounds(140,285,120,25);
			add(mc);
			
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
			
			ic.setBounds(130,343,170,25);
			add(ic);
			
			n = new JTextField();
			n.setBackground(Color.WHITE);
			n.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(n.getText().equalsIgnoreCase(ns))
						{
							
							n.setForeground(cc);
							n.setBorder(null);
							n.setEditable(false);
							
						}
						else
						{
							
							n.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			n.setBounds(170,390,100,25);
			add(n);
			
			t = new JTextField();
			t.setBackground(Color.WHITE);
			t.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(t.getText().equalsIgnoreCase(ts))
						{
							
							t.setForeground(cc);
							t.setBorder(null);
							t.setEditable(false);
							
						}
						else
						{
							
							t.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			t.setBounds(140,440,100,25);
			add(t);
			
			ph = new JTextField();
			ph.setBackground(Color.WHITE);
			ph.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(ph.getText().equalsIgnoreCase(phs))
						{
							
							ph.setForeground(cc);
							ph.setBorder(null);
							ph.setEditable(false);
							
						}
						else
						{
							
							ph.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			ph.setBounds(675,140,100,25);
			add(ph);
			
			mt = new JTextField();
			mt.setBackground(Color.WHITE);
			mt.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(mt.getText().equalsIgnoreCase(mts))
						{
							
							mt.setForeground(cc);
							mt.setBorder(null);
							mt.setEditable(false);
							
						}
						else
						{
							
							mt.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			mt.setBounds(675,270,100,25);
			add(mt);
			
			ta = new JTextField();
			ta.setBackground(Color.WHITE);
			ta.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(ta.getText().equalsIgnoreCase(tas))
						{
							
							ta.setForeground(cc);
							ta.setBorder(null);
							ta.setEditable(false);
							
						}
						else
						{
							
							ta.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			ta.setBounds(675,425,100,25);
			add(ta);
			
			d = new JTextField();
			d.setBackground(Color.WHITE);
			d.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(d.getText().equalsIgnoreCase(ds))
						{
							
							d.setForeground(cc);
							d.setBorder(null);
							d.setEditable(false);
							
						}
						else
						{
							
							d.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			d.setBounds(515,157,100,25);
			add(d);
			
			m = new JTextField();
			m.setBackground(Color.WHITE);
			m.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(m.getText().equalsIgnoreCase(ms))
						{
							
							m.setForeground(cc);
							m.setBorder(null);
							m.setEditable(false);
							
						}
						else
						{
							
							m.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			m.setBounds(515,184,100,25);
			add(m);
			
			p = new JTextField();
			p.setBackground(Color.WHITE);
			p.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(p.getText().equalsIgnoreCase(ps))
						{
							
							p.setForeground(cc);
							p.setBorder(null);
							p.setEditable(false);
							
						}
						else
						{
							
							p.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			p.setBounds(515,212,100,25);
			add(p);
			
			lc = new JTextField();
			lc.setBackground(Color.WHITE);
			lc.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(lc.getText().equalsIgnoreCase(lcs))
						{
							
							lc.setForeground(cc);
							lc.setBorder(null);
							lc.setEditable(false);
							
						}
						else
						{
							
							lc.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			lc.setBounds(500,347,130,25);
			add(lc);
			
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
			
			cb.setBounds(500,390,100,25);
			add(cb);
			
			cn = new JTextField();
			cn.setBackground(Color.WHITE);
			cn.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(cn.getText().equalsIgnoreCase(cns))
						{
							
							cn.setForeground(cc);
							cn.setBorder(null);
							cn.setEditable(false);
							
						}
						else
						{
							
							cn.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			cn.setBounds(500,520,100,25);
			add(cn);
			
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
			
			JTextField[] fields = new JTextField[]{mc,ic,n,t,ph,mt,ta,d,m,p,lc,cb,cn};
			String[] strings = new String[]{mcs,ics,ns,ts,phs,mts,tas,ds,ms,ps,lcs,cbs,cns};
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
