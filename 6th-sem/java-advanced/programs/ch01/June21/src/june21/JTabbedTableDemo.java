/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package june21;

import javax.swing.*;

/**
 *
 * @author sujal
 */
public class JTabbedTableDemo {

	public JTabbedTableDemo() {
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setSize(450, 450);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		jf.setLayout(null);

		JPanel jp1 = new JPanel();
		JLabel jl1 = new JLabel("ID:");
		JLabel jl2 = new JLabel("First name:");
		JLabel jl3 = new JLabel("Last name:");

		JTextField jt1 = new JTextField();
		JTextField jt2 = new JTextField();
		JTextField jt3 = new JTextField();
		jp1.add(jl1); jp1.add(jt1); jp1.add(jl2);
		jp1.add(jt2); jp1.add(jl3); jp1.add(jt3);

		String[][] rowData = {
			{"1", "Sujal", "Gurung"},
			{"2", "Madan", "Krishna"},
			{"3", "Hari", "Bahadur"},};
		String[] columnNames = {"id", "First name", "Last name"};
		JTable jt = new JTable(rowData, columnNames);
		JScrollPane jsp = new JScrollPane(jt);
//		jsp.setBounds(20,20, 200, 200);

		JTabbedPane jtp = new JTabbedPane(JTabbedPane.TOP);

		jtp.add("Form", jp1);
		jtp.add("Table", jt);
		jf.add(jtp);

	}

}
