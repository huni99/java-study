package homework;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str =scanner.next();
		boolean result;
		result = str.equals("간다") ;// str에 null값이 들어갈수도잇으므로
		result = "간다".equals(str);// 이게더 좋은 코드 
		String str2 = result? "온다":"간다";
		System.out.println(str2);
	}
}
