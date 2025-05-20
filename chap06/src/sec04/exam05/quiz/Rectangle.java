package sec04.exam05.quiz;

public class Rectangle {
	int width,height;
	
	void area() {
		System.out.println("직사각형 넓이 : " + width*height);
	}
	
	
	void length() {
		System.out.println("직사각형 둘레 : " + 2*(width+height));
	}
}
