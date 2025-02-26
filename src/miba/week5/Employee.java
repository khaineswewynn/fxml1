package miba.week5;

public class Employee {
private String id,name,email,position,dept;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPosition() {
	return position;
}

public void setPosition(String position) {
	this.position = position;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

public Employee(String id, String name, String email, String position, String dept) {
	this.id = id;
	this.name = name;
	this.email = email;
	this.position = position;
	this.dept = dept;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", position=" + position + ", dept=" + dept
			+ "]";
}

public void work() {
	System.out.println(this.name + " is working at "+this.dept);
}

public void calculateSalary(int working_hours,int rate)
{
	System.out.println("Salary amount is "+(working_hours*rate));
}

}
