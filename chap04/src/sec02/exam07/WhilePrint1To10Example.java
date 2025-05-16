package sec02.exam07;

import java.util.Scanner;

public class WhilePrint1To10Example {
	public static void main(String[] args) {
		int count=1;
		int sum =0;
		while(count<=100) {
			sum+=count;
			count++;
		}
		System.out.println(sum);
		
		//(참고)무한 루프
		while(true) {
			System.out.println("무한반복");
			//실제 사용 예 :특정 조건을 만족하면 멈추도록
			if(true) {
				break;
				
			}
			
		}
		boolean flag= true;
		while(flag) {
			System.out.println("무한반복");
			//실제 사용 예 :특정 조건을 만족하면 멈추도록
			if(true) {
				flag=false;
			}
		}
	
		//1부터 100까지 합
		//do-while문으로 작성
		sum=0;
		count=1;
		do {
			sum+=count;
			count++;
		}while(count<=100);//세미클론 필수!
	
		System.out.println("1~"+(count-1)+"합: "+sum);
	// Quiz: 1부터 100까지 홀수의 합
		count =1;
		sum=0;
		while(count<=100) {
			if(count%2==1) {
				sum+=count;
				
			}
			count++;
		}
		System.out.println("1~"+(count-1)+"홀수 합: "+sum);
		
		// Quiz2
//		화면에서 자연수를 입력받아서 각 자리수의 합을 출력하는 프로그램을 구현하시오.
//
//		[입력]    [출력]
//		 123   =>  6
//		 12345 =>  15
		Scanner scanner = new Scanner(System.in);
		System.out.println("자연수 입력");
//		String num =scanner.next();
//		sum=0;
//		for(int i = 0 ; i<num.length();i++) {
//			sum+=(num.charAt(i))-'0';
//		}
//		System.out.println(sum);
		sum=0;
		int num = scanner.nextInt();
		while(num>0) {
			sum+=num%10;
			num/=10;
			
			
		}
		System.out.println(sum);
		
		
		
		
		
	}
		
	
	
	
	
	
}
