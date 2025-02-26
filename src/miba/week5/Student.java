package miba.week5;

public class Student {
	//attributes
	String name,email,major;
	
	//constructor method (Overloading methods)
	Student(String name,String email,String major)
	{
		this.name=name;
		this.email=email;
		this.major=major;
	}
	Student()
	{
		this.name="Default User";
	}
	//behaviours
	public void learn()
	{
		System.out.println(this.name+" is learning");
	}
	//grading(subj1,subj2,subj3)
	// 80>= : A
	// 70-80 : B
	//60-70 :C
	//<60 :D
}
