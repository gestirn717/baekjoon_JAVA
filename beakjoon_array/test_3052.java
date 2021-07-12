package beakjoon_array;

import java.io.*;
public class test_3052 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr [] = new int [10];
		int count = 0;
		int same = 0;
		
		for(int i=0; i< arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine())%42;
		}
		
		for (int i=0; i<arr.length; i++) {
			same = 0;
			for(int j=i+1; j<arr.length; j++) {
			  if(arr[i] == arr[j]) {
				  same ++;
			  }
			}
			if(same==0) {
				count ++;
			}
		}
		
		System.out.print(count);
	}

}
