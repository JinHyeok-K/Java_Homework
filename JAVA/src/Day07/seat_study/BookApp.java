package Day07.seat_study;

import java.util.Scanner;

public class BookApp { // class start | 화면 설계 Class



	// 1. 클래스 설계 
			// 1. book
				// 필드 : ISBN(도서번호) , 도서명 , 작가 , 도서대여여부 , 대여회원
				// 메소드 : 1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.도서등록 6.도서삭제
			// 2. member
				// 필드 : 번호,아이디,비밀번호,이름,연락처
				// 메소드 : 1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
		// 2. 화면 설계 
			// 1. 초기 메뉴 [ 1.회원가입 , 2.로그인 , 3.아이디찾기 , 4.비밀번호찾기  ]
			// 2. 일반회원메뉴 [ 1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃 ]
			// 3. 관리자메뉴  [ 1.도서등록 2.도서목록 3.도서삭제 4.순위(도전) 5.로그아웃
	// =====================================================================
	
	static Scanner scanner = new Scanner(System.in);
	static Member[] members = new Member[100];
	static Book[] books = new Book[100];
	
	public static void main(String[] args) { // main start
		
		BookApp app = new BookApp();
		app.menu();
		
	}// main end
	
	// 1. 초기 메뉴 메소드
	void menu() {
		while(true) {
			System.out.println(" ----- Book App -----");
			System.out.print("1.회원가입 2.로그인 3.ID찾기 4.PW찾기");
			
			int ch = scanner.nextInt();
			if(ch==1) {
				
			}
			else if(ch==2){
				
			}
			else if(ch==3){
				
			}
			else if(ch==4){
				
			}
			else System.out.println("잘못된 입력");
		}
	}
	// 2. 일반회원 메뉴 메소드
	void membermenu() {
		while(true) {
			System.out.println(" ----- 회원 메뉴 -----");
			System.out.println("1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃");
			
			int ch = scanner.nextInt();
			if(ch==1) {
				
			}
			else if(ch==2){
				
			}
			else if(ch==3){
				
			}
			else if(ch==4){
				
			}
			else System.out.println("잘못된 입력");
		}
	}
	
		
	// 3. 관리자 메뉴 메소드
	void adminmenu() {
		while(true) {
			System.out.println(" ----- 관리자 메뉴 -----");
			System.out.println("1.도서등록 2.도서목록 3.도서삭제 4.순위(도전) 5.로그아웃");
			
			int ch = scanner.nextInt();
			if(ch==1) {
				
			}
			else if(ch==2){
				
			}
			else if(ch==3){
				
			}
			else if(ch==4){
				
			}
			else System.out.println("잘못된 입력");
		}
	}
} // class end


