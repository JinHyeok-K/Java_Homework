package Day07.seat_study;

public class Book {// class start
	/*
	 * 	1. 필드
	 *  	[ ISBN(도서번호) , 도서명 , 작가 , 도서대여여부 , 대여회원 ]
		2. 생성자
		
		3. 메소드
	 *  	[ 1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.도서등록 6.도서삭제 ]
	 * 
	 */
	// 1. 필드
	String ISBN;
	String book;
	String writter;
	boolean rental;
	String rental_ID;
	
	// 2. 생성자
	Book(){}

	public Book(String ISBN, String book, String writter, boolean rental, String rental_ID) {
		ISBN = ISBN;
		this.book = book;
		this.writter = writter;
		this.rental = rental;
		this.rental_ID = rental_ID;
	}
	
	
	// 3. 메소드
		// 1. 도서 검색
	void find_book() {}
		// 2. 도서 목록
	void book_index() {}
		// 3. 도서 대여
	void book_give() {}
		// 4. 도서 반납
	void book_back() {}
		// 5. 도서 등록
	void book_reg() {}
		// 6. 도서 삭제
	void book_del() {}
	
	
	
	
	
}// class end
