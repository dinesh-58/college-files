/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package june22;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author sujal
 */
public class CustomJPanel extends JPanel {
	// copmonents(jpanel) by themselves can't have text content
	// let's change that
	private String textContent;
	public CustomJPanel() {
		textContent = "Hello";
	}
	public CustomJPanel(String textContent) {
		this.textContent = textContent;
	}

	@Override
protected void paintComponent(Graphics g) {
//		super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.black);
		Font myFont = new Font("TimesRoman", Font.BOLD, 30);
		g2d.setFont(myFont);
//		g2d.drawString(textContent, 20, 20);

//		g2d.drawLine(0, 150, 400, 150);

//		face
		g2d.drawOval(50, 50, 400, 400);
		g2d.setColor(Color.yellow);
		g2d.fillOval(50, 50, 400, 400);

// eyes
g2d.drawOval(80, 100, 100, 100);
		g2d.setColor(Color.black);
g2d.fillOval(50, 50, 100, 100);
	}
	
}
