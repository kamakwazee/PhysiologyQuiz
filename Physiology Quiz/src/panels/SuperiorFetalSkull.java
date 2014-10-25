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
	private static String fbs,pbs,pfs,afs,obs;
	private static JButton back, answers, reset;
	
	public SuperiorFetalSkull(Container pane, boolean colorblind)
	{
		
		JPanel panel = this;
		setLayout(null);
		setBackground(Color.WHITE);
		pane.setBackground(Color.WHITE);
		DARKGREEN = new Color(0,153,0);
		
		fbs = "Frontal bone";
		pbs = "Parietal bone";
		pfs = "Posterior fontanel";
		afs = "Anterior fontanel";
		obs = "Occipital bone";
		
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
			
			fb.setBounds(130,190,110,25);
			add(fb);
			
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
			
			pb.setBounds(80,325,110,25);
			add(pb);
			
			pf = new JTextField();
			pf.setBackground(Color.WHITE);
			pf.addActionListener(
				new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(pf.getText().equalsIgnoreCase(pfs))
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
						
						if(af.getText().equalsIgnoreCase(afs))
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
			
			ob.setBounds(590,485,110,25);
			add(ob);
			
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
			
			JTextField[] fields = new JTextField[]{fb,pb,pf,af,ob};
			String[] strings = new String[]{pbs,pbs,pfs,afs,obs};
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
