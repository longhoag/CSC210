package octtwlve;

import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String[] list = new String[33];
		for (int i = 0; i < list.length; i++) {
			list[i] = in.nextLine();
			if (list[i] == " ")
				break;
		}
		
		System.out.println(list.length);

	}

}
