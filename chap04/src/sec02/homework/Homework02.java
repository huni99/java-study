package sec02.homework;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		while(true) {
			
			int num = scanner.nextInt();
			if(num<0) {
				System.out.println("양수만 입력해주세요");
				continue;
			}
			if(num>9) {
				System.out.println("9이하의 숫자를 입력해주세요");
				continue;
			}
			if(num==0) {
				System.err.println("종료");
				return;
			}
			for(int i = num ; i<=9; i++) {
				for (int j = 1; j<=9; j++) {
					System.out.println(i+ " x "+ j +" = " +i*j);
				}
			}
		}
	}
}
