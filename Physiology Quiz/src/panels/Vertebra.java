package panels;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import quiz.BonesMenu;
import quiz.Quiz;

public class Vertebra extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2115460040207751600L;
	private static BufferedImage bi;
	private static JTextField tp, l, sp, va, vf, b, p;
	private static JTextArea sapf;
	private static String tps, ls, sps, vas, vfs, bs, ps, sapfs;
	private static Color cc, wc;
	private static JButton back, answers, reset;
	
	public Vertebra(Container pane, Color correctcolor, Color wrongcolor)
	{
		JPanel panel = this;
		setLayout(null);
		setBackground(Color.WHITE);
		pane.setBackground(Color.WHITE);
		cc = correctcolor;
		wc = wrongcolor;
		
		try
		{
			File f = new File("resources" + File.separator + "Vertebra.jpg");
			bi = ImageIO.read(f);
			
			tps = "Transverse process";
			ls = "Lamina";
			sps = "Spinous process";
			vas = "Vertebral arch";
			vfs = "Vertebral foramen";
			bs = "Body";
			ps = "Pedicle";
			sapfs = "Superior articular process and facet";
			
			tp = new JTextField();
			tp.setBackground(Color.WHITE);
			tp.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(tp.getText().equalsIgnoreCase(tps))
						{
							
							tp.setForeground(cc);
							tp.setBorder(null);
							tp.setEditable(false);
							
						}
						else
						{
							
							tp.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			tp.setBounds(210,185,130,25);
			add(tp);
			
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
							
							l.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			l.setBounds(250,135,100,25);
			add(l);
			
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
			
			sp.setBounds(520,170,110,25);
			add(sp);
			
			va = new JTextField();
			va.setBackground(Color.WHITE);
			va.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(va.getText().equalsIgnoreCase(vas))
						{
							
							va.setForeground(cc);
							va.setBorder(null);
							va.setEditable(false);
							
						}
						else
						{
							
							va.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			va.setBounds(590,135,110,25);
			add(va);
			
			vf = new JTextField();
			vf.setBackground(Color.WHITE);
			vf.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(vf.getText().equalsIgnoreCase(vfs))
						{
							
							vf.setForeground(cc);
							vf.setBorder(null);
							vf.setEditable(false);
							
						}
						else
						{
							
							vf.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			vf.setBounds(600,440,120,25);
			add(vf);
			
			b = new JTextField();
			b.setBackground(Color.WHITE);
			b.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(b.getText().equalsIgnoreCase(bs))
						{
							
							b.setForeground(cc);
							b.setBorder(null);
							b.setEditable(false);
							
						}
						else
						{
							
							b.setForeground(wc);
							
						}
						
					}
					
				}
					
			);
			
			b.setBounds(575,495,100,25);
			add(b);
			
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
			
			p.setBounds(230,435,100,25);
			add(p);
			
			sapf = new JTextArea();
			sapf.setBackground(Color.WHITE);
			sapf.setLineWrap(true);
			sapf.setWrapStyleWord(true);
			
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
			
			JTextField[] fields = new JTextField[]{tp, l, sp, va, vf, b, p};
			String[] strings = new String[]{tps, ls, sps, vas, vfs, bs, ps};
			for(JTextField field : fields)
			{
				field.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				field.addActionListener(
					new ActionListener()
					{
						
						public void actionPerformed(ActionEvent e)
						{
							if((JTextField) e.getSource() == p && sapf.getText().isEmpty())
							{
								sapf.requestFocusInWindow();
							}
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
			sapf.addKeyListener(
				new KeyListener()
				{

					@Override
					public void keyTyped(KeyEvent e) {
						
						if(e.getKeyChar() == '\n')
						{
							if(sapf.getText().equalsIgnoreCase(sapfs + '\n'))
							{
								sapf.setForeground(cc);
								sapf.setBorder(null);
								sapf.setEditable(false);
									for(int i = 0; i < fields.length; i++)
									{
										if(fields[i].getText().equalsIgnoreCase(""))
										{
											fields[i].requestFocusInWindow();
											
										}
									}
									
							}
							else
							{
								sapf.setForeground(wc);
							}
						}
						
					}

					@Override
					public void keyPressed(KeyEvent e) {}

					@Override
					public void keyReleased(KeyEvent e) {}
					
					
					
				}
			);
			sapf.setBounds(130,320,130,40);
			add(sapf);
			sapf.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			
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
						sapf.setText(sapfs);
						sapf.setForeground(Color.BLACK);
						sapf.setBorder(null);
						sapf.setEditable(false);
						
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
						
						sapf.setText("");
						sapf.setBorder(BorderFactory.createLineBorder(Color.BLACK));
						sapf.setForeground(Color.BLACK);
						sapf.setEditable(true);
						
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
