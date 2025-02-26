package miba.week5;

import java.util.Scanner;

public class Day1 {
	
	public static void displayInfo(String [][]info)
	{
		System.out.println("length"+info.length);
		for(int index=0;index<info.length;index++)
		{
			if(info[index]!=null)
			{
				for(int data=0;data<info[index].length;data++)
				{
					System.out.print(info[index][data]+",");
				}
				System.out.println();
			}
			
		}
	}
	
	public static void main(String args[])
	{
		//array initialization
		String [][]students= {
				{"1","David","ICT","david@gmail.com"},
				{"2","HtetHtet","BA","htet@gmail.com"},
				{"3","David","ICT","david@gmail.com"},
				{"4","HtetHtet","BA","htet@gmail.com"}
		};
		System.out.println("number of students"+students.length);
		System.out.println(students[0].length);
		
		displayInfo(students);
		
		String []newStudent= {"5","Thiri","Civil","thiri@gmail.com"};
		
		//array declaration
		String [][]stu=new String[10][]; //empty array
		
		int count=0;
		for(int index=0;index<students.length;index++)
		{
			stu[index]=students[index];
			count++;
		}
		
		if(count<stu.length)
		{
			stu[count]=newStudent;
			count++;
		}
		displayInfo(stu);
		
		//input student info (id,name,major,email)
		//check if the students array is full or not
		//check if the user wants to add student info or not
		
		Scanner scanner=new Scanner(System.in);
		boolean status=true;
		while(status)
		{
			System.out.println("Number of students:"+count);
			if(count<stu.length)
			{
				
				System.out.println("Enter student ID");
				String id=scanner.next();
				System.out.println("Enter student name");
				String name=scanner.next();
				System.out.println("Enter student major");
				String major=scanner.next();
				System.out.println("Enter student name");
				String email=scanner.next();
				String newInfo[]=new String[4];
				newInfo[0]=id;
				newInfo[1]=name;
				newInfo[2]=major;
				newInfo[3]=email;
				stu[count]=newInfo;
				count++;
				System.out.println("Number of students:"+count);
				System.out.println("continue? yes or no?");
				String message=scanner.next();
				if(message.equals("no"))
					status=false;
			}
			else
			{
				System.out.println("Full of students");
			}
		}
		displayInfo(stu);
		
	}

}
