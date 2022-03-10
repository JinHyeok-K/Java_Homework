package Day07;

public class Book {
	
	// 1. 필드
		// ISBN [도서번호 = 식별용]
		// 도서명
		// 작가
		// 도서대여여부
		// 대여인ID
	String ISBN;
	String bname;
	String bwritter;
	boolean brental;// = true;
	String mid;
	
	
	// 2. 생성자
		// 1. 빈 생성자 [기본생성자] : 메소드 호출용 (ctrl+스페이스바)
	public Book() { }
		// 2. 풀 생성자 [모든 필드 받는 생성자 ] : 도서 등록
	public Book(String ISBN, String bname, String bwritter, boolean brental, String mid) {
		this.ISBN = ISBN;
		this.bname = bname;
		this.bwritter = bwritter;
		this.brental = brental;
		this.mid = mid;
	}
	
	// 3. 메소드 
		// 1. 도서 검색
	void 도서검색() {
		
	}
		// 2. 도서 목록
	void 도서목록() {
		
			
		System.out.println("ISBN \t도서명 \t작가 \t대출가능여부 \t대출자");
		
		for(Book temp : Day07_05_BookApplication.books) {
//			System.out.println(temp.ISBN+"\t"+temp.bname+"\t"+temp.bwritter+"\t"+temp.brental+"\t"+mid);
			if(temp!=null) {
				if(temp.brental) {
				System.out.println(temp.ISBN+"\t"+temp.bname+"\t"+temp.bwritter+"\t"+"대여가능");
				
				}
				else {
				System.out.println(temp.ISBN+"\t"+temp.bname+"\t"+temp.bwritter+"\t"+"대출중");
				}
			}
		}
	}
		// 3. 도서 대출
	void 도서대출(String loginid) {
		System.out.println("---- 도서 대여 페이지 ----");
		System.out.println(" 도서 ISBN : "); String ISBN = Day07_05_BookApplication.scanner.next();
		for (Book temp : Day07_05_BookApplication.books) {
			if (temp!=null && temp.ISBN.equals(ISBN)
					&& temp.brental){
				System.out.println(" 앙ㄹ림) 해당 도서 대여합니다.");
				temp.brental =false;
				temp.mid= loginid;
				return;
			}
			System.out.println("알림)해당 도서 대여중 [대여불가]");			
			}
			System.out.println("알림)동일한 도서가 없습니다.");
			return;
		}
		
	
		// 4. 도서 반납
	void 도서반납() {
		
	
		
		
	}
		// & 현재 로그인 한 회원이 대여중인 도석 목록
	void 도서대여() {}
	
	
	
		// 5. 도서 등록
	void 도서등록() {
//		System.out.print(" 등록할 도서의 수? : "); int b1 = Day07_05_BookApplication.scanner.nextInt();
//		if(b1>0) {
//			int j=0;
//			for(j=0;j<=b1;j++) {
//				brental =true;
//				System.out.println(" ISBN "); 	String ISBN= Day07_05_BookApplication.scanner.next();
//				System.out.println(" 도서 명 "); 	String bname= Day07_05_BookApplication.scanner.next();
//				System.out.println(" 작가 "); 	String bwritter= Day07_05_BookApplication.scanner.next();
//				
//				}
//		}
		System.out.println("================= 도서 등록===============");
		System.out.print(" ISBN  : "); 	String ISBN= Day07_05_BookApplication.scanner.next();
		
		// ISBN 중복 체크
		for(Book temp: Day07_05_BookApplication.books) {
			if(temp!=null && temp.ISBN.equals(ISBN)) {
				System.err.println("동일한 ISBN이 존재합니다.");
				return; // 도서 등록 실패 
			}
		}
		System.out.print(" 도서 명 : "); 	String bname= Day07_05_BookApplication.scanner.next();
		System.out.print(" 작가  :"); 		String bwritter= Day07_05_BookApplication.scanner.next();
		
		Book book = new Book(ISBN,bname,bwritter,true,null);
		
		int i =0; // 반복횟수 [인덱스]
		for ( Book temp: Day07_05_BookApplication.books) {
			if(temp==null) {
				Day07_05_BookApplication.books[i]=book;
				System.out.println("도서등록 완료");
				return;
			}
			
			i++; // 인덱스 증가
		}
		
	}
	
		// 6. 도서 삭제
	void 도서삭제() {
		System.out.println(" 삭제할 도서");
		
	}

}
