package Homework04_Day04_키오스크;

import java.util.Scanner;
/*
 * - 프로그램 코드 작성 시 제출 방법
    1. 5회 이상 완성하기  ((   걸린시간 / 참고횟수[ 모범코드를 본 횟수 ] )))
    2. 모든 줄 주석처리 [ 모든 줄마다 자신이 생각하는 설명 적기 ] 
    3. 질문 만들어오기 [ 프로그램 작성시 궁금한 점 만들기 ]
    4. 녹화[ 코드작성하는 화면을 화면캡쳐하기 ]
    - 1~4번 과정을 다 한 후에 itdanja@kakao.com 에 파일로 제출 혹은 git에 올린후에 git 주소 제출
 */
public class 키오스크_7 { // time: [10:49]  // | 참고횟수 0회
	// 자판기 프로그램 [10min]
	// 1. 메뉴판 [ 1. 콜라(300) 2.환타(200) 3.사이다(100) 4.결제 ]
	// 			// 1. 메뉴판에서 제품 선택하면 장바구니에 넣기
	//			// 2. 재고가 부족하면 알림( 재고 부족 )
	// 2. 초기 재고 [ 제품당 10개 씩 ]
	// 3. 결제 시 금액을 입력 받아 결제액 만큼 차감 후 잔돈 출력
			// 1. 투입한 금액보다 결제액(구매액)이 크면 결제 취소 [ 금액 부족 ]
	//문제점 : 변수들 입력 미스
	//		 if사용시 괄호 미스(특히 else시)
	public static void main(String[] args) { // Main thread 시작
		Scanner scanner = new Scanner(System.in); // 입력 객체 불러옴  line 3. import 시킴 
		
		//Q.)스캐너 객체 load => Resource leak: 'scanner' is never closed 발생 이유 & 해결 방법?
		//   syso, 자동완석 시 => System.out.println(); 출력하는데 System.err.println(); 의 자동완성은? 
		// 
		
		int 콜라구매=0; int 환타구매=0; int 사이다구매=0;        	//상품(변수) 구매 수량 초기화(정수형 선언) 
		int 콜라재고=10; int 환타재고=10; int 사이다재고=10;			//상품(변수) 재고 초기화(정수형 선언) 
		int 콜라가격=300; int 환타가격=200; int 사이다가격=100;		//상품(변수) 가격 초기화(정수형 선언)
		int 입금금액=0; int 결제금액= 0; int 잔액= 0;				//결제 시 사용될 변수 초기화(정수형 선언)
		
		while(true) { // Main 무한루프 시작 [ 종료조건 : 없음 ] :
			System.out.println("자판기"); 			// 콘솔창에 [자판기] 출력
			System.out.println("1.음료 2. 결제");		// 콘솔창에 [1.음료 2.결제] 출력
			System.out.print("선택 :"); int 선택 = scanner.nextInt(); // 콘솔창에 [선택 : ] 출력 | 선택이라는 정수형 변수에 입력값 대입
			while(true) { // sub 무한루프 시작 [종료조건 :  뒤로 선택시 Master 무한루프로 돌아감 ]
				if (선택==1) { // 선택 변수(이하 선택) 의 값이 1일 때, (초기메뉴에서 음료  선택)
					System.out.println("1.콜라 2.환타 3.사이다 4.뒤로"); //  콘솔창에 [ 1.콜라 2.환타 3.사이다 4.뒤로 ] 출력
					System.out.print("음료 선택 : "); int 음료선택 = scanner.nextInt(); // 
					//콘솔창에 [ 음료 선택 : ] 출력 | 음료선택이란 변수에 입력값 대입(정수형)
					if(음료선택==1) { // 음료선택을 1번을 할 때,
						if(콜라재고==0) { // 콜라재고가 0이라면
							System.err.println("재고가 없습니다."); //재고가 없다는 에러 메세지 출력 (강조를 위해서 에러창으로 표시)
						}
						else { // 콜라재고가 0이 아니면
							콜라구매++; // 콜라 구매 수량 1 (초기값 0개 => 1개) : 한번씩 입력시
							콜라재고--; // 콜라 재고 수량 1 (초기값 10개 => 9개) : 한번씩 입력시
							System.err.println("콜라를 담았습니다."); // 콜라를 담았다는 메세지 출력 (강조를 위해서 에러창으로 표시)
						}
							
					}
					else if(음료선택==2) { // 음료선택을 2번을 할 때,
						if(환타재고==0) { // 환타재고가 0이라면
							System.err.println("재고가 없습니다."); //재고가 없다는 에러 메세지 출력 (강조를 위해서 에러창으로 표시)
						}
						else { // 환타재고가 0이 아니면
							환타구매++; // 환타 구매 수량 1 (초기값 0개 => 1개) : 한번씩 입력시
							환타재고--; // 환타 재고 수량 1 (초기값 10개 => 9개) : 한번씩 입력시
							System.err.println("환타를 담았습니다.");// 환타를 담았다는 메세지 출력 (강조를 위해서 에러창으로 표시)
						}
					}
					else if(음료선택==3) {// 음료선택을 3번을 할 때,
						
						if(사이다재고==0) {//사이다재고가 0이 아니면
						System.err.println("재고가 없습니다."); //재고가 없다는 에러 메세지 출력 (강조를 위해서 에러창으로 표시)
					}
					else {// 사이다재고가 0이 아니면
						사이다구매++;// 사이다 구매 수량 1 (초기값 0개 => 1개) : 한번씩 입력시
						사이다재고--;// 사이다 재고 수량 1 (초기값 10개 => 9개) : 한번씩 입력시
						System.err.println("사이다를 담았습니다.");// 사이다를 담았다는 메세지 출력 (강조를 위해서 에러창으로 표시)
					}}
					else if(음료선택==4) {break;}// 맨 처음 메뉴로 돌아감 (1. 음료 2결제)
					else {System.out.println("잘못된 입력입니다.");} // 1~4번 외 키를 입력시 잘못된 입력이라는 출력 표시
				}
				else if (선택==2) { // 선택 변수(이하 선택) 의 값이 2일 때,(초기메뉴에서 결제  선택)
					결제금액 = 콜라구매*콜라가격+환타구매*환타가격+사이다가격*사이다구매; // 결제금액이라는 변수에 총 결제할 금액을 대입(총 결제할 금액은 선택한 각 음료수의 수(구매)와 가격의 곱의 합)
					
					System.out.println("결제 메뉴"); // 결제메뉴 출력
					System.out.println("1.입금 2.결제 3.취소 4.뒤로"); // 1.입금 2.결제 3.취소 4.뒤로 출력 
					System.out.print("선택 :"); int 결제선택 = scanner.nextInt(); // 선택 : 출력 | 결제선택이란 변수에 입력값 대입(정수형)
					
					if (결제선택==1) { // 결제선택이라는 변수(이하 결제선택)의 값이 1이라면
						System.out.print("입금 금액 :"); int 입금액 = scanner.nextInt(); //입금 금액 : 출력 | 입금액이라는 정수형 변수에 입력값 대입
						입금금액 = 입금금액+입금액; // 입금금액 변수 값 재설정 -> 입금금액에 입력한 입금액을 더하여 입금금액에 대입
								System.err.println(입금금액+ " 원 입금하였습니다."); // 입금금액의 값+ "원을 입금하였습니다. " 출력 (강조를 위해서 에러창으로 표시)
					}
					else if(결제선택==2){// 결제선택의 값이 2이라면
						if(결제금액==0) { // 결제금액의 값이 0과 같으면,
							System.err.println("결제할 상품이 없습니다."); // 결제할 상품이 없다는 에러메세지 출력 (강조를 위해서 에러창으로 표시)
						}
						else if(결제금액>입금금액) { //결제 금액의 값이 입금금액의 값보다 크다면
							System.err.println("결제할 금액이 부족합니다."); // 결제할 금액이 부족하다는 에러메세지 출력 (강조를 위해서 에러창으로 표시)
						}
						else { //그 외라면
							사이다구매=0; 콜라구매=0; 환타구매=0; //결제가 진행되는것이므로 장바구니에 담겨있는 구매수량 0으로 초기화 -> 구입해간것으로 정의 
							잔액 = 입금금액 -결제금액; // 잔액의 값은 입금금액의 값 에 결제한 금액의 차의 나머지
						System.err.println("결제가 완료되었습니다. 잔액은"+ 잔액+ " 원입니다.");} // 결제가 완료되었습니다 잔액은 xx 원입니다 출력 (강조를 위해서 에러창으로 표시)
					}
					else if(결제선택==3){ // 결제선택값이 3이라면
						System.err.println("상품 구매를 취소합니다."); //상품구매 취소 출록 (강조를 위해서 에러창으로 표시)
						콜라재고 += 콜라구매; 환타재고 += 환타구매; 사이다재고 += 사이다구매; // 장바구니에 담아놨던 상품들을 초기화(변수초기화), 재고는 구매수량을 더하면 총 재고가 됨 
					}
					else if(결제선택==4){break;} // 4번 선택시 초기메뉴 진입
					else {System.err.println("잘못된 입력입니다.");} // 1~4 값 외 입력 시 잘못된 입력 출력
				}
				else {System.err.println("잘못된 입력입니다.");} // 1~2 값 외 입력 시 잘못된 입력 출력
			} // Sub 무한루프 end
			
		} // Main 무한루프 end
	} // main thread end	
} // class end

