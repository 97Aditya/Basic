package javaproject;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=0,a,temp,n;
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter any number to check Armstrong or not: ");
        n=s.nextInt();
       
       temp=n;
       
       while(n>0)
       {
    	   a=n%10;
    	   n=n/10;
    	   c=c+(a*a*a);  
       }
       if(temp==c)
    	   System.out.println("number is Armstrong Number..");
       else
    	   System.out.println("number is not armstrong number..");
	}

}
