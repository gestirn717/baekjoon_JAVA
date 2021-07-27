package array_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class test2_10818_2 {

	// for 문 대신 while 문 써서 배열의 각 인덱스 별로 값 넣기
	// hasMoreTokens() 사용하
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); 
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		int arr [] = new int [N];
		int idx = 0;
		while(st.hasMoreTokens()) {
			arr[idx] = Integer.parseInt(st.nextToken());
			idx++;
		}
		Arrays.sort(arr);
		System.out.print(arr[0]+" "+arr[N-1]);
	}
}
