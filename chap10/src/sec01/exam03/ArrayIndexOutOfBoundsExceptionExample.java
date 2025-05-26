package sec01.exam03;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		//사용자의 잘못된 사용까지도 고려하는 좋은 프로그래밍	
		if(args.length==2) {
			String data1 = args[0]; // 예외 발생 
			String data2 = args[1];
			
			System.out.println("args[0]: "+data1);
			System.out.println("args[1]: "+data2);	
		}else {
			System.out.println("두개의 실행 매개값이 필요합니다.");
		}
		
		
	}

}
