/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package june22;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author sujal
 */
public class WindowListenerDemo extends JFrame implements WindowListener{
	public WindowListenerDemo() {
		this.setSize(300,300);
		this.setVisible(true);
		this.addWindowListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void windowOpened(WindowEvent e) {
//		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("closing");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("closed");
	}
	

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("iconified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("de-iconified");
	}

	@Override
	public void windowActivated(WindowEvent e) {
//		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
//		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}
	
}
