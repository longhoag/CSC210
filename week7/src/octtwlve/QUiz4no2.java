package octtwlve;

import java.util.Scanner;

public class QUiz4no2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the input with the first number: ");
		int x = in.nextInt();
		
		System.out.println("Enter the string: ");
		String[] n = new String[x];
		
		int[] f = new int[x];
		
		for (int i = 0; i < x; i++) {
			n[i] = in.nextLine();
		}
		
		for(int i = 0; i <x; i++) {  
            f[i] = 1;  
            for(int j = i+1; j < x; j++) {  
                if(n[i] == n[j]) {  
                    f[i]++;  
                      
                    //Set string[j] to 0 to avoid printing visited character  
                    n[j] = "0";  
                }  
            }  
        }  
          
        //Displays the each character and their corresponding frequency  
        System.out.println("Characters and their corresponding frequencies");  
        for(int i = 0; i < f.length; i++) {  
            if(n[i] != " " && n[i] != "0")  
                System.out.println(n[i] + "-" + f[i]);  
        }  
		
		
	}

}
