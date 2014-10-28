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

public class Leg extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2295405582480521965L;
	private static BufferedImage bi;
	private static JTextField n,lc,ps,h,lt,il,gt,inf,mc,gtr,ic,lc2;
	private static String ns,lcs,pss,hs,lts,ils,gts,infs,mcs,gtrs,ics,lc2s;
	private static Color cc; //Correct color
	private static Color DARKGREEN;
	private static JButton back, answers, reset;
	
	public Leg(Container pane, boolean colorblind)
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
			File f = new File("resources" + File.separator + "Leg.jpg");
			bi = ImageIO.read(f);
			
			ns = "Neck";
			lcs = lc2s = "Lateral condyle";
			pss = "Patellar surface";
			hs = "Head";
			lts = "Lesser trochanter";
			ils = "Intertrochanteric line";
			gts = "Gluteal tuberosity";
			infs = "Intercondylar fossa";
			mcs = "Medial condyle";
			gtrs = "Greater trochanter";
			ics = "Intertrochanteric crest";
			
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
							
							n.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			n.setBounds(170,60,80,25);
			add(n);
			
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
							
							lc.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			lc.setBounds(110,495,110,25);
			add(lc);
			
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
							
							ps.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			ps.setBounds(130,535,110,25);
			add(ps);
			
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
			
			h.setBounds(390,95,80,25);
			add(h);
			
			lt = new JTextField();
			lt.setBackground(Color.WHITE);
			lt.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(lt.getText().equalsIgnoreCase(lts))
						{
							
							lt.setForeground(cc);
							lt.setBorder(null);
							lt.setEditable(false);
							
						}
						else
						{
							
							lt.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			lt.setBounds(385,140,120,25);
			add(lt);
			
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
							
							il.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			il.setBounds(350,167,150,25);
			add(il);
			
			gt = new JTextField();
			gt.setBackground(Color.WHITE);
			gt.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(gt.getText().equalsIgnoreCase(gts))
						{
							
							gt.setForeground(cc);
							gt.setBorder(null);
							gt.setEditable(false);
							
						}
						else
						{
							
							gt.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			gt.setBounds(390,195,130,25);
			add(gt);
			
			inf = new JTextField();
			inf.setBackground(Color.WHITE);
			inf.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(inf.getText().equalsIgnoreCase(infs))
						{
							
							inf.setForeground(cc);
							inf.setBorder(null);
							inf.setEditable(false);
							
						}
						else
						{
							
							inf.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			inf.setBounds(390,418,140,25);
			add(inf);
			
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
			
			mc.setBounds(390,450,130,25);
			add(mc);
			
			gtr = new JTextField();
			gtr.setBackground(Color.WHITE);
			gtr.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(gtr.getText().equalsIgnoreCase(gtrs))
						{
							
							gtr.setForeground(cc);
							gtr.setBorder(null);
							gtr.setEditable(false);
							
						}
						else
						{
							
							gtr.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			gtr.setBounds(630,70,130,25);
			add(gtr);
			
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
							
							ic.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			ic.setBounds(630,130,160,25);
			add(ic);
			
			lc2 = new JTextField();
			lc2.setBackground(Color.WHITE);
			lc2.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(lc2.getText().equalsIgnoreCase(lc2s))
						{
							
							lc2.setForeground(cc);
							lc2.setBorder(null);
							lc2.setEditable(false);
							
						}
						else
						{
							
							lc2.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			lc2.setBounds(630,370,130,25);
			add(lc2);
			
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
			
			JTextField[] fields = new JTextField[]{n,lc,ps,h,lt,il,gt,inf,mc,gtr,ic,lc2};
			String[] strings = new String[]{ns,lcs,pss,hs,lts,ils,gts,infs,mcs,gtrs,ics,lc2s};
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
