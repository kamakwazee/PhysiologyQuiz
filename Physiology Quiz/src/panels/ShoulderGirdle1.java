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

public class ShoulderGirdle1 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8545790319949725166L;
	static JTextField aj,c,s,ae,se,ae2,tl,se2;
	static Color DARKGREEN, cc;
	private static BufferedImage bi;
	private static String ajs,cs,ss,aes,ses,ae2s,tls,se2s;
	private static JButton back, answers, reset;
	
	public ShoulderGirdle1(Container pane, boolean colorblind)
	{
		
		JPanel panel = this;
		setLayout(null);
		setBackground(Color.WHITE);
		pane.setBackground(Color.WHITE);
		DARKGREEN = new Color(0,153,0);
		
		ajs = "Acromioclavicular joint";
		cs = "Clavicle";
		ss = "Scapula";
		aes = ae2s = "Acromial end";
		ses = se2s = "Sternal end";
		tls = "Trapezoid line";
		
		if(colorblind)
			cc = Color.BLUE;
		else
			cc = DARKGREEN;
		
		try {
			File f = new File("resources" + File.separator + "ShoulderGirdle1.jpg");
			bi = ImageIO.read(f);
			
			aj = new JTextField();
			aj.setBackground(Color.WHITE);
			aj.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(aj.getText().equalsIgnoreCase(ajs))
						{
							
							aj.setForeground(cc);
							aj.setBorder(null);
							aj.setEditable(false);
							
						}
						else
						{
							
							aj.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			aj.setBounds(100,100,150,25);
			add(aj);
			
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
			
			c.setBounds(300,130,100,25);
			add(c);
			
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
			
			s.setBounds(100,490,100,25);
			add(s);
			
			ae = new JTextField();
			ae.setBackground(Color.WHITE);
			ae.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(ae.getText().equalsIgnoreCase(aes))
						{
							
							ae.setForeground(cc);
							ae.setBorder(null);
							ae.setEditable(false);
							
						}
						else
						{
							
							ae.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			ae.setBounds(440,240,100,25);
			add(ae);
			
			se = new JTextField();
			se.setBackground(Color.WHITE);
			se.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(se.getText().equalsIgnoreCase(ses))
						{
							
							se.setForeground(cc);
							se.setBorder(null);
							se.setEditable(false);
							
						}
						else
						{
							
							se.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			se.setBounds(670,80,100,25);
			add(se);
			
			ae2 = new JTextField();
			ae2.setBackground(Color.WHITE);
			ae2.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(ae2.getText().equalsIgnoreCase(ae2s))
						{
							
							ae2.setForeground(cc);
							ae2.setBorder(null);
							ae2.setEditable(false);
							
						}
						else
						{
							
							ae2.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			ae2.setBounds(440,310,100,25);
			add(ae2);
			
			tl = new JTextField();
			tl.setBackground(Color.WHITE);
			tl.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(tl.getText().equalsIgnoreCase(tls))
						{
							
							tl.setForeground(cc);
							tl.setBorder(null);
							tl.setEditable(false);
							
						}
						else
						{
							
							tl.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			tl.setBounds(500,340,100,25);
			add(tl);
			
			se2 = new JTextField();
			se2.setBackground(Color.WHITE);
			se2.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(se2.getText().equalsIgnoreCase(se2s))
						{
							
							se2.setForeground(cc);
							se2.setBorder(null);
							se2.setEditable(false);
							
						}
						else
						{
							
							se2.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			se2.setBounds(690,350,100,25);
			add(se2);
			
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
			
			JTextField[] fields = new JTextField[]{aj,c,s,ae,se,ae2,tl,se2};
			String[] strings = new String[]{ajs,cs,ss,aes,ses,ae2s,tls,se2s};
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
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
