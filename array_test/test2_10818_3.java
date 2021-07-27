package array_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class test2_10818_3 {

	// 배열 사용하지 않고 풀어보기 
	// StringTokenizer로 받자마자 값 비교해서 최소,최대 갱신해주기    
	// 반복문 for문으로도 구현 가능 
	// 최소 , 최대 찾기 가장 빠름 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력만 받을거니까 변수 안만들어둠 
		Integer.parseInt(br.readLine()); 
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int max = -1000001;
		int min = 1000001;
		
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			if(num>max) {
				max =num;
			}
			
			if(num<min) {
				min =num;
			}
		}
		System.out.print(min+" "+max);
	}
}
