package homework;

import java.math.BigDecimal;
import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("가로, 세로 입력");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		System.out.println("면적:" + num1*num2);
		System.out.println("둘레:"+ ((num1+num2)*2));
	}
}
