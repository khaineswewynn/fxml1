package miba.week3;

import java.util.Scanner;

public class Day1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Are you a member? (y or n)");
		char member=scanner.next().charAt(0);
		switch(member) {
		case 'y': System.out.println("Member");break;
		case 'n': System.out.println("Non Member");break;
		default : System.out.println("Other letters");
		System.exit(0);
		}
		//
		System.out.println("Enter product code");
		int pcode=scanner.nextInt();
		int remainder=pcode%10;
		switch(remainder) {
		case 3: System.out.println("Product code ends with 3");break;
		default : System.out.println("Product code withoug ending 3");break;
		}
		
		//enter one character
		//check if this character is vowel or not in this line
		//a,e,i,o,u 
		//switch case
		
		// Unary Operator ? 
		
		String message= member=='y'? "it is a member":"not a member";
		System.out.println(message);
		
		System.out.println("Enter a number");
		int num=scanner.nextInt();
		message=num%2==0? "it is even":"it is odd";
		System.out.println(message);
		
		// Pass or fail (60>= Pass, 60< fail)
		
		
		
		
		
		
		
		
		
		
		
	}

}
