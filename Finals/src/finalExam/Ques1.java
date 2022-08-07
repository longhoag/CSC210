package finalExam;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	    
		System.out.println("Enter the list of numbers: ");
	    int input = 0;
	    int i = 0;
	    int elements = 0;
	    int [] numbers = new int[10];
	    
	    do {
	        input = in.nextInt();
	        if (input != -1) {
	           numbers[i] = input;
	           i++;
	           elements++;
	        }
	       
	        } while(input != -1);
	    
	    SortDescendTrace(numbers);
	    
	}  

	public static void SortDescendTrace(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
	        if(list[i] > 0) {
	        int max = i;
	        for (int j = i + 1; j < list.length; j++) {
	            if (list[max] < list[j]) {
	                max = j;
	            }
	        }
	            int temp = list[i];
	            list[i] = list[max];
	            list[max] = temp;
	            
	            
	            for (int k = 0; k < list.length; k++) {
	                 if(list[k] > 0)
	                    System.out.print(list[k] + " ");
	                }
	                 System.out.println("");
	            }
	     }
	}
}
