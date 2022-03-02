package Day02;

public class Day02_02 { // c.s
	
	public static void main(String[] args) { // m.s
		
		// ; : 실행 구분 선 ; 실행 단위 구분
		// 동일한 변수 명은 사용할 수 없다. [ 이름이 중복되면 오류 (구분 불가) ]
		
		// p.40 byte : 1 byte 정수 ± 128
		byte var1 = -128;	System.out.println(var1);
		byte var2 = -30;	System.out.println(var2);
		byte var3 = 30;		System.out.println(var3);
		// byte var4 = 300;	System.out.println(var4);
			// 오류 발생 : 128 이상은 저장할 수 없다. 
		byte var4 = 'j';	System.out.println(var4);
			// 문자 --> 정수 [아스키코드 규칙]
		
		// p.43 char : 2 byte [ 1문자 ] : 유니코드(2바이트: 전 세계 모든 문자) vs 아스키코드
		char c1 = 'a'; 		System.out.println(c1);
		char c2 = 97;		System.out.println(c2); // 10진수 표현 : 0~9
			// 정수 --> 문자 변환
		char c3 = '\u0041';	System.out.println(c3); // 16진수 표현 :  \u0041 
		char c4 = '가';		System.out.println(c4);
		char c5 = 44032; 	System.out.println(c5);
		char c6 = '\uac00';	System.out.println(c6);
		// 진법 [ 왜? : 컴퓨터가 2진수만 사용하면 표현 단위 적다 --> 표현 단위 다양성
			// 2진수 : 0,1 / 기계어 (2진코드 ) / 용량 (1비트)
			// 8진수 : 0 ~ 7
			// 10 진수 : 0 ~ 9
			// 16 진수 : 0 ~ 9 a b c d e f 
		
		// p.44 short : 2 byte 정수 ± 3만정도
		short num1 = 30000; System.out.println(num1);
		// short num2 = 40000; System.out.println(num2); // 오류 발생
		
		// ★ p.45 int : 4 byte 정수 : ± 20억정도 ( 정수 기본타입 )
		int num2 = 10; 		System.out.println(num2); // 10진수
		int num3 = 012;		System.out.println(num3); // 8진수 0 붙이기
		int num4 = 0xA;		System.out.println(num4); // 16진수는 앞에 0x 붙이기
		
		// p.46 long : 8 byte 정수 ± 20억 이상 [ 데이터 뒤에 L ] 
		long num5 = 10000000000L;	System.out.println(num5);
					// int형-> long 형
		
		// p. 47 float[ 데이터 뒤에 f ] : 4 byte : 8자리  / double(실수 기본 타입) : 8 byte :17자리까지 표현
		double num6 = 3.14;	System.out.println(num6);
		float num7 = 3.14f;	System.out.println(num7);
		
		double num8 = 0.12345678901234526789123456789; System.out.println(num8);
		float num9 = 0.987654321987654321987654321f;		System.out.println(num9);
		
		// p.48 boolean : 1 bit [ true or false ]
			// 스위치 : on, off /  
		boolean bol = true;	System.out.println(bol);
		
		// p.49 : 타입 변환
			//             ----------------- 자동 형변환 방향 ---------------------->>>>>>>>>
			// * 크기 순서 :  byte -> short -> int(정수기본) -> long -> float -> double(실수기본)
			//			   <<<<<<<<<<------- 강제 형변환 방향 -------------------------------
			// 1. 자동 형 변환 
					// 작은 상자에서 큰 상자로 이동 가능
					// 큰 상자에서 작은 상자로 이동 불가
			byte 바이트 = 10;
			int 인트 = 바이트; // 자동 형 변환 o
			// short 쇼트 = 인트; // 자동 형 변환 x 오류 발생
			//System.out.println(인트);
			// 2. 강제 형 변환
					// 큰 상자에서 작은 상자로 이동 가능하지만 단!  ' 데이터 손실 '
			short 쇼트 = (short)인트; // int 형 변수를 short 로 변환하는데 데이터 잘림
			//System.out.println(쇼트);
			
		
		
	} // m.e

} // c.e
