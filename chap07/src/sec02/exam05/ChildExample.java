package sec02.exam05;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent =new Child();//자동 타입 변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
	}
}
