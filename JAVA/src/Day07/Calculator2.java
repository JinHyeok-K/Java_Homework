package Day07;

public class Calculator2 {
	// 1. 필드
	// 2. 생성자
	// 3. 메소드
		// 1. 실행 메소드
	void execute() { //인수x반환x
		double result = avg(7,10);
		println("실행결과 : " + result);
		
	}
		// 2. 평균 메소드
	double	avg(int x, int y) {// 인수 o 반환 o
		double sum = plus(x,y);
		double result = sum / 2;
		return result;
	}
		// 3. 더하기 메소드
	int plus(int x, int y)	{// 인수 o 반환 o
		int result = x+y; 
		return result;
	}
		// 4. 결과 출력 메소드
	void println(String message) {// 인수 o 반환 x
		System.out.println(message);
		
	}
}
