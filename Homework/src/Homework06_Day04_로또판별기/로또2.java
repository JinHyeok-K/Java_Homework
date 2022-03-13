package Homework06_Day04_로또판별기;

import java.util.Random;
import java.util.Scanner;

public class 로또2 { // time[18:31] |4

	/* 로또 판별기 [10]
	1. 사용자 6개 수 입력받기 -> 배열 저장 
		1. 1~45 사이 수 만 입력받기 아니면 재입력
		2. 중복x 재입력 
	2. 추첨번호 : 컴퓨터 난수 6개 발생 -> 배열 저장 
		1. 1~45 사이 
		2. 중복x
	3. 사용자번호 와 컴퓨터 추첨번호와 동일 수의 개수
 */
	//문제점 : 괄호처리 미숙
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		Random random =new Random();
		int[] 사용자 = new int[6];
		int[] 컴퓨터 = new int[6];
		
		System.out.println(" 로또");
		
		for (int i=0;i<6;i++) {
			System.out.println(" 1~45까지의 숫자를 입력");
			int 입력숫자 = scanner.nextInt();
			boolean check = true;
			if(입력숫자<=0||입력숫자>=46) {
				System.out.println("잘못된 입력입니다.");
				i--;
				check= false;
			}
			else if(입력숫자>0||입력숫자<46) {
				for (int j=0;j<6;j++) {
					if(입력숫자==사용자[j]) {
						System.out.println("중복된 숫자를 입력하였습니다.");
						i--;
						check =false;
					}			
				}	
			}
			
			if (check==true) {
				사용자[i]= 입력숫자;
			}
			
		}
		
		for (int i=0;i<6;i++) {
			int 추첨번호 = random.nextInt(10)+1;
			
			boolean check2 = true;
			
			for (int j=0;j<6;j++) {
				if(추첨번호==컴퓨터[j]) {
					i--;
					check2 =false;
			}
			
			}
			if(check2==true) {
				컴퓨터[i]=추첨번호;
			}
			System.out.println(컴퓨터[i]);
		}
		
		
		
		
		
		int 동일숫자 =0;
		for (int i=0;i<6;i++) {
			for (int j=0;j<6;j++) {
				if(사용자[i]==컴퓨터[j]) {
					동일숫자++;
				}
			}
		}
		
		if (동일숫자==6) {
			System.out.println("1등");
		}
		else if (동일숫자==5) {
			System.out.println("2등");
		}
		else System.out.println("꽝");
		}
	

}
