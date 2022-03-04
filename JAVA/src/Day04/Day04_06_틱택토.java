package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_06_틱택토 { // c s

	/*
		1. 9칸 생성
			1 string[] 배열 = new string[9]
		2. 사용자에게 0~8 인덱스 번호 입력받기
				1. 해당 인덱스에 O 표시
		3. 컴퓨터는 0~8 사이 난수 발생
				1. 해당 인덱스에 x 표시
				2. 이미 둔 자리는 재 난수 생성
		4. 승리판단
				가로 인덱스들의 모양이 모두 동일하면 
				012 | 345 | 678
					| 첫번째 인덱스가 0부터 6까지 3씩 증가
				세로 인덱스들의 모양이 모두 동일하면
				036 | 147 | 258
					  두번째 : 첫번째 +1
				대각선 인덱스 들의 모양이 모두 동일하면 
				048 | 246
				      세번째 : 첫번째 +2
	*/
	public static void main(String[] args) { // m s
		
//		int[] 사용자번호 = new int[6]; // 사용자가 선택한 번호 목록 
//		int[] 추첨번호 = new int[6];	// 컴퓨터가 난수 번호 목록
//		
		
		
		Scanner scanner = new Scanner(System.in);		// 1)입력 객체
		
		//1. 9칸 생성
		//	1 string[] 배열 = new string[9]
		String[] 게임판 =     {"[ ]","[ ]","[ ]",
							"[ ]","[ ]","[ ]",
							"[ ]","[ ]","[ ]"} ;		// 2) String 객체 9개를 저장 할 수 있는 배열 선언
		String 승리알 = ""; // 3목이 되었을 때 해당 알을 저장하는 변수
		
		// 게임 실행
		while(true) { // 누가 승리할 때까지 돌려야 하므로 while 선택
					  // 무한루프 종료 조건 : 1. 9칸 모두 알이 있을 경우 2 . 승리자가 있을 경우(3목)
			// 게임판  출력 [ 배열 내 모든 인덱스 출력 ]
			//012 | 345 | 678
//			if(게임판[O].equals(게임판[1] ) && 게임판[1].equals(게임판[2]){}
//			if(게임판[3].equals(게임판[4] ) && 게임판[4].equals(게임판[5]){}
//			if(게임판[6].equals(게임판[7] ) && 게임판[7].equals(게임판[8]){}
//			
			
			
			
			for(int i=0; i<게임판.length;i++) {
				System.out.print(게임판[i]);
				// 배수 찾기 : 값%수 ==0
				// 인덱스 2 5 8 이면 줄바꿈
				if(i % 3 == 2) 	System.out.println();
			}
			/////////////////////////////////////////////////////////
			
			// 1. 플레이어 위치(인덱스) 선택
			while(true) {
				System.out.println("위치 선택 : "); int 위치 = scanner.nextInt();
				if(게임판[위치].equals("[ ]")) { // 선택한 위치가 공백이면 알 두기					
					게임판[위치] = "[O]";
					break; // 가장 가까운 반복문 탈출
				}
				else {
					System.out.println(" 알림)) 해당 위치에 이미 알이 있습니다. [ 재 선택 ]");
				}
				
			}// while 2 end [ 플레이어가 정상 입력시 break(종료) ]
			
			
			if(승리알.equals("[O]")) {
				System.out.println(" 알림)) 플레이어 승리");
				break;
			}
			if(승리알.equals("[X]")) {
				System.out.println(" 알림)) 컴퓨터 승리");
				break;
			}
			
			
			//////////////////////////////////////////////////////////
			
			// 2. 컴퓨터 난수(인덱스) 발생
			
		//	int 추첨 = random.nextInt(9)
//			int 위치 = scanner.nextInt();
										/*		while(true) {
												int 컴퓨터 = Random.nextInt(9);
													if(게임판[컴퓨터].equals("[ ]")) { // 선택한 위치가 공백이면 알 두기					
														게임판[컴퓨터] = "[X]";
													}
									*/			
		
			while(true) {
			Random	random = new Random(); // 1. 난수 객체 생성
			int 위치 = random.nextInt(9); // 0~8까지의 사이의 난수 int 형으로 가져오기
			if (게임판[위치].equals("[ ]")) {// 3. 해당 난수 위치에 공백이면
				// 난수 위치에 공백이면 X 알 두기
				게임판[위치]="[X]"; break;
				}
			} //while3 end
			
			// 1. 가로로 이기는 수
			// 				==========
			
			//====
			for(int i =0 ; i<=6 ; i+=3) { // * i는 0부터 6까지 3씩 증가
				if (게임판[i].equals(게임판[i+1]) && 게임판[i+1].equals(게임판[i+2]) ){
					// 0 인덱스 == 1인덱스 이면서 1 3 인덱스 == 2인덱스
					승리알 = 게임판[i];
						}
							
			}
//			// 2. 세로로 이기는 수		  
			 				
			// 3. 대각선으로 이기는수  				
			// =================	4. 게임종료
//			if(승리알.equals("[O]")) {
//				System.out.println(" 알림)) 플레이어 승리");
//				break;
//			}
//			if(승리알.equals("[X]")) {
//				System.out.println(" 알림)) 컴퓨터 승리");
//				break;
//			}
////			else System.out.println("알림 )) 비김 ");
			
			
		} // 게임 종료
			
			
			// while2 end [난수가 공백위치를 생성했을경우 
			//2. 사용자에게 0~8 인덱스 번호 입력받기
			//	1. 해당 인덱스에 O 표시
			
			
			//int 번호 = scanner.nextInt();
		//	String 겜판 = scanner.next();
			
			
			
		
	}// me

}//ce


// ==================================================================

//
//package Day04;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Day04_6_틱택토 {
//	/*
//	 * 삼목 게임 [ 틱택토 게임 ]
//			1. 게임판 9칸 생성 
//				1. String[] 배열 = new String[9]
//		
//			2. 사용자에게 0~8 인덱스번호 입력받기
//				1. 해당 인덱스에 O 표시
//				2. 이미 둔 자리는 재 입력 
//		
//			3. 컴퓨터는 0~8 사이 난수 발생 
//				1. 해당 인덱스에 X 표시
//				2. 이미 둔 자리는 재 난수 생성  
//		
//			4. 승리판단 
//				가로 인덱스들의 모양이 모두 동일하면
//				012 345 678
//					첫번째 인덱스가 0부터 6까지 3씩증가
//						두번쨰 : 첫번째+1
// 						세번쨰 : 첫번째+2 
//				세로 인덱스들의 모양이 모두 동일하면 
//				036 147 258
//					첫번째 인덱스가 0부터 2까지 1씩증가 
//						두번째 : 첫번째+3
//						세번째 : 첫번쨰+6
//				대각선 인덱스들의 모양이 모두 동일하면 
//				048 246
//	 */
//	
//	public static void main(String[] args) {
//		
//		// 준비
//		Scanner scanner = new Scanner(System.in); // 1.입력객체 
//		String[] 게임판 = { "[ ]" , "[ ]" , "[ ]" ,
//							"[ ]","[ ]" , "[ ]" , 
//							"[ ]","[ ]" , "[ ]" }; // String 객체 9개를 저장할수 있는 배열 선언 
//		String 승리알 = ""; // 3목 되었을때 해당 알을 저장 변수
//		
//		// 게임실행 
//		while(true) { // 무한루프 종료조건 : 1. 9칸 모두 알이 있을경우 2. 3목 되었을때 [ 승리자 ]
//			
//			/////////////////// 게임판 출력 [ 배열내 모든 인덱스 출력 ] ///////////////////////////////
//			for( int i = 0 ; i<게임판.length; i++ ) {
//				System.out.print( 게임판[i] );
//				// 인덱스 2 5 8 이면 줄바꿈 
//				if( i % 3 == 2 ) System.out.println();
//			}
//			////////////////////////1. 플레이어 위치(인덱스) 선택 //////////////////////////////////////
//			while( true ) {
//				System.out.print(" 위치 선택 : "); int 위치 = scanner.nextInt();
//				if( 게임판[위치].equals("[ ]") ) {
//					// 선택한 위치가 공백이면 O 알 두기 
//					게임판[위치] = "[O]";
//					break;	// 가장 가까운 반복문 탈출;
//				}else {
//					System.out.println(" 알림)) 해당 위치에 이미 알이 존재. [ 재 선택 ] ");
//				}
//			} // while2 end [ 플레이어 정상 입력시 break; ] 
//			/////////////////////////2. 컴퓨터 난수(인덱스) 선택////////////////////
//			while(true) {
//				Random random = new Random(); // 1. 난수 객체 생성 
//				int 위치 = random.nextInt(9); // 2. 0~8 사이의 난수 int형으로 가져오기 
//				if( 게임판[위치].equals("[ ]") ) { // 3. 해당 난수위치가 공백이면 
//					// 난수 위치에 공백이면 X 알 두기 
//					게임판[위치]="[X]"; break;	 // 4. 알을 두었으면 반복문 탈출
//				}
//			} // while2 end [ 난수가 공백위치를 생성했을경우에 break; ]
//			/////////////////////////// 3. 승리자 판단 ///////////////////////
//			// 1. 가로로 이기는수 
//			for( int i =0 ; i<=6 ; i+=3 ) { //* i는 0부터 6까지 3씩증가 -> 0 3 6 -> 3회
//				if( 게임판[i].equals(게임판[i+1]) && 게임판[i+1].equals(게임판[i+2]) ) {
//					//   0 인덱스 == 1 인덱스  이면서  1 3인덱스 == 2 인덱스 
//					승리알 = 게임판[i]; // 동일한 알을 승리알 변수에 대입 
//				}
//			}
//			// 2. 세로로 이기는수 
//			for( int i = 0 ; i<=2 ; i++ ) { // * i는 0부터 2까지 1씩증가 -> 0 1 2 -> 3회
//				if( 게임판[i].equals(게임판[i+3]) && 게임판[i+3].equals(게임판[i+6])) {
//					승리알 = 게임판[i];
//				}
//			}
//			// 3. 대각선으로 이기는수 
//			if( 게임판[0].equals(게임판[4]) && 게임판[4].equals(게임판[8] )) {
//				승리알 = 게임판[0];
//			}
//			if( 게임판[2].equals(게임판[4]) && 게임판[4].equals(게임판[6] )) {
//				승리알 = 게임판[2];
//			}
//			
//			/////////////////////////// 4. 게임종료 //////////////////////////////
//			if( 승리알.equals("[O]") ) { 
//				System.out.println(" 알림)) 플레이어 승리"); 
//				break; // 게임종료 
//			}
//			if( 승리알.equals("[X]") ) {
//				System.out.println(" 알림)) 컴퓨터 승리");
//				break; // 게임종료
//			}
//			
//			/////////////////////////  5. 무승부 ///////////////////////////////////
//			
//			
//		} // while1 end [ 게임종료 ] 
//		
//		/////////////////// 게임판 출력 [ 배열내 모든 인덱스 출력 ] ///////////////////////////////
//		for( int i = 0 ; i<게임판.length; i++ ) {
//			System.out.print( 게임판[i] );
//			// 인덱스 2 5 8 이면 줄바꿈 
//			if( i % 3 == 2 ) System.out.println();
//		}
//		
//	} // main end 
//} // class end 
//
//
//
//




