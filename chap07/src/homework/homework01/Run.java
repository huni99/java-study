package homework.homework01;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Student[] student = new Student[3];
		student[0] = new Student("김철수",20,178.2,70.0,1,"정보시스템공학과");
		student[1] = new Student("이영희",23,167.0,54.0,4,"물리학과");
		student[2] = new Student("홍길동",21,197.6,86.0,2,"경영학과");
		
		System.out.println(student[0].toString());
		System.out.println(student[1].toString());
		System.out.println(student[2].toString());
		
		Scanner sc =new Scanner(System.in);
		Employee[] emp = new Employee[10];
		int count=0;
		System.out.println("===사원 입력받기===");
		while(true) {
			System.out.println("이름: ");
			String name= sc.next();
			System.out.println("나이: ");
			int age = sc.nextInt();
			System.out.println("키: ");
			double height = sc.nextDouble();
			System.out.println("몸무게: ");
			
			double weight= sc.nextDouble();
			System.out.println("급여: ");
			int salary = sc.nextInt();
			System.out.println("부서: ");
			String dept= sc.next();
			
			emp[count]= new Employee(name, age, height, weight, salary, dept);
			
			System.out.println("계속 추가하시겠습니까?");
			String re=sc.next();
			if(re.equalsIgnoreCase("y")) {
				count++;
				continue;
			}
			else if(re.equalsIgnoreCase("n")) {
				for(int i =0; i<count+1 ; i++) {
					System.out.println(emp[i].toString());
					
				}
				break;
			}
			
			
		}
	}

}
