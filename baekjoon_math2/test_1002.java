package baekjoon_math2;

import java.io.*;
import java.util.*;

public class test_1002 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		while(n-- > 0) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			sb.append(point(x1,y1,r1,x2,y2,r2)).append('\n');
		}
		System.out.println(sb);

	}
	
	public static int point(int x1, int y1, int r1, int x2, int y2, int r2) {
		
		int distance = (int)(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		
		// 중점이 같으면서 반지름도 같을 경우 (무한대) 
	    if(x1==x2 && y1==y2 && r1==r2) {
	    	return -1;
	    }
	    
	    // 두 원의 반지름 합보다 중점간 거리(대각선) 가 더 클때 (접접없음)
	    else if (distance > Math.pow(r1 +r2,2)) {
	    	return 0;
	    }
	    
	    // 원 안에 원이 있으나 내접하지 않음, 반지름의 차가 두 점사이의 거리보다 크면 됨 
	    else if (distance < Math.pow(r2-r1,2)) {
	    	return 0;
	    }
	    
	    //내접
	    else if (distance == Math.pow(r2-r1,2)) {
	    	return 1;
	    }
	    
	    //외접
	    else if (distance == Math.pow(r2 + r1,2)) {
	    	return 1;
	    }
	    
	    else {
	    	return 2;
	    }
	    
		
	}

}
/*   각각 원을 그려서 생각하면 쉬움 
 * 
 *   접점 개수 무
 *   중심이 같고 거리도 같으면 접점의 개수가 무한  
 *   
 *   접점 없음 
 *   두점 사이의 거리가 각 원의 반지름의합보다 클 때 접점 없음
 *   한 원안에 다른 원이 있으면서 접점이 없을때 
 *     -> 반지름의 차가 두 원간의 중점거라보다 크면 된다  
 *   
 *   접점이 한개
 *   내접, 외접 
 *   
 *   나머지는 접점 두개 
 *   
 *   
 *   주의 할 점 
 *   double을 사용할 경우 0.1 + 0.2 == 0.3 은 참이 아니다 
 *   
 *   제곱은 Math.pow(n,제곱) 
 */