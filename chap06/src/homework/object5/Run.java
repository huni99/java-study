package homework.object5;

public class Run {
	public static void main(String[] args) {
		Student a = new Student();
		a.setCls("A");
		a.setName("김철수");
		System.out.println(a.getClsNo()+" "+ a.getName()+ " " + a.getCls());
		Student b = new Student();
		b.setCls("F");
		b.setName("홍길동");
		System.out.println(b.getClsNo()+" "+ b.getName()+ " " + b.getCls());
		Student c = new Student();
		c.setCls("B");
		c.setName("이영희");
		System.out.println(c.getClsNo()+" "+ c.getName()+ " " + c.getCls());
	}
}
