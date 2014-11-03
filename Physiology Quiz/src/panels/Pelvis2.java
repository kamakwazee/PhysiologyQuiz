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

public class Pelvis2 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 487953154981664702L;
	private static BufferedImage bi;
	private static JTextField psis,piis,gsn,ib,is,ih,it,ir,of,ipr,p,bp,at,aiis,asis,ic,il;
	private static String psiss,piiss,gsns,ibs,iss,ihs,its,irs,ofs,iprs,ps,bps,ats,aiiss,asiss,ics,ils;
	private static Color cc; //Correct color
	private static Color DARKGREEN;
	private static JButton back, answers, reset;
	
	public Pelvis2(Container pane, boolean colorblind)
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
			File f = new File("resources" + File.separator + "Pelvis2.jpg");
			bi = ImageIO.read(f);
			
			psiss = "Posterior superior iliac spine";
			piiss = "Posterior inferior iliac spine";
			gsns = "Greater sciatic notch";
			ibs = "Ischial body";
			iss = "Ischial spine";
			ihs = "Ischium";
			its = "Ischial tuberosity";
			irs = "Ischial ramus";
			ofs = "Obturator foramen";
			iprs = "Inferior pubic ramus";
			ps = "Pubis";
			bps = "Body of pubis";
			ats = "Acetabulum";
			aiiss = "Anterior inferior iliac spine";
			asiss = "Anterior superior iliac spine";
			ics = "Iliac crest";
			ils = "Ilium";
			
			psis = new JTextField();
			psis.setBackground(Color.WHITE);
			psis.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(psis.getText().equalsIgnoreCase(psiss))
						{
							
							psis.setForeground(cc);
							psis.setBorder(null);
							psis.setEditable(false);
							
						}
						else
						{
							
							psis.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			psis.setBounds(60,245,200,25);
			add(psis);
			
			piis = new JTextField();
			piis.setBackground(Color.WHITE);
			piis.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(piis.getText().equalsIgnoreCase(piiss))
						{
							
							piis.setForeground(cc);
							piis.setBorder(null);
							piis.setEditable(false);
							
						}
						else
						{
							
							piis.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			piis.setBounds(90,320,200,25);
			add(piis);
			
			gsn = new JTextField();
			gsn.setBackground(Color.WHITE);
			gsn.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(gsn.getText().equalsIgnoreCase(gsns))
						{
							
							gsn.setForeground(cc);
							gsn.setBorder(null);
							gsn.setEditable(false);
							
						}
						else
						{
							
							gsn.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			gsn.setBounds(130,360,150,25);
			add(gsn);
			
			ib = new JTextField();
			ib.setBackground(Color.WHITE);
			ib.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(ib.getText().equalsIgnoreCase(ibs))
						{
							
							ib.setForeground(cc);
							ib.setBorder(null);
							ib.setEditable(false);
							
						}
						else
						{
							
							ib.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			ib.setBounds(180,400,100,25);
			add(ib);
			
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
			
			is.setBounds(180,435,100,25);
			add(is);
			
			ih = new JTextField();
			ih.setBackground(Color.WHITE);
			ih.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(ih.getText().equalsIgnoreCase(ihs))
						{
							
							ih.setForeground(cc);
							ih.setBorder(null);
							ih.setEditable(false);
							
						}
						else
						{
							
							ih.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			ih.setBounds(140,505,100,25);
			add(ih);
			
			it = new JTextField();
			it.setBackground(Color.WHITE);
			it.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(it.getText().equalsIgnoreCase(its))
						{
							
							it.setForeground(cc);
							it.setBorder(null);
							it.setEditable(false);
							
						}
						else
						{
							
							it.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			it.setBounds(110,535,130,25);
			add(it);
			
			ir = new JTextField();
			ir.setBackground(Color.WHITE);
			ir.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(ir.getText().equalsIgnoreCase(irs))
						{
							
							ir.setForeground(cc);
							ir.setBorder(null);
							ir.setEditable(false);
							
						}
						else
						{
							
							ir.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			ir.setBounds(180,575,100,25);
			add(ir);
			
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
			
			of.setBounds(400,550,130,25);
			add(of);
			
			ipr = new JTextField();
			ipr.setBackground(Color.WHITE);
			ipr.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(ipr.getText().equalsIgnoreCase(iprs))
						{
							
							ipr.setForeground(cc);
							ipr.setBorder(null);
							ipr.setEditable(false);
							
						}
						else
						{
							
							ipr.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			ipr.setBounds(590,560,140,25);
			add(ipr);
			
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
			
			p.setBounds(590,475,100,25);
			add(p);
			
			bp = new JTextField();
			bp.setBackground(Color.WHITE);
			bp.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(bp.getText().equalsIgnoreCase(bps))
						{
							
							bp.setForeground(cc);
							bp.setBorder(null);
							bp.setEditable(false);
							
						}
						else
						{
							
							bp.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			bp.setBounds(590,445,100,25);
			add(bp);
			
			at = new JTextField();
			at.setBackground(Color.WHITE);
			at.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(at.getText().equalsIgnoreCase(ats))
						{
							
							at.setForeground(cc);
							at.setBorder(null);
							at.setEditable(false);
							
						}
						else
						{
							
							at.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			at.setBounds(570,345,100,25);
			add(at);
			
			aiis = new JTextField();
			aiis.setBackground(Color.WHITE);
			aiis.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(aiis.getText().equalsIgnoreCase(aiiss))
						{
							
							aiis.setForeground(cc);
							aiis.setBorder(null);
							aiis.setEditable(false);
							
						}
						else
						{
							
							aiis.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			aiis.setBounds(570,300,200,25);
			add(aiis);
			
			asis = new JTextField();
			asis.setBackground(Color.WHITE);
			asis.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(asis.getText().equalsIgnoreCase(asiss))
						{
							
							asis.setForeground(cc);
							asis.setBorder(null);
							asis.setEditable(false);
							
						}
						else
						{
							
							asis.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			asis.setBounds(620,210,200,25);
			add(asis);
			
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
			
			ic.setBounds(620,155,100,25);
			add(ic);
			
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
			
			il.setBounds(620,105,100,25);
			add(il);
			
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
			
			JTextField[] fields = new JTextField[]{psis,piis,gsn,ib,is,ih,it,ir,of,ipr,p,bp,at,aiis,asis,ic,il};
			String[] strings = new String[]{psiss,piiss,gsns,ibs,iss,ihs,its,irs,ofs,iprs,ps,bps,ats,aiiss,asiss,ics,ils};
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
