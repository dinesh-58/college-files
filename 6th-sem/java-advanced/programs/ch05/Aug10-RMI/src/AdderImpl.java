import java.rmi.RemoteException;

public class AdderImpl implements Adder {

	@Override
	public int sum(int a, int b) throws RemoteException {
		return a + b;
	}
}
