package miba.week6;

public class SalaryBasedEmployee extends Employee {
	int basic_salary;
	double bonus;
	public SalaryBasedEmployee(int id, String name, String email, String phone, String address,int basic_salary,double bonus) {
		super(id, name, email, phone, address);
		// TODO Auto-generated constructor stub
		this.basic_salary=basic_salary;
		this.bonus=bonus;
	}
	
	public void calculateSalary()
	{
		System.out.println("Name :"+this.name);
		double bonus_value=this.basic_salary*this.bonus;
		System.out.println("Salary :"+(this.basic_salary+bonus_value));
		
	}

}
