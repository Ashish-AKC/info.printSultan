package cPSetTest;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:- ");
		int number = sc.nextInt();
		int reverse = 0;
		
		
		
		while(number!=0) {
			
			 int reminder = number%10;
			 reverse = reverse*10+reminder;
			 number=number/10;
		}
		System.out.println("Reverse number is for given numbers:- "+reverse);
		
		for( ;number != 0; number=number/10)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		
		
		
		
		
	}
	

}
