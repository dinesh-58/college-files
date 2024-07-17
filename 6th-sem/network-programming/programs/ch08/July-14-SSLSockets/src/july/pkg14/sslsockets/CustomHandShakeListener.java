package july.pkg14.sslsockets;

import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;

public class CustomHandShakeListener implements HandshakeCompletedListener {

	@Override
	public void handshakeCompleted(HandshakeCompletedEvent event) {
		System.out.println("Using session: " + event.getSession());
//		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}
	
}
