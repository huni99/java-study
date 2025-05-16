package sec02.homework;

import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
		char strnu =' ';
		char  str ='*' ;
		int num = 5;
		for(int i =0; i<num ; i++) {
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
