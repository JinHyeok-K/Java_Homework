package Day09;
/* 
 * 	다른 클래스 내 멤버 호출하는 방법
 * 		1. 객체 생성[new] 해서 메소드 호출
 * 		2. static 메소드
 */
import java.util.Scanner;

//은행계좌프로그램(V) < - > 은행컨트롤러(C) < - > 은행(M) 
public class Day09_06_은행계좌프로그램 { // 입,출력
	// 은행계좌프로그램 [상속]
		// 은행[super]
		// 국민은행[sub], 신한은행[sub], 하나은행[sub]
		// 주 기능 : 1. 계좌생성 2. 입금 3. 출금 4.이체 5.내계좌목록 6.대출
	//& ** Main 밖에서 선언하는 이유
		// * 모든 클래스 에서 사용하기 위해 static 배열로 번환
		// static 변수는 프로그램 시작 시 메모리 할당 -> 프로그램 종료시 메모리 

	public static 은행[] 계좌리스트 = new 은행[100];
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) { // 프로그램 무한루프 [종료조건 X]
			
			System.out.println("-------- 계좌 시스템 ---------");
			System.out.println("1.계좌생성 2.입금 3.출금 4.이체 5.계좌목록 6.대출 | 선택 >: ");
			int 선택 = scanner.nextInt();

			은행컨트롤러 컨트롤 = new 은행컨트롤러(); 	// 컨트롤러 메소드 호출용 객체
			if (선택==1) {
				System.out.println("+++ 계좌등록 페이지 +++");
				System.out.println("비밀번호 : "); 	String 비밀번호 = scanner.next();
				System.out.println("계좌주 : ");		String 계좌주 = scanner.next();
				System.out.println("은행선택 : 1.국민 2.신한 3.하나 | 선택 >: ");
					int 은행번호 = scanner.nextInt();
					//컨트롤러 연결
					
				String 계좌번호 = 컨트롤.계좌생성(비밀번호, 계좌주, 은행번호); // 메소드 호출[인수3개]
				// 메소드 반환 저장 = 계좌번호 or null 반환
				// 메소드 실행 후 메시지 출력
				if(계좌번호!=null) { // result 가 true이면
					System.out.println("*** 계좌 생성***");
					System.out.println("고객님의 계좌번호는 : "+계좌번호);
				}else { //result가 false이면 
					System.err.println("알림) 계좌등록 실패 (관리자에게 문의)");
				}
				//	
			}
			else if (선택==2) {
				System.out.println("+++ 입금 페이지 +++");
				System.out.println(" 계좌번호 : " ); String 계좌번호 =scanner.next();
				System.out.println(" 입금액 : " ); int 입금액 =scanner.nextInt();
				boolean result = 컨트롤.입금(계좌번호,입금액);
				if (result == true) {
					System.out.println(" 알림)) 입금 성공");
				}else {
					System.err.println(" 알림)) 입금 실패 (동일한 계좌가 없습니다)");
				}
			}
			else if (선택==3) {
				System.out.println("+++ 출금 페이지 +++");
				System.out.println(" 계좌번호 : "); String 계좌번호 =scanner.next();
				System.out.println(" 비밀번호 : "); String 비밀번호 =scanner.next();
				System.out.println(" 출금액 : ");   int 출금액 = scanner.nextInt();
				
				int result = 컨트롤.출금(계좌번호,비밀번호,출금액);
				
				if(result ==1 ) {
					System.out.println("** 잔액 부족 **");
				}else if(result ==2) {
					System.out.println("** 출금 성공 **");					
				}else if(result ==3) {
					System.out.println("** 올바른 정보가 아닙니다. **");
				}
				
				
			}
			else if (선택==4) {
				System.out.println("+++ 이체 페이지 +++");
				
				System.out.println("보내는 분 계좌 : "); 	String 계좌번호 =scanner.next();
				System.out.println("비밀 번호 "); 			String 비밀번호 =scanner.next();
				System.out.println("이체하실 금액 : ");	 int 입금액 =scanner.nextInt();
				System.out.println("받으시는 분 계좌 : "); String 받는계좌 =scanner.next();
				
				int result =컨트롤.이체(계좌번호, 비밀번호, 입금액,  받는계좌);
				if(result ==1) {
					System.out.println("잔액 부족");
				}else if(result ==2) {
					System.out.println("이체 성공");
				}else if(result ==3) {
					System.out.println("받는 계좌 정보가 없습니다.");
				}else if(result ==4) {
					System.out.println("보내는 계좌 정보가 없습니다.");
				}
				
			}
			else if (선택==5) {
				System.out.println("+++ 계좌목록 페이지 +++");
				System.out.println(" 계좌주 : "); String 계좌주 = scanner.next();
				은행[] 내계좌목록 =컨트롤.계좌목록(계좌주);
				
				System.out.println(" *** 검색한 계좌주 님의 계좌 목록");
				int i = 1;
				for(은행 temp:내계좌목록) {
					if(temp!=null)
					System.out.println(i+"번| 계좌번호 : "+temp.get계좌번호() );
					i++;
				}
				
			}
			else if (선택==6) {
				System.out.println("+++ 대출 페이지 +++");
			}
			else {
				System.err.println("알수없는 입력입니다.");
			}
			
			
			
		}// while 프로그램 end
	
		
	} // main end
}//class end
