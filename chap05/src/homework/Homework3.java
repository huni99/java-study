package homework;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3이상 정수 입력: ");
		int num = scanner.nextInt();
		while(true) {
			if(num<3||num%2==0) {
				System.out.println("다시 입력하세요");
				num = scanner.nextInt();
			}	
			break;			
		}
		
		int[] arr = new int[num];
		for(int i = 0; i<arr.length; i++) {
			if(i<arr.length/2) {
				arr[i]=i+1;
			}else {
				arr[i]=arr.length-i;
			}
		}
		for(int ar : arr) {
			System.out.print(ar+" ");
		}
		
	}
}
