package sec01.exam21;

public class StringTrimeExample {
	public static void main(String[] args) {
		String tel1 = " 02";
		String tel2 = "123  ";
		String tel3 = " 1234  ";
		
		String tel = tel1.trim();
		System.out.print(tel+"-");
		tel = tel2.trim();
		System.out.print(tel+"-");
		tel = tel3.trim();
		System.out.print(tel);
	}
}
