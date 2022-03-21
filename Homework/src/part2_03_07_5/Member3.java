package part2_03_07_5;

public class Member3 {
	// 1. 클래스 설계 
	
	// 2. member
		// 필드 : 번호,아이디,비밀번호,이름,연락처
		// 메소드 : 1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
	int 번호;
	String id;
	String password;
	String name;
	String phone;
	
	public Member3() {
	
	}

	public Member3(int 번호, String id, String password, String name, String phone) {
	
		this.번호 = 번호;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	
	boolean 회원가입() {
		System.out.println("회원가입 페이지");
		System.out.print("id"); String id = 회원제도서프로그램_클래스버전2.scanner.next();
		System.out.print("pw"); String pw = 회원제도서프로그램_클래스버전2.scanner.next();
		System.out.print("name"); String name = 회원제도서프로그램_클래스버전2.scanner.next();
		System.out.print("phone"); String phone = 회원제도서프로그램_클래스버전2.scanner.next();
		
			for(Member3 temp :회원제도서프로그램_클래스버전3.member3) {
				if(temp!=null && temp.id.equals(id)) {
					System.out.println(" 현재 사용중인 아이디 ");
					return false;
				}
			}
			
			int index=0;
			int i = 0;
			for(Member3 temp : 회원제도서프로그램_클래스버전3.member3) {
				if(temp==null) {
					if( i == 0) {
						index=1; break;
					}
					else {
						index= 회원제도서프로그램_클래스버전3.member3[i-1].번호 +1 ;
						break;
					}
				}
				i++;
			}
		
		Member3 member3 = new Member3(번호, id, pw, name, phone);
		int j =0;
		for(Member3 temp : 회원제도서프로그램_클래스버전3.member3) {
			if(temp== null) {
				회원제도서프로그램_클래스버전3.member3[j] = member3;
				System.out.println("가입회원 회원번호 : "+번호);
			}
			i++;
		}
			
			
		return false;
	}
	String 로그인() {
		System.out.println("로그인 페이지");
		System.out.print("id"); String id=회원제도서프로그램_클래스버전3.scanner.next();
		System.out.print("pw"); String pw=회원제도서프로그램_클래스버전3.scanner.next();
		for(Member3 temp : 회원제도서프로그램_클래스버전3.member3) {
			if(temp!=null && temp.id.equals(id) &&temp.password.equals(pw)) {
				return temp.id;
			}
		}
		return null;
	}
	void 아이다찾기() {
		System.out.println("아이디 찾기 페이지");
		System.out.print("name"); String name = 회원제도서프로그램_클래스버전3.scanner.next();
		System.out.print("phone"); String phone = 회원제도서프로그램_클래스버전3.scanner.next();
		for(Member3 temp : 회원제도서프로그램_클래스버전3.member3) {
			if(temp!=null && temp.name.equals(name) && temp.phone.equals(phone)) {
				System.out.println("회원님 아이디 :"+ temp.id);
				return;
			}
		}
		System.out.println("동일한 정보가 없습니다.");
	}
	void 비밀번호찾기() {
		System.out.println("아이디 찾기 페이지");
		System.out.print("id"); String id = 회원제도서프로그램_클래스버전3.scanner.next();
		System.out.print("phone"); String phone = 회원제도서프로그램_클래스버전3.scanner.next();
		for(Member3 temp : 회원제도서프로그램_클래스버전3.member3) {
			if(temp!=null && temp.id.equals(id) && temp.phone.equals(phone)) {
				System.out.println("회원님 아이디 :"+ temp.password);
				return;
			}
		}
		System.out.println("동일한 정보가 없습니다.");
		
		
	}
}
