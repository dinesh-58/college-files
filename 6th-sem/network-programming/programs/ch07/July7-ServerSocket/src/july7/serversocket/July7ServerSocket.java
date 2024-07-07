/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package july7.serversocket;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author sujal
 */
public class July7ServerSocket {

	public July7ServerSocket() {
		try {
			ServerSocket server = new ServerSocket(8080);
			// this obj holds client socket connections?
			Socket socket = server.accept();
			// only logged when a client connectes to this server
			System.out.println("Server connected.");
			DataInputStream in = new DataInputStream(socket.getInputStream());
			String msg = in.readUTF();
			System.out.print("Client says: ");
			System.out.println(msg);

			// doesn't run because program is stuck above waiting for client connection?
			// maybe look up event handling
			ClientSideCode.main(new String[0]);
			

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		new July7ServerSocket();
	}

}
