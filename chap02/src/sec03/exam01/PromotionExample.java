package sec03.exam01;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; //1byte->4byte, 자동 형변환
		System.out.println("intvalue:"+intValue);
		
		char charValue = 'a';
		intValue = charValue;//2byte->4byte, 자동 형변환
		System.out.println("intvalue:"+intValue);
		
		intValue=30;
		long longValue = intValue; // 4byte->8byte, 자동 형변환
		System.out.println("longvalue:"+longValue);
		
		intValue=100;
		float floatValue = longValue; //실제 저장할 수 있는 값의 범위는 long<float, 자동 형 변환
		System.out.println("floatvalue:"+floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue; //4byte -> 8byte, 자동 형변환
		System.out.println("doublevalue:"+doubleValue);
		
		//주의! byte->char로 자동 형변환 불가: char는 0 부터의 값을 가지는데 byte는 음수부터 가지기 때문에
		byte byteVal = 65;
//		char CharVal = byteVal;// 		
		
	}
}
