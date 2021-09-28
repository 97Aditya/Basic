package javaproject;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str, rev="";
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("enter String: ");

		 str=sc.nextLine();

		 int length = str.length();

		 for(int i= length-1; i>=0; i--)
		 {
		 rev = rev + str.charAt(i);
		 		 			 
		 }
		 if(str.equals(rev))
		 {
			 System.out.println(str+" String is palindrome.");
		 }
		 else {
			 System.out.println(str+" String is not palindrome.");
		 }
	}

}
