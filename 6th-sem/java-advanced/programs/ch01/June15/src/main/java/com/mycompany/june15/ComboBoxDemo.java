package com.mycompany.june15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author sujal
 */
public class ComboBoxDemo {

	public ComboBoxDemo() {
		JFrame jf = new JFrame("Combo Wombo");
//		jf.setResizable(false);
		jf.setSize(600, 600);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel jl1 = new JLabel("Choose your favorite food: ");
		jl1.setBounds(20, 20, 200, 20);
		jf.add(jl1);

		String[] choices = {"-- Select one --", "Mango", "Banana", "Apple"};
		JComboBox jcb1 = new JComboBox(choices);
		jcb1.setBounds(290, 20, 120, 20);
		jcb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jcb1.getSelectedIndex() == 0) {
					System.err.println("Invalid selection");
				} else {
					System.out.println("Selected " + jcb1.getSelectedItem());
				}
			}
		});
		jf.add(jcb1);
	}

}
