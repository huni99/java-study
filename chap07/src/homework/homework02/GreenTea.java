package homework.homework02;

public class GreenTea extends Cake{
	private double powder;
	private int cheese;
	
	GreenTea(){}

	public GreenTea(double flour, double cream ,double powder, int cheese) {
		super(flour,cream);
		this.powder = powder;
		this.cheese = cheese;
	}

	public double getPowder() {
		return powder;
	}

	public void setPowder(double powder) {
		this.powder = powder;
	}

	public int getCheese() {
		return cheese;
	}

	public void setCheese(int cheese) {
		this.cheese = cheese;
	}
	
	public String toString() {
		return super.toString()+"녹차 파우더: "+powder+"(g)\n"+"치즈 큐브: "+ cheese+"(개)\n";
	}
}
