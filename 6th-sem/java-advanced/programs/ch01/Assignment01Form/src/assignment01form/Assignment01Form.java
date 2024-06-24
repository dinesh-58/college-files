/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change frame license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit frame template
 */
package assignment01form;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author sujal
 */
public class Assignment01Form extends MouseAdapter {

	JFrame frame;
	JTextField tFieldFName, tFieldLName;
	ButtonGroup btnGroupGender;
	JComboBox comboDistrict;
	ArrayList<JRadioButton> genderButtons;
	ArrayList<JCheckBox> checkboxesTransport;

	public Assignment01Form() {
		frame = new JFrame("Student form");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(new GridLayout(6, 2));

		frame.add(new JLabel("First Name: "));
		tFieldFName = new JTextField();
		frame.add(tFieldFName);

		frame.add(new JLabel("Last Name: "));
		tFieldLName = new JTextField();
		frame.add(tFieldLName);

		frame.add(new JLabel("Gender: "));
		JPanel pnlGender = new JPanel(new FlowLayout());

		String[] genderValues = {"male", "female", "others"};
		genderButtons = new ArrayList<JRadioButton>();
		btnGroupGender = new ButtonGroup();
		JRadioButton btnTemp;
		for (String g: genderValues) {
			btnTemp = new JRadioButton(g);
			genderButtons.add(btnTemp);
			btnGroupGender.add(btnTemp);
			pnlGender.add(btnTemp);
		}
		frame.add(pnlGender);

		frame.add(new JLabel("District: "));
		String[] districts = { "Kathmandu", "Pokhara", "Janakpur" };
		comboDistrict = new JComboBox(districts);
		frame.add(comboDistrict);

		frame.add(new JLabel("Transport: "));
		JPanel pnlTransport = new JPanel(new FlowLayout());

		checkboxesTransport = new ArrayList<JCheckBox>(); 
		String[] transportValues = {"Bus", "Bike", "Car"};
		JCheckBox checkBoxTemp;
		for (String t: transportValues) {
			checkBoxTemp = new JCheckBox(t);
			checkboxesTransport.add(checkBoxTemp);
			pnlTransport.add(checkBoxTemp);
		}
		/*
		for (JCheckBox j : checkboxesTransport) {
			pnlTransport.add(j);
		}
		*/
		frame.add(pnlTransport);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addMouseListener(this);
		frame.add(btnSubmit);

		frame.setVisible(true);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		new Assignment01Form();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		String message = "";
		message += "First Name: " + tFieldFName.getText();
		message += "\nLast Name: " + tFieldLName.getText();
		for(JRadioButton g: genderButtons) {
			if(g.isSelected()) {
				message += "\nGender: " + g.getText();
				break;
			}
		}
		message += "\nDistrict: " + comboDistrict.getSelectedItem();
		ArrayList<String> transportMeans = new ArrayList<String>();
		message += "\nTransport: ";
		for(JCheckBox t: checkboxesTransport) {
			if(t.isSelected()) message += t.getText() + ", ";
		}
		if (message.charAt(message.length()-2) == ',') {
			// TODO: remove last comma. meh
			System.out.println("test");
		}
		JOptionPane.showMessageDialog(frame, message);
	}

}
