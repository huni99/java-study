package sec02.exam02;

public class FieldInitValueExample {
	public static void main(String[] args) {
		//객체 생성
		FieldInitValue field = new FieldInitValue();
		
		System.out.println("byteField: " + field.byteField);
		System.out.println("shortField: " +field.shortField);
		System.out.println("intField: " + field.intField);
		System.out.println("longField: " +field.longField);

		System.out.println("booleanField: "+ field.booleanField);
		System.out.println("charField: " +field.charField);// 빈 공백
		
		System.out.println("floatField: " +field.floatField);
		System.out.println("doubleField: " +field.doubleField);
		System.out.println("doubleField: " +field.arrField);
		System.out.println("doubleField: " +field.referenceField);
	}
}
