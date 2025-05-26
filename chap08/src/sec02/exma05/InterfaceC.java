package sec02.exma05;
//methodA,B도 필요하다면 상속을 통해 물려받음
//인터페이스 끼리만 상속 가능,인터페이스의 조상은 언터페이스만 가능(Object가 최고 조상 아님)
//다중 상속이 가능(구현부가 없는 추상 메소드는 충동해도 문제가 없기 때문)
public interface InterfaceC extends InterfaceA, InterfaceB{
	public void methodC();
	
	//상속으로 물려받은 추상 메소드 methodA(),methodB() 까지 총 3개의 메소드를 갖고있음
	
}
