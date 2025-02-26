package miba.week2;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arithmetic Operator
		//Comparison Operator => true or false
		
		//octal(base8) and hexa(base 16)
		int num1=010; //8
		int num2=020; //16
		int result=num1+num2;
		System.out.println("Result is"+result);
		
		int num3=0x96; //150
		System.out.println(num1+num3);
		//local variable must initialize value.
		int num4=0;
		System.out.println("Num 4 is"+num4);
		
		//Assignment Operators (+=,-=,*=,/=)
		result+=num3; // result=result+num3
		System.out.println("result "+result);
		
		result/=4;
		System.out.println(result);
		
		//Unary Operators (++,--)
		//++=+1,--=-1
		
		result++; //postfix
		System.out.println(result);
		//prefix,postfix
		++result; //prefix
		System.out.println(result);
				
		int num6=5,num5=10;
		int total=++num6+num5++;
		System.out.println("total is"+total);
		System.out.println("num6 "+num6);
		System.out.println("num5 "+num5);
		
		int x=10;int y=7;
		result=++x/2*y;
		System.out.println("result "+result);
		System.out.println("x "+x);
		
		result=y++;
		
		//Logical Operators (&&,||,&,|)
		System.out.println(x>10 && y>10);//true && flase => false
		System.out.println(x>10 || y>10);
		System.out.println(x & y);
		System.out.println(x | y);
		System.out.println(!(x>10));
		
		int age=20;
		if(age>18) //true
		{
			System.out.println("login to webstie");
		}
		else
		{
			System.out.println("cant login");
		}
		//multiple condition
		//mark>=80 : A, 70-80 : B, 65-70:C, 65 < D
		int mark=67;
		if(mark>=80)
		{
			System.out.println("Grade A");
		}
		else if(mark>=70)
		{
			System.out.println("Grade B");
		}
		else if(mark>=65)
		{
			System.out.println("Grade C");
		}
		else
		{
			System.out.println("Grade D");
		}
		
		//even or odd
		int num=157;
		if(num%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}
		
		
	}

}
