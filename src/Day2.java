import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array : series of items
		//array declartion
		String[]students= new String[10];//0...9
		students[0]="David";
		students[1]="Bruce";
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students.length);
		
		//array initialization
		int []numbers= {1,2,3,4,5};
		System.out.println(numbers[0]);
		
		//major array with data ICT, Business, Cyber Security
		String []major= {"ICT","Business","Cyber Security"};
		System.out.println(major[0]);
		
		//Two dimenstional array
		String [][]users=new String[3][2];
		users[0][0]="David";
		users[0][1]="david@gmail.com";
		
		users[1][0]="Kathy";
		users[1][1]="kathy@gmail.com";
		
		//[ [David,david@gmail.com],
		//[Kathy,kathy@gmail.com]]
		
		users[2][0]="Tun Tun";
		users[2][1]="tun@gmail.com";
		
		System.out.println(users.length);
		System.out.println(users[0].length);
		
		//Loops
		//
		for(int index=0;index<students.length;index++)
		{
			System.out.println(students[index]);
		}
		
		int data[]=new int[1000];
		for(int index=0;index<data.length;index++)
		{
			data[index]=index+1;
			System.out.println(data[index]);
		}
		
		//data2 array (5,10,15,20.........) with size 100
		int data2[]=new int[100];
		for(int index=1;index<=data2.length;index++)
		{
			data2[index-1]=index*5;
			System.out.println(data2[index-1]);
		}
		
		System.out.println(data2);
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of rows of stars");
		int row=scanner.nextInt();
		for(int index=1;index<=row;index++)
		{
			for(int count=1;count<=index;count++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//break;continue;
		System.out.println("***************************");
		for(int count=1;count<100;count++)
		{
			if(count==50)
				break;
			System.out.println(count);
		}
		System.out.println("***************************");
		for(int count=1;count<100;count++)
		{
			
			if(count==50)
				continue;
			System.out.println(count);
		}
		
		//while
		int index1=1;
		while(index1!=100)
		{
			System.out.println(index1);
			index1++;
		}
		
		//
		boolean status=true;
		while(status)
		{
			System.out.println("Continue? yes or no?");
			String message=scanner.next();
			if(message.equals("no"))
				status=false;
		}
		
		//data3 with size of 10
		int data3[]=new int[10];
		boolean message=true;
		int count=0;
		int even_count=0;
		int odd_count=0;
		while(message && count<data3.length)
		{
			System.out.println("Enter a number :");
			data3[count]=scanner.nextInt();
			
			if(data3[count]%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			count++;
			System.out.println("Continue? yes or no?");
			if(scanner.next().equals("no"))
				message=false;
			
		}
		System.out.println("you added "+count+" numbers");
		System.out.println("Even "+even_count);
		System.out.println("Odd "+odd_count);
		//user input 
		//add array data4 
		// even? odd?
		
	}

}
