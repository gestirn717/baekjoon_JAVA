package baekjoon_math2;

import java.util.*;
public class test_1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int cnt = 0;
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length;i++) {
			if(check(arr[i])) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	static boolean check(int a) {
		int chk_cnt = 0;
		for(int i=1;i<a; i++) {
			if(a%i ==0) chk_cnt++;
		}
		if (chk_cnt ==1) return true;
	    return false;
	
	
	
	
}
}