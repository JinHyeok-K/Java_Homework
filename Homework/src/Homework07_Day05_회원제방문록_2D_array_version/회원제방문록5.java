package Homework07_Day05_회원제방문록_2D_array_version;

import java.util.Scanner;

public class 회원제방문록5 { //time : [19:04]
	// 회원제 방문록 프로그램 [ 2차원배열 ] 
			// 1. 초기메뉴 [ 1. 회원가입 2.로그인 ] 
				// 1. 회원가입 [ 아이디 , 비밀번호 , 이름 ]
				// 2. 로그인 [ 아이디 , 비밀번호 동일하면 로그인처리 ]
			// 2. 로그인시 메뉴 [ 1. 방문록쓰기 2. 로그아웃 ]
				// 1. 방문록쓰기 [ 제목 , 내용 , 작성자(로그인된아이디) ]
				// 2. 로그아웃 [ 초기메뉴로 돌아가기 ]
		public static void main(String[] args) {
			// 회원제 방문록 프로그램 [ 2차원배열 ] 
						// 1. 초기메뉴 [ 1. 회원가입 2.로그인 ] 
							// 1. 회원가입 [ 아이디 , 비밀번호 , 이름 ]
							// 2. 로그인 [ 아이디 , 비밀번호 동일하면 로그인처리 ]
				
			
			//문제점 : break ;위치 실수
			String[][] 회원 = new String[10][3];
			String[][] 게시판 = new String[10][3];
			
			// 배열 선언 완료
			
			while(true) { // master while start
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("================");
				System.out.print("1.회원가입 2. 로그인"); int 초기선택 = scanner.nextInt();
				
				if(초기선택 == 1) {
					// 회원가입
					// 1. 회원가입 [ 아이디 , 비밀번호 , 이름 ]
					
					//1-1 회원가입
					//1-2 id 중복 체크
					// 회원가입용 내용 입력
					
					System.out.print("id : "); String id=scanner.next();
					System.out.print("pw : "); String pw=scanner.next();
					System.out.print("name : "); String name=scanner.next();
					//1-2 중복체크
					
					boolean check = true;
					for(int i =0; i<회원.length;i++) {
						if(회원[i][0]!=null&&회원[i][0].equals(id)) {
							System.out.println("이미 사용하고 있는 id입니다.");
							check = false;
							break;
						}
					}//중복체크 완료
					
					if(check== true) {
					//입력 완료
						for (int i = 0 ; i < 회원.length ; i++) {
							if(회원[i][0]==null) {
								회원[i][0] = id; 회원[i][1] = pw;회원[i][2] = name;
								System.out.println("회원가입 완료");
								break;
							}//회원가입 완료 1-1
						}
					}
					
				}
				else if(초기선택 == 2) {
					//	// 2. 로그인 [ 아이디 , 비밀번호 동일하면 로그인처리 ]
					System.out.println("================");
					System.out.print(" id :"); String id=scanner.next();
					System.out.print(" pw :"); String pw=scanner.next();
					//입력완료
					//id 비번 동일시 로긴 체크
					boolean check = false; //로그인 완료시 true => 로그인 메뉴 진행용
					for (int i=0;i<회원.length;i++) {
						if(회원[i][0]!=null&&회원[i][0].equals(id)&&회원[i][1].equals(pw)) {
							System.out.println("로그인 완료");
							check = true;
							break;
						}
						else {
							System.out.println("일치하는 정보가 없습니다.");
						}break;
					}
					
					if(check==true) { //로그인 성공시 시행
						//로그인시 방명록 보여줌
						while(true) {
						System.out.println("==================");
						System.out.println("번호\t제목\t내용\t작성자");
						for (int i = 0 ; i<게시판.length;i++) {
							if(게시판[i][0]!=null) { //하나라도 있으면 게시글 오픈
								System.out.printf("%d\t%s\t%s\t%s\n",i+1,게시판[i][0],게시판[i][1],게시판[i][2]); //
							}							
						}// 로그인시 바로 글 나타남
						
						// 작성글 메뉴 
						System.out.println("==================");
						System.out.print("1.방문록 쓰기 2. 로그아웃 | 선택:>"); int 선택=scanner.nextInt();
						//선택 입력
						if(선택 == 1) {
							//글 작성 입력
							System.out.print("제목 : "); String 제목 =scanner.next();
							System.out.print("내용 : "); String 내용 =scanner.next();
							// 빈공간에 입력값 저장 진행
							for(int i = 0 ; i<게시판.length;i++) {
								if(게시판[i][0]==null) {
								게시판[i][0] = 제목; 게시판[i][1] = 제목; 게시판[i][2] = id;  
								System.out.println("작성 완료");
								break;
								}
							}
							
						}
						else if(선택 ==2) {
							System.out.println("로그아웃 합니다.");
							break;
						}
						
						
						
						// 2. 로그인시 메뉴 [ 1. 방문록쓰기 2. 로그아웃 ]
						// 1. 방문록쓰기 [ 제목 , 내용 , 작성자(로그인된아이디) ]
						// 2. 로그아웃 [ 초기메뉴로 돌아가기 ]	
						}//sub while end
					}
					
					
				}
				
				
			} // master while end
			
		}
}
