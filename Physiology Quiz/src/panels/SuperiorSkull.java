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
			
			sb.setBounds(80,200,100,25);
			add(sb);
			
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
