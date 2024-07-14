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

			SSLSocketFactory sslSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
			SSLSocket sslSocket = (SSLSocket) sslSocketFactory.createSocket("localhost", 8080);
			// NOTE:need handshaking in order to send message to SSL servers
//			DataOutputStream outStream = new DataOutputStream(sslSocket.getOutputStream());
//			outStream.writeUTF("is this secure?");
//			outStream.flush();
			sslSocket.close();
		} catch (Exception e) {
			System.err.println(Arrays.toString(e.getStackTrace()));
			System.err.println(e.getMessage());
		}
	}

}
