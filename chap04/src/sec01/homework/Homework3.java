package sec01.homework;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1,num2,num3,min;
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		num3=scanner.nextInt();
		min=num1;
		
		min = num1 <num2? num1:num2;
		min = min<num3? min :num3;
		System.out.println("최소값"+min);
		
		
	}
}
