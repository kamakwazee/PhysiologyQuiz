package menu;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public abstract class MenuSystem extends JPanel {
	
	int numButtons;
	static JButton[] buttons;
	
	public MenuSystem()
	{
		setLayout(null);
		
		numButtons = 0;
		buttons = new JButton[0];
		
	}
	
	private static void appendButton(JButton b)
	{
		
		JButton[] tempButtons = buttons;
		buttons = new JButton[buttons.length+1];
		for(int i = 0; i < tempButtons.length; i++)
			buttons[i] = tempButtons[i];
		buttons[tempButtons.length] = b;
		
	}
	
	public void addButton(String text, ActionListener al)
	{
		
		JButton button = new JButton(text);
		button.setBounds(340,50+60*numButtons,200,50);
		button.addActionListener(al);
		appendButton(button);
		add(button);
		numButtons++;
		
	}

}
