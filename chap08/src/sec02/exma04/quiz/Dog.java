package sec02.exma04.quiz;

public class Dog extends Animal{

	Dog(){
		super("강아지",4);
	}

	@Override
	public void eat() {
		System.out.println("주인이 주는대로 먹는다.");
	}

	@Override
	public void sound() {
		System.out.println("멍멍짖는다");
	}
	
}
