/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.june15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author sujal
 */
public class RadioButtonDemo implements ActionListener {

	JRadioButton jr1, jr2, jr3;

	public RadioButtonDemo() {
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(600, 600);
		jf.setLayout(null);

		JLabel jl1 = new JLabel("Choose only one: ");
		jl1.setBounds(20, 20, 100, 20);
		jf.add(jl1);

		jr1 = new JRadioButton("Mo:Mo");
		jr1.setBounds(120, 20, 80, 20);
		jr1.addActionListener(this);
		jf.add(jr1);

		jr2 = new JRadioButton("Burger");
		jr2.setBounds(220, 20, 80, 20);
		jr2.addActionListener(this);
		jf.add(jr2);

		jr3 = new JRadioButton("Pizza");
		jr3.setBounds(320, 20, 80, 20);
		jr3.addActionListener(this);
		jf.add(jr3);

		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(jr1);
		bg1.add(jr2);
		bg1.add(jr3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JRadioButton) {
			System.out.println(((JRadioButton) e.getSource()).getText());
		}
	}

}
