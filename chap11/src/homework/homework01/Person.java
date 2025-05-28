package homework.homework01;

public class Person {
	private String name;
	private String address;
	private char gender;
	private int age;
			
	Person(){}
	Person(String name, int age,String address,char gender){
		this.name=name;
		this.age=age;
		this.address=address;
		this.gender=gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return  "이름: " + name + " 나이: " + age + " 주소: " + address + " 성별: " + gender;
	}
}
