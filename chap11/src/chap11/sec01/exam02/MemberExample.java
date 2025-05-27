package chap11.sec01.exam02;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		//obj1과 obj2는 물리적으로는 다른객체,논리적(객체안에 데이터만 봤을때)으로는 동등객체
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과obj2가 동등합니다");
		}else {
			System.out.println("obj1과obj2가 동등하지않습니다.");
		}
		if(obj1.equals(obj3)) {
			System.out.println("obj1과obj3가 동등합니다");
		}else {
			System.out.println("obj1과obj3가 동등하지않습니다.");
		}
	}
}
