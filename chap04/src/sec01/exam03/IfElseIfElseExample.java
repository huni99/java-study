package sec01.exam03;

import java.util.Scanner;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 83;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급음 A 입니다.");
		}
		
		else if(score>=80){//80<=score<90 
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급음 B 입니다.");
		
		}
		else if(score>=70){//70<=score<80 
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급음 C 입니다.");
		
		}else {
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급음 D 입니다.");
			
		}
		//정리:
		//1.조건식을 여러 개 작성할 수 있다.(개수는 제한 없음)
		//2. 조건식이 true 가 되는 블록만 실행하고 if문을 빠져나간다.
		
		// Quiz
//		한 개의 문자를 입력받아
//		대문자, 소문자, 숫자, 기타문자인지를 출력하는 프로그램을 구현하시오.
//
//		[입력]   [출력]
//		  A  => 대문자
//		  a  => 소문자
//		  0  => 숫자
//		  가  => 기타문자
		Scanner scanner =new Scanner(System.in);
		char ch = scanner.next().charAt(0);
		
		if('a'<= ch && ch <='z') {
			System.out.println("소문자");
		}else if('A'<= ch && ch<='Z'){
			System.out.println("대문자");
		}else if('0'<=ch && ch<='9') {
			System.out.println("숫자");
		}else {
			System.out.println("기타문자");
		}
		
		
	}

}
