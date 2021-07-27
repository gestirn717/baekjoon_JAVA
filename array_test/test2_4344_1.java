package array_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class test2_4344_1 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int run = Integer.parseInt(br.readLine());
		
		int arr [];
		
		StringTokenizer st;
		
		for(int r =0; r<run; r++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken()); 
			arr = new int[N];
			
			double total = 0; // 총합계 모아서 나눗셈 하려면 double 형으로 받는게 좋음 
			
		    for(int i=0; i<N; i++) {
		    	int num = Integer.parseInt(st.nextToken());
		    	arr[i] = num;
		    	total += num;
		    }
		    
		    double avg = (total/N);
		    double cnt =0;
		    
		    for(int j=0; j<N; j++) {
		    	if(arr[j]>avg) cnt ++;
		    	
		    }	
		    System.out.printf("%.3f%%\n",(cnt/N)*100);
		}
	}
}
