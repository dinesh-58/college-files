/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package june22;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author sujal
 */
public class DrawStickMan extends JPanel {

	public DrawStickMan() {
	}

	public static void RunDemo() {
		JFrame jf = new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(400, 600);
//		jf.setLayout(null);

		DrawStickMan panel = new DrawStickMan();
//		panel.setPreferredSize(new Dimension(400, 600));

		jf.add(panel);
		jf.setVisible(true);

	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.black);
		g2d.drawOval(100, 100, 100, 100);

		g2d.drawLine(150, 150, 150, 400);
	}

}
