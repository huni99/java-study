package sec04.exam01;

public class Calculator {
	
	
	
	//메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	int plus(int num1,int num2) {
		return num1+num2;
	}
	int minus(int num1,int num2) {
		return num1-num2;
	}
	double divide(int num1,int num2) {
		return (double)num1/num2;
	}
	int multi(int num1,int num2) {
		return num1*num2;
	}
}
