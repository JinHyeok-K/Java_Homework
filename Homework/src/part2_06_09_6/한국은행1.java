package part2_06_09_6;

public class 한국은행1 {
	private String 계좌번호;
	private	String 비밀번호;
	private String 계좌주;
	private int 예금액;
	
	
	public 한국은행1() {
		// TODO Auto-generated constructor stub
	}


	public 한국은행1(String 계좌번호, String 비밀번호, String 계좌주, int 예금액) {
		super();
		this.계좌번호 = 계좌번호;
		this.비밀번호 = 비밀번호;
		this.계좌주 = 계좌주;
		this.예금액 = 예금액;
	}


	protected String get계좌번호() {
		return 계좌번호;
	}


	protected void set계좌번호(String 계좌번호) {
		this.계좌번호 = 계좌번호;
	}


	protected String get비밀번호() {
		return 비밀번호;
	}


	protected void set비밀번호(String 비밀번호) {
		this.비밀번호 = 비밀번호;
	}


	protected String get계좌주() {
		return 계좌주;
	}


	protected void set계좌주(String 계좌주) {
		this.계좌주 = 계좌주;
	}


	protected int get예금액() {
		return 예금액;
	}


	protected void set예금액(int 예금액) {
		this.예금액 = 예금액;
	}
	
	
}
