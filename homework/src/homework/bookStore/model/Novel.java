package homework.bookStore.model;

public class Novel extends Book {

	public Novel(String isbn, int price) {
		super(isbn, price);
	}
	
	public void printInfo() {
		System.out.println("[소설] ISBN:"+super.getIsbn()+", 가격: "+super.getPrice()+"원" );
	}
	
}
