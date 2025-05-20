package homework;

import java.util.Scanner;

public class Homework5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] choices = {"가위","바위","보"};
		int [] result = new int[3];
		
		while(true) {
			int num = (int)(Math.random()*3);
			System.out.println("가위 바위 보 중에 하나를 입력하세요");
			String str = scanner.next();
			if(str.equals("stop")){
				System.out.println(result[0]+result[1]+result[2]+"전 "+
						result[1]+"승 "+ result[0]+"무 "+result[2]+"패");
				
				break;
				
			}
			if(!(str.equals("가위")||str.equals("보")||str.equals("바위"))) {
				System.out.println("잘못입력하였습니다.");
				continue;
			}
			if(num==0) {
				System.out.println("컴퓨터 :"+ choices[num]);
				System.out.println("사용자 :"+ str);
				if(str.equals("가위")) {
					result[0]++;
					System.out.println("비겼습니다.");
				}else if(str.equals("바위")) {
					result[1]++;
					System.out.println("이겼습니다.");
				}else {
					result[2]++;
					System.out.println("졌습니다.");
				}
			
			}else if(num==1) {
				System.out.println("컴퓨터 :"+ choices[num]);
				System.out.println("사용자 :"+ str);
				if(str.equals("가위")) {
					result[2]++;
					System.out.println("졌습니다.");
				}else if(str.equals("바위")) {
					result[0]++;
					System.out.println("비겼습니다.");
				}else {
					result[1]++;
					System.out.println("이겼습니다.");
				}
			}else {
				System.out.println("컴퓨터 :"+ choices[num]);
				System.out.println("사용자 :"+ str);
				if(str.equals("가위")) {
					result[1]++;
					System.out.println("이겼습니다.");
				}else if(str.equals("바위")) {
					result[2]++;
					System.out.println("졌습니다.");
				}else {
					result[0]++;
					System.out.println("비겼습니다.");
				}
				
			}
				
				
				
			
			
		}
	}
}
