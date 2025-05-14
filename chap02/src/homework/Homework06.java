package homework;

import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.nextLine().charAt(0);
		int num =Integer.parseInt(ch+"");
		System.out.println(num*num);
	}
}
