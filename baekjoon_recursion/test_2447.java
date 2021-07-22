package baekjoon_recursion;


import java.io.*;
public class test_2447 {
	 static char[][] arr;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		arr = new char[N][N];
		
		star(0,0,N,false);
		
		for (int i=0; i<N; i++) {
			bw.write(arr[i]);
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();	
	}
	
	static void star(int x, int y,int N, boolean blank) {
		
		// 공백칸일 경우
		if (blank) {
			for (int i = x; i < x + N; i++) {
				for(int j = y; j < y + N; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		
		//더이상 쪼갤 수 없는  블록일 떄
		if (N == 1) {
			arr[x][y] = '*';
			return;
		}
		
		/*
		  N = 27 일 경우 한 블록의 사이즈는 9이고,
		  N = 9 일 경우 한 블록의 사이즈는 3 이듯 
		  해당 블록의 한 칸을 잠을 변수를 의미 size
		  
		  count 는 별 출력 누적을 의미   
		 */
		
		
		
		//먼저 실행되는 부분  
		int size = N/3;
		int count = 0;
		for (int i =x; i < x + N; i+=size) {
			for (int j = y; j < y + N; j += size) {
				count ++;
				if (count == 5) {
					star(i,j,size,true);
				}else {
					star(i,j,size,false);
				}			
			}
		}		

	}

}
