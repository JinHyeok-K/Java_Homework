package part2_03_07_5;

public class Book5 {
	// 1. book
	// 필드 : ISBN(도서번호) , 도서명 , 작가 , 도서대여여부 , 대여회원 O
	// 메소드 : 1.도서검색 2.도서목록 3.도서대여 4.도서대여목록 5.도서반납 6.도서등록  7.도서삭제
	
	
	
	String isbn; // 필드 설정
	String 도서명;
	String 작가;
	boolean 도서대여여부;
	String 대여회원;
	
	public Book5() {   //생성자 설정
	
	}

	public Book5(String isbn, String 도서명, String 작가, boolean 도서대여여부,String 대여회원) {
		super();
		this.isbn = isbn;
		this.도서명 = 도서명;
		this.작가 = 작가;
		this.도서대여여부 = 도서대여여부;
		this.대여회원 = 대여회원;
	}
	
	void 도서검색() { //도서검색 메소드 실행
		System.out.println( "도서 검색");
	}
	void 도서목록() { //도서목록 메소드 실행
		System.out.println("도서 목록");  //도서목록 및 도서기반 인덱스들 출력
		System.out.println("ISBN\t도서명\t작가\t대여가능여부");
		for(Book5 temp : 회원제도서프로그램_클래스버전5.books) { // 배열 길이만큼 반복문시행
			if(temp!=null) {//temp 값이 null 이 아닐때
				System.out.println(temp.isbn+"\t"+temp.도서명+"\t"+temp.작가+"\t"+"대여가능"); // 각 도서의 isbn 도서명 작가 대여가능여부 출력
			}else {
				System.out.println(temp.isbn+"\t"+temp.도서명+"\t"+temp.작가+"\t"+"대여중");
			}
			
		}
	}
	
	
	void 도서대여(String loginid) { //로그인한 값(인자)을 적용한 도서대여 메소드 시행
		System.out.println("도서대여페이지");
		//도서대여페이지 출력
		System.out.println(" ISBN : "); String ISBN = 회원제도서프로그램_클래스버전4.scanner.next();
		//isbn 입력
		
		int i = 0;//인덱스 설정
		for (Book5 temp :회원제도서프로그램_클래스버전5.books) { //0~ 책 배열 까지 반복
			if(temp!=null && temp.isbn.equals(ISBN)) { // 입력한 isbn 과 배열 내 isbn이 같고
				if(temp.도서대여여부) { 
					System.out.println("해당 도서 대여");
					회원제도서프로그램_클래스버전5.books[i].도서대여여부 =false;  // i번째 도서대여여부는 대여중 설정
					회원제도서프로그램_클래스버전5.books[i].대여회원 = loginid; // i번째 도서의 대여회원은 로그인한 id
					return;//반환
				}
				else {
					System.out.println("대여중"); // 대여중 출력
					return;
				}
			}
			i++;
		}
		
		System.out.println("동일한 ISBN 이 없습니다.");// 위조건 불 만족시
	}
	
	
	void 도서대여목록(String loginid) {//loginid 인자를 사용하는 도서대여목록 메소드 시행
		
		System.out.println("도서목록페이지");
		System.out.println("ISBN\t도서명\t작가\t대여가능여부");
		for(Book5 temp : 회원제도서프로그램_클래스버전5.books) {// 반복문 시행
			if(temp!=null && temp.대여회원.equals(loginid)) {// 대여한 회원과 로그인한 id 의 값이 같으면
				System.out.println(temp.isbn+"\t"+temp.도서명+"\t"+temp.작가+"\t"+"대여중");
				//하기와 같다.(isbn/도서명/작가/대여중
			}
		}
		
		
		
	}
	
	
	
	
	
	void 도서반납(String loginid) { //로그인 아이디 인자 기반 도서반납 메소드 실행
		System.out.println("----- 도서반납 페이지------");
		도서대여목록(loginid); //로그인 아이디가 적용된 도서대여목록 메소드 실행
		System.out.println(" ISBN"); String isbn = 회원제도서프로그램_클래스버전5.scanner.next(); //isbn 입력
		int i =0; // index 설정
		for(Book5 temp : 회원제도서프로그램_클래스버전5.books) { //배열 크기만큼 반복문 시행
			if(temp!=null && temp.isbn.equals(isbn)) { // null이 아니고 isbn,입력한 isbn이 같으면
				if(temp.대여회원.equals(isbn)){ //대여회원의 isbn이
					if(temp.도서대여여부) { //도서 보유시 false 시
						System.out.println("현재 도서 대여중이 아님"); // 대여중 아닌거 출력
					}
					else {
						System.out.println("반납완료"); // 대여중일 시 반납완료 
						회원제도서프로그램_클래스버전5.books[i].도서대여여부 = true; //i번째 배열에 (대여중이었던) 도서대여여부엔 대여가능
						회원제도서프로그램_클래스버전5.books[i].대여회원= null; // 대여회원엔 아무도 안빌린것으로 대입
						return; // 반환
					}
						
				}
				else {
					System.out.println(" 대여한 도서가 아님"); //위 조건 비만족씨 출력
				}
			}
			i++;
		}
		System.out.println("일치하는 isbn 없음"); //입력 isbn과 배열내 isbn 이 없으면 출력
		
	
		
		
	}
	
	
	
	
	
	void 도서등록() {
		
		System.out.println("도서등록페이지");  //도서등록 페이지 시작
		System.out.print("isbn: "); String isbn = 회원제도서프로그램_클래스버전5.scanner.next();
		System.out.print("도서명 :"); String 도서명 = 회원제도서프로그램_클래스버전5.scanner.next();
		System.out.print("작가 :"); String 작가 = 회원제도서프로그램_클래스버전5.scanner.next();
						
		//isbn ,도서명,작가 입력값 입력
		for(Book5 temp : 회원제도서프로그램_클래스버전5.books) { //배열크기만큼 진행
			if(temp !=null && temp.isbn.equals(isbn));// 배열 내  isbn 과 입력 isbn이 같으면
			System.out.println("이미 사용중인 isbn"); //이미 사용되고 있는 isbn 등록 
			return; //실패 
		}
		
		Book5 book5 = new Book5(isbn, 도서명, 작가, true, null); //배열 생성자 생성
		int i =0;  //인덱스 설정
		for(Book5 temp : 회원제도서프로그램_클래스버전5.books) { //배열 크기만큼 반복문 진행
			if(temp==null) {//temp값이 null 이면 책 i번째 배열에 생성된 배열 값 대입
				회원제도서프로그램_클래스버전5.books[i] =book5;
				System.out.println("도서등록 완료"); //도서등록 완료 
				return;
			}
			i++;
		}
		
		
	}
	
	
	
	void 도서삭제() { //도서삭제 페이지 시작
		System.out.println("도서 삭제 페이지");
	}
	
}
