package baekjoon_for;

import java.io.*;
import java.util.*;
public class test_10871 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		int a[]= new int[n];
		
		StringTokenizer sr = new StringTokenizer(br.readLine());
		for(int i=0; i<n;i++) {
			a[i] = Integer.parseInt(sr.nextToken());
			
			if(a[i]<x) {
				bw.write(a[i]+" ");
			}
		}
		
		bw.flush();
		
		
	}

}