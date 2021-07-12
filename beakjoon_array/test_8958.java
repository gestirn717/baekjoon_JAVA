package beakjoon_array;

import java.util.*;
public class test_8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		for(int i=0; i<n;i++) {
			String [] arr = sc.next().split("");
			int score = 0;
			int sum = 0;
			for(int j=0; j<arr.length;j++) {
				if(arr[j].equals("O") || arr[j].equals("o")) {
					sum ++;
					score += sum;
				}else {
					sum = 0;
				}
			}
			System.out.println(score);
		}

	}

}
