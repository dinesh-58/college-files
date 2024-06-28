/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvcexample;
public class MVCExample {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Model m = new Model();
		m.setFirstName("Ram bahadur");
		m.setLastName("Sharma");
		m.setAddress("Kathmandu");
		View v = new View();
		Controller c = new Controller(m,v);
		c.intController();
	}
	
}
