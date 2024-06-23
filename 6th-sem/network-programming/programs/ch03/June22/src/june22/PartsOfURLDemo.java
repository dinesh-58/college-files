/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package june22;

import java.net.URL;

/**
 *
 * @author sujal
 */
public class PartsOfURLDemo {

	public PartsOfURLDemo() {
		try {
			URL url = new URL("http://user:pass@www.test.org:8080/javafaq/books/jnp/index.html?isbn=123#toc");
			System.out.println(url.getProtocol());	// http
			System.out.println(url.getUserInfo());	// user:pass
			System.out.println(url.getHost());		// www.test.org
		} catch (Exception e) {
		}
	}
}
