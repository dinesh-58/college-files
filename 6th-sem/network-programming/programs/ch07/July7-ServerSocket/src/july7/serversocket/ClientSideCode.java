/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package july7.serversocket;

import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author sujal
 */
public class ClientSideCode {

	public static void chatWithServer() throws Exception {
		// sir ko ip address
//			Socket socket = new Socket("192.168.6.213", 8080);
		Socket socket = new Socket("localhost", 8080);
		/*
	* prev. way of writing(using OutputStream & Writer) 
			OutputStream out = socket.getOutputStream();
			out.write
		 */
// new way: provides writeUTF() for ez-ness
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeUTF("socket");
		out.flush();
	}

	public static void main(String[] args) {
		try {
			chatWithServer();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
