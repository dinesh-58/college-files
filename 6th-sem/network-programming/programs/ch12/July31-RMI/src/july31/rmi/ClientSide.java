package july31.rmi;
import java.rmi.registry.*;

/**
 *
 * @author sujal
 */
public class ClientSide {
	public static void main(String [] args) {
		try {
			Registry registry = LocateRegistry.getRegistry();
			// create obj having type interface in client side & invoke its methods
				// in actuality, implementation is instantiaed based on Registry?
			IAdder stub = (IAdder) registry.lookup("foo");
			System.out.println("Sum: " + stub.Add(1, 2));
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}
	
}
