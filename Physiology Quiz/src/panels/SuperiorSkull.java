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
	
	public SuperiorSkull(Container pane, boolean colorblind)
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
			File f = new File("resources" + File.separator + "SuperiorSkull.jpg");
			bi = ImageIO.read(f);
			
			/*cs = new JTextField();
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
			add(cs);*/
			
			
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
