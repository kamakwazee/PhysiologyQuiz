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

public class ShoulderGirdle2 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2967085601637010273L;
	static JTextField a,cp,gc,lb,sn,sb,sa,mb,ia,sn2,cp2,a2,gc2,lb2,sp;
	static Color cc, wc;
	private static BufferedImage bi;
	private static String as,cps,gcs,lbs,sns,sbs,sas,mbs,ias,sn2s,cp2s,a2s,gc2s,lb2s,sps;
	private static JButton back, answers, reset;
	
	public ShoulderGirdle2(Container pane, Color correctcolor, Color wrongcolor)
	{
		
		JPanel panel = this;
		setLayout(null);
		setBackground(Color.WHITE);
		pane.setBackground(Color.WHITE);
		cc = correctcolor;
		wc = wrongcolor;
		
		as = a2s = "Acromion";
		sbs = "Superior border";
		cps = cp2s = "Corocoid process";
		gcs = gc2s = "Glenoid cavity";
		lbs = lb2s = "Lateral border";
		mbs = "Medial border";
		ias = "Inferior angle";
		sas = "Superior angle";
		sns = sn2s = "Suprascapular notch";	
		sps = "Spine";
		
		try {
			File f = new File("resources" + File.separator + "ShoulderGirdle2.jpg");
			bi = ImageIO.read(f);
			
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
			
			a.setBounds(125,150,100,25);
			add(a);
			
			cp = new JTextField();
			cp.setBackground(Color.WHITE);
			cp.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(cp.getText().equalsIgnoreCase(cps))
						{
							
							cp.setForeground(cc);
							cp.setBorder(null);
							cp.setEditable(false);
							
						}
						else
						{
							
							cp.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			cp.setBounds(30,185,120,25);
			add(cp);
			
			gc = new JTextField();
			gc.setBackground(Color.WHITE);
			gc.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(gc.getText().equalsIgnoreCase(gcs))
						{
							
							gc.setForeground(cc);
							gc.setBorder(null);
							gc.setEditable(false);
							
						}
						else
						{
							
							gc.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			gc.setBounds(30,215,120,25);
			add(gc);
			
			lb = new JTextField();
			lb.setBackground(Color.WHITE);
			lb.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(lb.getText().equalsIgnoreCase(lbs))
						{
							
							lb.setForeground(cc);
							lb.setBorder(null);
							lb.setEditable(false);
							
						}
						else
						{
							
							lb.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			lb.setBounds(60,355,120,25);
			add(lb);
			
			sn = new JTextField();
			sn.setBackground(Color.WHITE);
			sn.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(sn.getText().equalsIgnoreCase(sns))
						{
							
							sn.setForeground(cc);
							sn.setBorder(null);
							sn.setEditable(false);
							
						}
						else
						{
							
							sn.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			sn.setBounds(200,110,150,25);
			add(sn);
			
			sb = new JTextField();
			sb.setBackground(Color.WHITE);
			sb.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(sb.getText().equalsIgnoreCase(sbs))
						{
							
							sb.setForeground(cc);
							sb.setBorder(null);
							sb.setEditable(false);
							
						}
						else
						{
							
							sb.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			sb.setBounds(360,145,110,25);
			add(sb);
			
			sa = new JTextField();
			sa.setBackground(Color.WHITE);
			sa.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(sa.getText().equalsIgnoreCase(sas))
						{
							
							sa.setForeground(cc);
							sa.setBorder(null);
							sa.setEditable(false);
							
						}
						else
						{
							
							sa.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			sa.setBounds(370,200,110,25);
			add(sa);
			
			sp = new JTextField();
			sp.setBackground(Color.WHITE);
			sp.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(sp.getText().equalsIgnoreCase(sps))
						{
							
							sp.setForeground(cc);
							sp.setBorder(null);
							sp.setEditable(false);
							
						}
						else
						{
							
							sp.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			sp.setBounds(390,280,100,25);
			add(sp);
			
			mb = new JTextField();
			mb.setBackground(Color.WHITE);
			mb.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(mb.getText().equalsIgnoreCase(mbs))
						{
							
							mb.setForeground(cc);
							mb.setBorder(null);
							mb.setEditable(false);
							
						}
						else
						{
							
							mb.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			mb.setBounds(380,380,100,25);
			add(mb);
			
			ia = new JTextField();
			ia.setBackground(Color.WHITE);
			ia.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(ia.getText().equalsIgnoreCase(ias))
						{
							
							ia.setForeground(cc);
							ia.setBorder(null);
							ia.setEditable(false);
							
						}
						else
						{
							
							ia.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			ia.setBounds(365,450,100,25);
			add(ia);
			
			sn2 = new JTextField();
			sn2.setBackground(Color.WHITE);
			sn2.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(sn2.getText().equalsIgnoreCase(sn2s))
						{
							
							sn2.setForeground(cc);
							sn2.setBorder(null);
							sn2.setEditable(false);
							
						}
						else
						{
							
							sn2.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			sn2.setBounds(420,172,150,25);
			add(sn2);
			
			cp2 = new JTextField();
			cp2.setBackground(Color.WHITE);
			cp2.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(cp2.getText().equalsIgnoreCase(cp2s))
						{
							
							cp2.setForeground(cc);
							cp2.setBorder(null);
							cp2.setEditable(false);
							
						}
						else
						{
							
							cp2.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			cp2.setBounds(580,155,120,25);
			add(cp2);
			
			a2 = new JTextField();
			a2.setBackground(Color.WHITE);
			a2.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(a2.getText().equalsIgnoreCase(a2s))
						{
							
							a2.setForeground(cc);
							a2.setBorder(null);
							a2.setEditable(false);
							
						}
						else
						{
							
							a2.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			a2.setBounds(740,205,100,25);
			add(a2);
			
			gc2 = new JTextField();
			gc2.setBackground(Color.WHITE);
			gc2.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(gc2.getText().equalsIgnoreCase(gc2s))
						{
							
							gc2.setForeground(cc);
							gc2.setBorder(null);
							gc2.setEditable(false);
							
						}
						else
						{
							
							gc2.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			gc2.setBounds(700,285,110,25);
			add(gc2);
			
			lb2 = new JTextField();
			lb2.setBackground(Color.WHITE);
			lb2.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(lb2.getText().equalsIgnoreCase(lb2s))
						{
							
							lb2.setForeground(cc);
							lb2.setBorder(null);
							lb2.setEditable(false);
							
						}
						else
						{
							
							lb2.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			lb2.setBounds(680,380,110,25);
			add(lb2);
			
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
			
			JTextField[] fields = new JTextField[]{a,cp,gc,lb,sn,sb,sa,mb,ia,sn2,cp2,a2,gc2,lb2,sp};
			String[] strings = new String[]{as,cps,gcs,lbs,sns,sbs,sas,mbs,ias,sn2s,cp2s,a2s,gc2s,lb2s,sps};
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
			
		} catch (IOException e) {
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
