package Homework08_Day05_회원제방문록_2D_array_version;

import java.util.Scanner;

public class 회원제방문록1 {//time [78:00]| 7  // 설계도대로만 진행
	// 회원제 방문록 프로그램 [ 2차원배열 ] 
			// 1. 초기메뉴 [ 1. 회원가입 2.로그인 ] 
				// 1. 회원가입 [ 아이디 , 비밀번호 , 이름 ]
				// 2. 로그인 [ 아이디 , 비밀번호 동일하면 로그인처리 ]
			// 2. 로그인시 메뉴 [ 1. 방문록쓰기 2. 로그아웃 ]
				// 1. 방문록쓰기 [ 제목 , 내용 , 작성자(로그인된아이디) ]
				// 2. 로그아웃 [ 초기메뉴로 돌아가기 ]
//	19:20 | 20:38
	// 문제점 : 무한루프 break 미스
//			   배열 크기 착각 => for 반복횟수 미스
	// 			형식문자 미스 / 연산자 미스 ==써야되는데 != 사용
	public static void main(String[] args) {
		
		String[][] 회원 = new String[100][3];
		String[][] 게시판 = new String[100][3];
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			
			// 1. 초기메뉴 [ 1. 회원가입 2.로그인 ] 
			// 1. 회원가입 [ 아이디 , 비밀번호 , 이름 ]
			// 2. 로그인 [ 아이디 , 비밀번호 동일하면 로그인처리 ]
			System.out.println(" 회원제 방문록 ");
			System.out.print(" 1. 회원가입 2.로그인 "); int 초기선택= scanner.nextInt();
			
			if(초기선택 == 1) {
				
				
				// 1. 회원가입 [ 아이디 , 비밀번호 , 이름 ]
				
				
				// 1-1 회원가입 (아이디, 비밀번호 , 이름)
				// 1-2 아이디 중복체크
				
				// 1-1 회원가입 (아이디, 비밀번호 , 이름)
				System.out.print(" id : "); String id= scanner.next();
				System.out.print(" pw : "); String pw= scanner.next();
				System.out.print(" name : "); String name= scanner.next();

				
				// 1-2 아이디 중복체크
				boolean check = true;
				for(int i=0;i<회원.length;i++) {
					if(회원[i][0]!=null&&회원[i][0].equals(id)) {
						System.out.println("이미 존재하는 id입니다.");
						
						check = false;
						break;
					}
				}
				if(check == true) {
					for(int i =0 ; i <회원.length;i++) {
						if(회원[i][0]==null) {
							회원[i][0] = id; 회원[i][1] = pw; 회원[i][2] = name;
						
						}
					}	System.out.println("회원가입 완료");
				// 회원정보 등록
				}
				
				
				}	
			else if(초기선택 == 2) {
				
				System.out.println("로그인 페이지");
				System.out.print(" id :"); String id = scanner.next();
				System.out.print(" pw :"); String pw = scanner.next();
				
				// 2. 로그인 [ 아이디 , 비밀번호 동일하면 로그인처리 ]
//				회원 id / pw 동일 시
				boolean check= false;
				for(int i = 0 ; i<회원.length;i++) {
					if(회원[i][0]!=null&& 회원[i][0].equals(id)&&
							회원[i][1].equals(pw)) { 
						System.out.println("로그인 완료");
						
						check = true;
						break;
					}else{ 
						System.err.println("일치하는 정보가 없습니다.");
						break;
					}
				}
				// 2. 로그인시 메뉴 [ 1. 방문록쓰기 2. 로그아웃 ]
				// 1. 방문록쓰기 [ 제목 , 내용 , 작성자(로그인된아이디) ]
				// 2. 로그아웃 [ 초기메뉴로 돌아가기 ]
				if(check==true) {
					while(true) {
				
						System.out.println("------------------------");
						System.out.println("--------- 방문록 ---------");
						System.out.println("번호\t작성자\t제목\t내용");
							// 모든 방문록 출력 
							for( int j = 0 ; j<게시판.length ; j++  ) { // 게시물 배열 반복문 처리 
								if( 게시판[j][0] != null ) { // 게시물이 없는 인덱스는 제외 
									System.out.printf("%d\t%s\t%s\t%s \n" , 
											j+1 , 
											게시판[j][2] , 
											게시판[j][0] , 
											게시판[j][1] );	
								}
							}
						
						
//					System.out.println("방문록 메뉴 ");
//					System.out.println("============================ ");
//					System.out.print("제목\t내용\t작성자\n");
//					for (int i=0;i<게시판.length;i++) {
//						if(게시판[i][0]!=null) {
//						System.out.print(게시판[i][0]+"\t"); System.out.print(게시판[i][1]+"\t");
//						System.out.print(게시판[i][2]+"\n");
//						}
					
					
					
					System.out.print("\n1.방문록 쓰기 2.로그아웃"); int 글쓰기선택 = scanner.nextInt();
					if(글쓰기선택 ==1 ) {
						System.out.print("제목 :"); String 제목 =scanner.next();
						System.out.print("내용 :"); String 내용 =scanner.next();
						
						for(int i=0;i<게시판.length;i++) {
							if(게시판[i][0]==null) {
								게시판[i][0] = 제목; 게시판[i][1] = 내용;
								게시판[i][2] = id;
								System.out.println("작성완료");
								break;
							}
					
					}
						}
					else if(글쓰기선택 ==2 ) {
						System.out.println(" 로그아웃");
						break;
					}
					}
					
				}
				
				
				
				
				
			}
			
		
		
		
		}
			
		
	}
}
				
						
