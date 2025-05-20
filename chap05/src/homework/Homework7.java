package homework;

import java.util.Arrays;

public class Homework7 {
	public static void main(String[] args) {
		String[] report = {"Introduction", "Research","Conclusion"};
		String[] copy = Arrays.copyOf(report, report.length);
		copy[0]="Team Feedback";
		for(int i = 0;i<report.length;i++) {
			System.out.print(report[i]+" ");
			
		}
		System.out.println();
		for(int i = 0;i<report.length;i++) {
		
			System.out.print(copy[i]+" ");
		}
	}
}
