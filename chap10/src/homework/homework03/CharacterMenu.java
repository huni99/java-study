package homework.homework03;

import java.util.Scanner;

public class CharacterMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 : ");
		String str = sc.nextLine();
		CharacterController cc = new CharacterController();
		try {
			System.out.println("문자열 : "+str +"에 포함된 영문자 개수"+cc.countAlpha(str));
		
		} catch (CharCheckException e) {
			e.printStackTrace();
		}
	}
}
