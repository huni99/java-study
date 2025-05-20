package sec04.exam01;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator cal= new Calculator();// 기본 생성자 호출
		cal.powerOn();
		 cal.divide(5, 2);// 문제 없음(리턴값이 있는데 피료없으면 받지 않아도 됨)
		System.out.println("나누기 : " + cal.divide(5, 2));
		
		
		byte x=10, y=4;
		double result2 = cal.divide(x, y);// byte->int 타입으로 자동 타입 변환
		System.out.println("result2: "+result2);
		
//		double result = car.divide(10.5, 20.0);//매개변수가 잘못됨
		cal.powerOff();
		
		
	}
}
