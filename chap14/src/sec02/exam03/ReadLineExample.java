package sec02.exam03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExample {
	public static void main(String[] args) throws Exception{
		//문자 기반 파일 입력 스트림
		Reader reader = new FileReader(ReadLineExample.class.getResource("Language.txt").getPath());
		
		BufferedReader br = new BufferedReader(reader);
		//한 문자씩 읽는 것 보다 라인(행) 단위로 문자열을 읽어 성능 향상
		
		while(true) {
			//라인 단위로 문자열을 읽는 readLine()메소드 제공
			String data =br.readLine();
			if(data==null)break;
			System.out.println(data);
		}
		
		br.close();
	}
}
