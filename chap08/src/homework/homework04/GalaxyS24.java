package homework.homework04;

public class GalaxyS24 extends SmartPhone {
	GalaxyS24(){
	
	}
	@Override
	public void charge() {
		System.out.println("고속충전,고속 무선 충전 ");
	}
	@Override
	public void makeCall() {
		System.out.println("번호를 누르고 통화버튼을 누름");
	}
	@Override
	public void takeCall() {
		System.out.println("수신 버튼을 누름 ");
	}
	@Override
	public void touch() {
		System.out.println("정전식, 와콤펜 지원 ");
	}
	@Override
	public void picture() {
		System.out.println("1200만 듀얼 카메라 ");
	}
	@Override
	public void printMaker() {		
		System.out.print("삼성");
	}
	@Override
	public void getName() {
		System.out.print("GalaxyS24");
		
	}
	
	
}
