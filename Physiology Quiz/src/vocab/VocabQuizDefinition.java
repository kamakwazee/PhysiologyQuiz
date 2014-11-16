package vocab;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import quiz.Quiz;

public class VocabQuizDefinition extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 42606383242485348L;
	public static JPanel panel;
	private static JTextArea[] defAreas;
	private static String[] definitions;
	private static JTextField[]  wordFields;
	private static String[] words;
	private static Color DARKGREEN;
	private static Color cc;
	private static JButton next, menu, defs, dtw;
	private static JTextField fieldOnScreen;
	private static JTextArea areaOnScreen;
	private static int lastIndex = -1;
	
	private static void splitWordsAndDefs(String[] str)
	{
		
		ArrayList<String> wordList  = new ArrayList<String>();
		ArrayList<String> defList = new ArrayList<String>();
		for(String s : str)
		{
			
			String word = "";
			String def = "";
			char[] ch = s.toCharArray();
			int section = 0;
			for(int i = 0; i < ch.length; i++)
			{
				
				if(section == 0)
				{
					
					if(ch[i] == ' ' && ch[i+1] == '-')
					{
						
						section = 1;
						
					}
					else
					{
						
						word += ch[i];
						
					}
					
				}
				else
				{
					
					if(!((ch[i-1] == '-' && ch[i] == ' ') || (ch[i] == '-' && ch[i+1] == ' ')))
					{
						
						def += ch[i];
						
					}
					
				}
				
			}
			
			wordList.add(word);
			defList.add(def);
			
		}
		
		words = wordList.toArray(new String[wordList.size()]);
		definitions = defList.toArray(new String[defList.size()]);
		
	}
	
	private static String getTextWithoutEnter(String t)
	{
		
		char[] ch = t.toCharArray();
		String s = "";
		for(char c : ch)
		{
			
			if(c != '\n')
				s += c;
			
		}
		return s;
		
	}
	
	private static JTextArea makeDefArea(String def)
	{
		
		JTextArea defArea = new JTextArea();
		defArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		defArea.setBackground(Color.WHITE);
		defArea.setLineWrap(true);
		defArea.setWrapStyleWord(true);
		defArea.setBounds(200,250,500,100);
		areaOnScreen = defArea;
		defArea.addKeyListener(
			new KeyListener()
			{

				@Override
				public void keyTyped(KeyEvent e) {
					
					if(defArea.getForeground() == cc)
					{
						
						panel.remove(areaOnScreen);
						panel.remove(fieldOnScreen);
						areaOnScreen.setForeground(Color.BLACK);
						areaOnScreen.setEditable(true);
						areaOnScreen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
						areaOnScreen.setText("");
						
						Random r = new Random();
						int i = -1;
						do
						{
							i = r.nextInt(wordFields.length);
						}while(i == lastIndex);
						lastIndex = i;
						panel.add(areaOnScreen = defAreas[i]);
						panel.add(fieldOnScreen = wordFields[i]);
						
						panel.repaint();
						panel.revalidate();
						next.setVisible(false);
						areaOnScreen.requestFocusInWindow();
						
					}
					else
					{
					
						if(e.getKeyChar() == '\n')
						{
							String t = getTextWithoutEnter(defArea.getText());
							defArea.setText(t);
							
							if(t.equalsIgnoreCase(def))
							{
								
								defArea.setEditable(false);
								defArea.setForeground(cc);
								defArea.setBorder(null);
								next.setVisible(true);
								
							}
							else if(t.equals(""))
							{
								
								defArea.setText(def);
								defArea.setForeground(Color.RED);
								
							}
							
						}
						else
						{
							
							defArea.setForeground(Color.RED);
							defArea.setText(getTextWithoutEnter(defArea.getText()));
							
						}
						
					}
					
				}

				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				
				
			}
		);
		
		return defArea;
		
	}
	
	private static boolean inWordsArray(int i)
	{
		
		for(int ii = 0; ii < words.length; ii++)
		{
			
			if(i == ii)
			{
				
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	private static boolean inDefinitionsArray(int i)
	{
		
		for(int ii = 0; ii < definitions.length; ii++)
		{
			
			if(i == ii)
			{
				
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	private static JTextField makeWordField(String word)
	{
		
		JTextField wordField = new JTextField(word);
		wordField.setBorder(null);
		wordField.setEditable(false);
		wordField.setBackground(Color.WHITE);
		wordField.setBounds(200,200,300,25);
		fieldOnScreen = wordField;
		
		return wordField;
		
	}
	
	private static void getWordsAndDefs(File vocabquiz)
	{
		
		try {
			ArrayList<String> linesList = new ArrayList<String>();
			Scanner scan = new Scanner(vocabquiz);
			
			while(scan.hasNextLine())
			{
				
				linesList.add(scan.nextLine());
				
			}
			scan.close();
			
			splitWordsAndDefs(linesList.toArray(new String[linesList.size()]));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public VocabQuizDefinition(Container pane, boolean colorblind, File vocabquiz)
	{
		panel = this;
		setLayout(null);
		setBackground(Color.WHITE);
		pane.setBackground(Color.WHITE);
		DARKGREEN = new Color(0,153,0);
		if(colorblind)
			cc = Color.BLUE;
		else
			cc = DARKGREEN;
		
		getWordsAndDefs(vocabquiz);
		defAreas = new JTextArea[definitions.length];
		wordFields = new JTextField[words.length];
		for(int i = 0; i < definitions.length; i++)
		{
			
			defAreas[i] = makeDefArea(definitions[i]);
			
		}
		
		for(int i = 0; i < words.length; i++)
		{
			
			wordFields[i] = makeWordField(words[i]);
			
		}
		
		dtw = new JButton("Definition to Word");
		dtw.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel, new VocabQuizWord(pane, colorblind, vocabquiz));
					
				}
				
			}
		);
		dtw.setBounds(410,600,200,50);
		add(dtw);
		
		next = new JButton("Next");
		next.setBounds(200,330,100,25);
		next.setVisible(false);
		next.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					panel.remove(areaOnScreen);
					panel.remove(fieldOnScreen);
					areaOnScreen.setForeground(Color.BLACK);
					areaOnScreen.setEditable(true);
					areaOnScreen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
					areaOnScreen.setText("");
					
					Random r = new Random();
					int i = -1;
					do
					{
						i = r.nextInt(wordFields.length);
					}while(i == lastIndex);
					lastIndex = i;
					panel.add(areaOnScreen = defAreas[i]);
					panel.add(fieldOnScreen = wordFields[i]);
					
					panel.repaint();
					panel.revalidate();
					next.setVisible(false);
					areaOnScreen.requestFocusInWindow();
					
				}
				
			}
		);
		add(next);
		
		Random r = new Random();
		int i = -1;
		do
		{
			i = r.nextInt(wordFields.length);
		}while(i == lastIndex && inWordsArray(i) && inDefinitionsArray(i) && i != -1);
		lastIndex = i;
		add(areaOnScreen = defAreas[i]);
		add(fieldOnScreen = wordFields[i]);
		
		defs = new JButton("Definitions");
		defs.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel, new VocabDefinitions(panel,pane,words,definitions));
					
				}
				
			}
		);
		defs.setBounds(620,600,120,50);
		add(defs);
		
		menu = new JButton("Menu");
		menu.setBounds(750,600,100,50);
		menu.addActionListener(
				
			new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent e) {
					
					Quiz.setPanel(panel, Quiz.mm);
					
				}
				
			}
		
		);
		add(menu);
		
	}

}
