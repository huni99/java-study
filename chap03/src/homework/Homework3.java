package homework;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1,num2;
		System.out.println("친구수");
		num1 = scanner.nextInt();
		System.out.println("사탕수");
		num2 = scanner.nextInt();
		
		System.out.println("1인당 사탕 개수:"+num2/num1);
		System.out.println("남는 사탕 개수:"+num2%num1);
		
	}
}
