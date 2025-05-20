package sec04.exam02;

public class ComputerExample {
	public static void main(String[] args) {
		Computer comp = new Computer();
		int[] values = {1,2,3};
		int result1 = comp.sum1(values);
		System.out.println(result1);
		
		int result2 = comp.sum1(new int[] {1,2,3,4,5});
		System.out.println(result2);
		
		
		//2. 매개값으로 값의 목록과 배열 둘 다 허용
		
		int result3 = comp.sum2(1,2,3);
		System.out.println(result3);
		
		int result4 = comp.sum2(1,2,3,4,5);
		System.out.println(result3);
		
		//배열을 넣어도 정상 동작함
		int result5 = comp.sum2(values);
		System.out.println(result1);
		
		int result6 = comp.sum2(new int[] {1,2,3,4,5});
		System.out.println(result2);
		
	}
}
