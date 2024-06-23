/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package june22;

import javax.swing.JFrame;

/**
 *
 * @author sujal
 */
public class CustomJPanelDemo {
	
	public CustomJPanelDemo() {
		JFrame jf = new JFrame();
		jf.setSize(500, 500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);

		CustomJPanel cjp = new CustomJPanel("This text should be different");
		// NOTE: only renders when bounds set
		cjp.setBounds(0,0,500,500);
		jf.add(cjp);
		jf.setVisible(true);
	}
}
