package sec01.homework;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("나이를 입력하세요: ");
		int num1 = scanner.nextInt();
		String str;
		if(num1<3) {
			str="무료";
			
		}else if(num1<13) {
			str="10000원";
		}else if(num1<19) {
			str= "20000원";
		}else if(num1<65) {
			str="30000원";
		}else {
			str="무료";
		}
		System.out.println("당신의 요금은"+str+"입니다");
	}
}
