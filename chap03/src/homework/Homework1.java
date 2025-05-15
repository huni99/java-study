package homework;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str =scanner.next();
//		String result = str=="간다"?"온다":"간다";
//		System.out.println(str);
		boolean result;
		result = str.equals("간다") ;
		String str2 = result? "온다":"간다";
		System.out.println(str2);
	}
}
