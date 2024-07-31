/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package july31.rmi;

import java.rmi.RemoteException;
public class AdderImpl implements IAdder {
	public AdderImpl() {
		super(); // calls constructor for Remote class?

	}

	@Override
	public int Add(int a, int b) throws RemoteException {
		return a + b;
	}
	
}
