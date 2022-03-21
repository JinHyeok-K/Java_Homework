package part2_03_07_5;

import java.util.Scanner;

public class 회원제도서프로그램_클래스버전2 {
	// BookApplication 클래스 : 입출력 관련코드
		// Book 클래스 : 도서 관련 코드 
		// Member 클래스 : 회원 관련 코드 
		
		// * 도서 대여 console 프로그램[ 클래스버전 ]
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
		
		// * main 밖에 변수를 선언하는 이유 : 모든 메소드에서 사용하기 위해서 
			// 지역변수  :  { 변수선언 } 괄호내에서 선언된 변수는 { } 밖을 못나감
				// 서로 다른 { } 괄호 내에서 사용시 -> 전역변수 
			// static  : 프로그램 시작시 메모리 할당 / 프로그램 종료시 메모리 초기화
				// 프로그램 전반적으로 모든곳에 사용되는 메모리[변수]
		
		// Time 51:00
		// 문제점
	static Scanner scanner = new Scanner(System.in);
	static Member2[] member2 = new Member2[100];
	static Book2[] book2= new Book2[100];
	
	public static void main(String[] args) {
		
		회원제도서프로그램_클래스버전2 app = new 회원제도서프로그램_클래스버전2();
		app.menu();
	}
	
	void menu() {
		while(true) {
	
			System.out.println("도서 대여 프로그램");
			System.out.println(" [ 1.회원가입 , 2.로그인 , 3.아이디찾기 , 4.비밀번호찾기  ]");
			int ch =scanner.nextInt();
			Member2 member2 = new Member2();
			if(ch==1) {
				
				boolean result = member2.회원가입();
				if(result)
					System.out.println("회원가입 성공");
				else
					System.out.println("회원가입 실패");
			}	
			else if(ch==2) {
				String result = member2.로그인();
				if(result == null) {
					System.out.println("로그인 실패");
				}
				else if(result.equals("admin")) {
					System.out.println("관리자 접속");
					adminmenu();
				}
				else
					System.out.println("어서오세요");
					membermenu(result);
			}
			else if(ch==3) {
				member2.아이디찾기();
			}	
			else if(ch==4) {
				member2.비밀번호찾기();
			}
			else {System.out.println("뭐 누름?");}
			
		}
	}
	
	
	void membermenu(String loginid) {
		while(true) {
			System.out.println("회원메뉴");
			System.out.println("1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃 ");
			int ch= scanner.nextInt();
			Book2 book2 = new Book2();
			if(ch==1) {book2.도서검색();}
			else if(ch==2) {book2.도서목록(); }
			else if(ch==3) { book2.도서대여(loginid);}
			else if(ch==4) { book2.도서반납(loginid);}
			else if(ch==5) { return;}
			else {System.out.println("뭘 누른거야?");}
		}
	}
	void adminmenu() {
		while(true) {
			System.out.println("관리자메뉴");
			System.out.println("1.도서등록 2.도서목록 3.도서삭제 4.로그아웃 ");
			int ch= scanner.nextInt();
			Book2 book2 = new Book2();
			if(ch==1) {book2.도서등록();}
			else if(ch==2) {book2.도서목록(); }
			else if(ch==3) { book2.도서삭제();}
			else if(ch==4) { return;}
			
			else {System.out.println("뭘 누른거야?");}
		}
	}
	
	
	
	
	
	
	
	
}
