package homework;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("배열 길이 입력:");
		int num = scanner.nextInt();
		int [] arr = new int[num];
		
		for(int i =0 ; i<num; i++) {
			System.out.println("배열 "+i+"번쨰 인덱스에 넣을 값: ");
			arr[i]= scanner.nextInt();
			
		}
		int sum =0 ;
		for (int ar : arr) {
			System.out.println(ar);
			sum+=ar;
		}
		System.out.println(sum);
	}
}
