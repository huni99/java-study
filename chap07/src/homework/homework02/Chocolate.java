package homework.homework02;

public class Chocolate extends Cake {
	private int cherry;
	private int chip;
	public int getCherry() {
		return cherry;
	}
	public void setCherry(int cherry) {
		this.cherry = cherry;
	}
	public int getChip() {
		return chip;
	}
	public void setChip(int chip) {
		this.chip = chip;
	}
	public Chocolate(double flour , double cream,int cherry, int chip) {
		super(flour, cream);
		this.cherry = cherry;
		this.chip = chip;
	}
	public Chocolate() {}
	
	public String toString() {
		return super.toString()+"체리: "+cherry+"(개)\n"+"초콜릭 칩: "+ chip+"(개)\n";
	}
}
