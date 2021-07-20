package baekjoon_math2;

import java.io.*;
import java.util.*;
public class test_1929 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	    StringBuilder sb = new StringBuilder();
	    int m = Integer.parseInt(st.nextToken());
	    int n = Integer.parseInt(st.nextToken());
	    
	    boolean [] arr = new boolean [n+1];
	    arr[0] = true;
	    arr[1] = true;
	    
	    for(int i=2; i<=Math.sqrt(n); i++) {
	    	for(int j=i*i; j<=n; j+=i) {
	    		arr[j] = true;
	    	}
	    }
	    for(int i=m; i<=n; i++) {
	    	if(arr[i]==false) {
	    		sb.append(i).append('\n');
	    	}
	    }
	    System.out.print(sb);

	}

}
