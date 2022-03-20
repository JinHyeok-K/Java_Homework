package Homework09_자유주제;

import java.util.Random;
import java.util.Scanner;

/* 1차원 배열 위치 표시 주사위게임
	1. 게임 배열 칸 입력=> 게임판 크기 설정
	2. 주사위 설정 (Random) 
	3. 게임 스타트 후 유저, 컴퓨터 간 위치 표시 '유저:[O], 컴퓨터:[X]'
		3-1 다음 게임 시 전 게임 위치 삭제
	4. 동일 위치 시 가위바위보 게임 시작 
		4-1 유저 승리시 동일 위치에 [O] 표시
		4-2 컴퓨터 승리시 동일 위치에 [X] 표시
	5. 누적된 위치 값이 설정한 게임배열 값 이상 혹은 도착시 승리  

*/
public class 자유주제프로그램 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		
		
		
		System.out.println(" mini 부루마블 ");
		System.out.println("게임 판 크기 설정"); int round=scanner.nextInt();
		System.out.println("주사위 눈 설정"); int eyes=scanner.nextInt();
		String[] 게임판 = new String[round];
		String[] 게임판_play = new String[round];
		String[] 게임판_com = new String[round];
		
		for(int i=0;i<게임판.length;i++) {
			게임판[i]="[ ]";
//			게임판_play[i]="[ ]";
//			게임판_com[i]="[ ]";
		}
		int saveposi_P=-1;
		int saveposi_C=-1;
		int 게임수=0;
		while(true) {
//			System.out.println("=================");
			
			int dice1 = random.nextInt(eyes)+1;
			int dice2 = random.nextInt(eyes)+1;
	
			int sumDice = dice1+dice2;
			for(int i =0 ;i<게임판.length;i++) {
//				System.out.println("=================");
				System.out.print(게임판[i]);
//				if(i/10==0) System.out.println();
//				System.out.println("=================");				
			}
			
			System.out.println(" \n======User Turn! 주사위를 굴립니다.====== ");
			System.out.println(" 아무키나 입력하세요"); String el=scanner.next();
			System.out.println("=====숫자 "+sumDice+"가 나왔습니다.=====");
			
			
			
			
			saveposi_P = saveposi_P+sumDice;
			if(게임수>0&&saveposi_C<게임판.length&&saveposi_P>=게임판.length) {
				saveposi_P = round;
	
				System.out.println("유저승리!");
				System.out.println("안녕히가십시오");
				break;
			}
			if(게임판[saveposi_P].equals("[ ]")) {
				
				게임판[saveposi_P] ="[O]";
				if(게임수>0) {
//					
						게임판[saveposi_P-sumDice] = "[ ]";
//					}
				}
			}
			
			
			else if(게임판[saveposi_P].equals("[X]")){
				System.err.println("컴퓨터와 동일위치!");
				System.out.println("==가위바위보게임!==");
				while(true) {
					int com =random.nextInt(2);
					System.out.println("0.가위 1.바위. 2.보 "); // 0.가위 1.바위. 2.보 3.게임 종료 출력
					System.out.print("선택 : "); int 선택 = scanner.nextInt();
					if(선택==0&&com==2 || 선택==1&&com==0 || 선택==2 && com==1) { 
						System.out.println(" 유저 승리!");
						 
						게임판[saveposi_C] ="[ ]"; 
						게임판[saveposi_P] ="[O]";
						saveposi_C=-1;
						for(int i=0;i<게임판.length;i++) {
							if(게임판[i].equals("[X]")) {
								게임판[i] = "[ ]";
									
							}
						}
						break;
					}
					else if(선택==0&&com==0||선택==1&&com==1||선택==2&&com==2) {
						System.out.println("무승부! 다시!");
					}
					else {System.out.println("패배하였습니다.");
						게임판[saveposi_P] ="[ ]"; 
						게임판[saveposi_C] ="[X]"; 
						saveposi_P=-1;
						for(int i=0;i<게임판.length;i++) {
							if(게임판[i].equals("[O]")) {
								게임판[i] = "[ ]";
								
							}
						}
						break;
					}
				}
			}
			for(int i =0 ;i<게임판.length;i++) {
				System.out.print(게임판[i]);
//				if(i/10==0) System.out.println();
			}
			System.out.println("\n======컴퓨터 Turn======");
			int com_dice1 =random.nextInt(eyes)+1;
			int com_dice2 =random.nextInt(eyes)+1;
			int com_dice = com_dice1+com_dice2;
			System.out.println("숫자 "+com_dice+"가 나왔습니다.");
			
			saveposi_C = saveposi_C+com_dice;
			if(saveposi_P<게임판.length&&saveposi_C>=게임판.length) {
				saveposi_C = round;
				System.out.println("컴퓨터승리!");
				System.out.println("또졌어?");
				break;
			}
			if(게임판[saveposi_C].equals("[ ]")) {
				게임판[saveposi_C] = "[X]";
				if(게임수>0) {
					게임판[saveposi_C-com_dice] = "[ ]";
				}
			}
			else if(게임판[saveposi_C].equals("[O]")){
				System.out.println("유저와 동일위치!");
				System.out.println("==가위바위보게임!==");
				while(true) {
					int com =random.nextInt(2);
					System.out.println("0.가위 1.바위. 2.보 "); // 0.가위 1.바위. 2.보 3.게임 종료 출력
					System.out.print("선택 : "); int 선택 = scanner.nextInt();
					if(선택==0&&com==2 || 선택==1&&com==0 || 선택==2 && com==1) { 
						System.out.println("유저 승리!");
						게임판[saveposi_C] ="[ ]"; 
						게임판[saveposi_P] ="[O]"; 
						saveposi_C =-1;
						for(int i=0;i<게임판.length;i++) {
							if(게임판[i].equals("[X]")) {
								게임판[i] = "[ ]";
							}
						}
						break;
					}
					else if(선택==0&&com==0||선택==1&&com==1||선택==2&&com==2) {
						System.out.println("무승부! 다시!");
					}
					else {System.out.println("컴퓨터 승리!");
						게임판[saveposi_P] ="[ ]";
						게임판[saveposi_C] ="[X]"; 
						saveposi_P=-1;
						for(int i=0;i<게임판.length;i++) {
							if(게임판[i].equals("[O]")) {
								게임판[i] = "[ ]";
							}
						}
						break;
					}
				}
			}
			게임수++;
		}
	}
}
