package part2_03_07_5;

import java.util.Scanner;


public class 회원제도서프로그램_클래스버전5 {
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
		
		// Time :49:52
		// 문제점
	
	static Scanner scanner = new Scanner(System.in); //모든 클래스에서 사용하는  입력객체 로드
	static Member5[] members = new Member5[100]; // 모든 클래스에서 사용하는 회원목록 배열
	static Book5[] books = new Book5[100];//모든 클래스에서 사용하는  책 목록 배열 
	
	
	public static void main(String[] args) {
		회원제도서프로그램_클래스버전5 app = new 회원제도서프로그램_클래스버전5(); // 회원용 도서프로그램 불러오기
		app.menu();// 메뉴 불러오기
	}
	
	
	void membermenu(String loginid) { // 로그인한 id 인자 사용
		while(true) {//무한루프 시작
		System.out.println("------ 회원 메뉴 ------"); //회원메뉴 출력
		System.out.print("1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃  선택: "); //선택메뉴 출력
		int ch = scanner.nextInt(); // 선택값 입력
			Book5 book5 = new Book5(); // 빈 생성자로 객체 생성
		if (ch==1) {book5.도서검색();}//1번선택  book 클래스 도서검색 메뉴 로드
		else if (ch==2) {book5.도서목록();} //book 클래스 도서목록 메뉴 로드
		else if (ch==3) {book5.도서대여(loginid);}//book 클래스 도서대여 메뉴 로드(로그인한 id대입한)
		else if (ch==4) {book5.도서반납(loginid);}//book 클래스 도서반납 메뉴 로드(로그인한 id대입한)
		else if (ch==5) {return;} // 로그아웃시 반환 
		else {System.out.println(" 알수없는 입력 입니다.");} // 외 값 입력시 출력
		}
	}

	void adminmenu() {//관리자용 메뉴 설정
		while(true) {//무한루프 시작
			System.out.println("------ 관리자 메뉴 ------");//관리자메뉴 불러오기
			
			System.out.print("1.도서등록 2.도서목록 3.도서삭제 5.로그아웃  선택 :"); //메뉴 출력
			int ch = scanner.nextInt(); // 선택용 갑 입력
				Book5 book5 = new Book5(); // 배열 불러오기
			if (ch==1) {book5.도서등록();} // 1번선택시 책 배열 도서등록 메뉴 로드,진행
			else if (ch==2) {book5.도서목록();}// 1번선택시 책 배열 도서목록 메뉴 로드,진행
			else if (ch==3) {book5.도서삭제();}// 1번선택시 책 배열 도서삭제 메뉴 로드,진행
			else if (ch==4) {return;}//로그아웃시 반환
			else {System.out.println(" 알수없는 입력 입니다.");} // 외 값 입력시 출력
		}
	}
	
	
	void menu(){
		while(true) { // 무한루프 [ 종료조건 없음]
			
			System.out.println("=========== 도서 대여 프로그램 ========");
			System.out.println("1.회원가입 , 2.로그인 , 3.아이디찾기 , 4.비밀번호찾기"); //선택창 출력
			int ch= scanner.nextInt(); // 선택용 값 입력
			Member5 member5 = new Member5(); // 멤버 배열 불러오기
			if(ch==1) { //1번선택
				// 회원가입 메소드 호출
				boolean result = member5.회원가입(); // 회원가입 메소드 호출
				if(result) System.err.println("알림) 회원가입 성공"); // 결과(회원가입 리턴값) 있을 시 회원가입 성공
				else System.err.println("알림)) 회원가입 실패"); //아니면 실패
				
			}
			else if(ch==2) {
				String result = member5.로그인(); // 로그인 메소드 실행
				
				if(result ==null) { //반환값이 null 이면
					System.err.println("알림) 동일한 회원 정보가 없습니다."); //불일치 회원정보 출력
				}
				else if(result.equals("admin")) { // 관리자 id  입력시

					System.out.println("\n 관리자접속"); //관리자용 안내 출력
					adminmenu(); // 관리자용 메뉴 불러오기
				}
				else {//그외

					System.out.println("\n 안녕하세요"); //인사 출력
					membermenu( result); // 회원에 로그인 리턴값 입력
				}
//				member.로그인();
				//로그인 메소드 호출
					//1. 일반 회원 메뉴 메소드 호출
					//2. 관리자 메뉴 메소드 호출
			}
			else if(ch==3) {
				member5.아이디찾기(); // 아이디 찾기 메소드 실행
				//아이디찾기 메소드 호출
			}
			else if(ch==4) {
				member5.비밀번호찾기(); // 비밀번호 메소드 실행
				//비밀번호찾기 메소드 호출
			}
			else {}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
