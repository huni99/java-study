package homework;

import java.util.Scanner;

public class Homework5 {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민번호 입력:");
		char str = scanner.next().charAt(7);
		String result = str=='1'||str=='3'? "남성":str=='2'||str=='4'?"여성":"잘못된값";
		System.out.println(result);
	}
}
