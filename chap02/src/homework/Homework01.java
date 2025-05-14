package homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("몸무게 입력: ");
		double num1 = scanner.nextDouble();
		System.out.println("키 입력: ");
		double num2 = scanner.nextDouble();
		
		System.out.printf("체칠량지수:%10.1f ",num1/(num2*num2));
	}
}
