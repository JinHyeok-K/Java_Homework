package part2_03_07_5;

public class Member5 {
	// 1. 클래스 설계 
	
	// 2. member
		// 필드 : 번호,아이디,비밀번호,이름,연락처
		// 메소드 : 1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
	
	int 번호;    //필드 설정
	String id;
	String password;
	String name;
	String phone;
	
	public Member5() {    //생성자 생성
		// TODO Auto-generated constructor stub
	}

	public Member5(int 번호, String id, String password, String name, String phone) {
		super();
		this.번호 = 번호;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	
	
	
	boolean 회원가입() { //회원가입 시작
		System.out.println("  회원가입 페이지");
		System.out.print(" 아이디 : ");	String id = 회원제도서프로그램_클래스버전5.scanner.next();
		System.out.print(" 비밀번호 : ");	String password = 회원제도서프로그램_클래스버전5.scanner.next();
		System.out.print(" 이름 : ");	String name = 회원제도서프로그램_클래스버전5.scanner.next();
		System.out.print(" 연락처 : ");	String phone = 회원제도서프로그램_클래스버전5.scanner.next();
		//아이디 비밀번호 이름 번호  입력
		for( Member5 temp : 회원제도서프로그램_클래스버전5.members) { //배열 크기만큼 반복시행
			if( temp != null && temp.id.equals(id)) {   //배열내 보유한 id 와 입력 id가 같으면
				System.out.println(" 현재 사용중인 아이디 "); //사용중 아이디 안내문 출력
				return false; // 가입실패 반환
			}
		} 
		int index = 0;  //인덱스 설정
		int i = 0;  //정수 선언
		for( Member5 temp : 회원제도서프로그램_클래스버전5.members ) { //배열 크기만큼 반복문 진행
			if( temp == null ) { //temp가 null 일때
				if( i == 0 ) {  // i 가 0일 때 
					index = 1; break;  //인덱스에 1대입, 탈출
				}
				else {  //그 외 
					index = 회원제도서프로그램_클래스버전5.members[ i-1 ].번호 + 1 ;//인덱스 값은 배열의 번호+1 대입 
					break;
				}
			}
			i++;  //인데스 증가
		}

		Member5 member = new Member5( index , id, password, name, phone ); 	 //배열 로드(생성자)
	int j = 0 ; //j =0 ;
	for( Member5 temp : 회원제도서프로그램_클래스버전5.members ) {//배열 크기만큼 반복
		if( temp == null ) {  //temp 가  null 일때 
			회원제도서프로그램_클래스버전5.members[j] = member;// 배열의 j번째 값에 배열의 값 대입
			System.out.println(" 알림)) 회원님의 회원번호 : " + index); //회원번호 출력
			return true; // 가입 완료 리턴
		}
		j++;
	}
	return false; 
	}
	
	String 로그인() {
		System.out.println("  로그인 페이지");
		System.out.print(" 아이디 : ");		String id = 회원제도서프로그램_클래스버전5.scanner.next();
		System.out.print(" 비밀번호 : ");	String password = 회원제도서프로그램_클래스버전5.scanner.next();
		//아이디 비밀번호 입력
	for( Member5 temp : 회원제도서프로그램_클래스버전5.members ) { //배열 길이만큼 반복
			if(  temp != null && temp.id.equals(id)  // 저장된 id와 비밀번호가 입력한 값과 각각 같으면   id반환
					&& temp.password.equals(password) ) {
				return temp.id; 
			}
		}
		return null;
	}
	
	void 아이디찾기() {
		System.out.println("아이디찾기 페이지"); //배열 길이만큼 반복
		System.out.print(" 이름 : "); String name = 회원제도서프로그램_클래스버전5.scanner.next();
		System.out.print(" 연락처 : "); String phone = 회원제도서프로그램_클래스버전5.scanner.next(); 
		// 저장된 이름과 연락처가 입력한 값과 각각 같으면   id반환
		for( Member5 temp : 회원제도서프로그램_클래스버전5.members) {
			if( temp !=null && temp.name.equals(name) && 
					temp.phone.equals(phone) ) {
				// 저장된 이름과 연락처가 입력한 값과 각각 같으면   id반환
				System.out.println("  회원 아이디 : " + temp.id); 
				return; 
			}
		}
		System.out.println(" 동일한 회원정보 없음 ");
	}
	void 비밀번호찾기() {
		System.out.println(" 비밀번호찾기 ");
		System.out.print(" 아이디 : ");	String id = 회원제도서프로그램_클래스버전5.scanner.next();
		System.out.print(" 연락처 : ");	String phone = 회원제도서프로그램_클래스버전5.scanner.next();
		for( Member5 temp : 회원제도서프로그램_클래스버전5.members ) 
			if( temp != null && temp.id.equals(id) &&
					temp.phone.equals(phone) ) {
				System.out.println(" 회원 비밀번호 : " + temp.password );
				return;// 저장된 아이디와 연락처가 입력한 값과 각각 같으면  비밀번호반환
				}
			
			
		System.out.println(" 동일한 회원정보 없음 "); // 위 조건 불만족 시 출력
	}
	
	
	
	
	
	
	
}
