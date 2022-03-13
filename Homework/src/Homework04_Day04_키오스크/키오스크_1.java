package Homework04_Day04_키오스크;

import java.util.Scanner;

public class 키오스크_1 { // time: [30] | 참고횟수 1회
	// 자판기 프로그램 [10min]
		// 1. 메뉴판 [ 1. 콜라(300) 2.환타(200) 3.사이다(100) 4.결제 ]
		// 			// 1. 메뉴판에서 제품 선택하면 장바구니에 넣기
		//			// 2. 재고가 부족하면 알림( 재고 부족 )
		// 2. 초기 재고 [ 제품당 10개 씩 ]
		// 3. 결제 시 금액을 입력 받아 결제액 만큼 차감 후 잔돈 출력
				// 1. 투입한 금액보다 결제액(구매액)이 크면 결제 취소 [ 금액 부족 ]
	// 고칠점 : 간단하게 생각, 설계 미스
	//		  중괄호 관리 제대로 못함
	// 		  
	public static void main(String[] args) {
		
		
		int 콜라재고= 10; int 환타재고= 10; int 사이다재고= 10;
		int 콜라가격=300; int 환타가격=200; int 사이다가격=100;
		int 콜라구매= 0; int 환타구매= 0; int 사이다구매= 0;
		int 입금금액=0; int 결제액=0; int 잔액=0;
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.println(" ==== 메뉴 ====");
			System.out.println(" 1. 음료 선택 2. 결제");
			System.out.print(" 선택 : "); int 메뉴선택 = scanner.nextInt();
			while(true) {
				if(메뉴선택==1) {
					System.out.println(" 구매하실 음료 선택");
					System.out.println("1. 콜라 2.환타 3.사이다 4.뒤로");
					System.out.print(" 선택 : "); int 선택 = scanner.nextInt();
					if (선택 ==1 ) {
						if(콜라재고>=1) {
						콜라재고 = 콜라재고-1;
						콜라구매= 1;
						System.out.println("콜라를 장바구니에 넣었습니다.");
						
						}
						else System.out.println("재고가 없습니다.");
					}
					else if(선택 ==2 ) {
						if(환타재고>=1) {
							환타재고 = 환타재고-1;
							환타구매= 1;
							System.out.println("환타를 장바구니에 넣었습니다.");
							}
						else System.out.println("재고가 없습니다.");
						
					}
					else if(선택 ==3 ) {
						if(사이다재고>=1) {
							사이다재고 = 사이다재고-1;
							사이다구매= 1;
							System.out.println("사이다를 장바구니에 넣었습니다.");
							}
							else System.out.println("재고가 없습니다.");
					}else if(선택 ==4 ) {
						break;
					}
					else System.out.println(" 잘못된 입력입니다. ");
					
				}
			
			
				if(메뉴선택 ==2 ) {
					System.out.println(" 결제 메뉴");
					System.out.println(" 1. 입금 2. 결제");
					System.out.print(" 선택 : "); int select2= scanner.nextInt();
					if (select2 == 1 ) {
						System.out.print(" 입금 금액 :"); int money = scanner.nextInt();
						 입금금액 =  입금금액 + money;
					}
					else if (select2 ==2 ) {
						결제액 = (콜라구매*콜라가격)+(환타구매*환타가격)+(사이다구매*사이다가격);
						
						if(입금금액 >=결제액) {
							
							잔액= 입금금액-결제액; 	
							System.out.println(입금금액);
							System.out.println(결제액);
							System.out.println(잔액);
							System.out.println(" 결제가 완료되었습니다.");
							break;
						}
						else if (입금금액 <결제액) {
							System.out.println("잔액이 부족합니다.");
							
						}
					}
					else {
							결제액 = 0; 입금금액 =0;
							사이다재고 = 사이다재고+사이다구매;
							환타재고 = 환타재고+환타구매;
							콜라재고 = 콜라재고+콜라구매;
							System.out.println(" 장바구니를 비웠습니다.");
							break;
					}
						
					
			}
			}	
			}
		}
		
		
	
	
}
