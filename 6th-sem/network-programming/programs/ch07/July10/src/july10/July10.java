/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package july10;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author sujal
 */
public class July10 {
	// loop server I/O i.e keep printing all messages sent to server

	public static void startServer() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ServerSocket server = new ServerSocket(8080);
		Socket socket = server.accept();
		socket.setSoTimeout(10000);
		System.out.println("client connected to server");
		System.out.print("Enter messages to send to client: ");
		DataInputStream inStream = new DataInputStream(socket.getInputStream());
		DataOutputStream outStream = new DataOutputStream(socket.getOutputStream());
		String incomingMsg = "", outGoingMsg = "";

		do {
			incomingMsg = inStream.readUTF();
			System.out.println("client: " + incomingMsg);
			outGoingMsg = br.readLine();
			outStream.writeUTF(outGoingMsg);
		} while(!incomingMsg.equals("stop"));
		outStream.flush();
		outStream.close();
		socket.close();
	}

	public static void main(String[] args) {
		try {
			startServer();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
}
