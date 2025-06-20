package homework.bookStore.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import homework.bookStore.model.Book;
import homework.bookStore.model.Novel;
import homework.bookStore.model.Poem;

public class BookStoreApplication  {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int price;
		String str,strName,strIsbn;
		List<Book> books =new ArrayList<Book>();
		Book book;
		JDBCInsert jd = new JDBCInsert();
		
		while(true) {
			while(true) {
			System.out.println("책 종류를 입력하세요 (소설/시): ");
			strName =sc.nextLine();
			if(!(strName.equals("소설")||strName.equals("시"))) {
				System.out.println("잘못된 종류입니다. 다시 입력해주세요.");
				continue;
				}		
			break;
			}
			
			while(true) {
				System.out.println("ISBN을 입력하세요 (13자리, *포함 가능): ");
				strIsbn=sc.nextLine();
				if(isValidISBN(strIsbn))continue;
				break;
			}
			while(true) {
				try {
					System.out.println("가격을 입력하세요: ");
					price=sc.nextInt();
					sc.nextLine();
					if(price<=0) {
						System.out.println("유효하지 않는 값입니다.");
						continue;
					}
				} catch (Exception e) {
					System.out.println("유효하지 않는 값입니다.");
					
					continue;
					
				}
				break;
			}
			
			if(strName.equals("소설")) {
				book=new Novel(strIsbn,price);
				books.add(book);
			}
			else {
				book=new Poem(strIsbn,price);
				books.add(book);
			}
			jd.insert(strName, book);
			System.out.println("입력을 종료하시겠습니까?(y/Y 입력 시 종료): ");
			str=sc.nextLine();
			if(str.equalsIgnoreCase("y")) {
				System.out.println("===== 도서 목록 =====");
				info(books);
				return;
			}
			
			
		}
		
	}
	public static boolean isValidISBN(String strIsbn) {
		if(strIsbn.length()!=13) {System.out.println("유효하지 않는 ISBN입니다");
		return true;
		}
		if(strIsbn.length()-strIsbn.replace("*", "").length()>1) {
			System.out.println("유효하지 않는 ISBN입니다");
			return true;
		}
		return false;
		
	}
	public static void info(List<Book> book) {
		double num=0;
		for (Book book2 : book) {
			book2.printInfo();
			num+=book2.getPrice();
		}
		System.out.printf("총 평균 가격: %.2f",num/book.size());
		
	}
		
}
