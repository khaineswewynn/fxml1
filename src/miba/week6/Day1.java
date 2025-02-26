package miba.week6;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HourlyEmployee emp1=new HourlyEmployee(1,"Htet","htet@gmail.com","09788888","mdy",40,20);
		//emp1.calculateSalary();
		emp1.showInfo();
		
		SalaryBasedEmployee emp2=new SalaryBasedEmployee(2,"David","david@gmail.com","97888886","ygn",3500,0.3);
		emp2.calculateSalary();
		
		HourlyEmployee emp3=new HourlyEmployee(1,"Htet","htet@gmail.com","09788888","mdy",40,20);
		//emp1.calculateSalary();
		emp3.showInfo();
		
		//Employee emp3=new Employee(3,"Thiri","thifi@gmail.com","mdy");
		
		Employee [] emps=new Employee[10]; //polymorphism
		emps[0]=emp1;
		emps[1]=emp2;
		emps[2]=emp3;
		
		System.out.println(emps[0].toString());
		System.out.println(emps[1].toString());
		int he_count=0;
		for(int index=0;index<emps.length;index++)
		{
			if(emps[index]!=null)
			{
				if(emps[index] instanceof HourlyEmployee) {
					he_count++;					
				}
			}
		}
		System.out.println("Number of hourly employees: "+he_count);
	}

}
