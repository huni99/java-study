package sec01.homework.homework1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class BookMenu {
	
	private Scanner sc = new Scanner(System.in);
	private BookController bc =new BookController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("=== 가남 도서관에 오신걸 환영합니다.===");
			System.out.println("원하시는 업무의 번호를 선택하세요.");
			System.out.println("1. 새 도서 추가\r\n"
					+ "2. 도서 전체 조회\r\n"
					+ "3. 도서 검색 조회\r\n"
					+ "4. 도서 삭제\r\n"
					+ "5. 도서 오름차순 정렬\r\n"
					+ "9. 종료");
			System.out.println("메뉴 선택 : ");
			
			int num = sc.nextInt();
			switch(num) {
				case 1:
					insertBook();
					break;
				case 2:
					selectList();
					break;
				case 3:
					searchBook();
					break;
				case 4:
					deleteBook();
					break;
				case 5:
					ascBook();
					break;
				case 9: System.out.println("프로그램을 종료합니다.");
					return;
				
				default:
					System.out.println("잘못입력하였다. 다시 입력해라");
					break;
			}
		}
		
	}
	public void insertBook() {
		System.out.println("=== 도서 등록 ===");
		System.out.println("도서명 : ");
		String str1 = sc.next();
		
		System.out.println("저자명 : ");
		String str2 = sc.next();
		System.out.println("장르 : ");
		int num1 = sc.nextInt();
		String str3;
		switch(num1) {
			case 1:
				str3="인문";break;							
			case 2 :
				str3="자연과학";break;
			case 3 :
				str3="어린이";break;
			default:
				str3="기타";break;								
		}
		
		System.out.println("가격 : ");
		num1 = sc. nextInt();
		
		bc.insertBook(new Book(str1,str2,str3,num1));
	}
	public void selectList() {
		System.out.println("=== 전체 조회 ===");
		List<Book> bookList =bc.selectList();	
		if(bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다");
		}else {
			for(Book bo : bookList) {
				System.out.println(bo.toString());
			}
		}
	}
	public void searchBook() {
		System.out.println("=== 도서 검색===");
		System.out.println("검색어 : ");
		String str = sc.next();
		System.out.println(bc.searchBook(str));
	}
	public void deleteBook() {
		System.out.println("=== 도서 삭제===");
		System.out.println("도서명 : ");
		String str =sc.next();
		System.out.println("저자명 : ");
		String str1 = sc.next();
		
		if(bc.deleteBook(str, str1)==null) {
			System.out.println("삭제할 도서를 찾지 못했습니다");
		}else {
			System.out.println("성공적으로 삭제 되었습니다.");
		}
	}
	public void ascBook() {
		if(bc.ascBook()==1) {
			
			System.out.println("정렬에 성공");
		}else {
			System.out.println("정렬에 실패");
		}
	}
	
	
}
