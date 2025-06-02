package sec01.exam01_2;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private String name;
	private int age;
	
	public Student() {
		
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)return true;
		if(!(obj instanceof Student))return false;
		
		Student other = ((Student)obj);
		return other.age==age && other.name.equals(this.name);
		
//		return ((Student)obj).age==age;

	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age,name);// 매개값을 이용해 해쉬 값을 반환해줌 (동일한 매개값이 들어가면 동일한 해쉬값이 나온다)
	}

	@Override
	public int compareTo(Student other) {
		// compareTo()의 리턴값 의미
		// 음수: this<other - this가 앞에온다
		// 양수: 뒤로 this>other - this가 뒤로
		// 0: 그대로 this==other - 그대로
			//나이 오름차순
		return age - other.age;
		
	}
}
