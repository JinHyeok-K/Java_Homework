package Day15;

public class Day15_01 {
	//클래스 : 객체 설계도
		// 객체 : 클래스 기반으로 메모리 할당
			// 기본자료형 / 클래스 변수명;   [String 이름;] =>변수
			// 기본자료형 / 클래스 변수명 = new 클래스 생성자(); [String
	// 상속 : 설계도 연장 [extends] (모범 설계도를 이어서
		// *선언 방식 : public class 자식클래스 extends 부모클래스{ }
		// 부모클래스(슈퍼클래스) : 부모클래스 내 멤버(필드,생성자,메소드) 를 자식
		// 자식클래스(서브클래스) : 부모클래스 내 멤버를 사용가능
			// super vs this
		// 자식 클래스로 객체 생성 시 : 부모 클래스 내 생성자 호출
		// Object 클래스 : 모든 클래스는 Object 생성자 호출 [ 100% 객체지향 ]
	
		// ** 다형성
			// 하나의 객체가 여러가지 타입으로 변환 가능
			// 조건1 : 자식객체가 -> 부모객체
	public static void main(String[] args) {
		
		// 1.  부모 클래스로 객체 생성
		사람 p1 = new 사람("오우"); //
			// 부모는 자식에게 접근 X
			
			p1.이름 = "오우";
			p1.이름호출();
		// 2. 자식클래스로 객체 생성
		학생 p2 = new 학생("오우");
			// 자식은 부모에게 접근이 가능
//			
			p2.이름= "헤업";
			p2.이름호출();
			
			// 부모클래스 내 부모클래스 접근
			p2.집업="학생";
			
		// *다형성객체*
			직업 j1 = new 학생("오우");
		// 부모클래스 객체 = 자식 객체
//			학생 j3 = new 직업(); // 불 가    
		// 자식클래스 객체 = 부모클래스
	}
}
