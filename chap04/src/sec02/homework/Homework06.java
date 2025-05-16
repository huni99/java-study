package sec02.homework;

import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
		char strnu =' ';
		char  str ='*' ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("트리의 높이를 입력: ");
		int num = scanner.nextInt();
		for(int i =0; i<num ; i++) {
			//(2num-1-(2i+1)/2  ex) num이3일때 마지막 칸수 = num*2-1 i는0 부터지만 num은 1부터 시작이라 
			//총 칸수에서 *개수 뺀식을 반으로 나눔
			for(int j=0;j<(num-i-1);j++) {
				
				System.out.print(strnu);
			}
			for(int j=0;j<(2*i+1);j++) {
				
				System.out.print(str);
			}
			for(int j=0;j<(num-i-1);j++) {
				
				System.out.print(strnu);
			}
			System.out.println();	
		}
		
	}
}
