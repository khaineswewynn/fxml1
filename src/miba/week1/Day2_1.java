package miba.week1;

import java.util.Scanner;

public class Day2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//operators
		//1. Arithmetic Operators (+,-,*,/,%)
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number :");
		int num1=scanner.nextInt();
		System.out.println("Enter second number :");
		int num2=scanner.nextInt();
		int result=num1+num2;
		System.out.println("Result is "+result);
		System.out.println("Enter another number :");
		num1=scanner.nextInt();
		result=result-num1;
		System.out.println("Subtraction:Result is "+result);
		System.out.println("Enter another number :");
		num1=scanner.nextInt();
		result=result*num1;
		System.out.println("Multiplication:Result is "+result);
		result=5/3;
		System.out.println("Division:Result is "+result);
		result=5%3;
		System.out.println("Remainder:Result is "+result);
		
		// subj1,subj2,subj3 => average marks 
		System.out.println("Enter subj 1 marks:");
		int mark1=scanner.nextInt();
		System.out.println("Enter subj2 marks:");
		int mark2=scanner.nextInt();
		System.out.println("Enter subj3 marks:");
		int mark3=scanner.nextInt();
		int total=mark1+mark2+mark3;
		int avg=total/3;
		System.out.println("Average mark :"+avg);
		//exponential power
		double result2=Math.pow(2,3);
		System.out.println("Power is "+result2);
		
		//Comparison Operators
		//<,>,<=,>=,==,!= : Boolean value (true or false)
		System.out.println("equal??"+(5==7));
		System.out.println("less than??"+(5<7));
		System.out.println("greater than ??"+(5>7));
		
	}

}
