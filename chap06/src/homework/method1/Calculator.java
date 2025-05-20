package homework.method1;

public class Calculator {
	String plus(String str1, String str2) {
		return str1+str2;
	}
	
	int multi(int num1, int num2 ) {
		if(num1<num2) {
			System.out.println("계산할 수 없습니다");
			return 0;
			
		}
		return num1*num2;
	}
	boolean compare(String str1, String str2) {
		if(str1.equals(str2)) {
			return true;
		}
		else {
			return false;
		}
	}
}
