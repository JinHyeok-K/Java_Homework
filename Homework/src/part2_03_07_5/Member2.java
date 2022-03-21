package part2_03_07_5;

public class Member2 {
	// 1. 클래스 설계 
	
	// 2. member
		// 필드 : 번호,아이디,비밀번호,이름,연락처
		// 메소드 : 1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
	int 번호;
	String id;
	String password;
	String name;
	String phone;
	
	public Member2() {
		// TODO Auto-generated constructor stub
	}

	public Member2(int 번호, String id, String password, String name, String phone) {
		super();
		this.번호 = 번호;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	
	
	boolean 회원가입() {
		System.out.println("--------- 회원 가입 ---------");
		System.out.print(" ID : ");  String id=회원제도서프로그램_클래스버전2.scanner.next();
		System.out.print(" Password : ");  String password=회원제도서프로그램_클래스버전2.scanner.next();
		System.out.print(" Name : ");  String name=회원제도서프로그램_클래스버전2.scanner.next();
		System.out.print(" Phone : ");  String phone=회원제도서프로그램_클래스버전2.scanner.next();
		
			for(Member2 temp : 회원제도서프로그램_클래스버전2.member2) {
				if(temp!=null && temp.id.equals(id)) {
					System.out.println(" 사용하고 있는 아이디 입니다.");
					return false;
				}
			}
			
			int index_num= 0;
			int i=0;
			for (Member2 temp : 회원제도서프로그램_클래스버전2.member2) {
				if(temp==null) {
					if(i==0) {
						index_num=1; 
						break;
					}
					else {
						index_num = 회원제도서프로그램_클래스버전2.member2[i-1].번호 +1;
						break;
					}
				}
				i++;
			}
			
			Member2 member2 = new Member2(번호, id, password, name, phone);
			
			int j=0;
			for(Member2 temp : 회원제도서프로그램_클래스버전2.member2) {
				if(temp==null) {
					회원제도서프로그램_클래스버전2.member2[i] = member2;
					System.out.println(" 회원님의 회원번호는 :"+index_num);
					return true;
				}
			}
		return false;
	}
	
	String 로그인() {
		System.out.println( "----- 로그인 페이지 ------");
		System.out.print(" ID : "); String id=회원제도서프로그램_클래스버전2.scanner.next();
		System.out.print(" Password : "); String pw=회원제도서프로그램_클래스버전2.scanner.next();
		
		for(Member2 temp : 회원제도서프로그램_클래스버전2.member2) {
			if(temp!=null && temp.id.equals(id)&&temp.password.equals(pw)) {
				return temp.id;
			}
		}
		return null;
	}
	void 아이디찾기() {
		System.out.println( "----- 아이디 찾기 페이지 -----");
		System.out.print("Name : "); String name = 회원제도서프로그램_클래스버전2.scanner.next();
		System.out.print("Phone : "); String phone = 회원제도서프로그램_클래스버전2.scanner.next();
		
		for(Member2 temp : 회원제도서프로그램_클래스버전2.member2) {
			if(temp!=null && temp.name.equals(name)&& temp.phone.equals(phone)) {
				System.out.println(" 회원님의 ID는 : "+ temp.id);
			}
				
		}
		System.out.println("동일한 정보가 없습니다.");
	}
	void 비밀번호찾기() {
		System.out.println("---- 비밀번호 찾기 페이지 -----");
		System.out.print(" ID : "); String id = 회원제도서프로그램_클래스버전2.scanner.next();
		System.out.print(" Password : "); String password = 회원제도서프로그램_클래스버전2.scanner.next();
		for(Member2 temp : 회원제도서프로그램_클래스버전2.member2) {
			if(temp!=null && temp.id.equals(id) && temp.phone.equals(phone)) {
				System.out.println(" 회원님의 비밀번호는 : "+temp.password);
				return;
			}
		}
		System.out.println("동일한 정보가 없습니다.");
	}
	
}
