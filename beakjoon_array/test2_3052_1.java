package beakjoon_array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test2_3052_1 {

	// 배열 만들기 
	// 단순하게처리 
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr [] = new int [10];
		for(int i=0; i<10; i++) {		
			arr[i] = (Integer.parseInt(br.readLine())%42);		
		}
		
		int rst = 0;
		for(int i=0; i<arr.length;i++) {
			int cnt=0;
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					cnt ++;
				}
			}
			if (cnt==0) rst++;
			
		}
		System.out.print(rst);

	}
}
