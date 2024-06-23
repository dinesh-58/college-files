/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package june22;

import java.net.URI;

/**
 *
 * @author sujal
 */
public class URIResolve {

	public URIResolve() {
		try {
			// https://stackoverflow.com/questions/176264/what-is-the-difference-between-a-uri-a-url-and-a-urn/1984225#1984225
			URI uri = new URI("https://google.com");
			URI u2 = uri.resolve("/images/home.html/../search.html");
			System.out.println(u2);
		} catch (Exception e) {
		}
	}

}
