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
import java.sql.*;

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
		for (String g : genderValues) {
			btnTemp = new JRadioButton(g);
			genderButtons.add(btnTemp);
			btnGroupGender.add(btnTemp);
			pnlGender.add(btnTemp);
		}
		frame.add(pnlGender);

		frame.add(new JLabel("District: "));
		String[] districts = {"Kathmandu", "Pokhara", "Janakpur"};
		comboDistrict = new JComboBox(districts);
		frame.add(comboDistrict);

		frame.add(new JLabel("Transport: "));
		JPanel pnlTransport = new JPanel(new FlowLayout());

		checkboxesTransport = new ArrayList<JCheckBox>();
		String[] transportValues = {"Bus", "Bike", "Car"};
		JCheckBox checkBoxTemp;
		for (String t : transportValues) {
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
//		createTable();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		String message = "";
		String fName = tFieldFName.getText();
		message += "First Name: " + fName;
		String lName = tFieldLName.getText();
		message += "\nLast Name: " + lName;
		String gender = "";
		for (JRadioButton g : genderButtons) {
			if (g.isSelected()) {
				gender = g.getText();
				break;
			}
		}
		message += "\nGender: " + gender;
		String district = (String) comboDistrict.getSelectedItem();
		message += "\nDistrict: " + district;
		String transportMeans = "";
//		ArrayList<String> transportMeans = new ArrayList<String>();
		message += "\nTransport: ";
		for (JCheckBox t : checkboxesTransport) {
			if (t.isSelected()) {
				transportMeans += t.getText() + ", ";
			}
		}
		message += transportMeans;
		if (message.charAt(message.length() - 2) == ',') {
			// TODO: remove last comma. meh
			System.out.println("test");
		}
		JOptionPane.showMessageDialog(frame, message);
		insertStudent(fName, lName, gender, district, transportMeans);
	}

	public static void createTable() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "");
			String sql = "create table student(id int primary key auto_increment, "
				+ "first_name varchar(50) not null, "
				+ "last_name varchar(50) not null, "
				+ "gender varchar(20) not null, "
				+ "district varchar(50) not null, "
				+ "vehicle_type varchar(50) not null"
				+ ");";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.execute();
			System.out.println("table created");

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public static void insertStudent(String fName, String lName, String gender, String district, String vehicle_type) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "");
			String sql = "insert into student(first_name, last_name, gender, district, vehicle_type) "
				+ "values(?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			// NOTE: index starts from 1 for prepared statement args
			ps.setString(1, fName);
			ps.setString(2, lName);
			ps.setString(3, gender);
			ps.setString(4, district);
			ps.setString(5, vehicle_type);
			ps.execute();
			System.out.println(fName + " " + lName + " stored in db");
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}

	}

}
