package baekjoon_if;


import java.util.Scanner;
public class test_14681 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a>0 && b>0) {
			System.out.print(1);
		}
		else if (a<0 && b>0) {
			System.out.print(2);
		}
		else if (a<0 && b<0) {
			System.out.print(3);
		}
		else if (a>0 && b<0) {
			System.out.print(4);
		}

	}

}
