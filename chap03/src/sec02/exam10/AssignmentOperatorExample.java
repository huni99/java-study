package sec02.exam10;

import java.util.Scanner;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
int result = 0;		
		
		result += 10;
		System.out.println("result=" + result);	// 10
		
		result -= 5;
		System.out.println("result=" + result);	// 5	
		
		result *= 3;
		System.out.println("result=" + result);	// 15
		
		result /= 5;
		System.out.println("result=" + result);	// 3
		
		result %= 3;
		System.out.println("result=" + result);	// 0
		
		// Quiz
//		금액을 입력받아 500원, 100원, 50원, 10원, 1원 동전으로 변경하려고 합니다.
//		최소 필요한 동전의 개수를 출력하는 프로그램을 구현하시오.
//
//		[입력]
//		5640
//
//		[출력]
//		500원:11개
//		100원:1개
//		50원:0개
//		10원:4개
//		1원:0개
		
		System.out.println("금액을 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		int coin =scanner.nextInt();
		int result2;
		System.out.printf("500원:%d \n100원:%d \n50원:%d \n10원:%d \n1원:%d \n"
				,coin/500,coin%500/100,coin%100/50,coin%50/10,coin%10);  
	}

}

