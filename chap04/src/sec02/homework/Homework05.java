package sec02.homework;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int sum=0 , num ;
		while(true) {
			System.out.println("숫자(0을 입력하면 종료) : ");
			num=scanner.nextInt();
			
			if(num==0) {
				
				System.out.println("양수의 합계"+sum);
				return;
			}
			if(num<0) {
				continue;
			}
			sum+=num;
		}
		
	}
}
