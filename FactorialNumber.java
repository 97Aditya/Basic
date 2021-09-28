package javaproject;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,f=1;
		int n;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter any number: ");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			f=f*i;
			
		}
		System.out.println("factorial of "+n+" is: "+f);
	}

}
