package sec02.exam02;

public class ArrayCreateByValueExample2 {
	public static void main(String[] args) {
		// 2. 배열 변수 선언 후 나중에 값 대입
		int []scores;
//		scores = {83,90,87}; //컴파일 에러(문법적으로 허용 안함)
		scores = new int[] {83,90,97};
		int sum1 = 0;
		for(int i = 0; i< scores.length; i++) {
			sum1+=scores[i];
					
		}
		System.out.println(sum1);
		
		//배열 변수에 배열 객체를 만들어서 넘기는 경우
//		int sum1 = add({80,98,90});//컴파일 에러
		int sum2 = add(scores);
		System.out.println(sum2);
		int sum3 = add(new int [] {90,87,93});//new연산자로 객체를 만들어서 넘겨야한다. 매개변수의객체가 미리 선언되 었기 때문에
		System.out.println(sum1);
	}
	
	//메소드 선언
	public static int add(int[] scores) {//이미 선언된 매개변수
		int sum =0;
		for(int i = 0; i<scores.length;i++) {
			sum+=scores[i];
			
		}
		return sum;
	}
		
}
