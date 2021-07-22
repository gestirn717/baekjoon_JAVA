package baekjoon_recursion;

import java.io.*;
public class test_11729 {
    public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		
       BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());
       
       sb.append((int)(Math.pow(2,N)-1)).append('\n');
       Hanoi(N,1,2,3);
       System.out.println(sb);
	}
	
	
	/*
        N : 원판의 개수 
        from : 출발지
        mid : 옮기기 위해 이동해야할 장소 
        to : 목적지  
    */
	
	
	
	public static void Hanoi(int N, int from, int mid, int to) {
		
		if (N==1) {
			sb.append(from + " " + to + '\n');
			return;
		}
		
		// N-1개를 A에서 B로 이동 
		Hanoi(N-1,from,to,mid);
		
		// 1개를 A에서 C로 이동
		sb.append(from + " " + to + '\n');
		
		// N-1개를 B에서 C로 이동 
		Hanoi(N-1,mid,from,to);
		
	}

}
