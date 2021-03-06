package vocab;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import quiz.Quiz;

public class VocabDefinitions extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6810208402151848208L;
	private static JTextArea defs;
	private static JScrollPane scroll;
	private static JButton back;
	
	private static String compileWordsAndDefs(String[] w, String[] d)
	{
		
		String s = "";
		
		for(int i = 0; i < w.length; i++)
		{
			
			s += "\n " + w[i] + " - " + d[i] + " \n";
			
		}
		
		return s;
		
	}
	
	public VocabDefinitions(JPanel vqp, Container pane, String[] words, String[] definitions)
	{
		
		JPanel panel = this;
		setLayout(null);
		setBackground(Color.WHITE);
		pane.setBackground(Color.WHITE);
		
		defs = new JTextArea(compileWordsAndDefs(words,definitions));
		defs.setEditable(false);
		scroll = new JScrollPane(defs);
		scroll.setBounds(3,3,pane.getWidth()-3,pane.getHeight()-75);
		add(scroll);
		
		back = new JButton("Back");
		back.setBounds(750,600,100,50);
		back.addActionListener(
				
			new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent e) {
					
					Quiz.setPanel(panel, vqp);
					
				}
				
			}
		
		);
		add(back);
		
		
	}

}
