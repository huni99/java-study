package homework.homework01;

public class Run {
	public static void main(String[] args) {
		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		String[] strarr = str.split("\n");
		Person[] parr  = new Person[strarr.length];
		for(int i = 0 ; i<strarr.length;i++) {
		      String[] fields = strarr[i].split(",");
	            String name = fields[0];
	            int age = Integer.parseInt(fields[1]);
	            String address = fields[2];
	            char gender = fields[3].charAt(0);

	            parr[i] = new Person(name, age, address, gender);
	           System.out.println(parr[i].toString());
		}
		
			
		
	}
}
