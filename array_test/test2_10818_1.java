package array_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class test2_10818_1 {
      
	// 배열 만들고 for 문 돌려서 인덱스에 값 넣기 
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); 
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int arr [] = new int [N];
		for (int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		System.out.print(arr[0]+" "+arr[N-1]);
	   
	}
}
