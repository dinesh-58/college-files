package july28.multicast.ip;

import java.net.*;

public class MulticastServer {

	final static String INET_ADDR = "224.0.0.2";
	final static int PORT = 8888;

	public static void main(String[] args) {         // Get the address that we are going to connect to.         
		try {
			InetAddress addr = InetAddress.getByName(INET_ADDR);
			// Open a new DatagramSocket, which will be used to send the data.         
			DatagramSocket serverSocket = new DatagramSocket();
			for (int i = 0; i < 5; i++) {
				String msg = "Sent message no " + i;
				// Create a packet that will contain the data (in the form of bytes) and send it.
				DatagramPacket msgPacket = new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, PORT);
				serverSocket.send(msgPacket);
				System.out.println("Server sent packet with msg: " + msg);
				Thread.sleep(500);
			}
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
}
