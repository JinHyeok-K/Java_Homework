package Day08_03; // A 클래스와 동일 패키지

public class B {
	// A와 패키지는 같지만 클래스가 다름
		// public, default 가능
		// private 접근 불가능
	
		// 1. 필드
		A a1 = new A(true); 	 //  현 클래스에서 public 호출 가능
		 
		A a2 = new A(1);		 // 현 클래스에서 default 호출 가능
//		A a3 = new A("문자열");	 // 현 클래스에서 private 호출 불가능 
	
		// 2. 생성자
		public B() {
			
			A a = new A(true);
			a.field1=1;
			a.field2=1;
			// a.field3; 사용 불가능
			
			a.method1();
			a.method2();
			//a.method3(); //불가능
		}
		// 3. 메소드
	
	// 전 범위 클래스 선언 A
			// 1. 필드
			
			
		
	
}
