package part2_03_07_5;

public class Member1 {
	// 1. 클래스 설계 
			
				// 2. member
					// 필드 : 번호,아이디,비밀번호,이름,연락처
					// 메소드 : 1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
	
	int 번호;
	String ID;
	String Password;
	String Name;
	String Phone;
	public Member1() {
	
	}
	public Member1(int 번호, String iD, String password, String name, String phone) {
		super();
		this.번호 = 번호;
		ID = iD;
		Password = password;
		Name = name;
		Phone = phone;
	}
	
	boolean 회원가입() {
		System.out.println(" 회원가입 페이지 ");
		System.out.print("ID : "); 			String id = 회원제도서프로그램_클래스버전1.scanner.next();
		System.out.print("password : "); 	String password = 회원제도서프로그램_클래스버전1.scanner.next();
		System.out.print("name : "); 		String name = 회원제도서프로그램_클래스버전1.scanner.next();
		System.out.print("phone : "); 		String phone = 회원제도서프로그램_클래스버전1.scanner.next();
		
		
		for(Member1 temp : 회원제도서프로그램_클래스버전1.members ) {
			if(temp != null && temp.ID.equals(id)) {
				System.out.println(" 이미 사용중인 아이디 입니다.");
				return false;
			}
		}
		// Q) 회원번호 이해 안감
		int CNum= 0;
		int j= 0;
		for(Member1 temp : 회원제도서프로그램_클래스버전1.members) {
			if(temp==null) {
				if(j==0) {
					CNum=1;
					break;
				}
				else {CNum= 회원제도서프로그램_클래스버전1.members[j-1].번호 +1;}
			}
			j++;
		}
		
		Member1 members = new Member1(CNum, id, password, name, phone);
		
		int i =0;
		for (Member1 temp : 회원제도서프로그램_클래스버전1.members) {
			if(temp==null) {
				회원제도서프로그램_클래스버전1.members[i] = members;
				System.out.println("회원번호 : "+CNum);
				return true;
			}
			i++;
		}
		return false;
	}
	
	String 로그인() {
		System.out.println(" ID : "); 		String id=회원제도서프로그램_클래스버전1.scanner.next();
		System.out.println(" Password : "); String password=회원제도서프로그램_클래스버전1.scanner.next();
		for (Member1 temp : 회원제도서프로그램_클래스버전1.members) {
			if(temp!=null && temp.ID.equals(id) && temp.Password.equals(password)){
				System.out.println(" 로그인 완료");
				return temp.ID;
			}
			else System.out.println("로그인 실패"); break;
		}
		return null;
	}
	void 아이디찾기 () {
			System.out.println(" name : ");		String name=회원제도서프로그램_클래스버전1.scanner.next();
			System.out.println(" phone : ");		String phone=회원제도서프로그램_클래스버전1.scanner.next();
			for(Member1 temp : 회원제도서프로그램_클래스버전1.members) {
				if(temp!=null && temp.Name.equals(name) && temp.Phone.equals(phone)) {
					System.out.println(" ID 를 찾았습니다 ");
					System.out.println(" ID : "+temp.ID);
					break;
				}
				else System.out.println(" 찾기 실패"); break;
			}
		
	}
	void 비밀번호찾기 () {
			System.out.println(" ID : ");  String id = 회원제도서프로그램_클래스버전1.scanner.next();
			System.out.println(" phone : ");  String phone = 회원제도서프로그램_클래스버전1.scanner.next();
			for(Member1 temp : 회원제도서프로그램_클래스버전1.members) {
				if(temp!=null && temp.ID.equals(id)&& temp.Phone.equals(phone)){
				System.out.println(" 비밀번호를 찾았습니다.");
				System.out.println(" Password : "+temp.Password);
				break;
				}
				else {System.out.println("찾기 실패"); break;}
			}
			
	}
}
