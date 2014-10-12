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
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import quiz.Quiz;

public class LateralSkull extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5404043282314214437L;
	private static BufferedImage bi;
	private static JTextField cs,pb,tb,ls,ss,ob,zp,eam,mp,sp,mr,ma,mf,m,am,mx,zb,nb,lb,eb,sb,fb;
	private static Color cc; //Correct color
	private static Color DARKGREEN;
	private static JButton mainmenu;
	
	public LateralSkull(Container pane, boolean colorblind)
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
		
		try {
			File f = new File("resources" + File.separator + "LateralSkull.jpg");
			bi = ImageIO.read(f);
			
			cs = new JTextField();
			cs.setBackground(Color.WHITE);
			cs.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(cs.getText().equalsIgnoreCase("Coronal Suture"))
						{
							
							cs.setForeground(cc);
							cs.setBorder(null);
							cs.setEditable(false);
							
						}
						else
						{
							
							cs.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			cs.setBounds(95,108,110,25);
			add(cs);
			
			pb = new JTextField();
			pb.setBackground(Color.WHITE);
			pb.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(pb.getText().equalsIgnoreCase("Parietal Bone"))
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
			
			pb.setBounds(95,142,110,25);
			add(pb);
			
			tb = new JTextField();
			tb.setBackground(Color.WHITE);
			tb.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(tb.getText().equalsIgnoreCase("Temporal Bone"))
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
			
			tb.setBounds(100,192,110,25);
			add(tb);
			
			ls = new JTextField();
			ls.setBackground(Color.WHITE);
			ls.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(ls.getText().equalsIgnoreCase("Lambdoid Suture"))
						{
							
							ls.setForeground(cc);
							ls.setBorder(null);
							ls.setEditable(false);
							
						}
						else
						{
							
							ls.setForeground(Color.RED);
							
						}
						
					}
					
					
				}
					
			);
			
			ls.setBounds(60,225,120,25);
			add(ls);
			
			ss = new JTextField();
			ss.setBackground(Color.WHITE);
			ss.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(ss.getText().equalsIgnoreCase("Squamous Suture"))
						{
							
							ss.setForeground(cc);
							ss.setBorder(null);
							ss.setEditable(false);
							
						}
						else
						{
							
							ss.setForeground(Color.RED);
							
						}
						
					}
					
					
				}
					
			);
			
			ss.setBounds(60,265,125,25);
			add(ss);
			
			ob = new JTextField();
			ob.setBackground(Color.WHITE);
			ob.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(ob.getText().equalsIgnoreCase("Occipital Bone"))
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
			
			ob.setBounds(50,295,110,25);
			add(ob);
			
			zp = new JTextField();
			zp.setBackground(Color.WHITE);
			zp.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(zp.getText().equalsIgnoreCase("Zygomatic Process"))
						{
							
							zp.setForeground(cc);
							zp.setBorder(null);
							zp.setEditable(false);
							
						}
						else
						{
							
							zp.setForeground(Color.RED);
							
						}
						
					}
					
					
				}
					
			);
			
			zp.setBounds(90,330,140,25);
			add(zp);
			
			eam = new JTextField();
			eam.setBackground(Color.WHITE);
			eam.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(eam.getText().equalsIgnoreCase("Exterior Acoustic Meatus"))
						{
							
							eam.setForeground(cc);
							eam.setBorder(null);
							eam.setEditable(false);
							
						}
						else
						{
							
							eam.setForeground(Color.RED);
							
						}
						
					}
					
					
				}
					
			);
			
			eam.setBounds(45,390,170,25);
			add(eam);
			
			mp = new JTextField();
			mp.setBackground(Color.WHITE);
			mp.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(mp.getText().equalsIgnoreCase("Mastoid Process"))
						{
							
							mp.setForeground(cc);
							mp.setBorder(null);
							mp.setEditable(false);
							
						}
						else
						{
							
							mp.setForeground(Color.RED);
							
						}
						
					}
					
					
				}
					
			);
			
			mp.setBounds(90,420,120,25);
			add(mp);
			
			sp = new JTextField();
			sp.setBackground(Color.WHITE);
			sp.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(sp.getText().equalsIgnoreCase("Styloid Process"))
						{
							
							sp.setForeground(cc);
							sp.setBorder(null);
							sp.setEditable(false);
							
						}
						else
						{
							
							sp.setForeground(Color.RED);
							
						}
						
					}
					
					
				}
					
			);
			
			sp.setBounds(100,450,110,25);
			add(sp);
			
			mr = new JTextField();
			mr.setBackground(Color.WHITE);
			mr.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(mr.getText().equalsIgnoreCase("Mandibular Ramus"))
						{
							
							mr.setForeground(cc);
							mr.setBorder(null);
							mr.setEditable(false);
							
						}
						else
						{
							
							mr.setForeground(Color.RED);
							
						}
						
					}
					
					
				}
					
			);
			
			mr.setBounds(255,505,130,25);
			add(mr);
			
			ma = new JTextField();
			ma.setBackground(Color.WHITE);
			ma.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(ma.getText().equalsIgnoreCase("Mandibular Angle"))
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
			
			ma.setBounds(460,545,120,25);
			add(ma);
			
			fb = new JTextField();
			fb.setBackground(Color.WHITE);
			fb.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(fb.getText().equalsIgnoreCase("Frontal Bone"))
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
			
			fb.setBounds(715,100,110,25);
			add(fb);
			
			sb = new JTextField();
			sb.setBackground(Color.WHITE);
			sb.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(sb.getText().equalsIgnoreCase("Sphenoid Bone"))
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
			
			sb.setBounds(715,130,110,25);
			add(sb);
			
			eb = new JTextField();
			eb.setBackground(Color.WHITE);
			eb.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(eb.getText().equalsIgnoreCase("Ethmoid Bone"))
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
			
			eb.setBounds(715,170,110,25);
			add(eb);
			
			lb = new JTextField();
			lb.setBackground(Color.WHITE);
			lb.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(lb.getText().equalsIgnoreCase("Lacrimal Bone"))
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
			
			lb.setBounds(715,200,110,25);
			add(lb);
			
			nb = new JTextField();
			nb.setBackground(Color.WHITE);
			nb.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(nb.getText().equalsIgnoreCase("Nasal Bone"))
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
			
			nb.setBounds(715,295,110,25);
			add(nb);
			
			zb = new JTextField();
			zb.setBackground(Color.WHITE);
			zb.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(zb.getText().equalsIgnoreCase("Zygomatic Bone"))
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
			
			zb.setBounds(715,330,110,25);
			add(zb);
			
			mx = new JTextField();
			mx.setBackground(Color.WHITE);
			mx.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(mx.getText().equalsIgnoreCase("Maxilla"))
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
			
			mx.setBounds(715,365,110,25);
			add(mx);
			
			am = new JTextField();
			am.setBackground(Color.WHITE);
			am.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(am.getText().equalsIgnoreCase("Alveolar Margins"))
						{
							
							am.setForeground(cc);
							am.setBorder(null);
							am.setEditable(false);
							
						}
						else
						{
							
							am.setForeground(Color.RED);
							
						}
						
					}
					
					
				}
					
			);
			
			am.setBounds(715,420,110,25);
			add(am);
			
			m = new JTextField();
			m.setBackground(Color.WHITE);
			m.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(m.getText().equalsIgnoreCase("Mandible"))
						{
							
							m.setForeground(cc);
							m.setBorder(null);
							m.setEditable(false);
							
						}
						else
						{
							
							m.setForeground(Color.RED);
							
						}
						
					}
					
					
				}
					
			);
			
			m.setBounds(715,460,110,25);
			add(m);
			
			mf = new JTextField();
			mf.setBackground(Color.WHITE);
			mf.addActionListener(
				
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(mf.getText().equalsIgnoreCase("Mental Foramen"))
						{
							
							mf.setForeground(cc);
							mf.setBorder(null);
							mf.setEditable(false);
							
						}
						else
						{
							
							mf.setForeground(Color.RED);
							
						}
						
					}
					
					
				}
					
			);
			
			mf.setBounds(715,490,110,25);
			add(mf);
			
			mainmenu = new JButton("Menu");
			mainmenu.setBounds(750,600,100,50);
			mainmenu.addActionListener(
					
				new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						Quiz.setPanel(panel, Quiz.mm);
						
					}
					
				}
			
			);
			add(mainmenu);
			
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
