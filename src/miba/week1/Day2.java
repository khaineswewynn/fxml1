package miba.week1;

import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Whole Number Integer
		byte age=20;
		short amount=200; // 8 bit
		int max_students=5000000;
		long balance=10000000000000000L;
		
	System.out.println("Age is "+age);
	System.out.println("Balance is "+amount);
	System.out.println("Max ppl "+max_students);
	System.out.println("it is "+balance);
	
	//floating point
	float rate=0.005f; // 32 bits
	double rate2=0.10; // 64 bits
	
	//character
	char letter='A';
	//String
	String name="David";
	
	//Boolean
	boolean status=true;
	
	//User Input
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter your name:");
	String studentName=scanner.next();
	System.out.println("My name is "+studentName);
	System.out.println("Enter your city:");
	String city=scanner.next();
	System.out.println("City is "+city);
	System.out.println("Enter your age");
	int age1=scanner.nextInt();
	System.out.println("Age is "+age1);
	System.out.println("Enter your age");
	int age2=Integer.parseInt(scanner.next());
	System.out.println("Age is "+age2);
	System.out.println("Enter interest rate:");
	double irate=scanner.nextDouble();
	System.out.println("Rate is "+irate);
	}

}
