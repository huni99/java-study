package sec01.homework.homework1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookController {
	private List<Book> bookList =new ArrayList<Book>();

	public BookController() {
		bookList.add(new Book("느리게 나이드는 습관","정희원","인문",16200));
		bookList.add(new Book("코스모스","칼 세이건","자연과학",17910));
		bookList.add(new Book("나에게 들려주는 예븐 말","김종원","어린이",15610));
		bookList.add(new Book("혼자 공부하는 자바","신용권","기타",25240));
	
	}
	public void insertBook(Book bk) {
		bookList.add(bk);
	}
	public List<Book> selectList() {
		return this.bookList;
	}
	public List<Book> searchBook(String keyword) {
		List<Book> searchList =new ArrayList<Book>();
		int i = 0 ;
		while(i<bookList.size()) {
			
			if(bookList.get(i).getTitle().contains(keyword)) {
				searchList.add(bookList.get(i));
			}
			i++;
		}
		return searchList;
	}
	public Book deleteBook(String title,String author) {
		Book removeBook =null;
		for(int i = 0; i <bookList.size();i++) {
			if(bookList.get(i).getAuthor().equals(author)&&bookList.get(i).getTitle().equals(title)) {
				removeBook= bookList.get(i);
				bookList.remove(i);
			}
		}
		return removeBook; 
	}
	public int ascBook() {
		if(bookList.isEmpty()) {
			return -1;
		}
		
		Collections.sort(bookList);
		return 1;
	}
}
