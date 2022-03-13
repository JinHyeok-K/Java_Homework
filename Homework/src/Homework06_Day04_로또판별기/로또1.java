package Homework06_Day04_로또판별기;

import java.util.Random;
import java.util.Scanner;

public class 로또1 {// time 63:03 |7
	/* 로또 판별기 [10]
	1. 사용자 6개 수 입력받기 -> 배열 저장 
		1. 1~45 사이 수 만 입력받기 아니면 재입력
		2. 중복x 재입력 
	2. 추첨번호 : 컴퓨터 난수 6개 발생 -> 배열 저장 
		1. 1~45 사이 
		2. 중복x
	3. 사용자번호 와 컴퓨터 추첨번호와 동일 수의 개수
 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random =new Random();
		int[] 사용자= new int[6];
		int[] 컴퓨터= new int[6];
		
			System.out.println("로또 게임");
			
			for (int i =0;i<6;i++) {
				System.out.print("1~45 사이의 숫자를 입력하세요"); 
				System.out.print("\n입력 : "); 	
				
				boolean 체크 = true;
				int 숫자= scanner.nextInt();
//				사용자[i]= 숫자;
				if(숫자<1 || 숫자>46) {
					System.out.println("잘못된 입력입니다.");
					i--; 
					체크 = false;
				}
				else if(숫자>=1||숫자<=46) {
					for (int j=0;j<6;j++) {
						if(숫자 ==사용자[j]) {
							System.out.println("중복된 번호입니다.");
							i--; 
							체크 = false;
						}
					}
				}
				if(체크==true) {
					사용자[i]= 숫자;
				}
			}
			
			
			for (int i =0;i<6;i++) {
				boolean 체크 = true;
				int 추첨 = random.nextInt(10)+1;
				for(int j =0;j<6;j++) {
					if(추첨==컴퓨터[j]) {
						i--;
						체크 = false;
					}
				}
				if(체크==true) {
					컴퓨터[i]=추첨;
				}
//				System.out.println(컴퓨터[i]);
			}
				
		
			int 중복숫자=0;
			for (int i=0;i<6;i++) {
				for(int j=0;j<6;j++) {
					if(사용자[i]==컴퓨터[j]) {
						중복숫자++;
					}
				}
			}
			
			if(중복숫자==6) {
				System.out.println("1등");
			}
			else if(중복숫자==5) {
				System.out.println("2등");}
			else if(중복숫자==4) {
				System.out.println("3등");
			}
			else if(중복숫자==3) {
				System.out.println("4등");
			}
			else  {System.out.println("꽝");}
	}	
}
