package beakjoon_array;

import java.util.*;
public class test_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		double sum = 0.0;
		
		int [] arr = new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		for(int i=0;i<n;i++) {
			sum += ((double)arr[i]/(double)max) *100;
		}
		System.out.print(sum/n);

	}

}
