package Day03;

import java.util.Iterator;

public class Day03_05_반복문 { // c s
	
	public static void main(String[] args) { // m s
		
		// 반복문 : 1. for | 2. while | 3. do~while [x]
		// for 문 :
			// 어디서부터 어디까지 몇 개씩 증가/감소 하면서 반복처리
				// 1부터 10까지 1씩 증가하면서 반복 처리 => 10번 실행 : 1,2,3,4,5,6,7,8,9,10
				// 1부터 10까지 3씩 증가하면서 반복 처리 => 4번 실행 : 1,4,7,10
			// 1. 초기값 | 2. 조건식 | 3. 증감식
			// 형태
			//		for ( 초기값 ; 조건식 ; 증감식 ) {
			//				반복실행문;
			//			}
			// for 문 중첩:
				// for1() { for2() {for3(){}}}
		
		
		// p.121 예제1
		    for(int i = 1 ; i<=10 ; i++ ) {
			// int i =1    : 초기값 설언 [ i는 반복변수 ]
				// i<=10   : 조건식 [ i가 10 이하이면 실행 아니면 실행 불가
					// i++ : 증감식 [ 실행문 실행 후 증가 혹은 감소 단위 ]
			// * 변수 i는 1부터 10까지 1씩 증가하면서 실행문 반복 처리		
		} //System.out.println(i+"임");
			
		// p.122 예제2 : 1부터 100까지 누적 합 출력
			int sum = 0;
			for (int i = 1 ; i<=100 ; i++) { // 반복문 실행
				// * i는 1부터 100까지 1씩 증가하면서 실행문 반복 처리
				sum = sum+i; // or sum +=i;
			} // 반복문 종료
			System.out.println("1~100 누적 합 결과 : "+sum);
			
		// 예제3 : 1~100 7배수의 누적합계
			// case 1 : for 문 단독 사용
			int sum2 = 0;
			for (int i = 0 ; i<=100; i+=7){
				sum2+=i;
			}
			System.out.println("1~100까지 7배수 누적합 결과 : "+sum2);
//			======================================================
			// case 2 : for + if 문 혼합 사용
			int sum3=0;
			for ( int i =1 ; i<=100; i++) {
				
				if(i%7 ==0 ) sum3+=i;
				
			}
			System.out.println("1~100까지 7배수 누적합 결과 : "+sum3);
			
		// 예제 4 : 2단 구구단 만들기 [ 2단 = 상수 | 변수 = 곱 ]
			
			for (int 곱 =1 ; 곱<=9; 곱++) {
				
//				System.out.println(" 2 X "+곱+" = "+(2*곱));
				System.out.printf("2X%d=%d\n",곱,(2*곱));
			}

		// for 문의 중첩 
			
		// 2~9단 구구단 만들기 [ 단 = 변수 , 곱 = 변수 ]
				// 단 : 2~9 까지 1씩 증가
				// 곱 : 1부터 9까지 1씩 증가
					// 단 1번 실행 시 곱 9번 실행
				// 구구단 총 실행 횟수 => 72 번 실행
			for ( int 단 = 2; 단<=9 ; 단++) {
				System.out.printf("-----%d단----- \n", 단);
				// for 문 중첩
				for (int 곱 = 1 ; 곱<=9 ; 곱++) {
					System.out.printf(" %d X %d = %d \n", 단,곱,(단*곱));
				}
				
				
			}
				
			
			
		
	} // m e

} // c e
