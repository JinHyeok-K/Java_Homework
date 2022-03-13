package Homework05_Day04_가위바위보;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보2 { //time [07:57]
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
	//문제점 ==>  break 누락
	// 			사용자 변수 사용 안함
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int 사용자; int 컴퓨터;
		int 게임수=0; int 사용자승수=0; int 컴퓨터승수=0;
		
		while(true) {
			System.out.println("가위바위보 게임");
			System.out.println("0.가위 1.바위 2.보 3.게임종료");
			System.out.print("선택 : "); int 선택 = scanner.nextInt();
			컴퓨터 = random.nextInt(2);
			
			if(선택 == 3 ) {
				System.out.println( " 게임 종료 ");
				if(사용자승수>컴퓨터승수) {
					System.out.println(" 사용자 승리");
					System.out.println(" 총 게임수 :"+게임수 );
					System.out.println(" 사용자 승수 : "+사용자승수);
				}
				else if(사용자승수 == 컴퓨터승수) {
					System.out.println("무승부!");
				}
				else System.out.println("컴퓨터 승리");
					System.out.println(" 총 게임수 :"+게임수 );
					System.out.println(" 컴퓨터 승수 : "+컴퓨터승수);
			//사용자에게 가위[0]바위[1]보[2] 종료[3] 	
			}
			else if (선택>=0&&선택<=2) {
				if(선택 ==0&&컴퓨터==2 || 선택 ==1&&컴퓨터==0|| 선택 ==2&&컴퓨터==1) {
					System.out.println(" 사용자 승리");
					사용자승수++;
				}
				else if (선택 ==0 && 컴퓨터 ==0 || 선택==1&&컴퓨터==1|| 선택==2&&컴퓨터==2) {
					System.out.println("무승부");
				}
				else
					System.out.println("컴퓨터 승리");
				    컴퓨터승수++;
			}
			게임수++;
		}
	}
	
}



