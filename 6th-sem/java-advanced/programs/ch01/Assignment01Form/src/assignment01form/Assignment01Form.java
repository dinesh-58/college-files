/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment01form;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author sujal
 */
public class Assignment01Form extends JFrame {

	public Assignment01Form() {
		this.setTitle("Student form");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setLayout(new GridLayout(6,2));

		this.add(new JLabel("First Name: "));
		JTextField tFieldFName = new JTextField();
		this.add(tFieldFName);


		this.add(new JLabel("Last Name: "));
		JTextField tFieldLName = new JTextField();
		this.add(tFieldLName);

		this.add(new JLabel("Gender: "));
		JPanel pnlGender = new JPanel(new FlowLayout());
			
		ButtonGroup btnGroupGender = new ButtonGroup();
		JRadioButton[] genderOptions = { 
			new JRadioButton("male"),
			new JRadioButton("female"),
			new JRadioButton("others"),
		};
		for(JRadioButton x: genderOptions) {
			btnGroupGender.add(x);
			pnlGender.add(x);
		}
		this.add(pnlGender);

		this.add(new JLabel("District: "));
		String[] districts = {
			"Kathmandu",
			"Pokhara",
			"Janakpur"
		};
		JComboBox comboDistrict = new JComboBox(districts);
		this.add(comboDistrict);
			
		this.add(new JLabel("Transport: "));
		JPanel pnlTransport = new JPanel(new FlowLayout());
		JCheckBox[] checkboxesTransport = {
			new JCheckBox("Bus"),
			new JCheckBox("Bike"),
			new JCheckBox("Car"),
		};
		for (JCheckBox j: checkboxesTransport) {
			pnlTransport.add(j);
		}
		this.add(pnlTransport);

		this.setVisible(true);
	}
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		new Assignment01Form();
	}
	
}
