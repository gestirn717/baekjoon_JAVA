package baekjoon_math2;

import java.io.*;
import java.util.*;
public class test_1085 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		// -방향도 고려 해야함  
		int x_min = Math.min(x, w-x);
		int y_min = Math.min(y, h-y);
		
		System.out.print(Math.min(x_min,y_min));

	}

}
