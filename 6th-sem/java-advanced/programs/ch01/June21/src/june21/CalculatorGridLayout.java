/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package june21;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author sujal
 */
public class CalculatorGridLayout {

	public CalculatorGridLayout() {
		JFrame frame = new JFrame();
//		frame.setResizable(false);
		frame.setSize(500, 500);
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTextField screen = new JTextField();
//		screen.setBackground(new Color(111, true));
//		screen.setSize(400,50);

		JPanel panelButtons = new JPanel();
		panelButtons.setLayout(new GridLayout(4, 4));

		frame.add(screen, BorderLayout.NORTH);
		frame.add(panelButtons, BorderLayout.CENTER);

		String[] buttonValues = {
			"7", "8", "9", "C",
			"4", "5", "6", "+",
			"1", "2", "3", "-",
			"/", "0", "*", "=",};

		JButton[] buttons = new JButton[16];
		for (int i = 0; i < 16; i++) {
			buttons[i] = new JButton(buttonValues[i]);
			panelButtons.add(buttons[i]);
		}
// setVisible must be at end in order to display elements properly. else, need to resize
// https://stackoverflow.com/questions/8770617/java-items-appear-only-after-the-window-is-resize
		frame.setVisible(true);
	}

}
