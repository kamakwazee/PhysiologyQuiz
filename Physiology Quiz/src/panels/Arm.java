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

public class Arm extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8961641461840465751L;
	private static BufferedImage bi;
	private static JTextField gt,lt,is,dt,rf,c,hh,an,rg,cf,of,me,t,sn,dt2,le;
	private static String gts,lts,iss,dts,rfs,cs,hhs,ans,rgs,cfs,ofs,mes,ts,sns,dt2s,les;
	private static Color cc; //Correct color
	private static Color DARKGREEN;
	private static JButton back, answers, reset;
	
	public Arm(Container pane, boolean colorblind)
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
			File f = new File("resources" + File.separator + "Arm.jpg");
			bi = ImageIO.read(f);
			
			gts = "Greater tubercle";
			lts = "Lesser tubercle";
			iss = "Intertubercular sulcus";
			dts = dt2s = "Deltoid tuberosity";
			rfs = "Radial fossa";
			cs = "Capitulum";
			hhs = "Head of humerus";
			ans = "Anatomical neck";
			rgs = "Radial groove";
			cfs = "Coronoid fossa";
			ofs = "Olecranon fossa";
			mes = "Medial epicondyle";
			ts = "Trochlea";
			sns = "Surgical neck";
			les = "Lateral epicondyle";
			
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
			
			gt.setBounds(140,75,130,25);
			add(gt);
			
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
			
			lt.setBounds(140,110,130,25);
			add(lt);
			
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
							
							is.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			is.setBounds(120,150,150,25);
			add(is);
			
			dt = new JTextField();
			dt.setBackground(Color.WHITE);
			dt.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(dt.getText().equalsIgnoreCase(dts))
						{
							
							dt.setForeground(cc);
							dt.setBorder(null);
							dt.setEditable(false);
							
						}
						else
						{
							
							dt.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			dt.setBounds(140,280,130,25);
			add(dt);
			
			rf = new JTextField();
			rf.setBackground(Color.WHITE);
			rf.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(rf.getText().equalsIgnoreCase(rfs))
						{
							
							rf.setForeground(cc);
							rf.setBorder(null);
							rf.setEditable(false);
							
						}
						else
						{
							
							rf.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			rf.setBounds(160,485,110,25);
			add(rf);
			
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
			
			c.setBounds(170,520,110,25);
			add(c);
			
			hh = new JTextField();
			hh.setBackground(Color.WHITE);
			hh.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(hh.getText().equalsIgnoreCase(hhs))
						{
							
							hh.setForeground(cc);
							hh.setBorder(null);
							hh.setEditable(false);
							
						}
						else
						{
							
							hh.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			hh.setBounds(405,80,130,25);
			add(hh);
			
			an = new JTextField();
			an.setBackground(Color.WHITE);
			an.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(an.getText().equalsIgnoreCase(ans))
						{
							
							an.setForeground(cc);
							an.setBorder(null);
							an.setEditable(false);
							
						}
						else
						{
							
							an.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			an.setBounds(410,130,130,25);
			add(an);
			
			rg = new JTextField();
			rg.setBackground(Color.WHITE);
			rg.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(rg.getText().equalsIgnoreCase(rgs))
						{
							
							rg.setForeground(cc);
							rg.setBorder(null);
							rg.setEditable(false);
							
						}
						else
						{
							
							rg.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			rg.setBounds(420,270,130,25);
			add(rg);
			
			cf = new JTextField();
			cf.setBackground(Color.WHITE);
			cf.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(cf.getText().equalsIgnoreCase(cfs))
						{
							
							cf.setForeground(cc);
							cf.setBorder(null);
							cf.setEditable(false);
							
						}
						else
						{
							
							cf.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			cf.setBounds(400,395,130,25);
			add(cf);
			
			of = new JTextField();
			of.setBackground(Color.WHITE);
			of.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(of.getText().equalsIgnoreCase(ofs))
						{
							
							of.setForeground(cc);
							of.setBorder(null);
							of.setEditable(false);
							
						}
						else
						{
							
							of.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			of.setBounds(400,455,130,25);
			add(of);
			
			me = new JTextField();
			me.setBackground(Color.WHITE);
			me.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(me.getText().equalsIgnoreCase(mes))
						{
							
							me.setForeground(cc);
							me.setBorder(null);
							me.setEditable(false);
							
						}
						else
						{
							
							me.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			me.setBounds(400,490,130,25);
			add(me);
			
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
							
							t.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			t.setBounds(430,530,100,25);
			add(t);
			
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
							
							sn.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			sn.setBounds(650,155,130,25);
			add(sn);
			
			dt2 = new JTextField();
			dt2.setBackground(Color.WHITE);
			dt2.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(dt2.getText().equalsIgnoreCase(dt2s))
						{
							
							dt2.setForeground(cc);
							dt2.setBorder(null);
							dt2.setEditable(false);
							
						}
						else
						{
							
							dt2.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			dt2.setBounds(645,277,130,25);
			add(dt2);
			
			le = new JTextField();
			le.setBackground(Color.WHITE);
			le.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(le.getText().equalsIgnoreCase(les))
						{
							
							le.setForeground(cc);
							le.setBorder(null);
							le.setEditable(false);
							
						}
						else
						{
							
							le.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			le.setBounds(660,512,130,25);
			add(le);
			
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
			
			JTextField[] fields = new JTextField[]{gt,lt,is,dt,rf,c,hh,an,rg,cf,of,me,t,sn,dt2,le};
			String[] strings = new String[]{gts,lts,iss,dts,rfs,cs,hhs,ans,rgs,cfs,ofs,mes,ts,sns,dt2s,les};
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
