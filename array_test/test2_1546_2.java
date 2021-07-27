package array_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class test2_1546_2 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int max = 0;
		double sum = 0.0;
		
		for (int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num > max) {
				max = num;
			}
			sum += num;
		}
		System.out.print(((sum/max)*100.0)/N);

	}

}
