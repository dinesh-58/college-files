/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package june22;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author sujal
 */
public class KeyListenerDemo extends JFrame implements KeyListener {
	JLabel lbl;
	public KeyListenerDemo() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,400);
		this.addKeyListener(this);
		lbl = new JLabel("Input: ");
		this.add(lbl);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		lbl.setText(lbl.getText() + e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("key code: "+ e.getKeyCode());
		System.out.println("pressed "+ e.getKeyChar());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("released "+ e.getKeyChar());
	}
	
}
