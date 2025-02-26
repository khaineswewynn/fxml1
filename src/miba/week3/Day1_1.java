package miba.week3;

import java.util.Scanner;

public class Day1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		double discount=0;
		double balance=0;
		System.out.println("Are you a member? (yes or no)");
		String member=scanner.next();
		System.out.println("Amount :");
		int amount=scanner.nextInt();
		if(member.equals("yes"))
		{
			if(amount>=100000)
			{
				discount=amount * 0.03;
			}
			else if(amount>=300000)
			{
				discount=amount * 0.05;
			}
			else if(amount>=500000)
			{
				discount=amount*0.07;
			}
		}
		else
		{
			if(amount>=300000)
			{
				discount=amount * 0.03;
			}
			else if(amount>=500000)
			{
				discount=amount * 0.05;
			}
			
		}
		balance=amount-discount;
		System.out.println("Discount "+discount);
		System.out.println("Balance "+balance);
		
	}

}
