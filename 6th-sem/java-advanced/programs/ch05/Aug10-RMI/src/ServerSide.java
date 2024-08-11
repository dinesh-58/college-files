
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;

public class ServerSide {

	public static void main(String[] args) {
		try {
			AdderImpl obj = new AdderImpl();
			Adder skeleton = (Adder) UnicastRemoteObject.exportObject(obj, 0);
			Registry registry = LocateRegistry.getRegistry();

			// binding remote obj and all its methods
			registry.bind("add", skeleton);
			System.out.println("Server ready");
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
			ex.printStackTrace();
//			Logger.getLogger(ServerSide.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
