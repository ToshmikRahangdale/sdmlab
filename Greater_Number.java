package Assignment1;

import java.util.Scanner;

public class Greater_Number {


	public static void main(String[] args) 
	{
		int a;
		int b;
	
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter first number a ");
		a=s.nextInt();
		
		System.out.println("Enter second number b");
		b=s.nextInt();	
		
		if(a>b)
		{
			System.out.println("Given number "+a+" is greater than "+b);
		}
		 else if(a<b)
		{
			System.out.println("Given number "+b+" is greater than "+a);
		}
		 else
		 {
			 System.out.println("Given Numbers is equal");
		 }
	}

}
