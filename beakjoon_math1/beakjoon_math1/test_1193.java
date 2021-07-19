package beakjoon_math1;

import java.io.*;
public class test_1193 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int num = 0; //누적 분수 개수
		int a = 0; //그룹의 순번, 그룹 분수의 갯수
		int bj = 0;
		int bm = 0;
		
		
		while(num < n) {
				a += 1;
				num += a;
		}
		if (a % 2 != 0) {
			bj = 1+num-n;
			bm = a+n-num;
		}
		else if (a % 2 ==0) {
			bj = a+n-num;
			bm = 1+num-n;
		}
		System.out.printf("%d/%d",bj,bm);

	}

}
