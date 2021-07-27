package func_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class test2_1065_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print(hansoo(Integer.parseInt(br.readLine())));

	}
	
	static int hansoo(int n) {
		
		int cnt =0;
		if (n<100) return n;
		else {
			cnt = 99;
			if (n==1000) n=999;
			
			
			for(int i=100; i<=n; i++) {
			int o = n%10;
			int t = n/10%10;
			int h = n/100;
			
			if((o-t)==(t-h)) {
				cnt ++;
			}
			
		}
	}
		
		return cnt++;
	}

}
