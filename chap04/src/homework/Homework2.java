package homework;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월과 기온을 입력하세요");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		if(num1<=0) {
			System.out.println("해당하는 계절이 없다");
			
		}else if(num1<=3) {
			System.out.println("봄");
			
		}else if(num1<=6) {
			if(num2>=35) {
				System.out.println("여름 폭염 경보");
			}else if(num2>=32) {
				System.out.println("여름 폭염 주의보");
			}else {
				System.out.println("여름");
			}
			
		}else if(num1<=9) {
			System.out.println("가을");
		}else if(num1<=12) {
			if(num2<=-15) {
				System.out.println("겨울 한파 경보");
			}else if(num2<=-12) {
				System.out.println("겨울 한파 주의보");
			}else {
				System.out.println("겨울");
			}
			
		}else {
			System.out.println("해당하는 계절이 없다");
		}
	}
}
