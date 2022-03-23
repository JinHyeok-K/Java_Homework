package Day12;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Day12_01 {
	
	public static void main(String[] args) throws IOException {
		
		// p. 496 String 클래스
			// String 문자열 클래스
				// 1. java.lang 패키지 [import X] 소속
				// 2. 객체인데 자동 리터럴 [객체가 자동 생성]
		String 성명1 = new String("유씨"); 	System.out.println(성명1);
		String 성명2 = "유씨"; 				System.out.println(성명2); // 자동 객체 생성 
				// 3. 13개의 생성자 [ 문자열 , 바이트열 등 ] = > 버전에 따라 다름
				// 4. 외부[파일,네트워크 등] 로 받은 데이터는 보통 바이트열
		
		// 바이트 -> 문자 변환 가능 이유 
			// 1. 바이트 => +- 127 표현 가능
			// 2. 아스키코드 => 0 or 1 조합된 7자리 => 0101011 => 2의 7승 => 128문자 표현가능
			// 바이트 -> 아스키코드 변환[ 영문 /특수문자 1바이트 | 한글 2바이트 ]
		//p. 497 예1
		// 1.여러개 바이트를 저장할 수 있는 바이트 배열 선언
		byte[] bytes= {72,101,108,108,111,32,74,97,118,97}; 
					// H	e	l	l	o 공백 j	a	v	a
		// 2. 바이트 배열 => 문자열 변환 [ new String(배열명); ]
		String str1 = new String(bytes);
		// 3. 확인
		System.out.println("바이트 배열 => 문자열 변환 :"+str1);
		// 4. 특정 위치부터 변환 [ new String( 배열명, 시작인덱스, 갯수) ]
		String str2 = new String(bytes,6,4);
		// 5. 확인
		System.out.println("바이트 배열 내 6번 인덱스에서부터 4개 변환 : "+str2);
		
		//p. 498 예2)
			// System.out : 시스템 클래스 내 출력필드
			// System.in : 시스템 클래스 내 입력 필드
		byte[] bytes2 = new byte[100];
		System.out.println("입력 : "); // 출력 필드내 print 메소드 호출
		// 메소드를 호출하는 방법
			//1. 객체를 생성 후에  . 연산자를 이요한 메소드 호출
			// 2 static 필드 /메소드
		int readByteNo = System.in.read(bytes2);
		  // 외부통신 : 자바프로그램 외 [키보드 ,파일 ,네트워크 등 ] 입출력 일반 예외
		// 키보드 입력 --- 스트림 [통신:바이트] ---> 컴퓨터
		// a->97 // a 엔터 ->97, 13[\n:줄바꿈],10[\r:커서를 앞으로] 
		System.out.println("입력받은 바이트 : " + Arrays.toString(bytes2));
									
		String str = new String(bytes2,0,readByteNo-2);
										//읽은 바이트 수 -2 ( -2 => 97,13 )
		System.out.println("입력받은 바이트 -> 문자열 변환 : "+ str);
		
			//Scanner 클래스 [System.in 으로부터 입력받은 바이트를 객체에 저장]
		Scanner scanner = new Scanner(System.in);
			//
		scanner.next(); // 바이트 -> 문자열 변환
		scanner.nextInt(); // 바이트 -> 정수열 변환
		scanner.nextDouble(); // 바이트 -> 실수열 변환
	}
}
