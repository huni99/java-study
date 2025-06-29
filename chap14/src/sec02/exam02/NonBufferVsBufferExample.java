package sec02.exam02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class NonBufferVsBufferExample {
	public static void main(String[] args) throws Exception{
		//참고 :클래스명.class란? 해당 클래스이 class 객체를 가리키는 문법
		//해당 클래스 타입에 대한 메타정보(Class객체)를 얻어옴
		
		//기본 스트림 코드
		String originalFilePath1 = NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		//기본 스트림 코드를 이용해서 복사
		long nonBufferTime =  copy(fis,fos);
		System.out.println("버퍼를 사용하지 않았을 때:\t"+ nonBufferTime+"ns");
		
				
		// 버퍼 보조 스트림을 적용한 코드
		String originalFilePath2 = NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		long BufferTime = copy(bis,bos);
		System.out.println("버퍼를 사용했을 때:\t\t"+BufferTime+"ns");
		
		fis.close();
		fos.close();
	}
	
	
	//입력 스트림에서 데이터를 읽고 출력 스0트림으로 데이터를 보내는 코드(데이터를 복사하는 코드)
	static int data = -1;//입력 스트림으로부터 데이터를 전혀 읽지 않았을 경우 -1
	//매개 변수의  타입은 바이트 기반 스트림으로 그림, 음악, 텍스트 등 모든 종류의 파일을 복사하기 위해
	public static long copy(InputStream is , OutputStream os)throws Exception{
		long start = System.nanoTime();//시작 시간 저장
		
		//파일 복사
		//원본 파일에서 읽은 1byte를타겟파일로 바로 출력
		while(true) {
			data= is.read();//바이트를 읽어서
			if(data== -1) break;
			os.write(data);//바이트를 출력
			
		}
		os.flush();
		long end = System.nanoTime();// 끝시간 저장
		return end-start;
		
	}
}
