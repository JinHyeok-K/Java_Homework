package Day11;

public class Reply {
	// 1. 필드
	private String contents;
	private String password;
	private String writter;
	private String date;
	// 2. 생성자
			// 1. 빈 생성자
	public Reply() {}
			// 2. 풀 생성자
	public Reply(String contents, String password, String writter, String date) {
		this.contents = contents;
		this.password = password;
		this.writter = writter;
		this.date = date;
	}
			// 3. 댓글등록 시 사용되는 생성자
	public Reply(String contents, String password, String writter) {
		this.contents = contents;
		this.password = password;
		this.writter = writter;
	}
	
	// 3. 메소드
	
	
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getWritter() {
		return writter;
	}
	public void setWritter(String writter) {
		this.writter = writter;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
