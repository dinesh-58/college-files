/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package july10;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientSide {

	public static void main(String[] args) {
		Socket socket;
		// can use Scanner as well
		// BufferedReader is faster than scanner because it doesn't parse input?
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			socket = new Socket("localhost", 8080);
//			socket.setSoTimeout(3000);
			DataInputStream inStream = new DataInputStream(socket.getInputStream());
			DataOutputStream outStream = new DataOutputStream(socket.getOutputStream());
			System.out.print("Enter messages to send to server: ");
			String incomingMsg = "", outgoingMsg = "";
			do {
				// NOTE: currently has bug. client must send msg first because of order of writing code
				// client will keep waiting for input and then only get incomingMsg
				// if server sends message 1st, msg is shown on client only after client sends 
				// implement some checking? to see which happens first: user input or incomingMsg
				outgoingMsg = br.readLine();
				outStream.writeUTF(outgoingMsg);
				incomingMsg = inStream.readUTF();
				System.out.println("server: " + incomingMsg);
			} while (!outgoingMsg.equals("stop"));
			outStream.flush();
			outStream.close();
			socket.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
		}

	}

}
