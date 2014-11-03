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

public class SuperiorFetalSkull extends JPanel{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2485035365327738440L;
	static JTextField fb,pb,pf,af,ob;
	static Color DARKGREEN, cc;
	private static BufferedImage bi;
	private static String[] fbs,pbs,pfs,afs,obs;
	private static JButton back, answers1, answers2, reset;
	
	public SuperiorFetalSkull(Container pane, boolean colorblind)
	{
		
		JPanel panel = this;
		setLayout(null);
		setBackground(Color.WHITE);
		pane.setBackground(Color.WHITE);
		DARKGREEN = new Color(0,153,0);
		
		fbs = new String[]{"Frontal bone"};
		pbs = new String[]{"Parietal bone"};
		pfs = new String[]{"Posterior fontanel", "Occipital fontanel"};
		afs = new String[]{"Anterior fontanel", "Frontal fontanel"};
		obs = new String[]{"Occipital bone"};
		
		if(colorblind)
			cc = Color.BLUE;
		else
			cc = DARKGREEN;
		
		try {
			File f = new File("resources" + File.separator + "SuperiorFetalSkull.jpg");
			bi = ImageIO.read(f);
			
			fb = new JTextField();
			fb.setBackground(Color.WHITE);
			fb.addActionListener(
				new ActionListener(){
					
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
							
							fb.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			fb.setBounds(130,190,110,25);
			add(fb);
			
			pb = new JTextField();
			pb.setBackground(Color.WHITE);
			pb.addActionListener(
				new ActionListener(){
					
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
							
							pb.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			pb.setBounds(80,325,110,25);
			add(pb);
			
			pf = new JTextField();
			pf.setBackground(Color.WHITE);
			pf.addActionListener(
				new ActionListener(){
					
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
							
							pf.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			pf.setBounds(165,460,125,25);
			add(pf);
			
			af = new JTextField();
			af.setBackground(Color.WHITE);
			af.addActionListener(
				new ActionListener(){
					
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
							
							af.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			af.setBounds(590,145,125,25);
			add(af);
			
			ob = new JTextField();
			ob.setBackground(Color.WHITE);
			ob.addActionListener(
				new ActionListener(){
					
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
							
							ob.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			ob.setBounds(590,485,110,25);
			add(ob);
			
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
			
			JTextField[] fields = new JTextField[]{fb,pb,pf,af,ob};
			String[][] strings = new String[][]{fbs,pbs,pfs,afs,obs};
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
									if(strings[i].length > 1)
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
									else
									{
										
										if(fields[i].getText().equalsIgnoreCase(strings[i][0]))
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
			// TODO Auto-generated catch block
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
