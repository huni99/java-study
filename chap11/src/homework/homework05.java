package homework;

import java.util.Scanner;

public class homework05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 :");
		String str1 = sc.next();
		System.out.println("생년월일 : ");
		String str2 = sc.next();
		String result= "";
		result += str1.substring(0,1);
		result +=str2.substring(2,4);
		result +=str2.substring(6);
		result += str1.substring(1);
		System.out.println(result);
		
		
		
	}
}
