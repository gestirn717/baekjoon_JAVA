package baekjoon_if;

import java.util.Scanner;
public class test_9498 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (90 <= a) {
			System.out.print("A");
		}
		else if (80 <= a) {
			System.out.print("B");
		}
		else if (70 <= a) {
			System.out.print("C");
		}
		else if (60 <= a) {
			System.out.print("D");
		}
		else {
			System.out.print("F");
		}
	}

}
