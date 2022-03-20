package part2_01_06_3;

import java.util.Scanner;

public class Day06_3_회원제프로그램5 {
	// 회원제 프로그램 [ 클래스 버전 ] 
	
	// 0. 회원 설계 => 회원 클래스 만들기 
		// 1. 필드 
			// 1. 아이디 2.비밀번호 3.이름 4.전화번호
	// 1. 초기메뉴 [ 1. 회원가입 2. 로그인 3.아이디찾기 , 4.비밀번호찾기 ]
		// 1. 회원가입시 입력받아 저장 
		// 2. 로그인시 아이디와 비밀번호가 동일하면 로그인처리 
		// 3. 아이디찾기는 이름과 전화번호가 동일하면 아이디 출력 
		// 4. 비밀번호찾기는 아이디와 전화번호가 동일하면 비밀번호 출력 
	// time : 17:25
	// 문제점 : 괄호 위치 실수 로 인한 코드 위치 잘못 입력
	public static void main(String[] args) {
		// 1. 초기메뉴 [ 1. 회원가입 2. 로그인 3.아이디찾기 , 4.비밀번호찾기 ]
		
		Scanner scanner = new Scanner(System.in); //입력객체 로드
		Member5[] memberlist = new Member5[100]; // 배열 설정 100개
		
		while(true) {//무한루프 시작
			
			System.out.println("------------------------");
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기"); int ch=scanner.nextInt();
			// 메뉴 선택 출력 및 선택
			if(ch==1) {//회원가입 선택
				System.out.println(" 회원가입 ");
				System.out.println(" ID : "); String id =scanner.next();
				System.out.println(" Password : "); String pw =scanner.next();
				System.out.println(" Name : "); String name =scanner.next();
				System.out.println(" Phone : "); String phone =scanner.next();
				// id,pw,name,phone 입력
				//배열 
				Member5 member = new Member5(); // 배열 사용(불러오기)
				member.id=id; // 배열 member의 필드값 id에 id 대입
				member.name=name;//배열 member의 필드값 name에 name 대입
				member.phone=phone;//배열 member의 필드값 phone에 phone 대입
				member.pw=pw;//배열 member의 필드값 pw에 pw 대입
				
				//아이디 등록
				boolean check=true; // ture,false 설정
				for(Member5 temp : memberlist) { // 배열 길이만큼 반복문시작
					if(temp!=null && temp.id.equals(id)) { // 배열 값이 null이 아니고 입력한 id값과 배열의 id값이 같으면
						System.out.println("중복된 아이디 입니다."); //중복 id 안내문 출력
						check= false; // 위 조건 만족시 check 는 false 로 진행,
						break; //위조건시 반복문 탈출
					}
				}if(check==true) { //check 가 true 일 때 진행
					int i =0; //  인덱스번호 i 설정
					for(Member5 temp : memberlist) { // memberlist 길이만큼 반복문시행
						if(temp==null) { // temp 번째 값이 null이라면
							System.out.println("가입 완료"); // 가입완료 출력
							memberlist[i] = member; // memberlist 의 i번째 값에 member (id,name,phone,pw) 대입
							break; //저장완료 시 반복문 탈출
						}
						i++; // index번호 추가 (+1)
					}
				}
			}
			else if(ch==2) { //로그인 페이지
				System.out.println(" 로그인 페이지 ");
				System.out.println(" ID : ");  String id = scanner.next();
				System.out.println(" Password : ");  String pw = scanner.next();
				//로그인 페이지 동작 id, pw 입력
				boolean check = false; //true,false 설정
				for (Member5 temp : memberlist) { // 멤버리스트크기까지 반복문 시행
					if(temp!=null && temp.id.equals(id)&&temp.pw.equals(pw)) { //temp번째 값이 null이 아니고 입력한id,pw가 동일하면 
						System.out.println(" 로그인 성공 "); //로그인성공 출력
						check = true; // check = true 설정
						break;// 로그인 확인용 반복문 탈출
					}
				}if (check== false) { System.out.println(" 일치하는 정보가 없습니다. "); break;} //id나 pw 가 불 일치시 로그인 실패 출력
			}
			else if(ch==3) { // id 찾기 선택
				boolean check = false;//true,false 설정
				System.out.println(" ID 찾기");// id 찾기 메뉴, 입력id,전화번호로 id 찾기
				System.out.println(" Name : "); String logname = scanner.next();
				System.out.println(" Phone : "); String logPhone = scanner.next();
				for(Member5 temp: memberlist) {//배열 길이만큼 반복문 시행
					if(temp!=null &&temp.name.equals(logname) && temp.phone.equals(logPhone)) {
						// temp번째 값이 null이 아니고 temp째 이름,전화번호와 입력값과 동일 하다면
						System.out.println(" ID 찾기 성공 "); //  id 찾기 성공 출력 
						System.out.println(" ID : "+ temp.id); // id 출력
						check = true; //check true 설정
						break; //찾기용 반복문 탈출
						
					}
				}
					if( check == false) { System.out.println(" 일치하는 정보가 없습니다.");} // 이름or 전화번호 불일치 시 실패 출력
					
				
			}
			else if(ch==4) {//비밀번호 찾기 선택
				boolean check = false; // check false 설정
				System.out.println(" Password 찾기"); //비밀번호 찾기 메뉴 출력& id와 전화번호 입력
				System.out.println(" ID : "); String logid = scanner.next();
				System.out.println(" Phone : "); String loginPhone = scanner.next();
				for(Member5 temp: memberlist) {//배열길이까지 반복문 시행
					if(temp!=null &&temp.id.equals(logid) && temp.phone.equals(loginPhone)) {
						// temp번째 값이 null이 아니고 temp째 id,전화번호와 입력값과 동일 하다면
						System.out.println(" PW 찾기 성공 ");  // pw 찾기 성공 출력 
						System.out.println(" PW : "+ temp.pw); // pw 출력
						check = true; //check true 변경
						break; //반복문 탈출
						
					}
				}
					if( check == false) { System.out.println(" 일치하는 정보가 없습니다.");} // id or 전화번호 불 일치 시 실패 출력
					
				
			}
			else {System.out.println(" 잘못된 입력입니다.");} // 1~4번외 값 입력시 출력 
		}
	}
}
