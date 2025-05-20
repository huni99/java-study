package homework.method2.run;

import homework.method2.controller.ExMethodController;

public class Run {
	public static void main(String[] args) {
		ExMethodController ext = new ExMethodController();
		int result = ext.plus();
		System.out.println(result);
		
		System.out.println(ext.oddEven(10));
		System.out.println(ext.checkEnglish("안녕하세여ㅛa"));
		System.out.println(ext.checkWord("apple", 'a'));
		ext.multiTable(7);
	}
}
