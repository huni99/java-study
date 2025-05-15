package homework;
import java.util.Scanner;
public class Homework6 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("각 과목의 점수를 입력하세요");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		int num5 = scanner.nextInt();
		int sum= num1+num2+num3+num4+num5;
		int avg=sum/5;
		
		if(num1>=40&&num2>=40&&num3>=40&&num4>=40&&num5>=40) {
			if(avg>=60) {
				System.out.println("합격을 축하합니다.");
			}
			else{
				System.out.println("평균 점수 60점 미만으로 불합격입니다.");
			}
		}else {
			if(num1<40) {
				System.out.println("소프트웨어설계 과목 과락으로 불합격입니다.");
			}
			else if(num2<40) {
				System.out.println("소프트웨어 개발 과목 과락으로 불합격입니다.");
			}
			else if(num3<40) {
				System.out.println("데이터베이스 구축 과목 과락으로 불합격입니다.");
			}
			else if(num4<40) {
				System.out.println("프로그래밍언어 활용 과목 과락으로 불합격입니다.");
			}
			else {
				System.out.println("정보시스템구축관리 과목 과락으로 불합격입니다.");
			}
		}
		
	}
}
