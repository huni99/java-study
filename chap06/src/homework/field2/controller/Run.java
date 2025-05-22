package homework.field2.controller;

import homework.field2.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.phone= "01012345678";
		p2.phone= "01012345678";
		
		p1.height=190.5;
		p2.height=175.4;
		
		p1.weight=100.2;
		p2.weight=65.6;
		
		System.out.println(p1.phone+" "+p1.height+" "+ p1.weight);
		System.out.println(p2.phone+" "+p2.height+" "+ p2.weight);
		
	}
}
