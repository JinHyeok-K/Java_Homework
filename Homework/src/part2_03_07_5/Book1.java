package part2_03_07_5;

public class Book1 {
	// 1. 클래스 설계 
				// 1. book
					// 필드 : ISBN(도서번호) , 도서명 , 작가 , 도서대여여부 , 대여회원 O
					// 메소드 : 1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.도서등록 6.도서삭제
	String ISBN;
	String 도서명;
	String 작가;
	boolean 도서대여여부;
	String 대여회원;
	
	public Book1() {
	}

	public Book1(String iSBN, String 도서명, String 작가, boolean 도서대여여부, String 대여회원) {
		super();
		ISBN = iSBN;
		this.도서명 = 도서명;
		this.작가 = 작가;
		this.도서대여여부 = 도서대여여부;
		this.대여회원 = 대여회원;
	}
	
	void 도서검색() {
		System.out.println("------------도서 검색-------------");
		
	}
	//Q ) temp.boolean => true? ) 
	void 도서목록() {
		System.out.println("------------도서 목록-------------");
		System.out.println("ISBN\t도서명\t작가\t도서대여여부");
		for(Book1 temp : 회원제도서프로그램_클래스버전1.books) {
			if(temp!=null) {
				if(temp.도서대여여부) {
					System.out.println(temp.ISBN+"\t"+temp.도서명+"\t"+temp.작가+"\t"+"대여가능");
				}else
					System.out.println(temp.ISBN+"\t"+temp.도서명+"\t"+temp.작가+"\t"+"대여중");
					//Q ) "대여가능 , 대여중을 temp.도서대여여부(boolean)으로 ?
			}
		}
	}
	
	void 도서대여(String loginid) {
		System.out.println("----------도서 대여 --------");
		System.out.println("도서 ISBN "); String isbn = 회원제도서프로그램_클래스버전1.scanner.next();
		int i =0;
		for(Book1 temp : 회원제도서프로그램_클래스버전1.books) {
			if(temp!=null && temp.ISBN.equals(isbn)) {
				if(temp.도서대여여부) {
					System.out.println( " 해당 도서 대여 합니다.");
					회원제도서프로그램_클래스버전1.books[i].도서대여여부 = false;
					회원제도서프로그램_클래스버전1.books[i].대여회원 = loginid;
					break;
				}
				else System.out.println(" 해당 도서를 대여할수 없습니다."); break;
				
			}i++;
		}
		System.out.println(" 동일한 번호의 도서가 없슴");
	}
	
	
	
	void 도서반납(String loginid) {
		 도서대여목록(loginid);
		 System.out.println("ISBN : "); String isbn=회원제도서프로그램_클래스버전1.scanner.next();
		 int i =0;
		 for(Book1 temp : 회원제도서프로그램_클래스버전1.books) {
			 if(temp!=null && temp.ISBN.equals(isbn)) {
				 if(temp.대여회원.equals(loginid)) {
					 if(temp.도서대여여부) {
						 System.out.println(" 대여중이 아닙니다.");
					 }
					 else {
						 System.out.println("반납완료");
						 회원제도서프로그램_클래스버전1.books[i].도서대여여부=true;
						 회원제도서프로그램_클래스버전1.books[i].대여회원=null;
						 break;
					 }
				 }
				 else System.out.println("호갱님이 대여한 도서가 아님미다");
			 }
			 i++;
		 }
		 System.out.println(" 동일 도서가 없으미다");
	}
	void 도서대여목록(String loginid) {
		System.out.println("---------- 도서 반납 ----------");
		System.out.println("ISBN\t도서명\t작가\t도서대여여부");
		for(Book1 temp : 회원제도서프로그램_클래스버전1.books) {
			if(temp!=null && temp.대여회원.equals(loginid)) {
				System.out.println(temp.ISBN+"\t"+temp.도서명+"\t"+temp.작가+"\t"+"대여중");
			}
		}
	}
	void 도서등록() {
		System.out.println("---------- 도서 등록 ------------");
		System.out.println("ISBN :"); String isbn = 회원제도서프로그램_클래스버전1.scanner.next();
		System.out.println("도서명 :"); String 도서명 = 회원제도서프로그램_클래스버전1.scanner.next();
		System.out.println("작가 :"); String 작가 = 회원제도서프로그램_클래스버전1.scanner.next();
		
		for(Book1 temp : 회원제도서프로그램_클래스버전1.books) {
			if(temp!=null && temp.ISBN.equals(isbn)) {
				System.out.println("등록된 ISBN 입니다.");
				break;
			}
		}
		Book1 book = new Book1(isbn, 도서명, 작가, true, null);
		int i =0;
		for(Book1 temp: 회원제도서프로그램_클래스버전1.books) {
			if(temp== null) {
				회원제도서프로그램_클래스버전1.books[i] = book;
				System.out.println("도서 등록 완료");
				break;
				
			}
			i++;
		}
	}
	
	void 도서삭제() {
		System.out.println("------- 도서 삭제 -----------");
		
	}
}
