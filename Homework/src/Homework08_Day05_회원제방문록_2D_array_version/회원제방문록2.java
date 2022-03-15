package Homework08_Day05_회원제방문록_2D_array_version;

import java.util.Scanner;

public class 회원제방문록2 { // time [28:00] | 1회
	// 회원제 방문록 프로그램 [ 2차원배열 ] 
			// 1. 초기메뉴 [ 1. 회원가입 2.로그인 ] 
				// 1. 회원가입 [ 아이디 , 비밀번호 , 이름 ]
				// 2. 로그인 [ 아이디 , 비밀번호 동일하면 로그인처리 ]
			// 2. 로그인시 메뉴 [ 1. 방문록쓰기 2. 로그아웃 ]
				// 1. 방문록쓰기 [ 제목 , 내용 , 작성자(로그인된아이디) ]
				// 2. 로그아웃 [ 초기메뉴로 돌아가기 ]
//	20:46 21:14
	// 문제점  괄호처리 미스 / break 누락 미스
	public static void main(String[] args) {
		// 1. 초기메뉴 [ 1. 회원가입 2.로그인 ] 
		// 1. 회원가입 [ 아이디 , 비밀번호 , 이름 ]
		// 2. 로그인 [ 아이디 , 비밀번호 동일하면 로그인처리 ]
		String[][] 회원 = new String[10][3];
		String[][] 게시판 = new String[10][3];
		
		while(true) {//while start
			//회원가입 시작 
			Scanner scanner=new Scanner(System.in); //입력
			
			System.out.println("===========");
			System.out.println(" 회원제 방문록");
			System.out.println("===========");
			System.out.print("1.회원가입 2.로그인  선택:>"); int 초기선택=scanner.nextInt();
			if(초기선택 ==1 ) {//초기선택 if ==1 start
				//1. 회원가입 [ 아이디 , 비밀번호 , 이름 ]
				
				
				// 1-1 회원가입
				System.out.print("id :"); 		String id=scanner.next(); 
				System.out.print("pw :");		String pw=scanner.next();
				System.out.print("name :");		String name=scanner.next();
				
				
				//id중복체크
				boolean check = true;
				for(int i=0;i<회원.length;i++) {
					if(회원[i][0]!=null&&회원[i][0].equals(id)) {
						System.out.println("동일한 id가 존재합니다.");
						check = false;
						break;
					}
				}
				
				if(check==true) {
					for (int i =0 ; i<회원.length;i++) { // 회원가입 for 시작
						if(회원[i][0]==null) {
							회원[i][0] = id; 회원[i][1] = id; 회원[i][2] = name;
							System.out.println("회원가입 완료");
							break;
						}
						else {
							System.out.println("회원가입 제한");
						}
				}
					}//회원가입 for end 
				
			} //초기선택 if ==1 end
			
			if(초기선택 ==2 ) { // 2. 로그인 [ 아이디 , 비밀번호 동일하면 로그인처리 ]
				System.out.print(" id : ");  String id =scanner.next();
				System.out.print(" pw : ");  String pw =scanner.next();
				
				// c체크
				boolean check = false;
				for(int i=0;i<회원.length;i++) {
					if(회원[i][0]!=null&&회원[i][0].equals(id)&&회원[i][1].equals(pw)) {
						System.out.println("로그인 되었습니다.");
						check= true;
						break;
					}
					else {
						System.out.println("일치하는 정보가 없습니다.");
						break;
					}
				}
				// 2. 로그인시 메뉴 [ 1. 방문록쓰기 2. 로그아웃 ]
				// 1. 방문록쓰기 [ 제목 , 내용 , 작성자(로그인된아이디) ]
				// 2. 로그아웃 [ 초기메뉴로 돌아가기 ]
				if (check==true) {
					while(true) {
					System.out.println("=================");
					System.out.println("번호\t제목\t내용\t작성자");
						for(int i =0 ; i<게시판.length;i++) {
							if(게시판[i][0]!=null) {
								System.out.printf("%d\t%s\t%s\t%s\n",i+1,게시판[i][0],게시판[i][1],게시판[i][2]);		
							}
							
						}
					System.out.println("=================");
					System.out.print("1.방문록 쓰기 2. 로그아웃 | 선택 :>" ); int 글메뉴 = scanner.nextInt();
						if(글메뉴==1 ) {
							System.out.print("제목 :\n"); String 제목=scanner.next();
							System.out.print("내용 :\n"); String 내용=scanner.next();
							
							 for (int i=0;i<게시판.length;i++) {
								 if(게시판[i][0]==null) {
									 게시판[i][0] = 제목; 게시판[i][1] = 내용; 게시판[i][2] =id;
									 System.out.println("작성완료");
									 break;
								 }
								 
								 }
							 }
						else if(글메뉴==2) {
							System.out.println("로그아웃 합니다.");
							break;		 

						}
					
					}
					
					
					
					
					
				}
			}
			
			
			
			
			
			
		}//while 1 end
	}//me	
}//ce
