package baekjoon_math2;

import java.io.*;
public class test_3053 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	    double r = Double.parseDouble(br.readLine());
	    System.out.println(Math.PI*r*r);
	    System.out.println(2*r*r);
	    	
	}
}

/*   택시기하학 = 맨해튼 거리 
 *     2차원 평면에서  대각선거리(유클리드 기하학)가 아니라
 *     두점의 x좌표차 + 두 점의 y좌표 차 
 * 
 *   유클리드 기하학 
 *     거리 제곱 =x좌표차 제곱 +y좌표 차  
 *     -> 대각선 구하기  
 * 
 *   유클리드 기하학에서 원의 넓이는 파이 * r제곱 
 *   
 *   택시기하학에서 원은 중심 점에서 반지름 이라고 불리는 일정한 거리만큼 떨어져 있는 점들의 집합 
 *   D(T1,T2) = |x1 - x2| + |y1 - y2| 
 *   단순화 시키면 거리 D = |x| + |y| 
 *   
 *   택시 기하학에서의 원은 45도 기울어진 원 
 *   따라서 원의 넓이는 2*r제곱 
 *   
 *   정리하자면
 *   유클리드 기하학에서 원의 넓이  = 파이 * 반지름 제곱
 *   택시 기하학에서 원의 넓이 = 2 * 반지름 제곱  
 *  
 */