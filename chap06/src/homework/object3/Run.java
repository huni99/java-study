package homework.object3;

public class Run {
	public static void main(String[] args) {
		Employee em = new Employee("홍길동","영업부","과장","010222222","서울시 강남구",100,25,3000000,'남',0.05);
		System.out.println(em.getAddress());
	}
}
