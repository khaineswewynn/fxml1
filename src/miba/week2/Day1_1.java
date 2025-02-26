package miba.week2;

import java.util.Scanner;

public class Day1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using scanner, mark1,mark2,mark3
		// find average marks
		// Check avarage mark => 75 (Credit)
		// average marks > 60 (Pass) , Fail
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter mark 1:");
		int mark1=scanner.nextInt();
		System.out.println("Enter mark 2:");
		int mark2=scanner.nextInt();
		System.out.println("Enter mark 3:");
		int mark3=scanner.nextInt();
		
		double avg=(mark1+mark2+mark3)/3.0;
		if(avg>=75)
			System.out.println("Credit");
		else if(avg>=60)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		//nested if
		if(mark1>=60 && mark2>=60 && mark3>=60)
		{
			if(avg>=75)
				System.out.println("Pass with Credit");
			else if(avg>=60)
				System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		

	}

}
