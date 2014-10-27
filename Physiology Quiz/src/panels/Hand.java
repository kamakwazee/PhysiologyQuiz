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

public class Hand extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3878599068748139627L;
	private static BufferedImage bi;
	private static JTextField ph,d,m,p,mc,c,h,pf,tt,l,u,r,tm,td,s,ct;
	private static String phs,ds,ms,ps,mcs,cs,hs,pfs,tts,ls,us,rs,tms,tds,ss,cts;
	private static Color cc; //Correct color
	private static Color DARKGREEN;
	private static JButton back, answers, reset;
	
	public Hand(Container pane, boolean colorblind)
	{
		JPanel panel = this;
		setLayout(null);
		setBackground(Color.WHITE);
		pane.setBackground(Color.WHITE);
		DARKGREEN = new Color(0,153,0);
		if(colorblind)
			cc = Color.BLUE;
		else
			cc = DARKGREEN;
		
		try
		{
			File f = new File("resources" + File.separator + "Hand.jpg");
			bi = ImageIO.read(f);
			
			phs = "Phalanges";
			ds = "Distal";
			ms = "Middle";
			ps = "Proximal";
			mcs = "Metacarpals";
			cs = "Carpals";
			hs = "Hamate";
			pfs = "Pisiform";
			tts = "Triquetrum";
			ls = "Lunate";
			us = "Ulna";
			rs = "Radius";
			tms = "Trapezium";
			tds = "Trapezoid";
			ss = "Scaphoid";
			cts = "Capitate";
			
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
							
							ph.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			ph.setBounds(155,217,100,25);
			add(ph);
			
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
							
							d.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			d.setBounds(270,170,80,25);
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
							
							m.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			m.setBounds(280,200,80,25);
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
							
							p.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			p.setBounds(290,260,80,25);
			add(p);
			
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
							
							mc.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			mc.setBounds(205,350,100,25);
			add(mc);
			
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
							
							c.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			c.setBounds(150,450,100,25);
			add(c);
			
			h = new JTextField();
			h.setBackground(Color.WHITE);
			h.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(h.getText().equalsIgnoreCase(hs))
						{
							
							h.setForeground(cc);
							h.setBorder(null);
							h.setEditable(false);
							
						}
						else
						{
							
							h.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			h.setBounds(270,417,80,25);
			add(h);
			
			pf = new JTextField();
			pf.setBackground(Color.WHITE);
			pf.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(pf.getText().equalsIgnoreCase(pfs))
						{
							
							pf.setForeground(cc);
							pf.setBorder(null);
							pf.setEditable(false);
							
						}
						else
						{
							
							pf.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			pf.setBounds(270,445,80,25);
			add(pf);
			
			tt = new JTextField();
			tt.setBackground(Color.WHITE);
			tt.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(tt.getText().equalsIgnoreCase(tts))
						{
							
							tt.setForeground(cc);
							tt.setBorder(null);
							tt.setEditable(false);
							
						}
						else
						{
							
							tt.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			tt.setBounds(290,475,80,25);
			add(tt);
			
			l = new JTextField();
			l.setBackground(Color.WHITE);
			l.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(l.getText().equalsIgnoreCase(ls))
						{
							
							l.setForeground(cc);
							l.setBorder(null);
							l.setEditable(false);
							
						}
						else
						{
							
							l.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			l.setBounds(275,502,80,25);
			add(l);
			
			u = new JTextField();
			u.setBackground(Color.WHITE);
			u.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(u.getText().equalsIgnoreCase(us))
						{
							
							u.setForeground(cc);
							u.setBorder(null);
							u.setEditable(false);
							
						}
						else
						{
							
							u.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			u.setBounds(255,530,80,25);
			add(u);
			
			r = new JTextField();
			r.setBackground(Color.WHITE);
			r.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(r.getText().equalsIgnoreCase(rs))
						{
							
							r.setForeground(cc);
							r.setBorder(null);
							r.setEditable(false);
							
						}
						else
						{
							
							r.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			r.setBounds(455,555,80,25);
			add(r);
			
			tm = new JTextField();
			tm.setBackground(Color.WHITE);
			tm.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(tm.getText().equalsIgnoreCase(tms))
						{
							
							tm.setForeground(cc);
							tm.setBorder(null);
							tm.setEditable(false);
							
						}
						else
						{
							
							tm.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			tm.setBounds(560,417,80,25);
			add(tm);
			
			td = new JTextField();
			td.setBackground(Color.WHITE);
			td.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(td.getText().equalsIgnoreCase(tds))
						{
							
							td.setForeground(cc);
							td.setBorder(null);
							td.setEditable(false);
							
						}
						else
						{
							
							td.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			td.setBounds(560,444,80,25);
			add(td);
			
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
							
							s.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			s.setBounds(560,472,80,25);
			add(s);
			
			ct = new JTextField();
			ct.setBackground(Color.WHITE);
			ct.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(ct.getText().equalsIgnoreCase(cts))
						{
							
							ct.setForeground(cc);
							ct.setBorder(null);
							ct.setEditable(false);
							
						}
						else
						{
							
							ct.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			ct.setBounds(560,502,80,25);
			add(ct);
			
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
			
			JTextField[] fields = new JTextField[]{ph,d,m,p,mc,c,h,pf,tt,l,u,r,tm,td,s,ct};
			String[] strings = new String[]{phs,ds,ms,ps,mcs,cs,hs,pfs,tts,ls,us,rs,tms,tds,ss,cts};
			for(JTextField field : fields)
			{
				field.setBorder(BorderFactory.createLineBorder(Color.BLACK));
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
