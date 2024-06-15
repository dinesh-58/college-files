/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.june15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author sujal
 */
public class June15 {

	public June15() {
		JFrame jf = new JFrame("Checkers");
		jf.setSize(400, 400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);

		JLabel jl1 = new JLabel("Choices:");
		jl1.setBounds(20, 20, 80, 20);
		jf.add(jl1);

		JCheckBox jc1 = new JCheckBox("Mo:Mo");
		jc1.setBounds(20, 50, 80, 20);
		jf.add(jc1);

		JCheckBox jc2 = new JCheckBox("Burger");
		jc2.setBounds(20, 80, 80, 20);
		jf.add(jc2);

		JCheckBox jc3 = new JCheckBox("Pizza");
		jc3.setBounds(20, 110, 80, 20);
		jf.add(jc3);

		JButton jb1 = new JButton("submit");
		jb1.setBounds(20, 140, 80, 20);
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jc3.isSelected()) {
					System.out.println(jc3.getText());
				}
				if (jc2.isSelected()) {
					System.out.println(jc2.getText());
				}
				if (jc1.isSelected()) {
					System.out.println(jc1.getText());
				}
			}
		});
		jf.add(jb1);
	}

	public static void main(String[] args) {
//		June15 j = new June15();
//		RadioButtonDemo rbd = new RadioButtonDemo();
//		ComboBoxDemo cbd = new ComboBoxDemo();
		MenuDemo md = new MenuDemo();
	}
}
