package baekjoon_while;

import java.util.*;
public class test_1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int chk = n;
		int cnt = 0;
		
		while(true) {
			int num = n/10 + n%10;
			int n_num = (n%10*10)+(num%10);
			cnt += 1;
			n = n_num;
			
			if(chk ==n) {
				break;
			}
		}
		System.out.print(cnt);


	}

}
