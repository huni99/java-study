package sec02.exam11;

import java.util.Scanner;

public class ConditionalOperatorExample {
	public static void main(String[] args) {
		int score = 85;
		
		char grade = (score>90)? 'A' :(score>80?'B':'C');
		System.out.println(score+"점은 "+grade+"등급입니다.");
		
		// Quiz
//		0~100사이의 점수를 입력받아
//		점수가 60점 이상이면 "합격",
//		60점 미만인 경우 "불합격"을 출력하는 프로그램을 구현하시오.
//		단 음수이거나 100이 넘는 점수는 "점수입력오류"로 출력한다.
//
//		[입력] [출력]
//		 85 => 합격
//		 50 => 불합격
//		-10 => 점수입력오류
		System.out.println("정수 입력: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int check;
		check= (num>=60 && num<=100) ? 1: num>0&&num<60 ? 2 : 3 ;
		
		if(check==1) {
			System.out.println("합격");
		}else if(check==2) {
			System.out.println("불합격");
		}
		else if(check==3) {
			System.out.println("점수입력오류");
		}
		
	}
}
