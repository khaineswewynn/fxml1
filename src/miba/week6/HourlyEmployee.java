package miba.week6;

public class HourlyEmployee extends Employee {
	
	int working_hours;
	double rate;
	
	public HourlyEmployee(int id, String name, String email, String phone, String address,int working_hours,double rate) {
		super(id, name, email, phone, address);
		this.working_hours=working_hours;
		this.rate=rate;
		// TODO Auto-generated constructor stub
	}
	
	public void calculateSalary()
	{
//		System.out.println("Name : "+this.name);
		System.out.println("Salary : "+(this.working_hours*this.rate));
		
	}
	
	public void showInfo()
	{
		System.out.println(this.toString());
		calculateSalary();
	}

}
