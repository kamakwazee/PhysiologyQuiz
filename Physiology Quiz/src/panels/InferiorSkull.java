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

public class InferiorSkull extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3595634700783152258L;
	static JTextField pb, zb, tb, v, mf, sp, mp, tb2, pab, m, sb, fo, cac, jf, oc, fm;
	static Color cc, wc;
	private static BufferedImage bi;
	private static String pbs, zbs, tbs, vs, mfs, sps, mps, pabs, ms, sbs, fos, cacs, jfs, ocs, fms, tb2s;
	private static JButton back, answers, reset;
	
	public InferiorSkull(Container pane, Color correctcolor, Color wrongcolor)
	{
		JPanel panel = this;
		setLayout(null);
		setBackground(Color.WHITE);
		pane.setBackground(Color.WHITE);
		cc = correctcolor;
		wc = wrongcolor;
		
		pbs = "Palatine bone";
		zbs = "Zygomatic bone";
		tbs = "Zygomatic process";
		tb2s = "Temporal bone";
		vs = "Vomer";
		mfs = "Mandibular fossa";
		sps = "Styloid process";
		mps = "Mastoid process";
		pabs = "Parietal bone";
		ms = "Maxilla";
		sbs = "Sphenoid bone";
		fos = "Foramen ovale";
		cacs = "Carotid canal";
		jfs = "Jugular foramen";
		ocs = "Occipital condyle";
		fms = "Foramen magnum";
		
		try{
			File f = new File("resources" + File.separator + "InferiorSkull.jpg");
			bi = ImageIO.read(f);
			
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
			
			pb.setBounds(90,120,110,25);
			add(pb);
			
			zb = new JTextField();
			zb.setBackground(Color.WHITE);
			zb.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(zb.getText().equalsIgnoreCase(zbs))
						{
							
							zb.setForeground(cc);
							zb.setBorder(null);
							zb.setEditable(false);
							
						}
						else
						{
							
							zb.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			zb.setBounds(90,180,110,25);
			add(zb);
			
			tb = new JTextField();
			tb.setBackground(Color.WHITE);
			tb.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(tb.getText().equalsIgnoreCase(tbs))
						{
							
							tb.setForeground(cc);
							tb.setBorder(null);
							tb.setEditable(false);
							
						}
						else
						{
							
							tb.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			tb.setBounds(70,220,130,25);
			add(tb);
			
			v = new JTextField();
			v.setBackground(Color.WHITE);
			v.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(v.getText().equalsIgnoreCase(vs))
						{
							
							v.setForeground(cc);
							v.setBorder(null);
							v.setEditable(false);
							
						}
						else
						{
							
							v.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			v.setBounds(90,280,110,25);
			add(v);
			
			mf = new JTextField();
			mf.setBackground(Color.WHITE);
			mf.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(mf.getText().equalsIgnoreCase(mfs))
						{
							
							mf.setForeground(cc);
							mf.setBorder(null);
							mf.setEditable(false);
							
						}
						else
						{
							
							mf.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			mf.setBounds(50,310,120,25);
			add(mf);
			
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
			
			sp.setBounds(90,350,110,25);
			add(sp);
			
			mp = new JTextField();
			mp.setBackground(Color.WHITE);
			mp.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(mp.getText().equalsIgnoreCase(mps))
						{
							
							mp.setForeground(cc);
							mp.setBorder(null);
							mp.setEditable(false);
							
						}
						else
						{
							
							mp.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			mp.setBounds(95,385,110,25);
			add(mp);
			
			tb2 = new JTextField();
			tb2.setBackground(Color.WHITE);
			tb2.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(tb2.getText().equalsIgnoreCase(tb2s))
						{
							
							tb2.setForeground(cc);
							tb2.setBorder(null);
							tb2.setEditable(false);
							
						}
						else
						{
							
							tb2.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			tb2.setBounds(95,415,110,25);
			add(tb2);
			
			pab = new JTextField();
			pab.setBackground(Color.WHITE);
			pab.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(pab.getText().equalsIgnoreCase(pabs))
						{
							
							pab.setForeground(cc);
							pab.setBorder(null);
							pab.setEditable(false);
							
						}
						else
						{
							
							pab.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			pab.setBounds(80,510,110,25);
			add(pab);
			
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
			
			m.setBounds(720,180,110,25);
			add(m);
			
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
			
			sb.setBounds(700,220,110,25);
			add(sb);
			
			fo = new JTextField();
			fo.setBackground(Color.WHITE);
			fo.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(fo.getText().equalsIgnoreCase(fos))
						{
							
							fo.setForeground(cc);
							fo.setBorder(null);
							fo.setEditable(false);
							
						}
						else
						{
							
							fo.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			fo.setBounds(690,260,110,25);
			add(fo);
			
			cac = new JTextField();
			cac.setBackground(Color.WHITE);
			cac.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(cac.getText().equalsIgnoreCase(cacs))
						{
							
							cac.setForeground(cc);
							cac.setBorder(null);
							cac.setEditable(false);
							
						}
						else
						{
							
							cac.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			cac.setBounds(695,330,110,25);
			add(cac);
			
			jf = new JTextField();
			jf.setBackground(Color.WHITE);
			jf.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(jf.getText().equalsIgnoreCase(jfs))
						{
							
							jf.setForeground(cc);
							jf.setBorder(null);
							jf.setEditable(false);
							
						}
						else
						{
							
							jf.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			jf.setBounds(710,430,110,25);
			add(jf);
			
			oc = new JTextField();
			oc.setBackground(Color.WHITE);
			oc.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(oc.getText().equalsIgnoreCase(ocs))
						{
							
							oc.setForeground(cc);
							oc.setBorder(null);
							oc.setEditable(false);
							
						}
						else
						{
							
							oc.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			oc.setBounds(690,460,110,25);
			add(oc);
			
			fm = new JTextField();
			fm.setBackground(Color.WHITE);
			fm.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(fm.getText().equalsIgnoreCase(fms))
						{
							
							fm.setForeground(cc);
							fm.setBorder(null);
							fm.setEditable(false);
							
						}
						else
						{
							
							fm.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			fm.setBounds(610,565,120,25);
			add(fm);
			
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
			
			JTextField[] fields = new JTextField[]{pb, zb, tb, v, mf, sp, mp, tb2, pab, m, sb, fo, cac, jf, oc, fm};
			String[] strings = new String[]{pbs, zbs, tbs, vs, mfs, sps, mps, tb2s, pabs, ms, sbs, fos, cacs, jfs, ocs, fms};
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
			
		}
		catch(IOException e)
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
