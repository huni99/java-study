package sec01.homework.homework3;

import java.util.Map;
import java.util.Scanner;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== (주)가남에 오신것을 환영합니다. =====\r\n"
					+ "원하시는 메뉴의 번호를 입력하세요.\r\n"
					+ "1. 회원가입\r\n"
					+ "2. 로그인\r\n"
					+ "3. 같은 이름 회원 찾기\r\n"
					+ "9. 종료\r\n"
					+ "메뉴 번호 입력 :");
			int num = sc.nextInt();
			switch(num) {
				case 1:
					joinMember();
					break;
				case 2:
					logIn();
					memberMenu();
					break;
				case 3:
					sameName();
					break;
				case 9 :
					System.out.println("프로그램 종료");
					return;
				default:
					System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}	
		}
	}
	public void memberMenu() {
		while(true){
			System.out.println("***** 회원 메뉴 *****\r\n"
					+ "회원 메뉴는 회원만 접근할 수 있습니다.\r\n"
					+ "먼저 회원가입, 로그인을 해주세요.\r\n"
					+ "1. 비밀번호 바꾸기\r\n"
					+ "2. 이름 바꾸기\r\n"
					+ "3. 로그아웃\r\n"
					+ "메뉴 번호 입력 :");
			int num = sc.nextInt();
			switch(num) {
				case 1:
					changePassword();
					break;
				case 2:
					changeName();
					break;
				case 3:
					System.out.println("로그아웃 되었습니다.");
					return;
		
			}	
		}
		
	}
	public void joinMember() {
		System.out.println("=== 1. 회원가입 ===");
		System.out.println("아이디: ");
		String id = sc.next();
		System.out.println("비밀번호: ");
		String pw = sc.next();
		System.out.println("이름: ");
		String name = sc.next();
		mc.joinMember(id, new Member(pw,name));
		System.out.println("성공적으로 회원가입 완료하였습니다.");
	}
	public void logIn() {
		System.out.println("=== 2. 로그인 ===");
		while(true) {
			System.out.println("아이디: ");
			String id = sc.next();
			System.out.println("비밀번호: ");
			String pw = sc.next();
			String str = mc.login(id, pw);
			if(str!=null) {
				System.out.println(str +"님, 환영합니다!");
				break;
			}else {
				System.out.println("틀린 아이디 또는 비밀번호 입니다. 다시 입력해주세요.");
			}
	
		}
				
	}
	public void changePassword() {
		
		System.out.println("=== 1. 비밀번호 바꾸기 ===");
		
		while(true) {
			System.out.println("아이디: ");
			String id = sc.next();
			System.out.println("현재 비밀번호: ");
			String pw = sc.next();
			System.out.println("새로운 비밀번호: ");
			String name = sc.next();
			if(mc.changePassword(id, pw, name)) {
				System.out.println("비밀번호 변경에 성공했습니다.");
				break;
			}else System.out.println("비밀번호 변경에 실패햇습니다. 다시 입력해주세요.");
				
		}
		
	}
	public void changeName() {
		System.out.println("=== 2. 이름 바꾸기 ===");
		while(true) {
			System.out.println("아이디: ");
			String id = sc.next();
			System.out.println("비밀번호: ");
			String pw = sc.next();
			String str =mc.login(id, pw);
			
			if(str!=null) {
				System.out.println("현재 설정된 이름: "+str);
				System.out.println("변경할 이름: ");
				String name = sc.next();
				mc.changeName(id, name);
				System.out.println("이름 변경에 성공하였습니다.");
			break;
			}else {
				System.out.println("이름 변경에 실패하였습니다. 다시 입력해주세요");
			}
		}
	}
	public void sameName() {
		System.out.println("=== 3. 같은 이름 회원 찾기");
		System.out.println("검색할 이름: ");
		String name = sc.next();
		for(Map.Entry<String,String> en : mc.sameName(name).entrySet()) {
			System.out.println(en.getValue()+"-"+en.getKey());
			
		}
		
		
	}
}
