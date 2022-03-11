package Day08;

public class Day08_01 { // class start
	
	public static void main(String[] args) { // main start
		
		//p. 238 : static 
			// 정적변수
			// 공용적인 
		
		// * 클래스 내 필드, 메소드(멤버) 접근 방법
			// (static 멤버가 아닐 때) 1. 객체 생성 -> 객체.멤버
				// 객체가 생성될 때 new 연산자로 객체(내 멤버 포함) 메모리 할당
//		Calculator calculator = new Calculator();
//		System.out.println("객체를 이용한 멤버 접근 : "+calculator.pi);
			// (static 멤버 일 때) 1. 클래스 명.멤버
				// 클래스가 로딩 되고 메소드영역에 static 변수들 바로 저장
		System.out.println("객체 없이 멤버 접근 : " + Calculator.pi);
		
		double result = 10 * 10 * Calculator.pi;
								// 클래스명.정적변수명
		int result2 = Calculator.plus(10, 5);
//		Calculator calculator = new Calculator();
		int reuslt3 = Calculator.minus(10, 5);
		int result4 = Calculator.plus(1, 1);
		int reuslt5 = Calculator.minus(5, 2);
		
		
		System.out.println("result1 : "+result);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+reuslt3);
		
		
		
	}// main end
}// class  end
