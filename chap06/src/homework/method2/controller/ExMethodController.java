package homework.method2.controller;

public class ExMethodController {
	public void showStr(String str) {
		System.out.println(str);
	}
	
	public int plus () {
		int sum=0;
		for(int i = 1; i<=100;i++ )sum+=i;
		return sum;
	}
	public String oddEven(int num) {
		if(num%2==0) {
			String str = "짝수";
			return str;
		}else {
			String str = "홀수";
			return str;
		}
	}
	
	public String checkEnglish(String str) {
		boolean check=false;
		for(int i=0;i<str.length();i++) {
			if('A'<str.charAt(i)&&'z'>str.charAt(i)) {
			check =true;	
			}
			
		}
		if(check) {
			return "존재";
		}
		return "없음";
	}
	
	public int checkWord(String str, char ch) {
		int count=0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		return count;
	}
	public void multiTable(int num) {
		for(int i =1 ;i<10 ; i++) {
			System.out.println(num+" x "+i+" = "+num*i);
		}
	}
}
