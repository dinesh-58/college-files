package mvcexample;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame{
	private JTextField txt1, txt2, txt3;
	private JLabel lbl1, lbl2, lbl3;
	private JButton btn,btn2;
	private JPanel p1,p2;
	public View() {
		p1= new JPanel();
		p2=new JPanel();
		lbl1= new JLabel("First Name");
		lbl2= new JLabel("Last Name");
		lbl3= new JLabel("Address");
		txt1=new JTextField(20);
		txt2= new JTextField(20);
		txt3= new JTextField(20);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		p1.add(lbl1);p1.add(txt1);p1.add(lbl2);p1.add(txt2);p1.add(lbl3);p1.add(txt3);
		p2.setLayout(new FlowLayout(FlowLayout.CENTER));
		btn = new JButton("Clear");
		btn2 = new JButton("Show Initialize Data");
		p2.add(btn2);
		p2.add(btn);
		this.add(p1);
		this.add(p2);
		this.setSize(1000, 200);
		this.setLayout(new GridLayout(3, 1));
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public JButton getBtn2() {
		return btn2;
	}
	public void setBtn2(JButton btn2) {
		this.btn2 = btn2;
	}
	public JTextField getTxt1() {
		return txt1;
	}
	public void setTxt1(JTextField txt1) {
		this.txt1 = txt1;
	}
	public JTextField getTxt2() {
		return txt2;
	}
	public void setTxt2(JTextField txt2) {
		this.txt2 = txt2;
	}
	public JTextField getTxt3() {
		return txt3;
	}
	public void setTxt3(JTextField txt3) {
		this.txt3 = txt3;
	}
	public JLabel getLbl1() {
		return lbl1;
	}
	public void setLbl1(JLabel lbl1) {
		this.lbl1 = lbl1;
	}
	public JLabel getLbl2() {
		return lbl2;
	}
	public void setLbl2(JLabel lbl2) {
		this.lbl2 = lbl2;
	}
	public JLabel getLbl3() {
		return lbl3;
	}
	public void setLbl3(JLabel lbl3) {
		this.lbl3 = lbl3;
	}
	public JButton getBtn() {
		return btn;
	}
	public void setBtn(JButton btn) {
		this.btn = btn;
	}
	public JPanel getP1() {
		return p1;
	}
	public void setP1(JPanel p1) {
		this.p1 = p1;
	}
	public JPanel getP2() {
		return p2;
	}
	public void setP2(JPanel p2) {
		this.p2 = p2;
	}

}
