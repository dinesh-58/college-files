import java.rmi.*;

public interface Adder extends Remote {
	public int sum(int a, int b) throws RemoteException;
}