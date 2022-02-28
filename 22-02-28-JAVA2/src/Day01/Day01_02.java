


package Day01;

public class Day01_02 { // c.s
	
	// 1. 출력
		// A. print() : 출력 만
		// B. printf() : 출력에 꾸미기 
			// 형식 
				// %s : 문자열 대체
				// %d : 정수(n) 들어가는 자리
				// %f : 실수 들어가는 자리
			//  제어 문자 [ \ : 엔터위에 원화 기호 ]
				// \n : 줄바꿈 --> line
				// \t : 들여쓰기 [ 5칸 ] --> tap
	// C. println() : 출력 후 한칸 내림(줄 바뀜)
	
	// 1. System : System Class [ 입 출력 관련된 만들어진 코드 제공 ]
	// 2. out : 출력 스트림
	// 3. print() : 출력 함수
	// 4. ; : 한줄 code 끝 알림
	// * 시스템 클래스 내 out 이라는 출력 스트림을 통해  print 함수를 사용해서
	// console 에 원하는 대로 출력 할 수 있다.
	
	
	public static void main(String[] args) { // m.s
		
		// 1. 기본 출력
		System.out.print("오호3ㅏ바리");   // ; : code 단위 종료
		System.out.print("Java 1일차");  // 문자 처리 "  "  처리
		System.out.print(123);			// 숫자 " " 처리 X
			// * 미리 만들어진 단어 [ 예약어 ] 를 제외한 모든 문자는 " " 처리
			
		// 2. 자동 완성 ( syso + ctrl + space bar)
		System.out.println("자바는 객체지향이다.");
		System.out.println("으헣헣");
		System.out.println(123);
	
		// 3. 형식 출력
		System.out.printf("%s" , "하고싶은말");
		System.out.printf("java %d일차",1);
		System.out.printf("%d",59103);
		
		
		System.out.println("\t\t[[출석부]]");
		// 예제 1  [ 출석부 ]
		
		System.out.println("\n\t\t[[출석부]]");
		System.out.println("-------------------------------------------");
		System.out.println("이름\t1교시\t2교시\t3교시\t비고");
		System.out.println("강호동\t 출석\t 결석\t 출석");
		System.out.println("유재석\t 출석\t 출석\t 결석");
		System.out.println("-------------------------------------------");
		
		
		// 예제 2 [ 예제 1 --> printf 로 ]
		
		
		System.out.printf("\n\t\t%s","[[출석부]]\n");
		System.out.printf("-------------------------------------------\n");
		System.out.printf("%s\t%s\t%s\t%s\t%s\n","이름","1교시","2교시","3교시","비고");
		System.out.printf("%s\t%s\t%s\t%s\t\n","강호동"," 결석"," 출석"," 출석");
		System.out.printf("%s\t%s\t%s\t%s\t\n","유재석"," 결석"," 출석"," 출석");
		
		// 문제1 : 고양이
		
				/*		\    /\
						 )  ( ')
						(  /  )
						 \(__)|
				*/ 
		System.out.println("\n[[코!냥!이!]]");
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
		
		//  '/' 표시 하기위해선  " // " --> / 출력(두번 입력) 
		
		
		// 문제2 : 강아지 
				/*
						|\_/|
						|q p|   /}
						( 0 )"""\
						|"^"`    |
						||_/=\\__|
				*/	
		System.out.println("\n 개시키");
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"'    |");
		System.out.println("||_/=\\\\__|");
		
		// " <ㅡ 출력 시  \" 해야 " 출력  
		
	} // m.e
	

	

} // c.e
