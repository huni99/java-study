package homework.homework01;

public class Employee extends Person {
	private int salary;
	private String dept;
	
	public Employee() {}
	public Employee(String name , int age, double height, double weight ,
			int salary, String dept) {
		super(age, height,weight);
		this.name=name;
		this.salary = salary;
		this.dept = dept;
	}
	
	public String toString() {
		return super.toString()+"급여: "+ salary + "\n"+
				"부서: "+ dept+"\n";
	}
}
