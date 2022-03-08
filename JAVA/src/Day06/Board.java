package Day06;

public class Board {
	// * Board Class 선언
		// main 메소드 사용 X
		// main 메소드는 코드 실행 시에만 사용 클래스(설계도) 에서 사용 X
	
	// 1. 필드
	String title;
	String contents;
	String writter;
	String password;
	
	// 2. 생성자 [ 클래스 이름과 동일하면 생성자 명]
		// 자동 : 오른쪽 클릭-> source-> Generator constructor ~
		// 1. 빈 생성자
	Board(){}
		// 2. 1개 필드를 받는 생성자
	Board(String title){ // 외부변수
		this.title = title;
		// this.필드명 => 내부 변수
		// * 외부로부터 들어온 제목을 내부 변수에 저장
	}
		// 3. 2개 필드를 받는 생성자
	Board(String title, String contents){
		this.title = title;
		this.contents = contents;
	}
		// 4. 3개 필드를 받는 생성자
	Board(String title, String contents, 
			String writter){
		this.title = title;
		this.contents = contents;
		this.writter = writter;
	}
	
		// 5. 4개 필드를 받는 생성자
	Board(String title, String contents, 
			String writter, String password){
		this.title = title;
		this.contents = contents;
		this.writter = writter;
		this.password = password;
	}
	
	
	
	// 3. 메소드
	
	

	
	
}
