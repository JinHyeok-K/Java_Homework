package Day03;

import java.util.Scanner;

public class Day03_06_별찍기 { // c s
	
	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in); // 입력객체
		
		
		// 별 문제 1 입력 받은 수 만큼 * 출력
		
		System.out.println(" 문제1) 별 개수 : "); int s1 = scanner.nextInt();
		
		for ( int i =1 ; i<=s1 ; i++) {
			// * i는 1부터 입력받은 수 까지 i는 1씩 증가
			System.out.print("*");
		}
		System.out.println("\n-------------------------");
		
		// 별 문제 2 입력 받은 수 만큼 * 출력 [ 단 5개 마다 줄바꿈 처리 ]	
		System.out.println(" 문제2) 별 개수 : "); int s2 = scanner.nextInt();
		for ( int i =1 ; i<=s2 ; i++) {
			// * i는 1부터 입력받은 수 까지 i는 1씩 증가
			System.out.print("*");
			// 5깨마다 줄바꿈 -> 5배수 마다 -> 배수 찾기
			if (i%5 == 0 ) System.out.println( ); // 줄바꿈 처리
					
		}
		System.out.println("\n-------------------------");
		
		
		
		// 별문제3 : 입력받은 줄 만큼 출력	
		
		System.out.println(" 문제3) 줄수 : "); int line3 = scanner.nextInt();
		
		for (int i=1; i<=line3; i++) {
			// * i는 1부터 입력 받은 줄 수까지 1씩 증가
			for (int s=1; s<=i; s++) {
			// 1 . 별 찍기
			System.out.print("*");
			}
			// 2. 줄바꿈 처리
			System.out.println();
		}
			// 순서도 
				// 사용자가 3을 입력 했을 때
				// i = 1 i<=3 [true]  -> i++
					// s =1   s<=1 [ true ] -> * -> s++
					// s =2   s<=1 [ false ] -> for2 반복문 종료
				// 줄바꿈
				// i = 2 i<=3 [true] -> i++
					// s =1  s<=2 [true] -> * -> s++
					// s =2  s<=2 [true] -> * -> s++
					// s =3  s<=2 [false] -> for2 반복문 종료
				// 줄바꿈
				// i = 3 i<=3 [true] -> i++
					// s =1  s<=3 [true] -> * -> s++
					// s =2  s<=3 [true] -> * -> s++
					// s =3  s<=3 [true] -> * -> s++
					// s =4  s<=3 [false] -> for2 반복문 종료
				// 줄바꿈
				// i = 4  i<=3 [false ] for1 반복문 종료
		System.out.println("\n-------------------------");
		
		
		
		// 별문제4 : 입력받은 줄 만큼 출력	
		
		System.out.println(" 문제4) 줄수 : "); int line4 = scanner.nextInt();
		
		for (int i=1; i<=line4; i++) {
			// * i는 1부터 입력 받은 줄 수까지 1씩 증가
			for (int s=1; s<=line4-i+1; s++) {
			// 1 . 별 찍기
			System.out.print("*");
			}
			// 2. 줄바꿈 처리
			System.out.println();
		}
		
		System.out.println("\n-------------------------");
		
		
		
		// 별문제5 : 입력받은 줄 만큼 출력	
		
		System.out.println(" 문제5) 줄수 : "); int line5 = scanner.nextInt();
		
		for (int i =1; i<=line5; i++ ) {
			
			// 1. 공백찍기
			for(int b = 1; b<=line5-i; b++) {
				System.out.print(" "); // 공백 => 스페이스 바
			}
			// 2. 별찍고
			for (int s = 1 ; s<=i ; s++) {
				System.out.print("*");
						}
			// 3. 줄바꿈			 
		 System.out.println();	
		}
	
		// 별문제6 : 입력받은 줄 만큼 출력	
		
		System.out.println(" 문제6) 줄수 : "); int line6 = scanner.nextInt();
		
		for (int i=1; i<=line6; i++) {
			// 1. 공백 쓰기
			for (int b=1; b<=i-1; b++) {
				System.out.print(" ");
			}
			// 2. 별 쓰기
			for (int s = 1; s<=line6-i+1; s++) {
			System.out.print("*");
			}
			// 3. 줄바꿈
			System.out.println();
		}
		
		// 별문제7 : 입력받은 줄 만큼 출력	
		
			System.out.println(" 문제7) 줄수 : "); int line7 = scanner.nextInt();
				
			// 1. iteration 시작
			for (int i = 1 ; i<=line7 ;i++) {
			// 2-1. 공백 찍기
				for (int b=1; b<=line7-i;b++) {
				    System.out.print(" ");
				}
			// 2-2 별 찍기
				for (int s=1; s<=i*2-1;s++) {
				
					System.out.print("*");
					
				}
			System.out.println();	
				
			}
			
		// 별문제8 : 입력받은 줄 만큼 출력	
		
			System.out.println(" 문제8) 줄수 : "); int line8 = scanner.nextInt();
				
			// 1. iteration 시작
			for (int i = 1 ; i<=line8 ;i++) {
			// 2-1. 공백 찍기
				for (int b=1; b<=line8-i;b++) {
				    System.out.print(" ");
				}
			// 2-2 별 찍기
				for (int s=1; s<=i*2-1;s++) {
				
//						System.out.print("*");
					System.out.print(i);
				}
			System.out.println();	
				
			}
		
			// 별문제9 : 입력받은 줄 만큼 출력	
			
			System.out.println(" 문제9) 줄수 : "); int line9 = scanner.nextInt();
					// 0. iteration 
				for ( int i =1 ; i<=line9;i++) {
					//1. 공백 입력
					for ( int b=1; b<=i-1;b++) {
						System.out.print(" ");
					}
					//2. 별 찍기
					for (int s = 1; s<=line9*2-i;s++) {
						System.out.print("*");
					}
					System.out.println();	
				}
					
		
		
	} // m e

} // c e
