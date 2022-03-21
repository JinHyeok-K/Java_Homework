package part2_03_07_5;

public class Member4 {
	// 1. 클래스 설계 
	
	// 2. member
		// 필드 : 번호,아이디,비밀번호,이름,연락처
		// 메소드 : 1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
	int 번호;
	String id;
	String password;
	String name;
	String phone;
	
	
	
	public Member4() {
	
	}



	public Member4(int 번호, String id, String password, String name, String phone) {
		super();
		this.번호 = 번호;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	
	boolean 회원가입() {
		System.out.println("회원가입페이지");
		System.out.print("ID: "); String id = 회원제도서프로그램_클래스버전4.scanner.next();
		System.out.print("비밀번호: "); String password = 회원제도서프로그램_클래스버전4.scanner.next();
		System.out.print("이름: "); String name= 회원제도서프로그램_클래스버전4.scanner.next();
		System.out.print("연락처: "); String phone = 회원제도서프로그램_클래스버전4.scanner.next();
		
			for(Member4 temp : 회원제도서프로그램_클래스버전4.member4) {
				if(temp!=null&&temp.id.equals(id)) {
					System.out.println("동일아이디 사용중");
					return false;
				}
			}
			
			int index = 0;
			int i =0;
			for(Member4 temp : 회원제도서프로그램_클래스버전4.member4) {
				if(temp==null) {
					if(i==0) {
						index= 1; break;
					}
					else {
						index = 회원제도서프로그램_클래스버전4.member4[i-1].번호 +1;
						break;
					}
				}
				i++;
			}
		Member4 member4 = new Member4(번호, id, password, name, phone);
		
		int j=0;
		for(Member4 temp : 회원제도서프로그램_클래스버전4.member4) {
			if(temp== null) {
				회원제도서프로그램_클래스버전4.member4[i] =member4;
				System.out.println("회원번호 :"+index);
				return true;				
			}
			i++;
		}
		return false;	
	}
	String 로그인() {
		System.out.println("로그인페이지");
		System.out.print(" id : "); String id = 회원제도서프로그램_클래스버전4.scanner.next();
		System.out.print(" password : "); String password = 회원제도서프로그램_클래스버전4.scanner.next();
		
		for(Member4 temp : 회원제도서프로그램_클래스버전4.member4) {
			if(temp!= null && temp.id.equals(id) && temp.password.equals(password)) {
				return temp.id;
			}
		}
		return null;
	}
	void 아이디찾기() {
		System.out.println("아이디 찾기");
		System.out.print("이름:"); String name = 회원제도서프로그램_클래스버전4.scanner.next();
		System.out.print("phone:"); String phone = 회원제도서프로그램_클래스버전4.scanner.next();
		
		for(Member4 temp : 회원제도서프로그램_클래스버전4.member4) {
			if(temp!=null && temp.name.equals(name) && temp.phone.equals(phone)) {
				System.out.println("id :"+temp.id);
				return;
			}
		}
		System.out.println("일치하는 정보 없음");
	}
	void 비밀번호찾기() {
		System.out.println("비번 찾기");
		System.out.print("id:"); String id = 회원제도서프로그램_클래스버전4.scanner.next();
		System.out.print("phone:"); String phone = 회원제도서프로그램_클래스버전4.scanner.next();
		
		for(Member4 temp : 회원제도서프로그램_클래스버전4.member4) {
			if(temp!=null && temp.id.equals(id) && temp.phone.equals(phone)) {
				System.out.println("id :"+temp.password);
				return;
			}
		}
		System.out.println("일치하는 정보 없음");
	}
	
	
	
	
	
	
	
	
	
}
