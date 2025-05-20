package homework;

public class Homewokr1 {
	public static void main(String[] args) {
		int arr[] = {152,180,165,158,171};
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
