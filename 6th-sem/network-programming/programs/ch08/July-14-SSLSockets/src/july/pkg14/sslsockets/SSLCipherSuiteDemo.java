/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package july.pkg14.sslsockets;

import java.util.Arrays;
import javax.net.ssl.*;

public class SSLCipherSuiteDemo {

	public static void main(String[] args) {
		try {
			SSLSocketFactory sslSockFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
			String host = "hcoe.edu.np";
			// default port number for https is 443(?)
			SSLSocket sslSocket = (SSLSocket) sslSockFactory.createSocket(host, 443);
			System.out.println(host + " supports these cipher suites / algorithms: ");
			for (String s : sslSocket.getSupportedCipherSuites()) {
				System.out.println("- " + s);
			}

			System.out.println(host +" has these cipher suites enabled:");
			for (String s : sslSocket.getEnabledCipherSuites()) {
				System.out.println("- " + s);
			}


		} catch (Exception e) {
			System.err.println(Arrays.toString(e.getStackTrace()));
			System.err.println(e.getMessage());
		}
	}

}
