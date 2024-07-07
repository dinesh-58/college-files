/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package july6;

import java.net.Socket;

public class July6 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		SocketOptionsDemo();
	}

	public static void SocketOptionsDemo() {
		try {
			Socket socket = new Socket("time.nist.gov", 13);
			socket.setSoTimeout(10000);
			socket.setTcpNoDelay(true);
			socket.setSoLinger(true, 100000);
			if (socket.isConnected()) {
				System.out.println("Socket connected!");
				if (socket.isClosed()) {
					System.out.println("Connection to socket closed! ");
				} else {
					System.out.println("Connection not closed! ");

					System.out.println("Server Port: " + socket.getPort());
					System.out.println("Server Address: " + socket.getInetAddress());

					System.out.println("Client Port: " + socket.getLocalPort());
					System.out.println("Client Address: " + socket.getLocalAddress());
				}
			} else {
				System.out.println("Couldn't connect to socket! ");
			}

		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
