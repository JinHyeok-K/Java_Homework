package Homework05_Day04_가위바위보;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보6 { // time [06:49]
	/*
	 * 가위바위보게임[10]
		1. 사용자에게 가위[0]바위[1]보[2] 종료[3] 중에  입력받기
		2. 컴퓨터 난수발생[0~2] 
		3. 사용자와 컴퓨터중 승리자 판단 [ 경우의수 ]
		4. 3번 선택하기 전까지 게임 실행 
		5. 3번 선택시 게임종료 
			1. 총 게임수 출력	예) 3판
			2. 최종 승리 출력	예) 컴퓨터 2  사용자 1
	 */
	// 문제점 : 변수 초기화 미흡
	//		  난수 초기값 설정 실수
	public static void main(String[] args) { // main thread 시작
		Scanner scanner =new Scanner(System.in); // 입력 객체 load
		//Q.)스캐너 객체 load => Resource leak: 'scanner' is never closed 발생 이유 
		
		Random random =new Random(); // 난수 발생 객체load
		int 사용자; int 컴퓨터; int 게임수=0; // int 형 변수 초기화선언
		int 사용자승수=0; int 컴퓨터승수=0;// int 형 변수 초기화선언
		//Q) 사용자, 컴퓨터 변수 선언시 초기값을 0으로 해도 가능한지?

		
		while(true) { // 무한루프 시작 [ 종료조건:  3번 선택 ] 
			컴퓨터 =random.nextInt(2); // 컴퓨터 변수에 난수 입력 (0~2사이)
			System.out.println("=====가위바위보 게임====="); // =====가위바위보 게임===== 출력 
			System.out.println("0.가위 1.바위. 2.보 3.게임 종료"); // 0.가위 1.바위. 2.보 3.게임 종료 출력
			System.out.print("선택 : "); 사용자 = scanner.nextInt(); // 선택 :  출력 | 사용자 변수에 입력값 대입 
			if(사용자==3) { // 사용자 변수(이하 사용자) 값이 3일 때 (게임종료 선택)
				if(사용자승수>컴퓨터승수) { // 사용자의 승리수가 컴퓨터의 승리수보다 크면
					System.err.println("사용자 승리! "); // 사용자 승리! 출력
					System.err.println("총 게임횟수 : "+게임수); //  총게임 횟수 출력 
					System.err.println("사용자 승리 수 : "+사용자승수); // 사용자 승리수 출력
				}
				else if (사용자승수==컴퓨터승수) { // 승수가 서로 같으면
					System.err.println(" 무승부 "); // 무승부 출력
					
				}
				else {// 그 외에는
					System.err.println("컴퓨터 승리! "); // 컴퓨터 승리 출력
					System.err.println("총 게임횟수 : "+게임수); // 총 게임횟수 출력
					System.err.println("컴퓨터 승리 수 : "+컴퓨터승수); // 컴퓨터 승리수 출력
				}
				break; // 게임종료 ; 무한루프 종료
			}

			else if(사용자>=0&&사용자<=2) { // 사용자 값이  0보다 크거나 같고 2보다 작거나 같을 때,
				if(사용자==0&&컴퓨터==2 || 사용자==1&&컴퓨터==0 || 사용자==2 && 컴퓨터==1) { 
					// 사용자가 가위이고 컴퓨터가 보 또는 그리고 사용자가 바위,컴퓨터가 가위 또는 사용자가 보,컴퓨터가 바위일 때  
					System.err.println("사용자 승리! "); //사용자 승리 출력
					사용자승수++; //사용자의 승리수에 +1 증가
				}
				else if(사용자==0&&컴퓨터==0||사용자==1&&컴퓨터==1||사용자==2&&컴퓨터==2) {
					// 사용자가 가위,컴퓨터가 가위 또는 사용자가 바위,컴퓨터가 바위 또는 사용자가 보, 컴퓨터가 보 일 떄
					System.err.println("무승부"); // 무승부
					
				}
				else { //그 외의 경우는
					System.err.println("컴퓨터 승리! "); // 컴퓨터 승리 출력 
					컴퓨터승수++; // 컴퓨터의 승리수 +1 증가
				}
				게임수++; // 1루프 진행(입력 1회) 게임수 +1 씩 증가
			}
			
			
		}
		System.out.println(" 이용해 주셔서 감사합니다."); // 게임 종료 시 출력
	}

}
