package homework.homework04;

import java.util.Scanner;

public class NumberMenu {
	public void menu() {
		int num1 , num2 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1: ");
		num1= sc.nextInt();
		System.out.println("정수2: ");
		num2=sc.nextInt();
		NumberMenuController nm =new NumberMenuController();
		try {
			
			System.out.println(num1+"은 "+num2+"의 배수인가?"+nm.checkDouble(num1, num2));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
