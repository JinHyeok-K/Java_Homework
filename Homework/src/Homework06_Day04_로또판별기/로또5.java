package Homework06_Day04_로또판별기;

import java.util.Random;
import java.util.Scanner;

public class 로또5 { // time [08:18]
	/* 로또 판별기 [10]
	1. 사용자 6개 수 입력받기 -> 배열 저장 
		1. 1~45 사이 수 만 입력받기 아니면 재입력
		2. 중복x 재입력 
	2. 추첨번호 : 컴퓨터 난수 6개 발생 -> 배열 저장 
		1. 1~45 사이 
		2. 중복x
	3. 사용자번호 와 컴퓨터 추첨번호와 동일 수의 개수
 */
	//문제점 : for 문 입력시 어버버 한거 
	// 		괄호 처리 미숙(주석 미표시)
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("로또 게임");
		int[] 사용자 = new int[6];
		int[] 컴퓨터 = new int[6];
		
		for(int i=0;i<6;i++) {
			System.out.println(" 1 ~ 45 사이의 숫자를 입력하세요");
			System.out.print("숫자 입력 : "); int 번호입력 = scanner.nextInt();
			boolean check = true;
			
			if(번호입력<=0 || 번호입력 >=46) {
				System.out.println("잘못된 번호를 입력하였습니다.");
				i--;
				check= false;
			}
			else if (번호입력 >=1 || 번호입력 <=45) {
				for (int j = 0; j<6;j++) {
					if(번호입력==사용자[j]) {
						i--;
						System.out.println("중복된 숫자를 입력하였습니다.");
						check = false;
					}
					
				}
			}
			if(check == true ) {
				사용자[i] = 번호입력;
			}
		}//for 1
		
		
		for (int i = 0 ; i<6;i++) {
			
			int 추첨번호 = random.nextInt(45)+1;
			boolean check2=true;
			for(int j=0 ; j<6;j++) {
				if(추첨번호 == 컴퓨터[j]) {
					i--;
					check2=false;
				}
				
			}
			if(check2==true) {
				컴퓨터[i] = 추첨번호;
			}
			
		}
		
		
		int 중복숫자 =0;
		
		for (int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if (사용자[i]==컴퓨터[j]) {
					중복숫자++;
				}
			}
		}
		
		if (중복숫자==6) {System.out.println("1등");}
		else if (중복숫자==5) {System.out.println("2등");}
		else if (중복숫자==4) {System.out.println("3등");}
		else if (중복숫자==3) {System.out.println("4등");}
		else {System.out.println("꽝");}
		
	}
}

