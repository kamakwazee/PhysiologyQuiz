package panels;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InferiorSkull extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3595634700783152258L;
	static JTextField pb, zb, tb, v, mf, sp, mp, tb2, pab, m, sb, fo, cac, jf, oc, fm;
	static Color DARKGREEN, cc;
	private static BufferedImage bi;
	private static String pbs, zbs, tbs, vs, mfs, sps, mps, pabs, ms, sbs, fos, cacs, jfs, ocs, fms;
	private static JButton back;
	
	public InferiorSkull(Container pane, boolean colorblind)
	{
		JPanel panel = this;
		setLayout(null);
		setBackground(Color.WHITE);
		pane.setBackground(Color.WHITE);
		DARKGREEN = new Color(0,153,0);
		
		pbs = "Palatine bone";
		zbs = "Zygomatic bone";
		tbs = "Temporal bone";
		vs = "Vomer";
		mfs = "Mandibular fossa";
		sps = "Styloid process";
		mps = "Mastoid process";
		pabs = "Parietal bone";
		ms = "Maxilla";
		sbs = "Sphenoid bone";
		fos = "Foramen ovale";
		cacs = "Cartoid canal";
		jfs = "Jugular foramen";
		ocs = "Occipital condyle";
		fms = "Foramen magnum";
		
		if(colorblind)
			cc = Color.BLUE;
		else
			cc = DARKGREEN;
		
		try{
			File f = new File("resources" + File.separator + "InferiorSkull.jpg");
			bi = ImageIO.read(f);
			
			
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
