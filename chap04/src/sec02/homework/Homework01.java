package sec02.homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num=0,sum=0;
		System.out.println("정수 입력:");
		while(true) {
			
			num = scanner.nextInt();
		if(num<1||num>50) {
			System.out.println("1~50사이의 정수를 입력하세요");
			continue;
			}
		else {
			for(int i =0 ; i<=num; i++) {
				if(i%2==0)sum+=i;
				
				
			}
			
		}
		System.out.println("합계:"+sum);
		break;
		}
	}
}
