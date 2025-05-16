package sec02.exam04;

public class ForFloatCounterExample {
	public static void main(String[] args) {
		//잘못 작성된 for문의 예
		for(float i = 0.1f; i<= 1.0f; i+=0.1f) {
			System.out.println(i);//10번 반복을 기대하지만 실제로는 9번 반복
			//이유?  i이 0.1씩 더할때 정확하게 0.1이 더해지는 것이 아님
		}
		//초기화식에 사용되는 변수는 정수타입을 사용하는것이 좋음
	}
}
