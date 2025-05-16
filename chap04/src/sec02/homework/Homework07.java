package sec02.homework;

import java.util.Scanner;

public class Homework07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("정수를 입력:");
			int num = scanner.nextInt();
			if(!(num>0)) {
				System.out.println("양수가 아닙니다.");
				continue;
			}
			for(int i = 1 ; i<=num ; i++) {
				if(i%2==0) {
					System.out.print("수");
					}
				else {
					System.out.print("박");
				}
				
			}
			break;
		}
	}
}
