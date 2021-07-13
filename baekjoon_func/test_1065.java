package baekjoon_func;

import java.util.*;
public class test_1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(hansoo(sc.nextInt()));
		sc.close();
	}
     
	public static int hansoo(int num) {
		int cnt = 0;
		
		if (num < 100) {
			return num;
		}
		
		else {
			cnt =99;
    		if (num == 1000) { 
				num = 999;
			}
    		
    		for (int i=100; i <=num; i++) {
    			int h = i /100;
    			int t = (i/10) % 10;
    			int o = i % 10;
    			
    		    if ((h - t) == (t - o)) {
    		    	cnt++;
    		    }
  		
    		}
		}
		return cnt;
	}	
}
