package vocab;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;

import quiz.MainMenu;
import quiz.Quiz;

public class VocabQuizButton extends JButton {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7551700698587208260L;
	private File vbq;
	private Container p;

	public VocabQuizButton(Container pane, boolean colorblind, String name, File vocabquiz)
	{
		
		super(name);
		this.vbq = vocabquiz;
		this.p = pane;
		super.addActionListener(new VocabQuizButtonListener());
		
		
	}
	
	private class VocabQuizButtonListener implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e)
		{
			
			Quiz.setPanel(Quiz.mm, new VocabQuizWord(p, MainMenu.colorblind, vbq));
			
		}
		
	}

}
