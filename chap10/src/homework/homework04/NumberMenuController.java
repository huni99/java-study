package homework.homework04;

public class NumberMenuController {
	public NumberMenuController(){
		
	}
	public boolean checkDouble(int num1 , int num2 ) throws NumRangeException {
		if( 1<=num1&&num1<=100&&1<=num2&&num2<=100) {
			
		if(num1%num2==0||num2%num1==0) {
			return true;
		}
		
		return false;}
		else {
			throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
		}
	}
}
