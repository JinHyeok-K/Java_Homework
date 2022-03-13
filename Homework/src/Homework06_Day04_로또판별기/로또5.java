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
	public static void main(String[] args) { // main thread 시작
		Scanner scanner =new Scanner(System.in); // 입력 객체 load
		Random random = new Random(); // 랜덤한 값 발생 객체 load
		
		System.out.println("로또 게임"); // 로또 게임 출력
		int[] 사용자 = new int[6]; //  사용자라는 정수형 배열 선언 : 0~5 ; 6칸
		int[] 컴퓨터 = new int[6]; //  컴퓨터라는 정수형 배열 선언 : 0~5 ; 6칸
		
		for(int i=0;i<6;i++) { // 반복문 실행 : i가 0부터 5 까지 1씩 증가하면서 반복; 총 6번 반복
			System.out.println(" 1 ~ 45 사이의 숫자를 입력하세요"); // 1~45 사이의 숫자 입력하세요 출력
			System.out.print("숫자 입력 : "); int 번호입력 = scanner.nextInt(); 
			//숫자 입력 :  출력 | 번호입력 정수형 변수에 입력 대입 
			boolean check = true; // switch 변수 check  true 설정( true=1=통과 ,false=0=실패) 
			
			if(번호입력<=0 || 번호입력 >=46) { // 번호입력의 값이 0또는 0보다 작은 값 또는 46보다 크거나 같으면
				System.out.println("잘못된 번호를 입력하였습니다."); // 잘못된 번호를 입력 출력
				i--; // 위 조건 만족 시 반복횟수 -1(i값 -1) 
				check= false; // switch check 의 값 을 false(0) 로 변경
			}// 번호입력 조건의 값이 상기 조건과 같으면 check가 false 가 되므로 다음 코드로 진행이 되지 않아 다시 for 문에서 재시작 

			else if (번호입력 >=1 || 번호입력 <=45) {//번호입력 값이 1보다 크거나 45보나 작거나같으면  하기 코드 실행
				for (int j = 0; j<6;j++) { //j가 0부터 5 까지 1씩 증가하면서 반복; 총 6번 반복
					if(번호입력==사용자[j]) { // 번호입력의 값이 사용자배열의 j번째 값과 같으면
						i--; // 위 조건 만족 시  총 반복횟수 값 -1(i값 -1) 
						System.out.println("중복된 숫자를 입력하였습니다."); // 중복된 숫자를 입력하였습니다 출력
						check = false; //switch check 의 값 을 false(0) 로 변경
					}
					
				}
				
			}// 번호입력 조건의 값이 상기 조건과 같으면 check가 false 가 되므로 다음 코드로 진행이 되지 않아 다시 for 문에서 재시작 
			 // 번호입력의 값이 사용자 배열 내 숫자중 하나가 같을 때 반복문 재실행  
			 // 중복값 체크
			
			//Q) 수업시 코드에 누락된것이 있는게 맞는지
			// -> 번호입력 시 1~45 외 숫자 입력 -> 알림)) 선택할수 없는 번호 입니다.[재입력]  7회 출력
			// 그 이후 정상 숫자 입력 시 오류발생
			
			
			if(check == true ) { // switch check 의 값이 true(1) 일 때
				사용자[i] = 번호입력; // 사용자 i번째 배열의 값이 입력한 번호입력을 대입
			}
		}// 사용자 입력 반복문 종료  
		
		
		for (int i = 0 ; i<6;i++) { // 반복문 실행 : i가 0부터 5 까지 1씩 증가하면서 반복; 총 6번 반복
			
			int 추첨번호 = random.nextInt(45)+1; // 정수형 추첨번호 변수에 1~45사이의 난수 값 입력
			boolean check2=true; //  switch 변수 check2  true 설정( true=1=통과 ,false=0=실패) 
			for(int j=0 ; j<6;j++) { // //j가 0부터 5 까지 1씩 증가하면서 반복; 총 6번 반복
				if(추첨번호 == 컴퓨터[j]) { // 추첨번호의 값이 컴퓨터 변수 배열의 j번째 값과 같으면
					i--; // i값 감소 => 위 조건 만족 시  총 반복횟수 값 -1(i값 -1) 
					check2=false; //switch check 의 값이 false(0) 로 변경
				}
				
			}
			//중복 체크 :추첨번호의 값이 컴퓨터배열 내 저장된 값이 하나라도 같으면 반복
			if(check2==true) {// switch 의 값이 true(1) 일 때
				컴퓨터[i] = 추첨번호; // 컴퓨터 i번째 배열에 발생한 추첨번호 대입
			} 
			
		}
		
		
		int 중복숫자 =0; // 정수형 변수 중복숫자 를 0으로 초기화 선언
		
		for (int i=0;i<6;i++) { // i 가 0부터 5까지 1씩 증가하면서 반복
			for(int j=0;j<6;j++) { // j 가 0부터 5까지 1씩 증가하면서 반복
				if (사용자[i]==컴퓨터[j]) { //사용자 i번째 배열의 값과 컴퓨터의 j번째 배열의 값 과 같으면
					중복숫자++; // 중복숫자 값에 +1
				}
			}
		}
		
		if (중복숫자==6) {System.out.println("1등");} //중복숫자의 값이 6이면 1등 출력
		else if (중복숫자==5) {System.out.println("2등");} //중복숫자의 값이 5이면 2등 출력
		else if (중복숫자==4) {System.out.println("3등");} //중복숫자의 값이 4이면 3등 출력
		else if (중복숫자==3) {System.out.println("4등");} //중복숫자의 값이 3이면 4등 출력
		else {System.out.println("꽝");} // 그 외에는 꽝 출력
		
	}
}

