/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package june30;

import java.io.InputStream;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 *
 * @author sujal
 */
public class June30 {

	public static void getHTTPHeaders() {
		// loop 10 times: print key-val
		Scanner scan = new Scanner(System.in);
		// NOTE: user must specify protocol. e.g: https
		System.out.print("Enter web address: ");
		String input = scan.nextLine();

		try {
			URL url = new URL(input);
			URLConnection conn = url.openConnection();
			System.out.println("Header: \t Value \n");
			for (int i = 0; i < 10; i++) {
				System.out.print(conn.getHeaderFieldKey(i) + ": \t");
				System.out.println(conn.getHeaderField(i));
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
//		getHTTPHeaders();
		SocketDemo();
	}

	public static void SocketDemo() {
		try {
			// NOTE: past paper question asks for daytime service. just use this url & port
			Socket socket = new Socket("time.nist.gov", 13);
			socket.setSoTimeout(10000);
			InputStream instream = socket.getInputStream();
			System.out.print("Current time: ");
			int c;
			while ((c = instream.read()) != -1) {
				System.out.write(c);
			}
			socket.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
