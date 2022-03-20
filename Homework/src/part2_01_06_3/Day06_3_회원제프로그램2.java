package part2_01_06_3;

import java.util.Scanner;

public class Day06_3_회원제프로그램2 {
	// 회원제 프로그램 [ 클래스 버전 ] 
	
	// 0. 회원 설계 => 회원 클래스 만들기 
		// 1. 필드 
			// 1. 아이디 2.비밀번호 3.이름 4.전화번호
	// 1. 초기메뉴 [ 1. 회원가입 2. 로그인 3.아이디찾기 , 4.비밀번호찾기 ]
		// 1. 회원가입시 입력받아 저장 
		// 2. 로그인시 아이디와 비밀번호가 동일하면 로그인처리 
		// 3. 아이디찾기는 이름과 전화번호가 동일하면 아이디 출력 
		// 4. 비밀번호찾기는 아이디와 전화번호가 동일하면 비밀번호 출력 
	
	// time : 29.37 // 4
	// 문제점 : 클래스용 배열 작성 실수
	//		  배열 선언 실수
	//        클래스 사용 미숙	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member2[] memberlist = new Member2[100];
	
		while(true) {
		System.out.println("=============");
		System.out.println("1.회원가입 2.로그인 3.ID찾기 4.비밀번호 찾기"); int ch =scanner.nextInt();
		
			if(ch==1) {
				System.out.println("회원가입 페이지");
				System.out.println("id : "); String id =scanner.next();
				System.out.println("pw : "); String pw =scanner.next();
				System.out.println("name : "); String name = scanner.next();
				System.out.println("phone : "); String phone = scanner.next();
				
				Member2 member = new Member2();
				member.id=id;
				member.password=pw;
				member.name=name;
				member.phone=phone;
				
				boolean check = true;
				for(Member2 temp : memberlist) {
					if(temp!=null&& temp.id.equals(id)) {
						System.out.println(" 사용되고있는 아이디입니다. ");
						break;
					}
				}
				if (check==true) {
					int i =0;
					for (Member2 temp : memberlist) {
						if(temp==null) {
						 memberlist[i] = member ;
							System.out.println(" 회원 가입이 완료되었습니다.");
							break;
						}
						i++;
					}
				}
			}	
			else if(ch==2) {
				System.out.println("로그인 페이지");
				System.out.println(" id :"); String id = scanner.next();
				System.out.println(" pw :"); String pw = scanner.next();
				
				boolean check = false;
				for (Member2 temp : memberlist) {
					if(temp!=null&& temp.id.equals(id)&&temp.password.equals(pw)) {
						System.out.println( "로그인 성공");
						check = true;
						break;
					}
					
				}if(check ==false) {
					System.out.println("동일한 정보가 없습니다.");
				}
			}
			else if(ch==3) {
				System.out.println("id찾기");
				System.out.println(" 이름 "); String name = scanner.next();
				System.out.println(" 전화번호 "); String phone = scanner.next();
				
				boolean check = false;
				for (Member2 temp : memberlist) {
					if(temp!=null && temp.name.equals(name)&& temp.phone.equals(phone)) {
						System.out.println( " ID 찾기 성공");
						System.out.println("ID :"+temp.id);
						check= true;
						break;
					}
				}if (check=false) {
					System.out.println("일치하는 정보가 없습니다.");
				}
			}
			else if(ch==4) {
				
				System.out.println("pw 찾기");
				System.out.println(" id : "); String id= scanner.next();
				System.out.println(" phone : "); String phone= scanner.next();
				boolean check = false;
				for (Member2 temp : memberlist) {
					if(temp!=null && temp.id.equals(id)&&temp.phone.equals(phone)) {
						System.out.println(" 비밀번호 찾기 성공");
						System.out.println("비밀번호 : "+temp.password);
						check = true;
						break;
					}
				}if (check = false) {
					System.out.println(" 일치하는 정보가 없습니다.");
				}
				
			}
			else {System.out.println(" 잘못된 입력입니다.");}
		}
			
	}
}
