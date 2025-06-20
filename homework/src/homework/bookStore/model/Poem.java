package homework.bookStore.model;

public class Poem extends Book {

	public Poem(String isbn, int price) {
		super(isbn, price);
	}
	
	public void printInfo() {
		System.out.println("[시] ISBN:"+super.getIsbn()+", 가격: "+super.getPrice()+"원" );
	}
	
}
