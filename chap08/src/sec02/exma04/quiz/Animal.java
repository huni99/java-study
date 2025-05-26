package sec02.exma04.quiz;

public abstract class  Animal {

	private String kind;
	private int leg;
	Animal(){}
	Animal(String kind, int leg){
		this.kind=kind;
		this.leg= leg;
		
	}

	public String getKind() {
		return kind;
	}

	public int getLeg() {
		return leg;
	}
		
	public abstract void eat();
	public abstract void sound();
	
}
