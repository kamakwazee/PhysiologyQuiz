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

public class SuperiorSkull extends JPanel{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2485035365327738440L;
	static JTextField eb, cp, cg, sb, st, tb, pb, ob, fm, fb, oc, fo, jf;
	static Color DARKGREEN, cc;
	private static BufferedImage bi;
	private static String ebs, cps, cgs, sbs, sts, tbs, pbs, obs, fms, fbs, ocs, fos, jfs;
	private static JButton back, answers, reset;
	
	public SuperiorSkull(Container pane, boolean colorblind)
	{
		
		JPanel panel = this;
		setLayout(null);
		setBackground(Color.WHITE);
		pane.setBackground(Color.WHITE);
		DARKGREEN = new Color(0,153,0);
		ebs = "Ethmoid Bone";
		cps = "Cribriform plate";
		cgs = "Crista galli";
		sbs = "Sphenoid bone";
		sts = "Sella turcica";
		tbs = "Temporal bone";
		pbs = "Parietal bone";
		obs = "Occipital bone";
		fms = "Foramen magnum";
		fbs = "Frontal bone";
		ocs = "Optic canal";
		fos = "Forumen ovale";
		jfs = "Jugular foramen";
		if(colorblind)
			cc = Color.BLUE;
		else
			cc = DARKGREEN;
		
		try {
			File f = new File("resources" + File.separator + "SuperiorSkull.jpg");
			bi = ImageIO.read(f);
			
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
			
			eb.setBounds(50,87,110,25);
			add(eb);
			
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
							
							cp.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			cp.setBounds(185,80,100,25);
			add(cp);
			
			cg = new JTextField();
			cg.setBackground(Color.WHITE);
			cg.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(cg.getText().equalsIgnoreCase(cgs))
						{
							
							cg.setForeground(cc);
							cg.setBorder(null);
							cg.setEditable(false);
							
						}
						else
						{
							
							cg.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			cg.setBounds(185,110,100,25);
			add(cg);
			
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
			
			sb.setBounds(120,170,100,25);
			add(sb);
			
			st = new JTextField();
			st.setBackground(Color.WHITE);
			st.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(st.getText().equalsIgnoreCase(sts))
						{
							
							st.setForeground(cc);
							st.setBorder(null);
							st.setEditable(false);
							
						}
						else
						{
							
							st.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			st.setBounds(110,230,100,25);
			add(st);
			
			st = new JTextField();
			st.setBackground(Color.WHITE);
			st.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(st.getText().equalsIgnoreCase(sts))
						{
							
							st.setForeground(cc);
							st.setBorder(null);
							st.setEditable(false);
							
						}
						else
						{
							
							st.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			st.setBounds(110,230,100,25);
			add(st);
			
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
			
			tb.setBounds(100,325,100,25);
			add(tb);
			
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
			
			pb.setBounds(90,455,100,25);
			add(pb);
			
			ob = new JTextField();
			ob.setBackground(Color.WHITE);
			ob.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(ob.getText().equalsIgnoreCase(obs))
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
			
			ob.setBounds(100,500,100,25);
			add(ob);
			
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
							
							fm.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			fm.setBounds(200,545,120,25);
			add(fm);
			
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
			
			fb.setBounds(715,95,110,25);
			add(fb);
			
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
			
			oc.setBounds(715,175,110,25);
			add(oc);
			
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
							
							fo.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			fo.setBounds(715,235,110,25);
			add(fo);
			
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
							
							jf.setForeground(Color.RED);
							
						}
						
					}
					
				}
					
			);
			
			jf.setBounds(715,405,110,25);
			add(jf);
			
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
			
			JTextField[] fields = new JTextField[]{eb, cp, cg, sb, st, tb, pb, ob, fm, fb, oc, fo, jf};
			String[] strings = new String[]{ebs, cps, cgs, sbs, sts, tbs, pbs, obs, fms, fbs, ocs, fos, jfs};
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
