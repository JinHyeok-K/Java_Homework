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
		
		Scanner scanner = new Scanner(System.in);
		Member5[] memberlist = new Member5[100];
		
		while(true) {
			
			System.out.println("------------------------");
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기"); int ch=scanner.nextInt();
			
			if(ch==1) {
				System.out.println(" 회원가입 ");
				System.out.println(" ID : "); String id =scanner.next();
				System.out.println(" Password : "); String pw =scanner.next();
				System.out.println(" Name : "); String name =scanner.next();
				System.out.println(" Phone : "); String phone =scanner.next();
				
				//배열 
				Member5 member = new Member5();
				member.id=id;
				member.name=name;
				member.phone=phone;
				member.pw=pw;
				
				//아이디 등록
				boolean check=true;
				for(Member5 temp : memberlist) {
					if(temp!=null && temp.id.equals(id)) {
						System.out.println("중복된 아이디 입니다.");
						check= false;
						break;
					}
				}if(check==true) {
					int i =0;
					for(Member5 temp : memberlist) {
						if(temp==null) {
							System.out.println("가입 완료");
							memberlist[i] = member;
							break;
						}
						i++;
					}
				}
			}
			else if(ch==2) {
				System.out.println(" 로그인 페이지 ");
				System.out.println(" ID : ");  String id = scanner.next();
				System.out.println(" Password : ");  String pw = scanner.next();
				
				boolean check = false;
				for (Member5 temp : memberlist) {
					if(temp!=null && temp.id.equals(id)&&temp.pw.equals(pw)) {
						System.out.println(" 로그인 성공 ");
						check = true;
						break;
					}
				}if (check== false) { System.out.println(" 일치하는 정보가 없습니다. "); break;}
			}
			else if(ch==3) {
				boolean check = false;
				System.out.println(" ID 찾기");
				System.out.println(" Name : "); String logname = scanner.next();
				System.out.println(" Phone : "); String logPhone = scanner.next();
				for(Member5 temp: memberlist) {
					if(temp!=null &&temp.name.equals(logname) && temp.phone.equals(logPhone)) {
						System.out.println(" ID 찾기 성공 ");
						System.out.println(" ID : "+ temp.id);
						check = true;
						break;
						
					}
				}
					if( check == false) { System.out.println(" 일치하는 정보가 없습니다.");}
					
				
			}
			else if(ch==4) {
				boolean check = false;
				System.out.println(" Password 찾기");
				System.out.println(" ID : "); String logid = scanner.next();
				System.out.println(" Phone : "); String loginPhone = scanner.next();
				for(Member5 temp: memberlist) {
					if(temp!=null &&temp.id.equals(logid) && temp.phone.equals(loginPhone)) {
						System.out.println(" ID 찾기 성공 ");
						System.out.println(" ID : "+ temp.pw);
						check = true;
						break;
						
					}
				}
					if( check == false) { System.out.println(" 일치하는 정보가 없습니다.");}
					
				
			}
			else {System.out.println(" 잘못된 입력입니다.");}
		}
	}
}
