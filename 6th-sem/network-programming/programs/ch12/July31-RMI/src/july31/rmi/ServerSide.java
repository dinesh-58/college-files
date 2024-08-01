package july31.rmi;

import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;

public class ServerSide {
	public static void main(String[] args) {
		try {
			IAdder adder = new AdderImpl();
			IAdder skeleton = (IAdder) UnicastRemoteObject.exportObject((IAdder) adder, 0);

			Registry registry = LocateRegistry.getRegistry();
//			registry.bind("foo", skeleton);
			registry.rebind("foo", skeleton);
			System.out.println("Server ready ");
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
}
