package sec01.exam02;

//public class Member extends Object{
public class Member {//명시적으로 상속받은게 없으면 자동적으로 Object를 상속받음
	public String id;
	
	public Member(String id) {
		this.id=id;
	}
	
	@Override
		public boolean equals(Object obj) {
		//매개 변수의 타입이 Object 타입으로 모든 객체가 대입 가능하므로
		//제일 먼저 매개값이 Member 타입인지 확인이 필요
		if(obj instanceof Member) {
			//id 필드에 접근하기 위해서 Member 타입으로 강제 타입 변환하고
			Member member = (Member) obj;
			//id 필드값이 동일한지 검사한 동일하다면 true를 리턴
			if(member.id.equals(id)) {
			return true;//여기서의 equals()는 String 에 재정의된 메소드로 문자열을 비교
	
			}
		}
		//매개값이 Member 타입이 아니거나 Member타입인데 id값이 다른경우
		return false;
	}
	
}
