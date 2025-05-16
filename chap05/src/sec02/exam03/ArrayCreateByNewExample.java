package sec02.exam03;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		//new 연산자로 배열 생성
//		int[] arr1 = new int[] {1,2,3};//값 목록을 알 경우
//		int[] arr1 = {1,2,3};//값 목록을 알 경우
		int[] arr1 = new int[3];//값 목록을 모를경우 배열의 길이를 지정 해줘야한다.
		
		//배열 생성시 기본값(초기값)확인
		for(int i= 0 ; i< arr1.length; i++) {
			System.out.println("arr1["+i+"]:"+arr1[i]);
		}
		arr1[0]=10;
		arr1[1]=10;
		arr1[2]=10;
		for(int i= 0 ; i< arr1.length; i++) {
			System.out.println("arr1["+i+"]:"+arr1[i]);
		}
		
		System.out.println();
		//double
		double[] arr2 = new double[3];
		
		for(int i= 0 ; i< arr2.length; i++) {
			System.out.println("arr1["+i+"]:"+arr2[i]);
		}
		
		System.out.println();
		
		
		//String
		String[] arr3 = new String[3];
		for(int i= 0 ; i< arr3.length; i++) {
			System.out.println("arr1["+i+"]:"+arr3[i]);
		}
		
		//정리:
		//배열은 값 목록을 이용해서 생성 또는 길이를 지정하여 배열 객체를 생성
		//배열은 처음 생성 시 길이가 정해지면 변경 불가
		//배열 생성 시 지정된 타입으로만 저장 가능
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
