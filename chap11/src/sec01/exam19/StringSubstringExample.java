package sec01.exam19;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880515-1234567";
		String firstNum = ssn.substring(0,6);
		String secondNum = ssn.substring(7);
		System.out.println(firstNum);
		System.out.println(secondNum);
	}
}
