package beakjoon_array;

import java.io.*;

public class test_2562 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr [] = new int [9];
		int max = 0;
		int index = 0;
			
		for(int i=0;i<9;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i]>max) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println(max);
		System.out.println(index+1);
	}

}