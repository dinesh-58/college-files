/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package june29;

import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author sujal
 */
public class June29 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		try {
			URL url = new URL("https://lukesmith.xyz");
			URLConnection conn = url.openConnection();
			System.out.println(conn.getContentType());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
