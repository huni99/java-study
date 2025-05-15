package homework;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String str = num%2==0? "짝수":"홀수";
		System.out.println(str);
	}
}
