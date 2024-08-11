import java.rmi.registry.*;

public class ClientSide {
	public static void main(String[] args) {
		try {
			Registry registry = LocateRegistry.getRegistry();
			Adder stub = (Adder) registry.lookup("add");
			System.out.println(stub.sum(1, 2));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
}
