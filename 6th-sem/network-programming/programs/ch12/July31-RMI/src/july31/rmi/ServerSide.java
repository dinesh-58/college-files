/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package july31.rmi;

import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;

public class ServerSide {
	public static void main(String[] args) {
		try {
			AdderImpl adder = new AdderImpl();
			IAdder skeleton = (IAdder) UnicastRemoteObject.exportObject(adder, 0);
			Registry registry = LocateRegistry.getRegistry();
			registry.bind("foo", skeleton);
			System.out.println("Server ready ");
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
}
