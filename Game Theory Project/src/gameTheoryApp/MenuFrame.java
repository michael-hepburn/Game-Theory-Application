package gameTheoryApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuFrame extends JFrame {
	private int choice;
	private JLabel directions;
	private JTextField answer;
	private JButton confirm;
	private JPanel content;
	
	MenuFrame(){
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		directions = new JLabel("Welcome to this Game Theory Tournament Simulator\n\n"
				+ "Please select one of these numbers:\n"
				+ "1. Set up user controlled game\n"
				+ "2. Set up automated tournament\n"
				+ "3. Help"
				+ "4. Quit");
		answer = new JTextField(20);
		confirm = new JButton("Confirm");
		confirm.addActionListener(ButtonListener);
		
		add(content);
		setVisible(true);
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			choice = JTextField
		}
		
	}

}
