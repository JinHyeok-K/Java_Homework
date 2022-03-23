package Day02;

import java.util.Scanner;

public class Day02_03_문제1_급여계산 { // c.s
	
	public static void main(String[] args) { // m.s
		
		// 문제1 : 급여 계산
				/*
				 * 	[입력조건]
				 * 		기본급 , 수당
				 * 	[ 조건 ] 
				 * 		실수령액 = 기본급 + 수당 - 세금[기본급10%] 
				 * 	[출력조건] 
				 * 		실수령액 출력 
				 */
				
		
		// 1. 입력 객체 만든다. [자료형 소문자 , 클래스명 대문자]
		
		Scanner scanner = new Scanner(System.in);
		// 2. 입력 받은 값을 변수에 저장. [ 입력 객체는 입력 받을 때마다 기존 데이터가 사라짐 ]
		
		System.out.printf("기본급 : ");	int 기본급 = scanner.nextInt();
		System.out.printf("수당 : ");		int 수당	 = scanner.nextInt();
				
		scanner.close();
		
		
		
		
		// 3. 변수를 연산(계산)한다.
		
		int 세금 = (int)(기본급*0.1); // int*double 후에 int 형으로 (강제)변환 
		int 실수령액 = 기본급 + 수당 - 세금; // 100%: 1 , 10% 0.1
		// 4. 출력
		
		System.out.println("호갱님의 실 수령액 : " + 실수령액);
					// 문자열 + 변수명 ( 변수 내 데이터 호출)
					// + : 1. 연결 연산자 기능 2. 더하기 기능
		
		// 문제2 : 지폐 세기 
				/*
				 * [ 입력조건 ] 
				 * 		금액 
				 * [ 조건 ] 
				 * 		십만원 부터 백원 까지의 개수 세기 
				 * [ 출력조건 ]
				 * 		예) 356789 입력시 
				 * 		십만원 3장 
				 * 		만원 5장
				 * 		천원 6장 
				 * 		백원 7개
				 * 
				 */
		
		
		
		
	} // m.e

} // c.e
