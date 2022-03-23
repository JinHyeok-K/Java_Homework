
// 확대 & 축소  : ctrl + shift + (+) (-)

// 주석처리    // 1. // 슬래시 2 번 : 한 줄 주석
 		  // 2. /* 여러줄 주석 */
// tab key : 들여쓰기 

package Day01; // 패키지 명 [ 소스 파일들의 폴더] 


public class Day01_01 { // class start(cs) 
	
	// public : 접근 제한자 => 전 범위
		// class : 클래스 선언(클래스를 쓰것으요!)
	 	  	// Day01_01 : Class 이름
	// * 모든 곳에서 사용하는 Day01_1 이라는 이름을 갖는 클래스 선언
					// { : 시작      } : 끝
	
	// 1. class { } 안에서 코드 작석한다. [ class 밖에서 작성 불가 ]
		 // A . JAVA 는 100% 객체지향 [ 클래스 -> 객체 ] 
	// 2. 실행 코드 main함수
		 // A. main 입력 후 " ctrl + space bar " -> 자동 완성 목록 확인 및 선택
	
	public static void main(String[] args) { // main start
		// public : 접근 제한자
			// static : 정적
				// void : 반환타입 [돌려주는 값] 없다
					// main 함수 : 메인 스레드를 가지고 있는 함수 [ 필! 수! ]
					// 스레드 : 코드를 읽어주는 흐름
		
		// * main 함수 안에 작성된 코드는 실행 된다.
		// 'syso' -> "ctrl+ space bar"  : '출력' "자동 완성"
		System.out.println("java 출력"); // 고급 언어 [ 사람이 이해하는 언어 ]
		 // 컴파일 [ ctrl+F11 ; 이클립스 기준 ]
		 		
	} // main end
	
	
	
	
} // class end(ce)
