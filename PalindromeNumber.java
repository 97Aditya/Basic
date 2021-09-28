package javaproject;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		int r, sum=0, temp;
		 int n;
		Scanner s = new Scanner(System.in);
	   System.out.println("enter any number to check palindrome or not: ");
		n= s.nextInt();
		
		temp=n;
		
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("number is palindrome..");
		else
			System.out.println("number is not palindrome.");
	}

}
