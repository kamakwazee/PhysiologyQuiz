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

public class LateralFetalSkull extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 860816932223980393L;
	private static BufferedImage bi;
	private static JTextField pb,pf,ob,mf,tb,af,sf,fb;
	private static String[] pbs,pfs,obs,mfs,tbs,afs,sfs,fbs;
	private static Color cc, wc;
	private static JButton back, answers1, answers2, reset;
	
	public LateralFetalSkull(Container pane, Color correctcolor, Color wrongcolor)
	{
		JPanel panel = this;
		setLayout(null);
		setBackground(Color.WHITE);
		pane.setBackground(Color.WHITE);
		cc = correctcolor;
		wc = wrongcolor;
		
		try {
			File f = new File("resources" + File.separator + "LateralFetalSkull.jpg");
			bi = ImageIO.read(f);
			
			pbs = new String[]{"Parietal bone"};
			pfs = new String[]{"Posterior fontanel","Occipital fontanel"};
			obs = new String[]{"Occipital bone"};
			mfs = new String[]{"Posterolateral fontanel","Mastoid fontanel"};
			tbs = new String[]{"Temporal bone"};
			afs = new String[]{"Anterior fontanel","Frontal fontanel"};
			sfs = new String[]{"Anterolateral fontanel","Sphenoidal fontanel"};
			fbs = new String[]{"Frontal bone"};
			
			pb = new JTextField();
			pb.setBackground(Color.WHITE);
			pb.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(textInArray(pb,pbs))
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
			
			pb.setBounds(190,200,110,25);
			add(pb);
			
			pf = new JTextField();
			pf.setBackground(Color.WHITE);
			pf.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(textInArray(pf,pfs))
						{
							
							pf.setForeground(cc);
							pf.setBorder(null);
							pf.setEditable(false);
							
						}
						else
						{
							
							pf.setForeground(wc);
							
						}
						
					}
					
					
				}
					
			);
			
			pf.setBounds(130,280,130,25);
			add(pf);
			
			ob = new JTextField();
			ob.setBackground(Color.WHITE);
			ob.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(textInArray(ob,obs))
						{
							
							ob.setForeground(cc);
							ob.setBorder(null);
							ob.setEditable(false);
							
						}
						else
						{
							
							ob.setForeground(wc);
							
						}
						
					}
					
					
				}
					
			);
			
			ob.setBounds(140,390,110,25);
			add(ob);
			
			mf = new JTextField();
			mf.setBackground(Color.WHITE);
			mf.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(textInArray(mf,mfs))
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
			
			mf.setBounds(80,450,160,25);
			add(mf);
			
			tb = new JTextField();
			tb.setBackground(Color.WHITE);
			tb.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(textInArray(tb,tbs))
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
			
			tb.setBounds(370,500,110,25);
			add(tb);
			
			af = new JTextField();
			af.setBackground(Color.WHITE);
			af.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(textInArray(af,afs))
						{
							
							af.setForeground(cc);
							af.setBorder(null);
							af.setEditable(false);
							
						}
						else
						{
							
							af.setForeground(wc);
							
						}
						
					}
					
					
				}
					
			);
			
			af.setBounds(420,145,130,25);
			add(af);
			
			sf = new JTextField();
			sf.setBackground(Color.WHITE);
			sf.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(textInArray(sf,sfs))
						{
							
							sf.setForeground(cc);
							sf.setBorder(null);
							sf.setEditable(false);
							
						}
						else
						{
							
							sf.setForeground(wc);
							
						}
						
					}
					
					
				}
					
			);
			
			sf.setBounds(590,180,150,25);
			add(sf);
			
			fb = new JTextField();
			fb.setBackground(Color.WHITE);
			fb.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(textInArray(fb,fbs))
						{
							
							fb.setForeground(cc);
							fb.setBorder(null);
							fb.setEditable(false);
							
						}
						else
						{
							
							fb.setForeground(wc);
							
						}
						
					}
					
					
				}
					
			);
			
			fb.setBounds(630,235,110,25);
			add(fb);
			
			back = new JButton("Back");
			back.setBounds(740,600,110,50);
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
			
			JTextField[] fields = new JTextField[]{pb,pf,ob,mf,tb,af,sf,fb};
			String[][] strings = new String[][]{pbs,pfs,obs,mfs,tbs,afs,sfs,fbs};
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
									if(fields[i].getText().equalsIgnoreCase(strings[i][0]) || fields[i].getText().equalsIgnoreCase(strings[i][1]))
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
			
			answers1 = new JButton("Answers 1");
			answers1.setBounds(500,600,110,50);
			answers1.addActionListener(
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						for(int i = 0; i < fields.length; i++)
						{
							
							fields[i].setText(strings[i][0]);
							fields[i].setForeground(Color.BLACK);
							fields[i].setBorder(null);
							fields[i].setEditable(false);
							
						}
						
					}
					
					
					
				}
			);
			add(answers1);
			
			answers2 = new JButton("Answers 2");
			answers2.setBounds(620,600,110,50);
			answers2.addActionListener(
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						for(int i = 0; i < fields.length; i++)
						{
							if(strings[i].length > 1)
								fields[i].setText(strings[i][1]);
							else
								fields[i].setText(strings[i][0]);
							fields[i].setForeground(Color.BLACK);
							fields[i].setBorder(null);
							fields[i].setEditable(false);
							
						}
						
					}
					
					
					
				}
			);
			add(answers2);
			
			reset = new JButton("Reset");
			reset.setBounds(380,600,110,50);
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
	
	private static boolean textInArray(JTextField field, String[] text)
	{
		
		for(String str : text)
		{
			
			if(field.getText().equalsIgnoreCase(str))
				return true;
			
		}
		
		return false;
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.drawImage(bi,67,59,this);
		
	}

}
