package sec01.exam12;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:/Temp/test8.txt");
		
		//길이가 100인 char 타입의 빈 배열 생성
		char[] buffer = new char[100];
		while(true) {
			//입력 스트림으로부터 배열의 길이만큼 읽어옴
			int num = reader.read(buffer);
			if(num==-1)break;
			for(int i =0 ; i<num; i++) {
				System.out.println(buffer[i]);
			}
		}
		reader.close();
	}
	
}
