package baekjoon_for;

import java.util.Scanner;
public class test_8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 0;
		for(int i=1;i<=n;i++) {
			m += i;
		}
		System.out.print(m);
		

	}

}
