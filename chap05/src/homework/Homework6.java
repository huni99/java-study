package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("배열의 크기 입력");
		int num=scanner.nextInt();
		String[] arr=new String[num];
		String re;
		for(int i = 0 ; i<arr.length; i++) {
			System.out.println(i+1+"번째 문자열");
			arr[i]=scanner.next();
		}
		
		while(true) {
			System.out.println("더 값을 입력하시겠습니까?(y/n");
			re=scanner.next();
			if(re.equals("y")||re.equals("Y")) {
				System.out.println("더 입력하고 싶은 개수: ");
				int num1=scanner.nextInt();
				String[] arrnew = Arrays.copyOf(arr, arr.length+num1); // 새로운 배열 만큼의 길이로 
				for(int i =num; i<num+num1;i++) {
					System.out.println(i+1+"번째 문자열 입력: ");
					arrnew[i]=scanner.next();
				}
				arr=arrnew;			
			}else if(re.equals("n")||re.equals("N")) {
				for(String i : arr) {
					System.out.println(i);				
				}
				break;			
			}else {
				System.out.println("잘못된 값 입니다.");		
			}
			
		}
		
	}
}
