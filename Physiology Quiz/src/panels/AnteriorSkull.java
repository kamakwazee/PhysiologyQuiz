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

public class AnteriorSkull extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3492728240060628412L;
	static JTextField pb, nb, sb, tb, eb, lb, zb, mx, ma, fb, sof, oc, mnc, inc, v;
	static Color DARKGREEN, cc;
	private static BufferedImage bi;
	private static String pbs, nbs, sbs, tbs, ebs, lbs, zbs, mxs, mas, fbs, sofs, ocs, mncs, incs, vs;
	private static JButton back, answers, reset;
	
	public AnteriorSkull(Container pane, boolean colorblind)
	{
		JPanel panel = this;
		setLayout(null);
		setBackground(Color.WHITE);
		pane.setBackground(Color.WHITE);
		DARKGREEN = new Color(0,153,0);
		
		pbs = "Parietal bone";
		nbs = "Nasal bone";
		sbs = "Sphenoid bone";
		tbs = "Temporal bone";
		ebs = "Ethmoid bone";
		lbs = "Lacrimal bone";
		zbs = "Zygomatic bone";
		mxs = "Maxilla";
		mas = "Mandible";
		fbs = "Frontal bone";
		sofs = "Superior orbital fissure";
		ocs = "Optic canal";
		mncs = "Middle nasal concha";
		incs = "Inferior nasal concha";
		vs = "Vomer";
		
		if(colorblind)
			cc = Color.BLUE;
		else
			cc = DARKGREEN;
		
		try{
			File f = new File("resources" + File.separator + "AnteriorSkull.jpg");
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
							
							pb.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			pb.setBounds(150,165,110,25);
			add(pb);
			
			nb = new JTextField();
			nb.setBackground(Color.WHITE);
			nb.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(nb.getText().equalsIgnoreCase(nbs))
						{
							
							nb.setForeground(cc);
							nb.setBorder(null);
							nb.setEditable(false);
							
						}
						else
						{
							
							nb.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			nb.setBounds(145,235,110,25);
			add(nb);
			
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
							
							sb.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			sb.setBounds(155,265,110,25);
			add(sb);
			
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
							
							tb.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			tb.setBounds(130,292,110,25);
			add(tb);
			
			eb = new JTextField();
			eb.setBackground(Color.WHITE);
			eb.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(eb.getText().equalsIgnoreCase(ebs))
						{
							
							eb.setForeground(cc);
							eb.setBorder(null);
							eb.setEditable(false);
							
						}
						else
						{
							
							eb.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			eb.setBounds(150,317,110,25);
			add(eb);
			
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
							
							lb.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			lb.setBounds(155,343,110,25);
			add(lb);
			
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
							
							zb.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			zb.setBounds(165,369,110,25);
			add(zb);
			
			mx = new JTextField();
			mx.setBackground(Color.WHITE);
			mx.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(mx.getText().equalsIgnoreCase(mxs))
						{
							
							mx.setForeground(cc);
							mx.setBorder(null);
							mx.setEditable(false);
							
						}
						else
						{
							
							mx.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			mx.setBounds(130,410,110,25);
			add(mx);
			
			ma = new JTextField();
			ma.setBackground(Color.WHITE);
			ma.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(ma.getText().equalsIgnoreCase(mas))
						{
							
							ma.setForeground(cc);
							ma.setBorder(null);
							ma.setEditable(false);
							
						}
						else
						{
							
							ma.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			ma.setBounds(135,460,110,25);
			add(ma);
			
			fb = new JTextField();
			fb.setBackground(Color.WHITE);
			fb.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(fb.getText().equalsIgnoreCase(fbs))
						{
							
							fb.setForeground(cc);
							fb.setBorder(null);
							fb.setEditable(false);
							
						}
						else
						{
							
							fb.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			fb.setBounds(605,145,110,25);
			add(fb);
			
			sof = new JTextField();
			sof.setBackground(Color.WHITE);
			sof.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(sof.getText().equalsIgnoreCase(sofs))
						{
							
							sof.setForeground(cc);
							sof.setBorder(null);
							sof.setEditable(false);
							
						}
						else
						{
							
							sof.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			sof.setBounds(610,265,150,25);
			add(sof);
			
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
							
							oc.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			oc.setBounds(610,300,110,25);
			add(oc);
			
			mnc = new JTextField();
			mnc.setBackground(Color.WHITE);
			mnc.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(mnc.getText().equalsIgnoreCase(mncs))
						{
							
							mnc.setForeground(cc);
							mnc.setBorder(null);
							mnc.setEditable(false);
							
						}
						else
						{
							
							mnc.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			mnc.setBounds(610,380,150,25);
			add(mnc);
			
			inc = new JTextField();
			inc.setBackground(Color.WHITE);
			inc.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(inc.getText().equalsIgnoreCase(incs))
						{
							
							inc.setForeground(cc);
							inc.setBorder(null);
							inc.setEditable(false);
							
						}
						else
						{
							
							inc.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			inc.setBounds(610,420,150,25);
			add(inc);
			
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
							
							v.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			v.setBounds(610,450,110,25);
			add(v);
			
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
			
			JTextField[] fields = new JTextField[]{pb, nb, sb, tb, eb, lb, zb, mx, ma, fb, sof, oc, mnc, inc, v};
			String[] strings = new String[]{pbs, nbs, sbs, tbs, ebs, lbs, zbs, mxs, mas, fbs, sofs, ocs, mncs, incs, vs};
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
											
											if(ii != fields.length-1 && !found)
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
