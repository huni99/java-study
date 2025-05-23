package homework.object3;

public class Employee {
	private String empName;
	private String dept;
	private String job;
	private String phone;
	private String address;
	
	private int empNo;
	private int age;
	private int salary;
	private char gender;
	private double bonus;
	
	public Employee() {}
	public Employee(int empNo, String empName) {
		this.empName = empName;
		this.empNo = empNo;
	}
	
	public Employee(String empName, String dept, String job, String phone, String address, int empNo, int age,
			int salary, char gender, double bonus) {
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.phone = phone;
		this.address = address;
		this.empNo = empNo;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.bonus = bonus;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
