package Day04;

import java.util.Scanner;

public class 키오스크7 { // 10:49
	// 자판기 프로그램 [10min]
	// 1. 메뉴판 [ 1. 콜라(300) 2.환타(200) 3.사이다(100) 4.결제 ]
	// 			// 1. 메뉴판에서 제품 선택하면 장바구니에 넣기
	//			// 2. 재고가 부족하면 알림( 재고 부족 )
	// 2. 초기 재고 [ 제품당 10개 씩 ]
	// 3. 결제 시 금액을 입력 받아 결제액 만큼 차감 후 잔돈 출력
			// 1. 투입한 금액보다 결제액(구매액)이 크면 결제 취소 [ 금액 부족 ]
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int 콜라구매=0; int 환타구매=0; int 사이다구매=0;
		int 콜라재고=10; int 환타재고=10; int 사이다재고=10;
		int 콜라가격=300; int 환타가격=200; int 사이다가격=100;
		int 입금금액=0; int 결제금액= 0; int 잔액= 0;
		
		while(true) {
			System.out.println("자판기");
			System.out.println("1.음료 2. 결제");
			System.out.print("선택 :"); int 선택 = scanner.nextInt();
			while(true) {
				if (선택==1) {
					System.out.println("1.콜라 2.환타 3.사이다 4.뒤로");
					System.out.print("음료 선택 : "); int 음료선택 = scanner.nextInt();
					
					if(음료선택==1) {
						if(콜라재고==0) {
							System.err.println("재고가 없습니다.");
						}
						else {
							콜라구매++;
							콜라재고--;
							System.err.println("콜라를 담았습니다.");
						}
							
					}
					else if(음료선택==2) {
						if(환타재고==0) {
							System.err.println("재고가 없습니다.");
						}
						else {
							환타구매++;
							환타재고--;
							System.err.println("환타를 담았습니다.");
						}
					}
					else if(음료선택==3) 
						{if(사이다재고==0) {
						System.err.println("재고가 없습니다.");
					}
					else {
						사이다구매++;
						사이다재고--;
						System.err.println("사이다를 담았습니다.");
					}}
					else if(음료선택==4) {break;}
					else {System.out.println("잘못된 입력입니다.");}
				}
				else if (선택==2) {
					결제금액 = 콜라구매*콜라가격+환타구매*환타가격+사이다가격*사이다구매;
					System.out.println("결제 메뉴");
					System.out.println("1.입금 2.결제 3.취소 4.뒤로");
					System.out.print("선택 :"); int 결제선택 = scanner.nextInt();
					
					if (결제선택==1) {
						System.out.print("입금 금액 :"); int 입금액 = scanner.nextInt();
						입금금액 = 입금금액+입금액;
								System.err.println(입금금액+ " 원 입금하였습니다.");
					}
					else if(결제선택==2){
						if(결제금액==0) {
							System.err.println("결제할 상품이 없습니다.");
						}
						else if(결제금액>0) {
							System.err.println("결제할 금액이 부족합니다.");
						}
						else
							사이다구매=0; 콜라구매=0; 환타구매=0;
							잔액 = 입금금액 -결제금액;
						System.err.println("결제가 완료되었습니다. 잔액은"+ 잔액+ " 원입니다.");
					}
					else if(결제선택==3){
						System.err.println("상품 구매를 취소합니다.");
						콜라재고 += 콜라구매; 환타재고 += 환타구매; 사이다재고 += 사이다구매;
					}
					else if(결제선택==4){break;}
					else {System.err.println("잘못된 입력입니다.");}
				}
				else {System.err.println("잘못된 입력입니다.");}
			}
			
		}
	}

}

