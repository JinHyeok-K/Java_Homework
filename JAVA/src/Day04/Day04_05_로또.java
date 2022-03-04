package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_05_로또 {// cs
	/*
		//	
		//	 로또 판별기 
		//		1. 사용자 6개 수 입력받기 -> 배열 저장 
		//			1. 1~45 사이 수 만 입력받기 아니면 재입력
		//			2. 중복x 재입력 
		//		2. 추첨번호 : 컴퓨터 난수 6개 발생 -> 배열 저장 
		//			1. 1~45 사이 
		//			2. 중복x
		//		3. 사용자번호 와 컴퓨터 추첨번호와 동일 수의 개수
		//	 
		//	
		//	/*Scanner scanner = new Scanner(System.in);
		//	
		//	int[] lotto = new int[6]; 
		//	int[] check = new int[6];
		//	
		//	
		//	// 입력 시작 6개가 될 때까지
		//	while(true) {
		//		
		//
		//	
		//	
		//	public static void main(String[] args) {// ms
		//		
		//		//준비
		////		int[] 사용자번호 = new int[6];	 // 사용자가 선택한 번호 	
		////		int[] 추첨번호 = new int[6];	 // 컴퓨터가 발생한 난수 번호 목록
		////		
		////		Scanner scanner = new Scanner(System.in);
		////		
		//		int[] 사용자번호 = new int[6]; // 사용자가 선택한 번호 목록 
		//		int[] 추첨번호 = new int[6];	// 컴퓨터가 난수 번호 목록
		//		Scanner scanner = new Scanner(System.in);
		//		
		//		
		//		
		//		// 1. 사용자에게 입력 받기
		//		for(int i =0; i<6; i++) {
		//			// i는 0부터 5까지 1씩 증가 반복 => 6회 반복
		//			System.out.println(" 1~45 사이의 숫자 입력 : ");
		//			int 번호 = scanner.nextInt();
		//			//조건1. 1~45 사이 값 입력 : 유효성 검사
		//			if (번호<1 || 번호>=46) {
		//				System.err.println(" 알림)) 선택할 수 없는 번호 입니다.[재입력] ");
		//				// 1보다 작거나 45보다 크면 선택할 수 없는 번호 입력시  재입력
		//				i--; // 현재 i는 비 정상 입력이므로 i 값 차감
		//			}//if end
		//			
		//			
		////			for( int i = 0 ; i<6 ; i++ ) {
		////				// i는 0부터 5까지 1씩증가반복 => 6회반복
		////				System.out.print(" 1~45 사이 입력 : ");
		////				int 번호 = scanner.nextInt();
		////				
		////		//		boolean 통과 = true; // 저장 되는 조건 변수
		////				
		////				// 조건1 : 유효성검사 
		////				if( 번호 < 1 || 번호 > 45 ) { // 1보다 작거나 45보다 크면 선택할수 없는 번호입력시 재입력 
		////					System.out.println(" 알림)) 선택할수 없는 번호 입니다.[재입력] ");
		////					i--; // 현재 i는 정상입력x
		////		//			통과 = false; // 저장 x 
		////				}// if end 
		////					
		//	
		//			// me
		//			
		//			 * for (int j=0; j<6;j++) {
		//			 * 
		//			 * if (사용자번호[i]==사용자번호[i+j] ||사용자번호[i]==사용자번호[i+j]||사용자번호[i]==사용자번호[i+j]||
		//			 * 사용자번호[i]==사용자번호[i+j]||사용자번호[i]==사용자번호[i+j]) {
		//			 * System.err.println(" 알림)) 중복된 수가 발견되엇습니다."); } }
		//			 
		//			
		//			//조건2. 중복 체크
		////				// 1. 배열 내 모든 인덱스 호출
		////			for(int j = 0; i<6; i++) {
		////				if( 번호 == 사용자번호[j]) {
		////					// 2. 입력받은 값과 j 번째 인덱스 값과 같은지 비교
		////					System.out.println("알림 )) 이미 선택한 번호 입니다. [재입력]");
		////					i--;
		////				} // if end
		////			} // for2 end
		////			
		////			사용자번호[i] = 번호;
		////		} // for end
		////		
		////		// * 사용자 배열 내 모든 인덱스 출력
		////		System.out.println("\n사용자가 선택한 번호 : ");
		////		for( int temp: 사용자번호) {
		//	//		System.out.println( temp + "\t" );
		//	//	}	
		//	
		//		// 2. 컴퓨터가 난수 생성
		//		
		//		// 3. 비교 = 두 배열간 동일한 수 찾기 
		//			}	
		//	}// me
		//} // c e 

======================================================	
	*/
	/* 로또 판별기 
	1. 사용자 6개 수 입력받기 -> 배열 저장 
		1. 1~45 사이 수 만 입력받기 아니면 재입력
		2. 중복x 재입력 
	2. 추첨번호 : 컴퓨터 난수 6개 발생 -> 배열 저장 
		1. 1~45 사이 
		2. 중복x
	3. 사용자번호 와 컴퓨터 추첨번호와 동일 수의 개수
 */
public static void main(String[] args) {// ms
	
	// 준비
	int[] 사용자번호 = new int[6]; // 사용자가 선택한 번호 목록 
	int[] 추첨번호 = new int[6];	// 컴퓨터가 난수 번호 목록
	int count=0;
	int result =0;
	Scanner scanner = new Scanner(System.in);
	
	// 1. 사용자에게 입력받기 
	for( int i = 0 ; i<6 ; i++ ) {
		// i는 0부터 5까지 1씩증가반복 => 6회반복
		System.out.print(" 1~45 사이 입력 : ");
		int 번호 = scanner.nextInt();
		
		boolean 통과 = true; // 저장 되는 조건 변수
		
		// 조건1 : 유효성검사 
		if( 번호 < 1 || 번호 > 45 ) { // 1보다 작거나 45보다 크면 선택할수 없는 번호입력시 재입력 
			System.out.println(" 알림)) 선택할수 없는 번호 입니다.[재입력] ");
			i--; // 현재 i는 정상입력x
			통과 = false; // 저장 x 
		}// if end 
		
		// 조건2 : 중복체크 
			// 1. 배열내 모든 인덱스 호출
		for( int j = 0 ; j<6 ; j++ ) {
			if( 번호 == 사용자번호[j] ) {
				// 2. 입력받은 값과 j번째 인덱스값과 같은지 비교
				System.out.println(" 알림)) 이미 선택한 번호 입니다.[재입력]");
				i--; // 현재 i는 정상입력x
				통과 = false; // 저장x
			} // if end 
		} // for2 end 
		// 정상입력[통과가 true] 이면 배열에 저장하기 
		if( 통과 == true) 사용자번호[i] = 번호;
		
	} // for end 
	
	System.out.print("\n사용자가 선택한 번호 : ");
	// * 사용자 배열내 모든 인덱스 출력 
	for( int temp : 사용자번호 ) {
		System.out.print( temp +"\t");
	}
	
	// 2. 컴퓨터가 난수생성
	for ( int i = 0; i<6 ; i++) {
		Random random= new Random(); // 1. 난수 객체
		int 추첨 = random.nextInt(45)+1; // 2 난수를 int 형으로 가져오기
								// random.nextInt() : +- 20억 사이중 난수 발생
								// random.nextInt(수) : 0~수 전까지 사이중 난수 발생
								// random.nextInt(수)+시작번호 : 시작번호 ~ 수 사이의 난수 발생
		// 조건 1 : 중복체크
		boolean 통과 = true;
		for(int temp : 추첨번호) {
			if( 추첨 == temp) {
				i--; // 중복이 있을 경우 현재 i 예외
				통과 = false; // 저장 x
			}
			
		}
		if(통과) 추첨번호[i] = 추첨;
		
	}
	System.out.print("\n추첨 번호 : ");
	// * 사용자 배열내 모든 인덱스 출력 
	for( int temp : 추첨번호 ) {
		System.out.print( temp +"\t");
		
//		사용자번호
//		추첨번호
	}
	int 동일한수 =0; 

	// 3. 비교 = 두 배열간 동일한 수 찾기
	/*   // 방법 1
				 for (int i = 0; i<사용자번호.length ; i++) {
					 //for (int i=0;i>6;i++) {
					for(int j=0;j<사용자번호.length;j++) {
						
						if(사용자번호[i] == 추첨번호[j]) {
							동일한수++;
						}
						
					}
				}
			  *///	 temp
	// 방법 2			  ↓
			for(int 비교기준 :사용자번호) {
				// 사용자번호 배열 내 하나씩 비교 기준에 대입
				for (int 비교대상 : 추첨번호) {
					 // 추첨번호 배열 내 하나씩 비교대상 대입
					if (비교기준 == 비교대상) 동일한수++;
					
				}
			}
			
	
	System.out.println("\n동일한 수 : "+동일한수);	
	
		
	
	}// me
} // c e 






	
	