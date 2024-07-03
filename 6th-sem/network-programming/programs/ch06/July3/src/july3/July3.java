/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package july3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author sujal
 */
public class July3 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
//		WriteToSocketDemo();
		CheckTCPPorts();
	}

	public static void WriteToSocketDemo() {
		try {
			Socket socket = new Socket("time.nist.gov", 13);
			socket.setSoTimeout(5000);
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter outWriter = new OutputStreamWriter(out);

			BufferedWriter bfWriter = new BufferedWriter(outWriter);
			bfWriter.write("Hello world \n");
			bfWriter.flush();
			socket.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static void CheckTCPPorts() {
		Socket socket;
		int port;
		for (int i = 3000; i <= 65535; i++) {
			try {
				socket = new Socket("time.nist.gov", i);
				port = socket.getPort();
				// logic is: if connection is succesfull, there is a TCP server
				// running on that port
				System.out.println("available port: " + port);
				socket.close();
				socket = null;
				break;
			} catch (UnknownHostException e) {
				System.err.println("UnknownHostException " + e.getMessage());
				break;
			} catch (IOException e) {
				// no server at this port
				System.err.println("IOException: port: "+e.getMessage());
			} catch(Exception e) {
				System.err.println("generic error: " + e.getMessage());
				break;

			}

		}

	}
}
