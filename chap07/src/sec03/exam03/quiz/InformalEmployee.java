package sec03.exam03.quiz;

public class InformalEmployee extends Employee {
	private int primaryPay;
	

	public InformalEmployee(String name, String dept , int primaryPay) {
		setName(name);
		setDept(dept);
		setType("정규직");
		this.primaryPay=primaryPay;
	}
	@Override
	public int getPay() {
		return primaryPay;
		
	}
	public String getInfo() {
		return getType()+", "+getName()+", "+getDept()+" ,"+primaryPay ;
	}
	
}
