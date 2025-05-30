package homework;

import java.util.Iterator;
import java.util.Scanner;

//split사용하면 훨씬 편함
public class homework06 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String sentence = "the quick brown fox jumps over the lazy dog";
		
		System.out.println("단어 입력: ");
		String str = sc.next();
		int index = sentence.indexOf(str);
		int pointer =index;
		String first,last ;
		if(index==-1) {
			System.out.println("존재하지 않는 단어");	
		}else {
			for (int i = index; i <sentence.length(); i++) {
				if(sentence.charAt(i)==' ') {
					pointer=i;
					break;
				}	
				if(i==sentence.length()-1) {
					System.out.println("마지막 단어입니다.");	
					return;	
				}
			}
			
			first = sentence.substring(index, pointer);
			index = ++pointer;
			for (int i = index; i <sentence.length(); i++) {
				if(sentence.charAt(i)==' ') {
					pointer=i;
					break;
				}
				if(i==sentence.length()-1) {
					pointer=i+1;
				}
			}
			last = sentence.substring(index, pointer);
			System.out.println(first+"다음 단어 : "+last);
		
		}
		
	}
}
