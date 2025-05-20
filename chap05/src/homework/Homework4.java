package homework;

public class Homework4 {
	public static void main(String[] args) {
		int arr [] = new int [6];
		
		for(int i=0 ;i<arr.length;i++) {
			boolean check=false;
			arr[i]= (int)(Math.random()*45+1);
			for(int j =0; j<i; j++) {
				if(arr[j]==arr[i]) {
					 check =true;
				}
			if(check) {
				i--;
			}
			
			}
			
		}
		for(int j = 0; j<arr.length;j++) {
			for(int i = 0; i<arr.length;i++) {
				if(i==arr.length-1) {
					break;
				}
				if(arr[i]<arr[i+1]) {
					
				}
				else {
					int num = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=num;
				}
			
			}
			if(j==arr.length-1) {
				break;
			}
		}
		for(int ar : arr) {
			System.out.println(ar);
		}
	}
}
