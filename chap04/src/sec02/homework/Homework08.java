package sec02.homework;

import java.util.Scanner;

public class Homework08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str;
		char ch ;
		while(true) {
			int num=0;
			System.out.println("문자열: ");
			str= scanner.next();
			System.out.println("문자: ");
			ch = scanner.next().charAt(0);
			for(int i =0; i<str.length();i++) {
				if(str.charAt(i)==ch)num++;
			}
			System.out.println("포함된 개수: "+num);
				while(true) {
				System.out.println("다시 입력하시겠습니까?");
				str = scanner.next();
				if(str.equals("y")||str.equals("Y"))break;
				else if(str.equals("n")||str.equals("N")) {
					System.out.println("프로그램종료");
					return;}
				else {
					System.out.println("잘못된 대답입니다.다시 입력해주세요.");
					continue;
				}
				
			}
			
		}
	}
}
