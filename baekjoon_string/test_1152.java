package baekjoon_string;

import java.io.*;
import java.util.*;

public class test_1152 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// countTokens() 은 토큰의 개수를 파악
		
		System.out.print(st.countTokens());
	}

}
