package sec02.homework;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str;
		
		do {
			System.out.println("게임을 시작합니다.");
			System.out.println("게임을 다시 플레이하겠습니다?(yes/no)");
			str=scanner.next();
		}while(!("no".equals(str)));
		System.out.println("게임을 종료합니다.");
	}
}
