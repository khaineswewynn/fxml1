package miba.week4;

import java.util.Scanner;

public class Day1 {
	//method definition (step 1)
	public static int addition(int a,int b)
	{		
		return a+b;
	}
	
	public static int subtraction(int a,int b)
	{
		return a-b;
	}
	public static int multiplication(int a,int b)
	{
		return a*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		boolean status=true;
		while(status)
		{
		System.out.println("Enter first number");
		int num1=scanner.nextInt();
		System.out.println("Enter second number");
		int num2=scanner.nextInt();
		// call method (step 2)
		// Selection
		System.out.println("Which option you want? add? subtract? multiply?");
		String operation=scanner.next();
		int result=0;
		if(operation.equals("add"))
		{
			result=addition(num1,num2);
		}
		else if(operation.equals("subtract"))
		{
			result=subtraction(num1,num2);
		}
		else
		{
			result=multiplication(num1,num2);
		}
		
		System.out.println("result is "+result);
		
		System.out.println("continue? yes or no?");
		String message=scanner.next();
		if(!message.equals("yes"))
			status=false;
		}
		

	}

}
