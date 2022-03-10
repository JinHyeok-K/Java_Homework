package Day07;

import java.util.Scanner;

public class Day07_05_BookApplication { //class end
	
	// BookApplication 클래스: 입&출력 관련 코드
	// Book 클래스: 도서 관련 코드
	// Member 클래스: 회원 관련 코드
	
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
		// 지역변수 : { 변수 선언 } 괄호 내에서 선언된 변수는 { } 밖을 못 나감
			// 서로 다른 중괄호{ } 에서 사용시 -> 전역변수
		// static : 프로그램 시작 시 메모리 할당 | 프로그램 종료 시 메모리 초기화
			// 프로그램 전반적으로 모든 곳에 사용 되는 메모리[변수]
	
	static Scanner scanner = new Scanner(System.in);
	static Member[] members = new Member[100]; // 모든 클래스에서 사용하는 회원목록 배열
	static Book[] books = new Book[1000];
	
	// 0. 코드를 읽어주는 시작 메소드 [ 스레드 ]
	public static void main(String[] args) { //main start
		
		// 메소드 호출
			// 1. 내부 호출
//		menu(); // 내부 호출 불가능  
				// static : 메모리 우선 할당이기 때문에 static 외 메소드, 필드 못 읽음
				// main 메소드 static 메소드 이기 때문에 static 메소드만 내부 호출 가능
			// 2. 외부 호출
				// 1. 객체 생성(메모리 할당) -> 메소드 호출
		Day07_05_BookApplication application = new Day07_05_BookApplication();
		application.menu();
	}//main end
	
	// 1. 초기 메뉴 메소드
	void menu(){
		while(true) { // 무한루프 [ 종료조건 없음]
			
			System.out.println("=========== 도서 대여 프로그램 ========");
			System.out.println("1.회원가입 , 2.로그인 , 3.아이디찾기 , 4.비밀번호찾기");
			int ch= scanner.nextInt();
			Member member = new Member(); // 1~4 {} 에서 사용하려고
			if(ch==1) {
				// 회원가입 메소드 호출
				boolean result = member.회원가입(); // 회원가입 메소드 호출
				if(result) System.err.println("알림) 회원가입 성공");
				else System.err.println("알림)) 회원가입 실패");
				
			}
			else if(ch==2) {
				String result = member.로그인(); //
				
				if(result ==null) {
					System.err.println("알림) 동일한 회원 정보가 없습니다.");
				}
				else if(result.equals("admin")) {
					// 2. 관리자 메뉴 메소드 호출
					System.out.println("\n 안녕하세요 관리자님");
					adminmenu();
				}
				else {
					// 1. 일반 메뉴 메소드 호출
					System.out.println("\n 안녕하세요"+result+"님");
					membermenu( result);
				}
//				member.로그인();
				//로그인 메소드 호출
					//1. 일반 회원 메뉴 메소드 호출
					//2. 관리자 메뉴 메소드 호출
			}
			else if(ch==3) {
				member.아이디찾기();
				//아이디찾기 메소드 호출
			}
			else if(ch==4) {
				member.비밀번호찾기();
				//비밀번호찾기 메소드 호출
			}
			else {}
		}
		
	}
	
	// 2. 일반 회원 메뉴 메소드
		void membermenu(String loginid) { // 인수의 변수형은 달라도 되지만 자료형 동일
			while(true) {
			System.out.println("------ 회원 메뉴 ------");
			System.out.print("1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃  선택: ");
			int ch = scanner.nextInt();
				Book book = new Book(); // 빈 생성자로 객체 => 메소드 호출용
			if (ch==1) {book.도서검색();}
			else if (ch==2) {book.도서목록();}
			else if (ch==3) {book.도서대출(loginid);}
			else if (ch==4) {book.도서반납();}
			else if (ch==5) {return;}
			else {System.out.println(" 알수없는 입력 입니다.");}
			}
		}
	// 3. 관리자 메뉴 메소드
		void adminmenu() {
			while(true) {
				System.out.println("------ 관리자 메뉴 ------");
				
				System.out.print("1.도서등록 2.도서목록 3.도서삭제 5.로그아웃  선택 :");
				int ch = scanner.nextInt();
					Book book = new Book();
				if (ch==1) {book.도서등록();}
				else if (ch==2) {book.도서목록();}
				else if (ch==3) {book.도서삭제();}
				else if (ch==4) {return;}
				else {System.out.println(" 알수없는 입력 입니다.");}
			}
		}
	}//class end
