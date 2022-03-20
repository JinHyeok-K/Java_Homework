package Part2_02_06_6;

public class Board1 {
	// 0. 게시물 설계 => 클래스 선언 
			// 필드 : 제목 , 내용 , 작성자 , 비밀번호
			// 생성자 : 사용유무 선택
	
	String title;
	String contents;
	String writter;
	String pw;
	
	public Board1() {
	
	}

	public Board1(String title, String contents, String writter, String pw) {
	
		this.title = title;
		this.contents = contents;
		this.writter = writter;
		this.pw = pw;
	}
	
}
