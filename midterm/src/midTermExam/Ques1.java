// Long Hoang (Ryan)

package midTermExam;

import java.util.Scanner;

public class Ques1 {
	
	public static boolean isSorted(int[] list) {
		
		boolean result = true;
		
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list[i + 1])
				result = false;
			else
				result = true;
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter list: ");
		//first number
		int[] myList = new int[in.nextInt()];
		
		for (int i = 0; i < myList.length; i++)
			myList[i] = in.nextInt();
		
		boolean ans;
		
		ans = isSorted(myList);
		
		if (ans) {
			System.out.println("The list is already sorted");
		}
		else {
			System.out.println("The list is not sorted");
		}
	}

}
