package part2_03_07_5;

public class Book3 {
	// 1. book
	// 필드 : ISBN(도서번호) , 도서명 , 작가 , 도서대여여부 , 대여회원 O
	// 메소드 : 1.도서검색 2.도서목록 3.도서대여 4.도서대여목록 5.도서반납 6.도서등록  7.도서삭제

	
	String isbn;
	String 도서명;
	String 작가;
	boolean 도서대여여부;
	String 대여회원;
	
	public Book3() {
	
	}

	public Book3(String isbn, String 도서명, String 작가, boolean 도서대여여부, String 대여회원) {
		super();
		this.isbn = isbn;
		this.도서명 = 도서명;
		this.작가 = 작가;
		this.도서대여여부 = 도서대여여부;
		this.대여회원 = 대여회원;
	}
	
	void 도서검색() {
		System.out.println("도서검색 페이지");
	}
	void 도서목록() {
		System.out.println("도서목록 페이지");
		System.out.println("ISBN\t도서명\t작가\t대여가능여부");
		for(Book3 temp : 회원제도서프로그램_클래스버전3.book3) {
			if(temp!=null) {
				if(temp.도서대여여부)
					System.out.println(temp.isbn+"\t"+temp.도서명+"\t"+temp.작가+"\t"+"대여가능");
				else
					System.out.println(temp.isbn+"\t"+temp.도서명+"\t"+temp.작가+"\t"+"대여중");
			}
		}
		
	}
	
	void 도서대여(String loginid) {
		System.out.println("도서대여 페이지");
		System.out.println("도서 ISBN : ");  String isbn = 회원제도서프로그램_클래스버전3.scanner.next();
		
		int i =0;
		for(Book3 temp : 회원제도서프로그램_클래스버전3.book3) {
			if (temp!=null && temp.isbn.equals(isbn)) {
				if(temp.도서대여여부) {
					System.out.println("해당 도서를 대여 합니다.");
					회원제도서프로그램_클래스버전3.book3[i].도서대여여부 = false;
					회원제도서프로그램_클래스버전3.book3[i].대여회원 = loginid;
					return;
				}
				else {
					System.out.println("대여중인 도서");
					return;}
			}
		}
		System.out.println(" 일치하는 isbn 없음");
	}
	void 도서대여목록(String loginid) {
		System.out.println("도서목록 페이지");
		System.out.println("ISBN\t도서명\t작가\t대여가능여부");
		for(Book3 temp: 회원제도서프로그램_클래스버전3.book3) {
			if(temp !=null && temp.대여회원.equals(loginid)) {
				System.out.println(temp.isbn+"\t"+temp.도서명+"\t"+temp.작가+"\t"+"대여중");
			}
		}
	}
	void 도서반납(String loginid) {
		System.out.println("도서반납 페이지");
		도서대여목록(loginid);
		System.out.println(" ISBN "); String isbn = 회원제도서프로그램_클래스버전3.scanner.next();
		int i = 0;
		for(Book3 temp : 회원제도서프로그램_클래스버전3.book3) {
			if(temp !=null && temp.isbn.equals(isbn)) {
				if(temp.대여회원.equals(loginid)) {
					if(temp.도서대여여부) {
						System.out.println("대여중 아님");
					}
					else {
						System.out.println("반납 완료");
						회원제도서프로그램_클래스버전3.book3[i].도서대여여부= true;
						회원제도서프로그램_클래스버전3.book3[i].대여회원= null;
					}
				}
			}
			i++;
		}
		System.out.println("동일한 isbn 이 없음");
	}
	void 도서등록() {
		System.out.println(" 도서등록 페이지");
		System.out.print(" ISBN"); String isbn = 회원제도서프로그램_클래스버전3.scanner.next();
		System.out.print(" 도서명"); String 도서명 = 회원제도서프로그램_클래스버전3.scanner.next();
		System.out.print(" 작가"); String 작가 = 회원제도서프로그램_클래스버전3.scanner.next();
		
		for (Book3 temp : 회원제도서프로그램_클래스버전3.book3) {
			if(temp!=null && temp.isbn.equals(isbn)) {
				System.out.println("현재 사용중인 ISBN");
				return;
			}
		}
		
		
		Book3 book3 = new Book3(isbn, 도서명, 작가, true, null);
		
		int i = 0;
		for(Book3 temp : 회원제도서프로그램_클래스버전3.book3) {
			if(temp ==null) {
				회원제도서프로그램_클래스버전3.book3[i]=book3;
				System.out.println("도서등록 완료");
				return;
			}
			i++;
		}
		
	}
	void 도서삭제() {
		System.out.println( "도서 삭제 페이지 ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
