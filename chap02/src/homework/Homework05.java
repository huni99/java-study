package homework;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 세 과목 점수:");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		double num3 = scanner.nextDouble();
		System.out.printf("과목 총점 : %d",(int)(num1+num2+num3));
		System.out.printf("과목 평균 : %d",(int)((num1+num2+num3)/3));
	}
}
