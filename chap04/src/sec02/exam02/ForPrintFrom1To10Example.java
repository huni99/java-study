package sec02.exam02;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		//1부터 100까지 합 출력
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum=sum+i;
			
		}
		System.out.printf("%d\n",sum);
	}
}
