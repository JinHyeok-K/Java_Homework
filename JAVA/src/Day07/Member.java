package Day07;

import java.util.Scanner;

public class Member {


	
	// 1. 필드
	int mno;			// 회원번호 [자동번호,중복X]
	String id;			// 아이디 [ 중복 X ]
	String password;	// 비밀번호
	String name;		// 이름
	String phone;   	// 연락처
	
	// 2. 생성자 [ 생성자명 == 클래스명 ]
		// 1. 빈 생성자 [ 기본 생성자 ] => 메소드 호출용 객체 생성시
	public Member() { }
		// 2. 모든 필드를 받는 생성자 : 회원 가입용 객체 생성 시
	public Member(int mno, String id, String password, String name, String phone) {
		
		this.mno = mno;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}


	
	// 3. 메소드
		// 1. 회원가입 메소드 [ 인수 x 반환 o : 가입성공 True : 가입실패 False ]
		// 
	boolean 회원가입() {
		// 1. 입력 받기 [ id, pw ,name, phone]
		System.out.println(" ----- 회원가입 페이지 ----- ");
		System.out.println(" ----- 입력해주세요 ----- ");
		System.out.print(" ID : "); 		String id 		=	Day07_05_BookApplication.scanner.next();
		
		// * 아이디 중복체크
//		boolean idcheck = false;  => 흐름 제어용 boolean
		for(Member temp : Day07_05_BookApplication.members) {
			if(temp != null && temp.id.equals(id)) {
				// 만약에 공백이 아니면서 배열 내 ID 와 입력받은 ID 와 동일하면
					System.err.println("알림 ) 현재 사용중인 아이디 이ㅣㅂ니다.");
					return false; // 함수종료--> 아이디가 중복되었기 때문에 false[가입 실패]
			}
		}
		
		System.out.print(" Password : ");	String password =	Day07_05_BookApplication.scanner.next();
		System.out.print(" Name : "); 		String name 	=	Day07_05_BookApplication.scanner.next();
		System.out.print(" Phone : "); 		String phone 	=	Day07_05_BookApplication.scanner.next();
			// * scanner 객체가 다른  클래스 내 static 선언되어있음 	// * 클래스명.필드명/메소드명
			// * static 필드, 메소드는 객체없이 호출 가능
		
			
			// * 회원번호 자동주입 [ 가장 최근에 가입한 회원의[마지막회원] 번호 +1 ]
		int bno=0; // 회원번호 저장하는 변수
		int j = 0; // 반복횟수 [인덱스] 
		for(Member temp : Day07_05_BookApplication.members) {
			if (temp==null) { // null 찾기 [null 찾았을 때 null -1 하면 마지막 회원 ]
				if (j==0) {
					bno=1; // 첫번째 index가 null => 첫 회원 => 첫회원번호 = 1부여
					break;
				}
				bno =(Day07_05_BookApplication.members[j-1].mno+1);
												// null 앞 [마지막 회원]번호에 +1
				break;
			}
			j++; // 인덱스 증가
		}
		
		
		
		// 2. 4개 변수 -> 객체화 -> 1개
		Member member = new Member(bno, id, password, name, phone); // 모든 필드 받는 생성자로 객체 생성
		// 3. 배열 내 빈 공간을 찾아서 새로운 회원[객체] 넣기 | 4. 가입 성공 시 true 반환 실패 시 false 반환
		int i = 0; // 반복횟수 [인덱스 체크 ]
		for (Member temp : Day07_05_BookApplication.members) {
			if(temp==null) { // 빈 공간이면 
				Day07_05_BookApplication.members[i] = member; // 빈 인덱스에 새로운 회원 대입
				System.out.println(" 알림)) 호구님의 호구번호 :  "+ bno );
				return true; // 회원 가입 메소드 종료 [ 반환 : true (성공) ]
			}
			i++; // i증가
		}
		return false; // 회원가입 메소드 종료 [반환 : false (실패)]
	}
	
		// 2. 로그인 메소드 [인수x 반환O ]
			// 로그인 성공 시 성공한 아이디 반환 / 실패 시 Null 반환
	String 로그인() {
		System.out.println(" ----- 로그인 페이지 ----- ");
			// 1. 입력받기
		System.out.print(" ID : "); 		String id 		=	Day07_05_BookApplication.scanner.next();
		System.out.print(" Password : ");	String password =	Day07_05_BookApplication.scanner.next();
			// 2. 배열 내 객체 id와 password 가 입력한 값과 동일하면
//		int i = 0;
		for ( Member temp : Day07_05_BookApplication.members) {
			if( temp!=null&&temp.id.equals(id)&&temp.password.equals(password)) {
				System.out.print(" 알림)) 로그인 성공 ");
				// * 공백이 아니면서 id 와 password 가 동일하면
				return temp.id; // 성공한 id반환
			}
			
		}
			// 3. 로그인 성공시 입력한 id 반환 /실패시 null
			System.out.print(" 알림)) 로그인 실패 ");
			return null;
		
	}
	
	
		// 3. 아이디찾기 메소드 // 이름 연락처
	void 아이디찾기() {
		System.out.println(" ----- 아이디찾기 페이지 ----- ");
		System.out.print(" Name : "); 		String name 		=	Day07_05_BookApplication.scanner.next();
		System.out.print(" phone : ");		String phone 		=	Day07_05_BookApplication.scanner.next();

		for (Member temp: Day07_05_BookApplication.members) {
			if( temp!=null&& temp.name.equals(name) && temp.phone.equals(phone) ) {
				System.out.println("당신의 ID 는 "+temp.id+"입니다.");
				return;
			}
//			else {System.out.println(" 확인 되지 않는 정보 입니다.");}
//			return;
		}
		System.out.println(" 확인 되지 않는 정보 입니다.");
//		return;
	}
	
		// 4. 비밀번호찾기 메소드 // 아이디 연락처
	void 비밀번호찾기() {
		System.out.println(" ----- 비밀번호찾기 페이지 ----- ");
		System.out.print(" ID : "); 		String id 		=	Day07_05_BookApplication.scanner.next();
		System.out.print(" phone : ");		String phone 		=	Day07_05_BookApplication.scanner.next();
		for (Member temp: Day07_05_BookApplication.members) {
			if(temp!=null && temp.id.equals(id)&&temp.phone.equals(phone)) {
//				System.out.println("당신의 비밀번호 는 "+temp.password+"입니다.");
				System.out.println("비밀번호를 재 설정 해 주세요.");
				System.out.print(" 재설정 하실 Password : ");		String password =Day07_05_BookApplication.scanner.next();
				temp.password =password;
				return; //동일한 값 찾았으면 해당 메소드 종료
			}
			
		}
		System.out.println(" 확인 되지 않는 정보 입니다.");
//		return;
	} 	
	
}
	
		// 5. 회원수정 메소드
		// 6. 회원탈퇴 메소드