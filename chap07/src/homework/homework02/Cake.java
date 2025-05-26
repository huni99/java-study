package homework.homework02;

public class Cake {
	private double flour;
	private double cream;
	
	Cake(){}

	public Cake(double flour, double cream) {
		this.flour = flour;
		this.cream = cream;
	}

	public double getFlour() {
		return flour;
	}

	public void setFlour(double flour) {
		this.flour = flour;
	}

	public double getCream() {
		return cream;
	}

	public void setCream(double cream) {
		this.cream = cream;
	}
	public String toString() {
		return "밀가루: "+flour+"(g)\n"+"크림: "+cream+"(g)\n";
	}
	
	
}
