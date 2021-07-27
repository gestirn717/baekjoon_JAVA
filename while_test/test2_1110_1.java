package while_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test2_1110_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int chk = n;
		int cnt = 0;
		
		while(true) {
			n = ((n/10 +n%10)%10)+((n%10)*10);
			cnt ++;
		
			if (chk == n) break;
			
		}
		System.out.print(cnt);
	}

}
