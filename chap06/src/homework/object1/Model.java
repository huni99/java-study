package homework.object1;

public class Model {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String phone;
	private String email;
	private char gender;
	private int age;
	
	public Model() {
	}
	public void chageName(String name) {
		memberName=name;
	}
	public void printName() {
		System.out.println(memberName);
	}
	
}
