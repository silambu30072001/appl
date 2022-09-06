package encapsulation;

public class Example1 {
	int empId;
	String emailId;
	String name;
	double salary;
	public int getempId() 
	{
		return empId;
	}
	public void setempId(int empId)
	{
		this.empId=empId;
	}
	public void setemailId(String emailId)
	{
		this.emailId=emailId;
	}
	public String getemailId()
	{ 
		return emailId;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{ 
		return name;
	}
	public void setsalary(double salary)
	{
		this.salary=salary;
	}
	public double getsalary()
	{ 
		return salary;
	}

}
