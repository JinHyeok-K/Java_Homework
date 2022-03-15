package Homework08_Day05_회원제방문록_2D_array_version;

import java.util.Scanner;

public class 회원제방문록4 { //time [27:30]
	// 회원제 방문록 프로그램 [ 2차원배열 ] 
			// 1. 초기메뉴 [ 1. 회원가입 2.로그인 ] 
				// 1. 회원가입 [ 아이디 , 비밀번호 , 이름 ]
				// 2. 로그인 [ 아이디 , 비밀번호 동일하면 로그인처리 ]
			// 2. 로그인시 메뉴 [ 1. 방문록쓰기 2. 로그아웃 ]
				// 1. 방문록쓰기 [ 제목 , 내용 , 작성자(로그인된아이디) ]
				// 2. 로그아웃 [ 초기메뉴로 돌아가기 ]
		//문제점 break; 실수 
	public static void main(String[] args) { //메인 시작
		// 회원제 방문록 프로그램 [ 2차원배열 ] 
		//배열
		String[][] 회원 = new String[10][3];
		String[][] 게시판 = new String[10][3];
		
		// 1. 초기메뉴 [ 1. 회원가입 2.로그인 ]
		
		while(true) {
			
			Scanner scanner = new Scanner(System.in);
			
			
			System.out.println("==========");
			System.out.println("회원제 방문록 ");
			System.out.println("==========");
			System.out.print("1.회원가입 2.로그인 | 선택 :>"); int 초기선택 = scanner.nextInt();
			
			
			if(초기선택 == 1) {
				
				System.out.println("========");
				System.out.println(" 회원가입 ");
				System.out.println("========");
				System.out.print(" id : "); 	String id = scanner.next();
				System.out.print(" pw : ");		 String pw = scanner.next();
				System.out.print(" name : "); 	String name = scanner.next();
				
				// 1. 회원가입 [ 아이디 , 비밀번호 , 이름 ]
				//회원아이디 중복 체크
				boolean check = true;
				for(int i=0;i<회원.length;i++) {
					if(회원[i][0]!=null&&회원[i][0].equals(id)) {
						System.out.println("중복된 id 가 있습니다.");
						break;
					}
				}
				// 회원가입 
				if(check==true) {
					for(int i=0; i<회원.length;i++) {
						if(회원[i][0]==null) {
							회원[i][0] = id; 회원[i][1] = pw; 회원[i][2] = name;   
						}
					}
				}
				//회원가입 완료
			}// 초기선택 if end
			if(초기선택 == 2) {
				
				
				
				// 2. 로그인 [ 아이디 , 비밀번호 동일하면 로그인처리 ]
					System.out.println("=========");
					System.out.print(" id : "); String id = scanner.next();
					System.out.print(" pw : "); String pw = scanner.next();
					boolean check = false;
					for(int i = 0 ; i < 회원.length ; i++) {
						if(회원[i][0]!=null&&회원[i][0].equals(id)&&회원[i][1].equals(pw)) {
							System.out.println("로그인 완료");
							check = true;
							break;
						}
						else { 
						System.out.println("일치하는 정보가 없습니다.");
						
						}break;
					}
					
					//로그인 처리 완료
					
					if(check==true) { //로그인 성공 시 메뉴 시작
						while(true) {	
						System.out.println("========================");
						System.out.println("번호\t제목\t내용\t작성자");
						
						for (int i=0;i<게시판.length;i++) {
							if(게시판[i][0]!=null) {
								System.out.printf("%d\t%s\t%s\t%s\n",i+1,게시판[i][0],게시판[i][1],게시판[i][2]);
							}
						}
//						// 로그인시 방문록 나열
//						
						System.out.println("=========================");
						System.out.print("1.방문록 쓰기 2. 로그아웃 | 선택 :>"); int 선택 = scanner.nextInt();
						if(선택 ==1 ) {
							//글 작성
							System.out.print(" 제목 : "); String 제목 = scanner.next();
							System.out.print(" 내용 : "); String 내용 = scanner.next();
							for(int i=0;i<게시판.length;i++) {
								if(게시판[i][0]==null) {
									게시판[i][0] = 제목; 게시판[i][1] = 내용; 게시판[i][2] = id;
									System.out.println(" 작성 완료 ");
									break;
								}
							}
						}
						else if(선택 ==2) {
							System.out.println("로그아웃 합니다");
							break;
							
						}
						
						
//						번호 제목 내용 작성자 
						
					}
					
					// 2. 로그인시 메뉴 [ 1. 방문록쓰기 2. 로그아웃 ]
					// 1. 방문록쓰기 [ 제목 , 내용 , 작성자(로그인된아이디) ]
					// 2. 로그아웃 [ 초기메뉴로 돌아가기 ]
				}
			}
			
			
			
		

		// 2. 로그인 [ 아이디 , 비밀번호 동일하면 로그인처리 ]

		
		} //main while end
	}// main end
}// class end
