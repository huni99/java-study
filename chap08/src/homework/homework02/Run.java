package homework.homework02;

public class Run {
	public static void main(String[] args) {
		Menu[] me = new Menu[5];
		me[0] = new Drink("파워에이드",2000,"파란색");
		me[1] = new Drink("레몬에이드",1500,"노란색");
		me[2] = new Dish("고등어",5000,"굽기");
		me[3] = new Dish("라면",1500,"끓이기");
		me[4] = new Drink("콜라",2000,"검정색");
		
		for(Menu m : me ) {
			m.cook();
		}
		
	}
	
}
