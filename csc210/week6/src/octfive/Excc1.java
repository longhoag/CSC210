package octfive;

import java.util.Scanner;
import java.lang.Math;

public class Excc1 {
	
	/*
	 * public static int sumDigits(long n) {
	 * 
	 * int s = 0; long let = 1;
	 * 
	 * while (let != 0) { let = n % 10; s += let; n = n/10; }
	 * 
	 * return s; }
	 */

	/*
	 * public static int countLetters(String s) {
	 * 
	 * int num = 0;
	 * 
	 * int lgth = s.length(); for (int i = 0; i < lgth; i++) { if (s.charAt(i) != '
	 * ') { num ++; } }
	 * 
	 * return num; }
	 */
	
	
	/*
	 * public static double area(int n, double side) {
	 * 
	 * double result = 0;
	 * 
	 * result = (n * side*side) / (4 * Math.tan(Math.PI / side));
	 * 
	 * 
	 * 
	 * return result; }
	 */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter value");
		
		/*
		 * long x = in.nextLong();
		 * 
		 * long sm = sumDigits(x);
		 * 
		 * System.out.println(sm);
		 */
		/*
		 * String let = in.nextLine(); System.out.println(countLetters(let));
		 */
		
		/*
		 * int s = in.nextInt();
		 * 
		 * double sd = in.nextDouble();
		 */
//		String url = in.nextLine();
//		
//		int lgth = url.length();
//		int index = 0;
//				
//		for (int i = 0; i < lgth; i++) {
//			if (url.charAt(i) == '.') {
//				index ++;
//			}
//		}
//		
//		/*
//		 * if (index != 1) return false; else return true;
//		 */
		int i = 0;
//		
		
//		System.out.println(i);
	
		String name = in.nextLine();
		
		int index = 0;
		
		for (int k = 0; k < name.length(); k++) {
			if (name.charAt(k) == '.') {
				index ++;
			}
		}
		if (index == 1) 
			i = name.indexOf('.');
		else 
			System.out.println("stop");
		
		
		String domainName = name.substring(0, i);
		
		boolean conclusion = true;
		
		if (i < 63) {
			if (domainName.charAt(0) != '-' && domainName.charAt(i - 1) != '-') {
				for (int j = 0; j < domainName.length(); j++) {
					if (Character.isLetter(domainName.charAt(j)) || domainName.charAt(j) =='-') {
						conclusion = true;
					}
					else
						conclusion = false;
				}
			}
			else conclusion = false;
		}
		else 
			conclusion = false;
		
		
		System.out.println(conclusion);
		System.out.println(domainName);
		System.out.println(i);
	}

}
