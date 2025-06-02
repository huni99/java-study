package sec01.exam05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		//인스턴스는 다르지만 내부 데이터가 동일한 경우
		//객체의 hashCode()와 equals()를 기준으로 판단
		set.add(new Member("김재현",30));
		set.add(new Member("김재현",20));
		//hashCode()와 equals()를 재정의 하지않으면 삭제 안됨
//		set.remove(new Member("김재현",30));
		//이외에도 동등 객체로 판단하는 많은 메소드들이 제대로 동작하려면 재정의 필수임
		
		
		
		//요소 정렬
		//HashSet 자체는 정렬 기능이 없는 컬렉션이기 때문에
		//정렬을 하려면 다른 컬렉션으로 변환한 뒤에 정렬
		//List로 변환 후 Collections.sort() 사용
		
		System.out.println("총 객체수: "+ set.size());
		for(Member member : set) {
			System.out.println("\t"+member);
		}
		List<Member> list = new ArrayList<Member>(set);
		Collections.sort(list);
		System.out.println(list.get(0).compareTo(list.get(1)));
	}
}
