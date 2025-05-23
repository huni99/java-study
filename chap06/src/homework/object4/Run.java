package homework.object4;

public class Run {
	public static void main(String[] args) {
		Person p1 = new Person();
//		p1.setAge(10);
//		p1.setName("김철수");
//		System.out.println(p1.getName()+" "+p1.getAge());
		
		p1.age=10;
		p1.name="김철수";
		System.out.println(p1.name+" "+p1.age);
		
	}
}
