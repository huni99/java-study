package sec01.exam06.quiz;

public class Planet {
	
//	Planet 클래스
//	1. 필드
//		- name: String // 이름(한글)
//		- diameter: int // 지름(km)
//		- period: double // 공전주기(년)
//	2. 생성자
//		+ Planet()
//		+ Planet(name: String, diameter: int, period: double)
//	3. Getter
//	4. 메소드
//		출력 예시에 맞춰 toString() 재정의
	private String name;
	private int diameter;
	private double period;
	public Planet(String name, int diameter, double period) {
		this.name = name;
		this.diameter = diameter;
		this.period = period;
	}
	public Planet() {
	}
	public String getName() {
		return name;
	}
	public int getDiameter() {
		return diameter;
	}
	public double getPeriod() {
		return period;
	}
	@Override
	public String toString() {
		return name+"(지름: "+diameter+"km, 공전주기 : "+period+"년)";
	}
	
	
}
