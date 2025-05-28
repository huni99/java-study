package homework;

import java.util.Scanner;

public class homework04 {
public static void main(String[] args) {
	String str ="";
	Scanner sc = new Scanner(System.in);
	while(true) {
		String re =sc.next();
		if(re.equalsIgnoreCase("n")) {
			System.out.println("프로그램 종료");
			break;
		}
		str+=re;
	}
	System.out.println(str);
}
}
