package panels;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import quiz.Quiz;

public class Ch5Vocab extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8980207091717318534L;
	
	Color DARKGREEN;
	
	JLabel question;
	
	JTextArea answer;
	
	JButton next, mainmenu;
	
	static int index, pi;
	
	static int section = 0;
	
	static boolean correct = false;
	
	static String[] a = new String[]{"Wart","Mass produced by uncontrolled growth of epithelial skin cells"};

	static String[] b = new String[]{"Topical","medication applied to the skin"};

	static String[] c = new String[]{"Pruritus","Itching caused by skin disorders (infections), systemic disorders (cancer, kidney failure), psychogenic factors (emotional stress), or allergic reactions."};

	static String[] d = new String[]{"Psoriasis","A common, chronic skin disorder in which keratinocytes divide and move more quickly than normal from the stratum basale to the stratum corneum"};

	static String[] e = new String[]{"Laceration","An irregular tear of the skin."};

	static String[] f = new String[]{"Keratosis","Formation of a hardened growth of epidermal tissue"};

	static String[] g = new String[]{"Intradermal","Within the skin"};

	static String[] h = new String[]{"Impetigo","Superficial skin infection"};

	static String[] i = new String[]{"Hives","reddened elevated patches"};

	static String[] j = new String[]{"Hemangioma","Localized tumor of the skin and subcutaneous layer that results from an abnormal increase in blood vessels"};

	static String[] k = new String[]{"Corn","A painful thickening of the stratum corneum"};

	static String[] l = new String[]{"Contact dermatitis","Inflammation of the skin characterized by redness, itching, and swelling and caused by exposure of the skin to chemicals"};

	static String[] m = new String[]{"Cold Sore","A lesion, usually in the oral mucous membrane, caused by type 1 herpes simplex"};

	static String[] n = new String[]{"Athlete's foot","A superficial fungus infection of the skin"};

	static String[] o = new String[]{"Abrasion","A portion of the epidermis that has been scraped away"};

	static String[] p = new String[]{"Acne","An inflammation of sebaceous glands"};

	static String[] q = new String[]{"Pressure ulcers","shedding of epithelium caused by a constant deficiency of blood flow to tissues"};

	static String[] r = new String[]{"Burn","damage caused by excessive heat, electricity, radioactivity, or corrosive chemicals that denature the proteins in the skin cells."};

	static String[] s = new String[]{"Photosensitivity","A heightened reaction of the skin after consumption of certain medications or contact with certain substances."};

	static String[] t = new String[]{"Transdermal drug administration","Enables a drug contained within an adhesive skin patch to pass across the epidermis and into the blood vessels of the dermis"};

	static String[] u = new String[]{"Chemotherapy","The treatment of disease, usually cancer, by means of chemical substances or drugs."};

	static String[] v = new String[]{"Pallor","Paleness of the skin that may occur in conditions such as shock and anemia."};

	static String[] w = new String[]{"Erythema","Redness of the skin caused by engorgement"};

	static String[] x = new String[]{"Jaundice","Due to the buildup of the yellow pigment bilirubin in the skin"};

	static String[] y = new String[]{"Skin graft","transfer of a patch of healthy skin taken from a donor site to cover a wound."};

	static String[] z = new String[]{"Dermatology","The branch of medicine that specializes in diagnosing and treating skin disorders."};

	static String[] aa = new String[]{"Cyanotic","mucous membranes, nail beds, and skin appear bluish when blood is not picking up an adequate amount of oxygen in the lungs"};

	static String[] bb = new String[]{"Albin","white"};

	static String[] cc = new String[]{"Basale","base"};

	static String[] dd = new String[]{"Corneum","horny"};

	static String[] ee = new String[]{"Cut-","skin"};

	static String[] ff = new String[]{"Derm-","skin"};

	static String[] gg = new String[]{"Epi-","over"};

	static String[] hh = new String[]{"Fer-","carry"};

	static String[] ii = new String[]{"Lucidus","clear"};

	static String[] jj = new String[]{"Melan-","black"};

	static String[] kk = new String[]{"Seb-","fat"};

	static String[] ll = new String[]{"Sub-","under"};

	static String[] mm = new String[]{"Sudor-","sweat"};

	static String[][] all = new String[][]{a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,aa,bb,cc,dd,ee,ff,gg,hh,ii,jj,kk,ll,mm};
	
	
	public Ch5Vocab(Container pane)
	{
		JPanel panel = this;
		
		setBackground(Color.WHITE);
		pane.setBackground(Color.WHITE);
		DARKGREEN = new Color(0,153,0);
		
		setLayout(null);
		
		Random r = new Random();
		
		index = r.nextInt(all.length);
		
		question = new JLabel(all[index][0]);
		question.setBounds(200,100,question.getMaximumSize().width,question.getMaximumSize().height);
		add(question);
		
		answer = new JTextArea();
		answer.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		answer.setLineWrap(true);
		answer.setWrapStyleWord(true);
		answer.setBounds(200,120,500,300);
		add(answer);
		
		next = new JButton("NEXT");
		next.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					if(section == 0)
					{
						
						if(answer.getText().equals(all[index][1]))
						{
							
							correct = true;
							answer.setForeground(DARKGREEN);
							answer.setText("Correct\n\n" + all[index][1]);
							
						}
						else
						{
							
							correct = false;
							answer.setForeground(Color.RED);
							answer.setText("Wrong\n\n" + all[index][1]);
							
						}
						
						section = 1;
						
						
					}
					else
					{
						
						answer.setForeground(Color.BLACK);
						pi = index;
						do
						{
							index = r.nextInt(all.length);
						}while(index == pi);
						question.setText(all[index][0]);
						question.setBounds(question.getBounds().x,question.getBounds().y,question.getMaximumSize().width,question.getMaximumSize().height);
						answer.setText("");
						section = 0;
						
					}
					
				}
				
			}
		);
		next.setBounds(600,430,100,50);
		add(next);
		
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
		
	}

}
