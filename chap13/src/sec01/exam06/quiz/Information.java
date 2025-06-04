package sec01.exam06.quiz;

public class Information {
	private String phone ;
	private int salary;
	public Information(String phone, int salary) {
		super();
		this.phone = phone;
		this.salary = salary;
	}
	public Information() {
		super();
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Information [phone=" + phone + ", salary=" + salary + "]";
	}
	
}
