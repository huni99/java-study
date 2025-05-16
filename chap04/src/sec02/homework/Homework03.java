package sec02.homework;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str;
		
		for(;;) {
			System.out.print("입력:");
			str = scanner.next();
			if("탈출".equals(str)){
			 System.out.println("프로그램 종료");
			 return;
			}
			System.out.println(str);
		}
	}
}
