/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package june21;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author sujal
 */
public class FlowLayoutDemo {
	public FlowLayoutDemo() {
		JFrame jf = new JFrame("Flow Layout");
		jf.setLayout(new FlowLayout());
		jf.setVisible(true);
		jf.setSize(400, 400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel jl1 = new JLabel("ID:");
		JLabel jl2 = new JLabel("First name:");
		JLabel jl3 = new JLabel("Last name:");

		JTextField jt1 = new JTextField();
		JTextField jt2 = new JTextField();
		JTextField jt3 = new JTextField();
		jf.add(jl1); jf.add(jt1); jf.add(jl2);
		jf.add(jt2); jf.add(jl3); jf.add(jt3);


	}
	
}
