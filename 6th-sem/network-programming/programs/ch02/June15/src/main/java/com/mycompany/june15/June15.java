package com.mycompany.june15;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class June15 {

	public static void main(String[] args) {
//		Practice1();
		Practice2();
	}

	public static void Practice1() {
		// check host address, domain name of given ip
		try {
//			String ip = "192.168.1.24";
			String ip = "tufohss.edu.np";
			InetAddress addr = InetAddress.getByName(ip);
			printAddressInfo(addr);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static void printAddressInfo(InetAddress addr) {
		System.out.println("host address: " + addr.getHostAddress());
		System.out.println("host name: " + addr.getHostName());
		System.out.println("canonical name: " + addr.getCanonicalHostName());
	}

	public static void Practice2() {
//		 check addressing type of given ip
		try {

			/*
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter an ipv4 address: ");
			String ip = scan.nextLine();
			 */
//			String ip = "localhost"; // loopback address
			String ip = "192.168.5.214"; // site-local address
//			String ip = "fe80::f144:1597:8e4:4e56%8"; // link-local address

			InetAddress addr = InetAddress.getByName(ip);

			System.out.println(ip + " is a " + getAddressingType(addr) + " address");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public static void Practice3() {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local.getAddress() + " is a " + getAddressingType(local) + " address");
			// getting MAC address
			Enumeration<NetworkInterface> net = NetworkInterface.getNetworkInterfaces();
			// TODO: complete this code
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static String getAddressingType(InetAddress addr) {
		if (addr.isLoopbackAddress()) {
			return "loopback";
		}
		if (addr.isMulticastAddress()) {
			return "multicast";
		}
		if (addr.isAnyLocalAddress()) {
			return "wildcard";
		}
		if (addr.isLoopbackAddress()) {
			return "loopback";
		}
		if (addr.isLinkLocalAddress()) {
			return "link-local";
		}
		if (addr.isSiteLocalAddress()) {
			return "site-local";
		} else {
			return "unidentifiable";
		}
	}
}
