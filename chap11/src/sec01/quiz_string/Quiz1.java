package sec01.quiz_string;

import java.util.Scanner;

public class Quiz1 {
	// Quiz
//	입력된 문자열 중 숫자들의 합계를 출력하시오.

//	[입력]
//	1) 1,2,3,4,5
//	2) 1-2-3-4-5
//	3) a1b2c3de45

//	[출력]
//	1) 15
//	2) 15
//	3) 15
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		
		System.out.println(sum(str)+" "+sum(str2)+ " "+sum(str3));
	}
	public static int sum(String str) {
		int sum=0;
		
		//숫자인지 직접 체크: '0'~'9'사이인지 확인
		//참고 : Character.isDigit(ch)
		for(int i = 0; i<str.length(); i++) {
			if('0'<=str.charAt(i)&&str.charAt(i)<='9') {
				//문자를 정수로 변환
				// 1. Character.getNumericValue(' ');
				// 2. 문자를 문자열로 바꾸고 문자열을 다시 정수로 Integer.parseInt(String.valueOf(' '))			 ;
				sum+=str.charAt(i)-'0';
			}
		}
		return sum;
	}
}
