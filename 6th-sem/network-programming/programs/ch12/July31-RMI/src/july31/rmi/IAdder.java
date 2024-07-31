/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package july31.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAdder extends Remote {
	public int Add(int a, int b) throws RemoteException; 	
}
