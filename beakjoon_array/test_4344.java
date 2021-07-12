package beakjoon_array;

import java.util.*;
public class test_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			int [] arr = new int[sc.nextInt()];
			double cnt = 0;
			double avg = 0;
			double sum = 0;
			
			for(int j=0;j<arr.length;j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			
			avg = sum/(double)arr.length;
			
			for (int k=0;k<arr.length;k++) {
				if(avg < arr[k]) {
					cnt ++;
				}
			}
			System.out.printf("%.3f%%\n",(double)(cnt/arr.length)*100);
			
		}
	}

}
