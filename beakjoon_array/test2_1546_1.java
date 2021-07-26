package beakjoon_array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class test2_1546_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st =new StringTokenizer(br.readLine());
		
		int arr [] = new int [N];
		int max = 0;
		double sum = 0.0;
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		
		for(int i=0; i<N; i++) {
			sum += ((double)arr[i] /(double)max)*100;
		}
		System.out.print(sum/N);
		
	}
}
