/*Name: Long Hoang (preferred name: Ryan)
Date: 10/12/2021

Project description: This program is designed to validate domain names on the internet and determine whether it has a core gTLD or not. 
A valid domain must only contain one period and have valid second-level domain. 
This program is required to prompt users to enter domain name to check the validity until they press enter to exit.

Input: the domain name of a web site 
Output: check if the domain is valid or not and if it has gTLD
Comment: if TLD is capitalized, it will not consider as gTLD, but it is not the requirement in the prompt! Just a note!

*/


package octfive;

import java.util.Scanner;

public class Hw6 {
	
	// create a method to check if the period appears more than one time
	public static boolean dot(String url) {
		
		// declare count value
		int count = 0;
		// loop to check the period 
		for (int i = 0; i < url.length(); i++) {
			if (url.charAt(i) == '.') {
				// if there is a period, count ++
				count ++;
			}
		}
		
		if (count == 1) 
			return true; 
		// if period appears more than 1 -> false
		else 
			return false;
	}
	
	// create a method to get the position of the period in the input
	public static int getThePositionofPeriod(String link) {
	
		// index of the period
		int i = 0;
		// if period appears 1
		if (dot(link))
			// get the index 
			i = link.indexOf('.');
		
		return i;
	}
	
	// create method to check TLD
	public static String isspecificTLD(String tld, int i, int l) {
		
		// declare what is gTLD
		String latter = ".com.net.org.info";
		String statement;
		
		// get the TLD of the input 
		tld = tld.substring(i, l);
		
		// if it is com .net . org .info, it is gTLD
		if (latter.contains(tld)) 
			statement = "has a core gTLD of \"" + tld + "\"";
		
		// else it is just TLD
		else 
			statement = "has a TLD of \"" + tld + "\"";
		
		return statement;
		 
	}
	
	// create a method to check the validity of the second level domain name 
	public static boolean secondLevel(String name, int i) {
		
		// get the second level domain name 
		String domainName = name.substring(0, i);
		
		// declare boolean value 
		boolean conclusion = true;
		
		// check if there are more than 63 characters 
		if (i < 64) {
			// check if it begins or starts with a dash
			if (domainName.charAt(0) != '-' && domainName.charAt(i - 1) != '-') {
				for (int j = 0; j < domainName.length(); j++) {
					// check if it has special characters in the second level domain name 
					if (Character.isLetter(domainName.charAt(j)) || domainName.charAt(j) =='-') {
						// if satisfies all the requirement, return true. if not, return false
						conclusion = true;
					}
					else 
						conclusion = false;
				}
			}
			else
				conclusion = false;
		}
		else 
			conclusion = false;
		
		
		return conclusion;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		//declare the input from the users 
		String domain;
		
		do {
			// prompt the users to input the domain name 
			System.out.println("Enter the next domain name (Enter to exit):");
			domain = in.nextLine();
			
			// if users press enter
			if (domain.length() == 0) {
				// exit
				System.out.println("Exit the program!");
				break;
			}
			else { // if there is input 
				
				// check if the period appears more than once! if not -> invalid 
				if (!dot(domain)) 
					System.out.println("\"" + domain + "\" is not a valid domain name.");
				
				else { // if period appears once 
					
					// get the index of the period 
					int period = getThePositionofPeriod(domain);
					
					// if there are special characters -> invalid
					if (!secondLevel(domain, period)) 
						System.out.println("\"" + domain + "\" is not a valid domain name.");
					
					else // else, it's valid 
						System.out.println("\"" + domain + "\" is a valid domain name and " + isspecificTLD(domain, period, domain.length()));
				}
			}
			
		} while (domain.length() != 0); // do the loop until users press enter 
		
	}
}

