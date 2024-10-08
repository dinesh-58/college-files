/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package july.pkg14.sslsockets;

import java.util.Arrays;
import javax.net.ssl.*;

/**
 *
 * @author sujal
 */
public class ClientSide {

	public static void main(String[] args) {
		try {
			System.setProperty("javax.net.ssl.truststore", "C://Users/sujal/Downloads/setup/truststore.jks");
			System.out.println("trustore value: " + System.getProperty("javax.net.ssl.truststore"));
//			System.setProperty("javax.net.ssl.truststore", "./truststore.jks");
			System.setProperty("javax.net.ssl.truststorePassword", "password");

			// connecting to server socket
			SSLSocketFactory sslSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
			SSLSocket sslSocket = (SSLSocket) sslSocketFactory.createSocket("localhost", 8080);
//		sslSocket.connect(new InetSocketAddress("localhost", 8080));
			// NOTE:need handshaking in order to send message to SSL servers
//			DataOutputStream outStream = new DataOutputStream(sslSocket.getOutputStream());
//			outStream.writeUTF("is this secure?");
//			outStream.flush();
			/*
		String [] suites = sslSocket.getEnabledCipherSuites();
		sslSocket.setEnabledCipherSuites(suites);
			 */
			// NOTE: this is custom class
			sslSocket.addHandshakeCompletedListener(new CustomHandShakeListener());
			sslSocket.startHandshake();
			System.out.println("connected to address: " + sslSocket.getInetAddress());
			System.out.println("connected to socket: " + sslSocket.getRemoteSocketAddress());

			sslSocket.close();
		} catch (Exception e) {
			System.err.println(Arrays.toString(e.getStackTrace()));
			System.err.println(e.getMessage());
		}
	}

}
