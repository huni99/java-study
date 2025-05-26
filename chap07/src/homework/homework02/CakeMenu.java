package homework.homework02;

import java.util.Scanner;

public class CakeMenu {
	private Scanner sc = new Scanner(System.in);
	private ChocolateController cc=  new ChocolateController();
	private GreenTeaController gtc = new GreenTeaController();
	
	public void mainMenu() {
	    while(true) {
	    	System.out.println("===== 어떤 케이크를 만드시겠습니까? =====\n"
					+ "1. 초콜릿 케이크(밀가루 : 200g, 크림 : 300g, 체리 : 10개, 초콜릿 칩 : 100개)\n"
					+ "2. 녹차 케이크(밀가루 : 250g, 크림 : 400g, 녹차 파우더 : 10g, 치즈 큐브 : 50개)\n"
					+ "9. 취소");
	    	System.out.println("메뉴 번호 : ");
	    	int num = sc.nextInt();
	    	switch(num) {
		    	case 1:
		    		chocolateMenu();
		    		
		    		break;
		    	case 2:
		    		greenTeaMenu();
		    		break;
		    	case 9:
		    		System.out.println("종료합니다.");
		    		return;
	    		default:
	    			System.out.println("잘못된 번호입니다.");
	    			
	    	}
	    }
	}
	public void chocolateMenu () {
		double a,b;
		int c,d;
		System.out.println("밀가루(g): ");
		a=sc.nextDouble();
		System.out.println("크림(g) :");
		b=sc.nextDouble();
		System.out.println("체리(개) :");
		c=sc.nextInt();
		System.out.println("초콜릿 칩(개) : ");
		d=sc.nextInt();
		System.out.println(cc.bakeChocolateCake(a,b,c,d));
		System.out.println("초코릿 케이크가 완성되었습니다.");
	}
	public void greenTeaMenu() {
		double a, b, c;
		int d;
		System.out.println("밀가루(g): ");
		a=sc.nextDouble();
		System.out.println("크림(g) :");
		b=sc.nextDouble();
		System.out.println("녹차 파우더(g) :");
		c=sc.nextDouble();
		System.out.println("치즈 큐브(개) :");
		d=sc.nextInt();
		System.out.println(gtc.bakeGreenTeaCake(a,b,c,d));
		System.out.println("치즈 케이크가 완성되었습니다.");
	}
}
