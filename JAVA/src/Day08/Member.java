/*package Day08;


public class Member {


		// 1.필드
			// 회원번호 [ 자동번호 , 중복x ] 
		String id;
		String 이름;		// 아이디 [ 중복x ]
		String password;// 비밀번호
		String 전화번호;
		int 계좌번호;	// 이름
		int 잔액;	// 연락처
//		이름/비밀번호/계좌번호/잔액
		// 2.생성자 [ 생성자명 == 클래스명 ]
			// 1. 빈생성자[기본생성자] : 메소드호출용 객체생성시
		public Member() { }
			// 2. 모든 필드를 받는 생성자 : 회원가입용 객체생성시
		public Member(String id, String 이름, String password,String 전화번호, int 계좌번호, int 잔액) {
			
			this.id =id;
			this.password = password;
			this.이름 = 이름;
			this.전화번호 = 전화번호;
			this.계좌번호 = 계좌번호;
			this.잔액 = 잔액;
		}
		boolean 회원가입() {
		
			System.out.println(" ----- 계좌 생성 페이지 ----- ");
			System.out.print(" 회원 이름"); String 이름= Day08_05.scanner.next();
			System.out.print(" id");		 String id= Day08_05.scanner.next();
			System.out.print(" 비밀 번호"); String password=Day08_05.scanner.next();
			System.out.print(" 전화번호"); String 전화번호=Day08_05.scanner.next();
			
			int 계좌번호 = (int)(Math.random() * (999999 - 100000 + 1)) + 100000000;
// 			System.out.println(계좌번호);
 			int 잔액 = 0;
 			Member member = new Member(이름, id, password, 전화번호, 계좌번호, 잔액); // 모든 필드 받는 생성자로 객체생성
			
				int i=0;
				for(Member temp:Day08_05.members) {
					if(temp==null) {
						Day08_05.members[i] = member;
						System.out.println(잔액);
					return true;	
					}
					i++;
				}
				
			return false;
		}
		String 로그인() {
			System.out.println(" ----- 로그인 페이지 ------");
			// 1. 입력받기 
			System.out.print(" 이름 : ");		String 이름 = Day08_05.scanner.next();
			System.out.print(" 비밀번호 : ");	String password = Day08_05.scanner.next();
			// 2. 배열내 객체 id와 password가 입력한 값과 동일하면 
			for( Member temp : Day08_05.members ) {
				if(  temp != null && temp.이름.equals(이름) 
						&& temp.password.equals(password) ) {
					// * 공백이 아니면서 id와 password가 동일하면 
					return temp.이름; // 성공한 id 반환
				}
			}
			// 3. 로그인 성공시 입력한 id 반환 / 실패시 null 
			return null; // 실패시 null 반환
		}
		void 아이디찾기() {
			System.out.println(" ----- 아이디찾기 페이지 ------");
			// 1.입력받기 
			System.out.print(" 이름 : "); String 이름 = Day08_05.scanner.next();
			System.out.print(" 연락처 : "); String phone = Day08_05.scanner.next();
			// 2. 입력받은 값을 배열에 찾기 
			for( Member temp : Day08_05.members ) {
				if( temp !=null && temp.이름.equals(이름) && 
						temp.전화번호.equals(phone) ) {
					//* 공백이 아니면서 해당 객체내 name,phone 이 입력받은 값과 동일하면 
					System.out.println(" 알림]] 회원님 아이디 : " + temp.id); // 찾은 id 안내
					return; // 동일한 값을 찾았으면 해당 메소드 종료 
				}
			}
			// 3. 찾았으면 찾은id 출력하고 못찾았으면 없음 출력 
			System.out.println(" 알림]] 동일한 회원정보가 없습니다. ");
		}
			// 4. 비밀번찾기 메소드 [ 인수x반환x ] : 아이디 , 연락처
		void 비밀번호찾기() {
			System.out.println(" ----- 비밀번호찾기 페이지 ------");
			System.out.print(" 아이디 : ");	String id = Day08_05.scanner.next();
			System.out.print(" 연락처 : ");	String phone = Day08_05.scanner.next();
			for( Member temp : Day08_05.members ) {
				if( temp != null && temp.이름.equals(id) &&
						temp.전화번호.equals(phone) ) {
					System.out.println(" 알림]] 회원님 비밀번호 : " + temp.password );
					return; // 동일한 값 찾았으면 해당 메소드 종료 
				}
			}
			System.out.println(" 알림]] 동일한 회원정보가 없습니다. ");
		}
		
		
}// class end
*/

package Day08;


public class Member {//cs //Day08_5_test , Day08 Member


//1.필드

int add_num;		//계좌번호
String id;			//아이디	[중복x]
String password;	//비밀번호
String name;		//이름
String phone;		//연락처
int 잔액;
int 대출잔액;

//2.생성자
	//1.빈생성자
public Member() {//메소드호출용

}
	//2.모든 필드를 받는 생성자 //회원가입용

public Member( int add_num, String id, String password, String name, String phone, int 잔액,int 대출잔액) {

	this.add_num = add_num;
	this.id = id;
	this.password = password;
	this.name = name;
	this.phone = phone;
	this.잔액 = 잔액;
	this.대출잔액 = 대출잔액;
}

//3.메소드
	//1.회원가입 메소드
	boolean 회원가입() {
		System.out.println("---------회원가입 페이지--------");
		System.out.println("아이디 : "); String id =  Day08_05_은행계좌.scanner.next();
		System.out.println("비밀번호 : "); String password = Day08_05_은행계좌.scanner.next();
		System.out.println("이름 : "); String name = Day08_05_은행계좌.scanner.next();
		System.out.println("연락처 : "); String phone = Day08_05_은행계좌.scanner.next();

		//*아이디중복체크
		for(Member temp : Day08_05_은행계좌.members) {
			if(temp != null && temp.id.equals(id) ) {
				System.err.println("알림)) 현재 사용중인 아이디입니다.");
				return false;//함수종료 -> 중복되었기 때문에 가입실패(false)
			}
		}//아이디중복체크 끝

		int i = 0;
		int add_num = (int)(Math.random() * (999999 - 100000 + 1)) + 100000000;
		int 잔액 = 0;
		int 대출잔액 = 0;
		Member member = new Member(add_num, id, password, name, phone,잔액,대출잔액);
		

		for(Member temp : Day08_05_은행계좌.members) {
			if(temp == null) {
				Day08_05_은행계좌.members[i] = member;
				System.out.println("알림)) 다음과같은아이디로 가입되었습니다. : " + id);
				System.out.println("알림)) 회원님의 계좌번호는 : " +add_num+"입니다 ");
				System.out.println(잔액);
				return true;
				}
				i++;
		}

		return false;
	}//회원가입 end

	//2.로그인 메소드
	String 로그인() {
		System.out.println("--------로그인 페이지----------");
		//1.입력받기
		System.out.println("아이디 : "); 		String id = Day08_05_은행계좌.scanner.next();
		System.out.println("비밀번호 : "); 	String password = Day08_05_은행계좌.scanner.next();
		//2. 배열내 객체 id화 password가 입력한 값과 동일하면
		for( Member temp : Day08_05_은행계좌.members)	{
			if(temp != null && temp.id.equals(id) && temp.password.equals(password) ) {
			//*공백이 아니면서 id와 password가 동일하면
				return temp.id;	//성공한 id 반환
			}
		}
		//3.로그인 성공시 입력한 id반환 / 실패시 null
		return null;//실패시 null반환
	}


}//ce
			
			
