package sec02.exam10;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] arrInt = new int[] {95,71,84,93,87};
		int sum =0;
		for(int arr :arrInt) {
			sum+=arr;
		}
		System.out.println(sum);
		
		double avg = (double) sum/ arrInt.length;
		System.out.println("점수 평균= "+avg);
		
		//정리 :
		// 기본 for문 보다 코드가 간결하여 자주 쓰임
		// 배열 index 값의 사용이 필요할 떄는 기본 for문 사용
 	}
}
