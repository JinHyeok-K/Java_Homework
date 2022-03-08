package Day06;

import java.util.Scanner;

public class Day06_01 {//cs
	
		// 클래스
			// 1. 클래스 : 설계도
			// 2. 객체(인스턴스) : 설계도 기반으로 메모리 할당 받은 변수
	
				// 예) 붕어빵 틀 = 클래스
					// 모양, 밀가루, 물, 팥, 슈크림 => 필드[속성=상태]
					// 굽기, 뒤집기, 판매, 반죽넣기 등 => 메소드[행동]
					// 붕어빵 틀로부터 여러개 붕어빵 생성
						// 서로 다른 붕어빵 생성 [붕어빵1, 붕어빵2 ~ ;] (팥붕어빵, 슈크림붕어빵, 등)
					// 예 ) 회원가입(feat. NAVER)
						// 아이디, 비밀번호, 이름, 생년월일, 성별, 이메일, 전화번호 => 필드
						// 회원가입, 아이디찾기, 비밀번호찾기, 회원탈퇴, 로그인 => 메소드[행동]
							// 서로 다른 회원 생성[회원1, 회원2] : 클래스는 동일하되(회원가입) 서로다른 객체(회원) 생성
	public static void main(String[] args) { //ms
		
		// p.195 예1)
		// Student <----- 설계도 없으면 선언 불가
		//   Student student = new Student();
			//Class    객체
			// 1. Student : 정의된 클래스(Class)명
			// 2. student : 객체명(변수명) [아무거나] : 추천! [클래스명 소문자]
			// 3. new 연산자 : 메모리(저장공간) 생성
			// 4. Student() : 생성자명( )
			// * 객체 생성 시 4가지 필요!!
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		System.out.println(s1);
		
		Student s2 = new Student();
		System.out.println(" s2 변수가 또 다른 Student 객체를 참조 합니다.");
		System.out.println(s2);
	}//me

}//ce
