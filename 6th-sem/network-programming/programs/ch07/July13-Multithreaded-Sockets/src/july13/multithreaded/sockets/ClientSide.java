/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package july13.multithreaded.sockets;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientSide {
	public static void main(String[] args) {
		try (Socket socket = new Socket("localhost", 1234)) {

			// writing to server
			// NOTE: no need to remember these chat-gpt generated methods.
			// just make notes for one single, ez approach to do I/O
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

			BufferedReader in = new BufferedReader(new InputStreamReader( socket.getInputStream()));

			Scanner scan = new Scanner(System.in);
			String line = null;

			while (!"exit".equalsIgnoreCase(line)) {

				// reading from user
				line = scan.nextLine();

				// sending the user input to server
				out.println(line);
				out.flush();

				// displaying server reply
				System.out.println("Server replied " + in.readLine());
			}

			// closing the scanner object
			scan.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
