package chap11.sec01.exam03;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number =number;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("재정의된 equals호출");
		if(obj instanceof Key comparekey) {
			if(comparekey.number==number) {
				return true;
			}
		}
		return false; 
	
		}
	@Override
	public int hashCode() {
		System.out.println("재정의된 hashCode호출");
		//number가 같은 모든 Key 객체는 동일한 해시코드가 나오게 만들어줌
		return number;
	}
}
