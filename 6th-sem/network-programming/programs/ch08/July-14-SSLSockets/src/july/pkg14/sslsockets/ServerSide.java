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
public class ServerSide {

	public static void main(String[] args) {
		try {
			// keystore file is in same folder as this i.e. in this package's folder
			System.setProperty("javax.net.ssl.keystore", "C://Users/sujal/Downloads/setup/keystore.jks");
//			System.setProperty("javax.net.ssl.keystore", "./keystore.jks");
			System.setProperty("javax.net.ssl.keystorePassword", "password");
			SSLServerSocketFactory sslServerSocketFactory = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
			SSLServerSocket sslServerSocket = (SSLServerSocket) sslServerSocketFactory.createServerSocket(8080);
			SSLSocket sslSocket = (SSLSocket) sslServerSocket.accept();
			System.out.println("client connected from: " + sslSocket.getInetAddress() + ":"+sslSocket.getPort());
			
		} catch (Exception e) {
			// use this to get line number where exception occured
			System.err.println(Arrays.toString(e.getStackTrace()));
			System.err.println(e.getMessage());
		}
	}

}
