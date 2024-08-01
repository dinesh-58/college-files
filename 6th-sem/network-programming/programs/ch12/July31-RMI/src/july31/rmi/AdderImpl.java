/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package july31.rmi;
public class AdderImpl implements IAdder {
	public AdderImpl() {
//		super(); // calls constructor for which interface?
	}

	@Override
	public int Add(int a, int b) {
		return a + b;
	}
	
}
