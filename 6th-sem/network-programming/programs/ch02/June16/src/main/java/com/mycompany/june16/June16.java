package com.mycompany.june16;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;

public class June16 {

	public static void main(String[] args) {
		//		getMACAddress();;
		try {
//			checkIPVersion(InetAddress.getByName("::")); // all 0s
//			checkReachable(InetAddress.getByName("google.com"));
//			getIPsByName("google.com");
checkBlacklist();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static void getMACAddress() {
		try {
			InetAddress inet = InetAddress.getLocalHost();
			NetworkInterface nint = NetworkInterface.getByInetAddress(inet);
			byte[] macBit = nint.getHardwareAddress();
			String[] macHex = new String[macBit.length];
			for (int i = 0; i < macBit.length; i++) {
//			for(byte x : macBit) {
// TODO: look up 2X formatting
				macHex[i] = String.format("%02X", macBit[i]);
			}
			System.out.println("your MAC address: " + String.join(":", macHex));

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public static void checkIPVersion(InetAddress inet) {
		try {
//			InetAddress inet =  InetAddress.getByName("::"); // all 0s
			byte[] ip = inet.getAddress();
			switch (ip.length) {
				case 4:
					System.out.println("It is an ipv4 address");
					break;
				case 16:
					System.out.println("It is an ipv6 address");
					break;
				default:
					throw new AssertionError();
			}
		} catch (Exception e) {
		}

	}

	public static void checkReachable(InetAddress inet) {
		try {
			System.out.println(inet.getAddress() + (inet.isReachable(400) ? "is reachable" : "isn't reachable"));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public static void getIPsByName(String name) {
		// get both ipv4 and ipv6 address
		try {

			InetAddress v4 = Inet4Address.getByName(name);
			InetAddress v6 = Inet6Address.getByName(name);
//			InetAddress inet = InetAddress.getByName(name);
			System.out.println("IPv4 address of " + name + " is " + v4.getHostAddress());
			System.out.println("IPv6 address of " + name + " is " + v6.getHostAddress());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public static boolean checkBlacklist() {
		// TODO: fix this
		// check pg.26 of ch.2 pdf 
		try {
			String testIp = "192.168.1.1";
//			String testIp = "192.168.3.5";
			InetAddress inet = InetAddress.getByName(testIp);
			byte[] quad = inet.getAddress();
			String query = "BLACKHOLE";
			for (byte octet : quad) {
				int unsignedByte = octet < 0 ? octet + 256 : octet;
				query = unsignedByte + "." + query;
			}
			InetAddress.getByName(query);
			System.out.println("IP not blacklisted");
			return true;
		} catch (UnknownHostException e) {
			System.out.println("IP blacklisted");
			return false;
		}
	}
}
