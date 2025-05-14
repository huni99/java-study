package homework;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열 입력:");
		String str = scanner.nextLine();
		System.out.printf("%s\n",str.charAt(0));
		System.out.printf("%s\n",str.charAt(1));
		System.out.printf("%s\n",str.charAt(2));
	}
}
