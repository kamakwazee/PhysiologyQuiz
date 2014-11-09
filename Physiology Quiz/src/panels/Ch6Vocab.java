package panels;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

import quiz.BonesMenu;
import quiz.Quiz;

public class Ch6Vocab extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6162494636454122910L;
	public static JPanel panel;
	private static JTextArea[] defAreas;
	private static String[] definitions;
	private static JTextField[]  wordFields;
	private static String[] words;
	private static Color DARKGREEN;
	private static Color cc;
	private static JButton next, menu, defs;
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
					
					if(ch[i-1] != '-' && ch[i] != '-')
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
	
	private static JTextArea makeDefArea(String def)
	{
		
		JTextArea defArea = new JTextArea(def);
		defArea.setEditable(false);
		defArea.setBorder(null);
		defArea.setBackground(Color.WHITE);
		defArea.setLineWrap(true);
		defArea.setWrapStyleWord(true);
		defArea.setBounds(200,200,500,100);
		
		return defArea;
		
	}
	
	private static boolean equalsMinusDash(String text, String ans)
	{
		
		String s = "";
		char[] ch = ans.toCharArray();
		
		for(char c : ch)
		{
			
			if(c != '-')
			{
				
				s += c;
				
			}
			
		}
		
		return s.equalsIgnoreCase(text);
		
	}
	
	private static JTextField makeWordField(String word)
	{
		
		JTextField wordField = new JTextField();
		wordField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		wordField.setBackground(Color.WHITE);
		wordField.setBounds(200,300,300,25);
		wordField.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					if(wordField.getText().equalsIgnoreCase(word) || equalsMinusDash(wordField.getText(),word))
					{
						
						wordField.setForeground(cc);
						wordField.setEditable(false);
						wordField.setBorder(null);
						next.setVisible(true);
						
					}
					else
					{
						
						wordField.setForeground(Color.RED);
						
						
					}
					
				}
				
			}
		);
		
		return wordField;
		
	}
	
	private static void getWordsAndDefs()
	{
		
		try {
			ArrayList<String> linesList = new ArrayList<String>();
			Scanner scan = new Scanner(new File("resources" + File.separator + "Ch6Vocab.txt"));
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
	
	public Ch6Vocab(Container pane, boolean colorblind)
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
		
		getWordsAndDefs();
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
					fieldOnScreen.setForeground(Color.BLACK);
					fieldOnScreen.setEditable(true);
					fieldOnScreen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
					fieldOnScreen.setText("");
					
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
					fieldOnScreen.requestFocusInWindow();
					
				}
				
			}
		);
		add(next);
		
		Random r = new Random();
		int i = -1;
		do
		{
			i = r.nextInt(wordFields.length);
		}while(i == lastIndex);
		lastIndex = i;
		add(areaOnScreen = defAreas[i]);
		add(fieldOnScreen = wordFields[i]);
		
		defs = new JButton("Definitions");
		defs.addActionListener(
			new ActionListener()
			{
				
				public void actionPerformed(ActionEvent e)
				{
					
					Quiz.setPanel(panel, new Ch6VocabDefinitions(pane,words,definitions));
					
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
