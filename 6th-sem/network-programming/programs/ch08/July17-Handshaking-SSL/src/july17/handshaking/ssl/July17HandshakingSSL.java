/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package july17.handshaking.ssl;

import july.pkg14.sslsockets.HandShakeListener;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Arrays;
import javax.net.ssl.*;

/**
 *
 * @author sujal
 */
public class July17HandshakingSSL {

	public static void main(String[] args) {
		try {
			System.setProperty("javax.net.ssl.truststore", "C://Users/sujal/Downloads/setup/truststore.jks");
			System.setProperty("javax.net.ssl.truststorePassword", "password");

			HandShakeCompletionDemo();
		} catch (Exception e) {
			System.err.println(Arrays.toString(e.getStackTrace()));
			System.err.println(e.getMessage());
		}
	}

	public static void HandShakeCompletionDemo() throws IOException {
		// Note: this is client-side code only
		SSLSocketFactory sslSockFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
//		SSLSocket sslSocket = (SSLSocket) sslSockFactory.createSocket("localhost", 8080);
		SSLSocket sslSocket = (SSLSocket) sslSockFactory.createSocket();
		sslSocket.connect(new InetSocketAddress("localhost", 8080));
		/*
		String [] suites = sslSocket.getEnabledCipherSuites();
		sslSocket.setEnabledCipherSuites(suites);
*/
		// NOTE: this is custom class
		sslSocket.addHandshakeCompletedListener(new HandShakeListener());
		sslSocket.startHandshake();
		System.out.println("connected to address: "+sslSocket.getInetAddress());
		System.out.println("connected to socket: "+sslSocket.getRemoteSocketAddress());
		
	}
	
}
