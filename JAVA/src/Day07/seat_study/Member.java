package Day07.seat_study;

public class Member {// class start
	/*
	 * 	1. 필드
	 *  	[번호,아이디,비밀번호,이름,연락처]
		2. 생성자
		
		3. 메소드
			[1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기]
	 * 
		 
	 * 
	 * 
	 */
	// 1. 필드
	//	[번호,아이디,비밀번호,이름,연락처]
	int id_num;
	String	id;
	String	password;
	String	name;
	String  phone;
	
	// 2. 생성자
		// 1. 빈 생성자
	Member(){} 
		// 2. 풀 생성자
	public Member(int id_num, String id, String password, String name, String phone) {
		this.id_num = id_num;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	
	
	//3 메소드
		// 1. 회원가입 메소드 [ 인수x 반환o : 가입성공TRUE / 가입실패FALSE]
	void join() {
			// 1. 입력
		System.out.println(" === 회원 가입 페이지 ===");
			// 1-1 ID 중복 check
		System.out.print(" ID : "); 	String id		= BookApp.scanner.next();
		for(Member temp:BookApp.members) {
			if (temp!=null&&temp.id.equals(id)) {
				System.err.println(" 이미 존재하는 ID");
				return;
			}
		}
		
		System.out.print(" PW : "); 	String password	= BookApp.scanner.next();
		System.out.print(" name : "); 	String name		= BookApp.scanner.next();
		System.out.print(" phone : "); 	String phone	= BookApp.scanner.next();
			// 2. 배열에 저장
		Member member = new Member(id_num,id,password,name,phone);
		
			// 2-1 회원 ID번호 저장[인덱스]
				// * 회원번호 자동부여 [ 가장 최근에 가입한 회원[마지막회원]의 번호 + 1 ]
		int uno=0; // 회원번호 저장 변수
		int i=0;
		for (Member temp:BookApp.members) {
			if(temp==null ) {
				if(i==0) {
					uno=1;
					return;
				}
				else { // i가 0이 아니면 (= 시작번호: 1
					uno = BookApp.members[i-1].id_num+1;// 회원 번호에 BookApp 멤버의 i-1인덱스
						//	  1,2,3...n-1,n,n+1.... => n번째 인덱스 찾기 (n번째는 null 이므로 최근 등록 인덱스는 n-1)
						// ex) i=1 일 때 멤버배열 0번째 회원 아이디는 0+1 => 1
						//    인덱스= 0부터 시작  i=0:1번째 회원 / i=1:2번째 회원/ i=2:3번째 회원
					return;
				}
			}
		}
	}
	
		// 2. 로그인 메소드 [ 인수x반환o : ]
			// 로그인성공시 성공한 아이디반환 / 실패시 NULL 반환
	void login() {
		System.out.println(" --- 로그인 페이지 --- ");
		 // 입력 받은 ID 와 비밀번호가 동일해야 로그인 성공
		System.out.print(" ID :"); String id=BookApp.scanner.next();
		System.out.print(" PW :"); String password=BookApp.scanner.next();
		// 비교 시작
			// 얼마만큼?
				// ID 같은 정보들이 저장되는 배열의 길이만큼 (100칸 : 100회)
		for (Member temp: BookApp.members) {
			
			if( temp!=null && temp.id.equals(id) && temp.password.equals(password) ) {
				// 빈공간이 없고 | ID와 비밀번호가 동일하면
				System.err.println(" 알림) 로그인 성공");
				return;
			}
			System.err.println(" 알림) 로그인 실패");
		}
	}
	
		// 3. 아이디찾기 메소드 [ 인수x반환x] : 이름 , 연락처
	void find_id(){
		 	// 입력한 이름 연락처 동일 시 (비교) -> id 응답
		System.out.println(" --- ID 찾기 페이지 --- ");
		System.out.print(" 이름 : "); 	String name 	= BookApp.scanner.next();
		System.out.print(" 연락처 : "); 	String phone	= BookApp.scanner.next();
			// 비교 시작
		
		for (Member temp : BookApp.members) {
			
			if (temp!=null&&temp.name.equals(name)&&temp.phone.equals(phone)) {
				
				System.err.println(" 당신의 ID 는 "+temp.id+"입니다.");
				return;
				
			}
			System.err.println(" 일치하는 정보가 없습니다.");
		}
	}
		// 4. 비밀번찾기 메소드 [ 인수x반환x ] : 아이디 , 연락처
	void find_pw() {
		for (Member temp : BookApp.members) {
			
			if (temp!=null&&temp.id.equals(id)&&temp.phone.equals(phone)) {
				
				System.err.println(" 새로운 비밀 번호를 설정하세요");
				temp.password = BookApp.scanner.next();
				return;
			}
		}
	}
		// 5. 회원수정 메소드
	void user() {
		
	}
		// 6. 회원탈퇴 메소드
	void exit() {
		
	}
	
	
}// class end
