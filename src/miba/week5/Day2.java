package miba.week5;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1=new Student("David","david@gmail.com","ICT"); // stu object or instance
//		stu1.name="David";
//		stu1.email="david@gmail.com";
//		stu1.major="ICT";
		System.out.println("student name "+stu1.name);
		stu1.learn();
		
		Student stu2=new Student("Htet Htet","htet@gmail.com","Civil");
//		stu2.name="Htet Htet";
//		stu2.email="htet@gmail.com";
//		stu2.major="Civil";
		stu2.learn();
		
		Student stu3=new Student();
		stu3.learn();
		
		Employee emp1=new Employee("1","Mg Mg","mgmg@gmail.com","PM","SE");
		System.out.println(emp1.toString());
		emp1.work();
		
		System.out.println(emp1.getName());
		emp1.setDept("PM");
		System.out.println(emp1.toString());
		emp1.calculateSalary(30, 50);

	}

}
