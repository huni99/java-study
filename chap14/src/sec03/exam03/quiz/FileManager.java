package sec03.exam03.quiz;

import java.io.File;

public class FileManager {
 public void deleteFile(File dir) {
	 if(dir.isFile()) {
		 System.out.println(dir.getPath()+" -> 삭제완료");
		 dir.delete();
	 }
 }
}
