package Day11;

public class Reply {
	// 1. �ʵ�
	private String contents;
	private String password;
	private String writter;
	private String date;
	// 2. ������
			// 1. �� ������
	public Reply() {}
			// 2. Ǯ ������
	public Reply(String contents, String password, String writter, String date) {
		this.contents = contents;
		this.password = password;
		this.writter = writter;
		this.date = date;
	}
			// 3. ��۵�� �� ���Ǵ� ������
	public Reply(String contents, String password, String writter) {
		this.contents = contents;
		this.password = password;
		this.writter = writter;
	}
	
	// 3. �޼ҵ�
	
	
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
