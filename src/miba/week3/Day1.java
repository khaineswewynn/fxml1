package miba.week3;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// product-code ends with 3 => promotion
		//promotion : 3 items => 1 coupon
		//113, 105
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter product code");
		int pcode=scanner.nextInt();
		System.out.println("How many items you gonna buy");
		int qty=scanner.nextInt();
		int no_of_coupons=0;
		if((pcode%10)==3)
		{
			no_of_coupons=qty/3;
			System.out.println("No of coupons :"+no_of_coupons);
		}
		else
		{
			System.out.println("No coupons");
		}
		
		
	}

}
