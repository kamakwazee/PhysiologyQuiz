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

public class AnteriorSkull extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3492728240060628412L;
	static JTextField pb, nb, sb, tb, eb, lb, zb, mx, ma, fb, sof, oc, mnc, inc, v;
	static Color DARKGREEN, cc;
	private static BufferedImage bi;
	private static String pbs, nbs, sbs, tbs, ebs, lbs, zbs, mxs, mas, fbs, sofs, ocs, mncs, incs, vs;
	private static JButton back;
	
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
