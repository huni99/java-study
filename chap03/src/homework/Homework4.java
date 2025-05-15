package homework;

import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1,num2,num3,sum,avg;
		String str;
		System.out.println("국 영 수 점수 입력");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		sum = num1+num2+num3;
		avg = sum/3;
		
		str= avg>=90 ? "휴대폰 교체가능":"휴대폰교체 불가능";
		System.out.println("합계"+sum);
		System.out.println("평균"+avg);
		System.out.println(str);
		
	}
}
