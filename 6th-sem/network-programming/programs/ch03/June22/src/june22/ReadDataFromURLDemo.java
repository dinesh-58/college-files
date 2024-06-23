/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package june22;

import java.io.InputStream;
import java.net.URL;

/**
 *
 * @author sujal
 */
public class ReadDataFromURLDemo {
	public ReadDataFromURLDemo() {
		try {
			System.out.println("test");
			URL url = new URL("http://lukesmith.xyz/");
			InputStream inStream = url.openStream();
			int c;
			while( (c = inStream.read()) != -1) {
				// write() turns int c into character
				System.out.write(c);
			}
			inStream.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
}
