package javaapplication2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author sujal
 */
public class JavaApplication2 {

	public JavaApplication2() {

		JFrame jf = new JFrame("Practice");
// NOTE: if layout is null, specify bounds for components	
		jf.setLayout(null);

		// close button will only minimize otherwise
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		// size must be set before setVisible?
		jf.setSize(400, 400);
//		jf.getContentPane().setBackground(Color.BLUE);

		JLabel jl1 = new JLabel("First number: ");
		jl1.setBounds(20, 20, 100, 20);
		jf.add(jl1);

		JTextField jtf1 = new JTextField();
		jtf1.setBounds(140, 20, 100, 20);
		jf.add(jtf1);

		JLabel jl2 = new JLabel("Second number: ");
		jl2.setBounds(20, 60, 100, 20);
		jf.add(jl2);

		JTextField jtf2 = new JTextField();
		jtf2.setBounds(140, 60, 100, 20);
		jf.add(jtf2);

		JButton jb1 = new JButton("Add");
		jb1.setBounds(20, 100, 100, 20);
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Sum: " + (Integer.parseInt(jtf1.getText()) + Integer.parseInt(jtf2.getText())));
//				throw new UnsupportedOperationException("Not supported yet."); 
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
			}
		});
		jf.add(jb1);

		JButton jb2 = new JButton("Subtract");
		jb2.setBounds(140, 100, 100, 20);
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Difference: " + (Integer.parseInt(jtf1.getText()) - Integer.parseInt(jtf2.getText())));
			}
		});
		jf.add(jb2);

		JButton jb3 = new JButton("Multiply");
		jb3.setBounds(20, 140, 100, 20);
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Product: " + (Integer.parseInt(jtf1.getText()) * Integer.parseInt(jtf2.getText())));
			}
		});
		jf.add(jb3);

		JButton jb4 = new JButton("Divide");
		jb4.setBounds(140, 140, 100, 20);
		jb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Quotient: " + (Integer.parseInt(jtf1.getText()) / Integer.parseInt(jtf2.getText())));
			}
		});
		jf.add(jb4);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		JavaApplication2 ja2 = new JavaApplication2();
	}

}
