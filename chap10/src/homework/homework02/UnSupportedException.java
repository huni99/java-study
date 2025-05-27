package homework.homework02;

public class UnSupportedException extends RuntimeException {
	
	public UnSupportedException() throws UnSupportedException{
		super("원인을 알 수 없는 오류가 발생");
	}
}
