package homework;

import java.util.Scanner;

public class homework03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str=str.trim();
		int index;
		if(!((index = str.indexOf('@')) ==-1)) {
			String str1 = str.substring(index+1);
			if(str1.equals("goodee.co.kr")) {
				System.out.println("아이디: "+str.substring(0,index).toUpperCase());
			}
			else {
				System.out.println("유효하지 않은 이메일입니다.");
			}
			
		}
	}
}
