package part2_01_06_3;

import java.util.Scanner;

public class Day06_3_회원제프로그램3 {
	// 회원제 프로그램 [ 클래스 버전 ] 
	
	// 0. 회원 설계 => 회원 클래스 만들기 
		// 1. 필드 
			// 1. 아이디 2.비밀번호 3.이름 4.전화번호
	// 1. 초기메뉴 [ 1. 회원가입 2. 로그인 3.아이디찾기 , 4.비밀번호찾기 ]
		// 1. 회원가입시 입력받아 저장 
		// 2. 로그인시 아이디와 비밀번호가 동일하면 로그인처리 
		// 3. 아이디찾기는 이름과 전화번호가 동일하면 아이디 출력 
		// 4. 비밀번호찾기는 아이디와 전화번호가 동일하면 비밀번호 출력 
	// 1. 필드 
				// 1. 아이디 2.비밀번호 3.이름 4.전화번호
		//time [24:00] / 4
	//  문제점 : 클래스 사용 실수 
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		Member3[] memberlist = new Member3[100];
		
		// 1. 초기메뉴 [ 1. 회원가입 2. 로그인 3.아이디찾기 , 4.비밀번호찾기 ]
		while(true) {
			
		System.out.println(" =========================");
		System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기"); int ch=scanner.nextInt();
		
		//1. 회원가입
			if(ch==1 ) {
				System.out.println("회원가입 페이지");
				System.out.println(" id: "); String id = scanner.next();
				System.out.println(" pw: "); String pw = scanner.next();
				System.out.println(" name: "); String name = scanner.next();
				System.out.println(" phone: "); String phone = scanner.next();
				
				Member3 member = new Member3();
				
				member.id =id;
				member.name =name;
				member.pw =pw;
				member.phone=phone;
				
				// 회원가입 시작 
				// id 중복체크
				boolean check = true;
				for(Member3 temp : memberlist) {
					if(temp!=null && temp.id.equals(id)) {
						System.out.println("사용중인 id 입니다.");
						check = false;
						break;					
					}
				}
				
				if(check==true) {
					int i= 0;
					for (Member3 temp: memberlist) {
						if(temp==null ) {
							System.out.println("회원가입 완료");
							memberlist[i] = member;
							break;
						}
						i++;
					}
				}
			}
			else if(ch==2 ) {//2. 로그인
				System.out.println(" 로그인 페이지 ");
				System.out.println(" id : ");  String id = scanner.next();
				System.out.println(" pw : ");  String pw = scanner.next();
				
				boolean check = false;
				for(Member3 temp : memberlist) {
					if(temp!=null && temp.id.equals(id)&& temp.pw.equals(pw)) {
						System.out.println(" 로그인 성공");{
						check= true;
						break;
						}
					}				
				}if (check == false) {
					System.out.println(" 일치하는 정보가 없습니다. ");
				}
			}
			else if(ch==3 ) {
				System.out.println(" id 찾기 ");
				System.out.println("name : "); String name = scanner.next();
				System.out.println("phone : "); String phone = scanner.next();
				boolean check= false;
				for (Member3 temp :memberlist) {
					if(temp!=null && temp.name.equals(name)&& temp.phone.equals(phone)) {
						System.out.println("  id 를 찾았습니다.");
						System.out.println("id :"+temp.id);
						check=true;
						break;
					}
				}if (check==false)
					{System.out.println(" 일치하는 정보가 없습니다.");}
				
			}
			else if(ch==4 ) {
				System.out.println(" pw 찾기 ");
				System.out.println("id : "); String id = scanner.next();
				System.out.println("phone : "); String phone = scanner.next();
				boolean check= false;
				for (Member3 temp :memberlist) {
					if(temp!=null && temp.id.equals(id)&& temp.phone.equals(phone)) {
						System.out.println("  pw 를 찾았습니다.");
						System.out.println("pw :"+temp.pw);
						check=true;
						break;
					}
				}if (check==false) {
					System.out.println(" 일치하는 정보가 없습니다.");
				}
			}	
			else {System.out.println(" 잘못된 입력입니다. ");
			
			}
		}
	}
}
