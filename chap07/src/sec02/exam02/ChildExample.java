package sec02.exam02;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child;// Parent 타입으로 자동 타입 변환
		
		Parent parent1 = new Child();
		
		parent1.method1();
		parent1.method2();// 자식 쪽의 재정의된 메소드가 호출됨
//		parent1.method3();// 부모 타입에 없는 필드나 메소드는 접근 불가능
		
		//정리 :참조 변수의 타입은 객체에 
		//부모타입에 자식 객체를 넣을 경우 부모타입 메소드와 자식객체에 재정의된 메소드만 접근가능
	}
}
