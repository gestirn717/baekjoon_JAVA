package java_lifecording;

class Calculator3{
	//정적 필드 선언
	public static void sum(int left, int right) {
		System.out.println(left+right);
	}
	
	public static void avg(int left, int right) {
		System.out.println((left+right)/2);
	}
}






// 클래스에 바로 접근 가능
public class CalculatorDemo3 {

	public static void main(String[] args) {
		Calculator3.sum(10,20);
		Calculator3.avg(10,20);
		
		Calculator3.sum(20,40);
		Calculator3.avg(20,40);
	}

}
