/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package july28.multicast.ip;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class MulticastClient {
	// NOTE: run client file first.  run file multiple times to simulate multiple users

	final static String INET_ADDR = "224.0.0.2";
	final static int PORT = 8888;

	public static void main(String[] args) throws UnknownHostException {
		// Get the address that we are going to connect to.
		InetAddress address = InetAddress.getByName(INET_ADDR);
// Create a buffer of bytes, which will be used to store the incoming bytes containing the information from the server. Since the message is  small here, 256 bytes should be enough.
		byte[] buf = new byte[256];
// Create a new Multicast socket (that will allow other sockets/programs to join it as well.         
		try (MulticastSocket clientSocket = new MulticastSocket(PORT)) {
//Joint the Multicast group.
			clientSocket.joinGroup(address);
			while (true) {                 // Receive the information and print it.
				DatagramPacket msgPacket = new DatagramPacket(buf, buf.length);
				clientSocket.receive(msgPacket);
				String msg = new String(buf, 0, buf.length);
				System.out.println("Socket 1 received msg: " + msg);
			}
		} catch (IOException ex) {
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
}
