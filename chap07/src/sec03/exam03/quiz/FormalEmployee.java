package sec03.exam03.quiz;

public class FormalEmployee extends Employee{
	private int empNo;
	private int salary;
	
	public FormalEmployee(String name, String dept , int empNo, int salary) {
		setName(name);
		setDept(dept);
		setType("정규직");
		this.empNo=empNo;
		this.salary=salary;
	}
	@Override
	public int getPay() {
		return salary/12;
		
	}
	public String getInfo() {
		return getType()+", "+getName()+", "+getDept()+", "+empNo+", " + salary;
	}
	
	
	

}
