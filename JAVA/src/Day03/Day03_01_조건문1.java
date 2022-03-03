package Day03;

public class Day03_01_조건문1 { //c.s
	
	
	
	public static void main(String[] args) {//m.s
	
		// 1일차 : 출력 , 입력
		// 2일차 : 저장(변수) , 계산(연산)
				
		// 제어문
			// 컴퓨터의 판단력 => 경우의 수
			// 조건식이 true 이면 실행문 처리
			// 형태
				// 1. if ( 조건식[ture/false] ) 실행문;
				// 2. if ( 조건식 ) 실행문;
				//    else 실행문[거짓];
				// 3. 실행문이 2줄 이상( ; 2개 이상이면 ) {   } 묶음 처리
				// 4. 경우의 수가 다수 일 때 [ 조건이 다수 일 때] 
				//	  if ( 조건1 ) { 실행문 [참1]; }
				// 	  else if( 조건2 ) { 실행문 [참2]; }
				// 	  else if( 조건3 ) { 실행문 [참3]; }		
				// 	  else if( 조건4 ) { 실행문 [참4]; }
				// 	  else if( 조건5 ) { 실행문 [참5]; }
				//	  else { 실행문[거짓]; }
				// 5. if 중첩
				//    if( 조건식 ) {
				//			if( 조건식 ){ 실행문; }
				//			else { 실행문; }
				//	  } else {	
				//			if (whrjstlr ) {실행문 ;}
				//			else { 실행문; }
				//    }
				//			
		
		// 예제1
		if(3>1) System.out.println("예1) 3이 1보다 크다.");
			// 만약에 3이 1보다 크면 출력O 아니면 출력 X
			// true 이면 실행 
		// 예제2
		if(3>5) System.out.println("예2) 3이 5보다 크다.");
			// 만약에 3이 5보다 크면 출력O 아니면 출력 X 
		// 예제3
		if(3>1) System.out.println("예3-1) 3이 1보다 크다.");
		else System.out.println("예3-2) 3이 1보다 작다.");
			// 만약에 (3이 1보다 크면) 예3-1 출력
			// 아니면 (3이 1보다 작으면) 예 3-2 출력
		// 예제4
		if(3>2) { // true 실행 문 시작 [ 실행문 (;) 2개 이상 일 때 ]
			System.out.println("true"); 
			System.out.println("3이 2보다 크다");
		}// true 실행문 끝
		else { // false 실행문 시작
			System.out.println("false");
			System.out.println("3이 2보다 작다.");
		} // false 실행문 끝
				
		
		// 예제5
		if(3>5)	System.out.println("예5) 3이 5보다 크다");  		//  실행 X
		else if( 3>4) System.out.println("예5) 3이 4보다 크다.");	//  실행 X
		else if( 3>3) System.out.println("예5) 3이 3보다 크다.");	//  실행 X
		else if( 3>2) System.out.println("예5) 3이 2보다 크다.");	//  실행 O
		else System.out.println(" true 없다. ");	//  실행 X
		
		
	}//m.e

}//c.e
