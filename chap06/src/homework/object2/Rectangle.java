package homework.object2;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(){
		width= 1;height=1;
	}
	public Rectangle(int width, int height){
		this.height=height;
		this.width = width;
	}
	
	public int calculateRound() {
		return (width+height)*2;
	}
	public int calculateArea() {
		return width*height;
	}
	public void printInfo() {
		System.out.println(calculateRound());
		System.out.println(calculateArea());
	}
}
