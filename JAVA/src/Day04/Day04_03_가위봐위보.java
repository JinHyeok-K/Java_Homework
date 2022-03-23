package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_03_가위봐위보 { // c s

	public static void main(String[] args) { // m s
		
		int 플레이어;										// 사용자가 선택한 수 저장
		int 컴퓨터;										// 컴퓨터가 난수를 생성한 수 저장
		int 게임수=0;										// 총 가위바위보 실행 횟수 저장
		int 플레이어승리수 = 0; int 컴퓨터승리수=0; int 비긴수=0;	// 각 승리 수 저장
		
		Scanner	scanner = new Scanner(System.in);
		
		
		
		// 프로그램 실행
		while(true) { // 프로그램 실행(무한루프 ) [무한루프 종료 조건 : 3번 입력 시 종료 (break)]
			
			System.out.println(" ------ 가위 바위 보 게임 ------");
			System.out.println(" 가위(0) 바위(1) 보(2)   종료(3)   선택  :");
			플레이어 = scanner.nextInt(); // 입력한 수 저장
			System.out.println(" 플레이어 선택 : "+ 플레이어 );
			
			Random random = new Random(); // 난수 객체 선언
			
				// random.nextInt(); : int 가 표현할 수 있는 범위 내 난수 발생
				// random.nextInt(수)+ 시작번호 : 0~수 전까지 범위 내 난 수 발생
					// random.nextInt(10); : 0~9 중 난수 발생
					// random.nextInt(11)+10; : 10~20까지 난수 발생
			컴퓨터 = random.nextInt(3); // 난수를 정수(int)로 가져오기
				// System.out.println(" 컴퓨터가  낸 수 : "+ 컴퓨터);
			
			// 승리자 판단
			
			
			if (플레이어 == 3 ) { // 종료 조건
				
				System.out.println("총 게임 수 : "+ (게임수));
				System.out.println("플레이어 이긴 수 :"+플레이어승리수+" 컴퓨터가 이긴 수 : "+컴퓨터승리수+" 비긴 수 : "+ 비긴수);
				if (플레이어승리수>컴퓨터승리수) {
					System.out.println(" 최종 승리자 : 플레이어! ");
				}
				else if (플레이어승리수<컴퓨터승리수) {
					System.out.println(" 최종 승리자 : 꼼쀼탸! ");
				}
				else  System.out.println(" 최종 승리자 : 무 승 부");
				
				break;
				
			} // 승리자 판단
			else if ( 플레이어 >=0 && 플레이어 <=2 ) { // 정상입력 
				// 승리 판단 
				if( (플레이어==0 && 컴퓨터==2) || (플레이어==1&&컴퓨터==0) || (플레이어==2&&컴퓨터==1)  ) { 
					// 플레어가 이기는 경우의수  // 플레이어 승리 경우의수 [ 0 -> 2 / 1->0 / 2->1 ]
					System.err.println(" 알림)) 플레이어 승리 ");
					플레이어승리수++; // 승리수 증가 
				}else if( (플레이어==0 && 컴퓨터==0) || (플레이어==1&&컴퓨터==1) || (플레이어==2&&컴퓨터==2) ) { // 비기는 경우의수 
					System.err.println(" 알림)) 무승부 ");
				}
				else{ // 그외는 컴퓨터 승리 
					System.err.println(" 알림)) 컴퓨터 승리 ");
					컴퓨터승리수++; // 승리수 증가 
				}
				// 게임수 증가 
				게임수++;
			}else {
				System.out.println(" 알림)) 알수없는 행동입니다. ");
			}
			
		}
//		if ( 플레이어>3  ) {
//			System.out.println(" 알림) 알 수 없는 행동 입니다.");
//		}
		
	} // m e
} // c e
