package mvcexample;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Controller {
	private Model model;
	private View view;
	public Controller(Model m, View v) {
		this.model=m;
		this.view=v;
	}
	public void intController() {
		JButton btn = view.getBtn();
		JButton btn2 = view.getBtn2();
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				clear();
			}
		});
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				saveInfo();
				
			}
		});
		
	}
	public void clear() {
		view.getTxt1().setText("");
		view.getTxt2().setText("");
		view.getTxt3().setText("");
	}
	public void saveInfo() {
		view.getTxt1().setText(model.getFirstName());
		view.getTxt2().setText(model.getLastName());
		view.getTxt3().setText(model.getAddress());
	}

}
