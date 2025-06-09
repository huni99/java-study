package homework.homework1;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice {
	
	public void method1(String str) {
		File file = new File("C:/test/sub");
		file.mkdirs();
		try {
			FileOutputStream fos = new FileOutputStream("C:/test/sub/나비야1.dat");
			byte[] byte1 = str.getBytes();
			fos.write(byte1);
			
		} catch (Exception e) {
		}
		
		
		
	}
	public void method2(String str) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:/test/sub/나비야2.dat");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		byte[] byte1 = str.getBytes();
		bos.write(byte1);
	}
}
