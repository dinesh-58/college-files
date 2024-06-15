/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.june2;

import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author sujal
 */
public class June2 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		inputDomainName();
		inputIPAddress();
	}

	public static void inputDomainName() {
		try {
//			System.out.print("Enter web url / domain name: ");
//			String url = scan.nextLine();
			String url = "google.com";

			InetAddress addr = InetAddress.getByName(url);
			printAddressInfo(addr);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static void inputIPAddress() {
		try {

			System.out.println("");
			// System.out.print("Enter ip address: ");
			byte[] url = new byte[]{(byte) 142, (byte) 250, (byte) 194, (byte) 238};
			InetAddress addr = InetAddress.getByAddress(url);
			printAddressInfo(addr);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static void printAddressInfo(InetAddress addr) {
		System.out.println("host address: " + addr.getHostAddress());
		System.out.println("host name: " + addr.getHostName());
		System.out.println("canonical: " + addr.getCanonicalHostName());	
	}
}
