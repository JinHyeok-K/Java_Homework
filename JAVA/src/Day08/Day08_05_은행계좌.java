package Day08;


import java.util.Scanner;

public class Day08_05_은행계좌 {

	// 계좌(모바일) 프로그램
		// 요구사항
		// 회원 주요기능 : 1. 회원가입 2.로그인 3. 아이디 찾기 4. 비밀번호찾기(변경)
		// 계좌 주요기능 : 1. 계좌생성 2.입금 3.출금 4.이체 5.대출 6. 계좌목록
		// 설계 : 통장, 대출상품(관리자), 회원
			// 필드
			// 메소드
	/*
	 * 회원 필드 :1. 회원가입 2.로그인 3. 아이디 찾기 4. 비밀번호찾기(변경)

		계좌 필드 :1. 계좌 생성 2.입금 3.출금 4.이체 5.대출 6. 계좌목록
		계좌 생성 필드 : 회원 이름 / 비밀번호
	    이체 필드 : 보내는 사람 /비밀번호/받는사람/받는사람계좌  	
		대출 : 대출회원 / 대출금액
		
 
	 */
 	static Scanner scanner = new Scanner(System.in);
 	static Member[] members = new Member[100];
 	static Address[] addsess= new Address[100];
 	
 	
 	
 	public static void main(String[] args) {
		
 		Day08_05_은행계좌 application = new Day08_05_은행계좌();
 		application.menu();
 	}	
	
 	// 1. 초기 메뉴 메소드
	void menu() {
		while( true) { // 무한루프 [ 종료조건 없음 ]
			System.out.println("1. 회원가입 2.로그인 3. 아이디 찾기 4. 비밀번호찾기(변경)");
			int ch = scanner.nextInt();
			Member member = new Member(); // 1~4 {}괄호에서 사용 가능
			if( ch == 1 ) {
				
				boolean result =  member.회원가입();// 회원가입 메소드 호출 
				if( result ) 
					System.err.println(" 알림]] 회원가입 성공 ");
//					System.out.println(" 귀하의 계좌번호는 "+ me +"입니다");
				else 
					System.err.println(" 알림]] 회원가입 실패");
				
			} 
			else if( ch ==2 ) {
				String result = member.로그인(); // 로그인 메소드 호출 
				
				if( result == null ) { // 로그인실패 
					System.out.println(" 알림]] 동일한 회원정보가 없습니다.");
//				}else if( result.equals("admin")) { // 관리자
//					// 2. 관리자 메뉴 메소드 호출 
//					System.out.println(" 알림]] 안녕하세요~ "+result+"님");
//					adminmenu(); // 내부 메소드 호출
				}else{ // 일반 
					// 1. 일반회원 메뉴 메소드 호출
					System.out.println(" 알림]] 안녕하세요~ "+result+"님");
					membermenu( result ); // 인수1개 [ 로그인 성공한 id ] 
				}
			}
//			else if( ch ==3 ) {
//				member.아이디찾기();// 아이디 찾기 메소드 호출 
//			}
//			else if( ch ==4 ) {
//				member.비밀번호찾기(); // 비밀번호 찾기 메소드 소출 
//			}
			else { System.err.println(" 알림]] 알수 없는 번호입니다. "); }
			
		}
	} // menu end 
	
	// 2. 일반회원 메뉴 메소드
	void membermenu( String loginid ) { // 인수 변수명은 달라도 되지만 자료형 동일 
		while(true) {
			System.out.println(" --------------- 회원 메뉴 ------------------");
			System.out.print("1.입금 2.출금 3.이체 4.대출 5.계좌목록 6.로그아웃");
			int ch = scanner.nextInt();
				Address address = new Address(); // 빈생성자로 객체 => 메소드 호출용
			if( ch == 1 ) 		{ address.입금(loginid); }
			else if( ch ==2 ) 	{ address.출금(loginid); }
			else if( ch == 3 ) 	{ address.이체( loginid ); }
			else if( ch == 4 ) 	{ address.대출( loginid ); }
//			else if( ch == 5 ) 	{ address.계좌목록( loginid ); }
			else if( ch == 6 ) 	{ return; } // 일반회원메뉴 메소드 종료 [ 로그아웃 ] 
//			else { System.err.println(" 알림]] 알수 없는 번호입니다. "); }
		}
	} // 일반회원 메뉴 종료 
	// 3. 관리자 메뉴 메소드 
//	void adminmenu() {
//		while(true) {
//			System.out.println(" --------------- 관리자 메뉴 ------------------");
//			System.out.print("1.도서등록 2.도서목록 3.도서삭제 4.로그아웃 선택 : ");
//			int ch = scanner.nextInt();
//				Book book = new Book();
//			if( ch == 1 ) 		{ book.도서등록(); }
//			else if( ch == 2 ) 	{ book.도서목록(); }
//			else if( ch == 3 ) 	{ book.도서삭제(); }
//			else if( ch == 4 ) 	{ return; }		// 관리자메뉴 메소드 종료 
//			else { System.err.println(" 알림]] 알수 없는 번호입니다. "); }
//		}
//	}
	
 	
 	
 	
}
