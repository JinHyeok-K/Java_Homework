package Day03;

import java.util.Scanner;

public class Day03_07_확인문제 { //  c s
	
	public static void main(String[] args) { // m s 
		
		boolean run =true; // 실행 여부 변수 : true = 실행 | false = 중지
		
		int balance =0; // 예금액 [통장안에 있는 금액] 변수
		
		Scanner scanner = new Scanner(System.in); // 입력객체
		
		while(run) { // while (조건식) { } : 무한루프
			System.out.println("----------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("----------------------");
			System.out.println("선택>"); int 선택 = scanner.nextInt();
			if( 선택 == 1 ) { // 만약에 입력값이 1이면
				System.out.println("예금액 : "); int 예금액 = scanner.nextInt();
				// 입력 받은 예금액을 통장에 추가
				balance += 예금액 ;
			}
			else if ( 선택 == 2 ) {//만약에 입력값이 2이면
				System.out.println("출금액 : "); int 출금액 = scanner.nextInt();
				// 만약에 출금액이 예금액 보다 더 크면 잔액부족
				if (출금액>balance) {
					System.out.println("알림) 잔액이 부족합니다.");
				} // 아니면 출금 실행
				else {balance -= 출금액 ; // 입력 받은 예금액을 통장에 빼기
				}
			}
			else if ( 선택 == 3 ) {//만약에 입력값이 3이면
				System.out.println(" 잔고 : " + balance);
			}
			else if ( 선택 == 4 ) {// 그 외
				break; // while 탈출 [무한 루프 종료]
			}else {System.out.println("알림) 알 수 없는 번호 입니다.");
			}
		}
		
		System.out.println("프로그램 종료");
		
		
	} // m e 

} // c e
