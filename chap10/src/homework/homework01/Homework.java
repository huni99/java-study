package homework.homework01;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		int num = (int)(Math.random()*50)+1;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1~50까지 숫자 입력: ");
			int num1;
			try {
				num1 = sc.nextInt();	
			} catch (Exception e) {
				System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
				sc.nextLine();//버퍼 초기화
				continue;
			}
			if(num1 <num ) {
				System.out.println("up");
			}else if(num1>num) {
				System.out.println("down");
			}else {
				System.out.println("축하합니다 정답입니다.");
				break;
			}
			
		}
	}
}
