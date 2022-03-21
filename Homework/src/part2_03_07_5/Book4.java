package part2_03_07_5;

public class Book4 {
	// 1. book
	// 필드 : ISBN(도서번호) , 도서명 , 작가 , 도서대여여부 , 대여회원 O
	// 메소드 : 1.도서검색 2.도서목록 3.도서대여 4.도서대여목록 5.도서반납 6.도서등록  7.도서삭제
	String isbn;
	String 도서명;
	String 작가;
	boolean 도서대여여부;
	String 대여회원;
	
	public Book4() {
	
	}

	public Book4(String isbn, String 도서명, String 작가, boolean 도서대여여부,String 대여회원) {
		super();
		this.isbn = isbn;
		this.도서명 = 도서명;
		this.작가 = 작가;
		this.도서대여여부 = 도서대여여부;
		this.대여회원 = 대여회원;
	}
	
	void 도서검색() {
		System.out.println( "도서 검색");
	}
	void 도서목록() {
		System.out.println("도서 목록");
		System.out.println("ISBN\t도서명\t작가\t대여가능여부");
		for(Book4 temp : 회원제도서프로그램_클래스버전4.book4) {
			if(temp!=null) {
				System.out.println(temp.isbn+"\t"+temp.도서명+"\t"+temp.작가+"\t"+"대여가능");
			}else {
				System.out.println(temp.isbn+"\t"+temp.도서명+"\t"+temp.작가+"\t"+"대여중");
			}
			
		}
	}
	void 도서대여(String loginid) {
		System.out.println("도서대여페이지");
		System.out.println(" ISBN : "); String ISBN = 회원제도서프로그램_클래스버전4.scanner.next();
		
		int i = 0;
		for (Book4 temp :회원제도서프로그램_클래스버전4.book4) {
			if(temp!=null && temp.isbn.equals(ISBN)) {
				if(temp.도서대여여부) {
					System.out.println("해당 도서 대여");
					회원제도서프로그램_클래스버전4.book4[i].도서대여여부 =false;
					회원제도서프로그램_클래스버전4.book4[i].대여회원 = loginid;
					return;
				}
				else {
					System.out.println("대여중");
					return;
				}
			}
			i++;
		}
		System.out.println("동일한 ISBN 이 없습니다.");
	}
	void 도서대여목록(String loginid) {
		
		System.out.println("도서목록페이지");
		System.out.println("ISBN\t도서명\t작가\t대여가능여부");
		for(Book4 temp : 회원제도서프로그램_클래스버전4.book4) {
			if(temp!=null && temp.대여회원.equals(loginid)) {
				System.out.println(temp.isbn+"\t"+temp.도서명+"\t"+temp.작가+"\t"+"대여중");
			}
		}
		
		
		
	}
	void 도서반납(String loginid) {
		System.out.println("----- 도서반납 페이지------");
		도서대여목록(loginid);
		System.out.println(" ISBN"); String isbn = 회원제도서프로그램_클래스버전4.scanner.next();
		int i =0;
		for(Book4 temp : 회원제도서프로그램_클래스버전4.book4) {
			if(temp!=null && temp.isbn.equals(isbn)) {
				if(temp.대여회원.equals(isbn)){
					if(temp.도서대여여부) {
						System.out.println("현재 도서 대여중이 아님");
					}
					else {
						System.out.println("반납완료");
						회원제도서프로그램_클래스버전4.book4[i].도서대여여부 = true;
						회원제도서프로그램_클래스버전4.book4[i].대여회원= null;
						return;
					}
						
				}
				else {
					System.out.println(" 대여한 도서가 아님");
				}
			}
			i++;
		}
		System.out.println("일치하는 isbn 없음");
		
		
	}
	void 도서등록() {
		
		System.out.println("도서등록페이지");
		System.out.print("isbn: "); String isbn = 회원제도서프로그램_클래스버전4.scanner.next();
		System.out.print("도서명 :"); String 도서명 = 회원제도서프로그램_클래스버전4.scanner.next();
		System.out.print("작가 :"); String 작가 = 회원제도서프로그램_클래스버전4.scanner.next();
						
		for(Book4 temp : 회원제도서프로그램_클래스버전4.book4) {
			if(temp !=null && temp.isbn.equals(isbn));
			System.out.println("이미 사용중인 isbn");
			return;
		}
		
		Book4 book4 = new Book4(isbn, 도서명, 작가, true, null);
		int i =0;
		for(Book4 temp : 회원제도서프로그램_클래스버전4.book4) {
			if(temp==null) {
				회원제도서프로그램_클래스버전4.book4[i] =book4;
				System.out.println("도서등록 완료");
				return;
			}
			i++;
		}
		
		
	}
	void 도서삭제() {
		System.out.println("도서 삭제 페이지");
	}
	
}
