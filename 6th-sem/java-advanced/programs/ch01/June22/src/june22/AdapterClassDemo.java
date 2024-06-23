/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package june22;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 *
 * @author sujal
 */
public class AdapterClassDemo extends MouseAdapter {
	JFrame f;
	public AdapterClassDemo() {
		f = new JFrame();
		f.setSize(300, 300);
		f.setVisible(true);
//		f.addMouseListener(this);
		f.addMouseMotionListener(this);  // used for mouse drag
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Graphics g = f.getGraphics();
		Color c = Color.BLACK;
		g.setColor(c);
		g.drawOval(e.getX(), e.getY(), 5, 5);
		g.fillOval(e.getX(), e.getY(), 5, 5);

	}

	
	@Override
	public void mouseClicked(MouseEvent e) {
	}
	
}
