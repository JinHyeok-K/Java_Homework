package Day04;

import java.util.Scanner;

public class Day04_01_반복문_for_while { // c s
	
	public static void main(String[] args) { // m s
		
		// 제어문 : if, switch
		// 반복문 : for, while
			// for 문 :1. 초기값 2. 조건식 3.증감식 4. 실행문
			// while 형태
			//		1. 초기값;
			//		while(2. 조건식) {
			//
			//			  4. 실행문;
			//			  3. 증감식;
			//		}
		// for 예1)
		
		for (int i =1 ; i<=10 ; i++) { // for start
			// * i 는 1부터 10이하까지 1씩 증가하면서 실행문 반복처리 => 10번 실행
			System.out.print(i+" ");
		} // for end
		
		System.out.println();
		
		// while 예1)
		
		int i = 1; // 1. 초기값
		while(i<=10) { // 2. 조건식
			
			System.out.print(i+" "); // 4. 실행문
			i++; // 3. 증감식
			
		}//while end
		
		System.out.println();
		
		// for 예2) 1~100 누적합계
		int sum=0;
		for(int j=1;j<=100;j++) {
			sum+=j; // sum = sum+j
		}System.out.println("for문 사용 1~100까지의 누적 합계 : " + sum);
		
			
		// while 예2) 1~100 누적합계
		
		int j= 1; // 1. 초기값
		int sum2 =0;
		while (j<=100) { // 2. 조건식 [true이면 실행 O 아니면 실행 X]
			sum2 +=j; // 4.실행문 
			j++; // 3. 증감식
			
		}// while end : j 가 101 일 때 종료
		
		System.out.println("while문 사용 1~100까지의 누적 합계 : " + sum2);
		
		// while 예3) 무한루프 : 24시간 돌릴려고 할 때
		while(true) { // 조건식이 true 실행 // true 는 상수 => 무한 루프
			System.out.println("무한루프");
			Scanner scanner = new Scanner(System.in);
			int exit = scanner.nextInt();
			if (exit ==3) {
				break; // break 기준 가장 가까운 반복문 stop [ if 제외 ] 
			}
		}
	} // m e

} // c e
