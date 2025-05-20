package homework.method1;

public class Execute {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		boolean a = cal.compare("안녕", "하세요");
		int b= cal.multi(30, 20);
		String c = cal.plus("안녕", "하세요");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	
	

}
