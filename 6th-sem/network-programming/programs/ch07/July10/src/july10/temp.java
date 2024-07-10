/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package july10;

import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author sujal
 */
public class temp {
	
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		try {
		Socket socket = new Socket("10.100.2.113", 8080);
		socket.setSoTimeout(5000);
		DataOutputStream outStream = new DataOutputStream(socket.getOutputStream());
		outStream.writeUTF("test");
		outStream.flush();
		outStream.close();
		socket.close();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}
