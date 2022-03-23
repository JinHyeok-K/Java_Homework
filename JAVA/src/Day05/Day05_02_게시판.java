package Day05;

import java.util.Scanner;

public class Day05_02_게시판 { // c s
	
	// 회원제 방문록 프로그램 [ 2차원 배열 ] 추후 class& DB version 사용
		// 1. 초기 메뉴 [ 1. 회원가입 2.로그인]
			// 1. 회원가입 [ 아이디, 비밀번호, 이름]
			// 2. 로그임 [아이디, 비밀번호 동일하면 로그인 처리]
		// 2. 로그인 시 메뉴 [ 1. 방문록 쓰기 2. 로그아웃]
			// 1. 방문록 쓰기 [ 제목, 내용, 작성자(로그인된 아이디)]
			// 2. 로그아웃 [ 초기메뉴로 돌아가기 ]
	
	
	public static void main(String[] args) { // m s
		
		// 준비 [ 전체에서 쓰이는 변수; 전역 변수  ]
		Scanner scanner = new Scanner(System.in); // 입력 객체
			// 회원 100명[id,pw,name] 저장하는 배열		
		String[][] memberlist = new String[100][3]; // 100행 3열 =>300칸==> 회원당 1행 [1열=id][2열=pw][3열=name]
			// 방문록 100개[title, contents, writter] 저장하는 배열
		String[][] boardlist = new String[100][3]; // 게시물당 1행
		
		// 초기메뉴
		
		while(true) { //무한 루프 [ 종료조건 : X]
			System.out.println("------------------------");
			System.out.println("------ 회원제 방문록 -------");
			System.out.println("------------------------");
			System.out.printf(" 1.회원 가입   2.로그인 선택 :"); int ch = scanner.nextInt();
			
			if (ch==1) { // 1. 회원가입
				System.out.println("---- 회원가입 페이지 ----");
				System.out.print(" Member ID: "); 			String id = scanner.next();
				System.out.print(" Member Password : "); 	String password = scanner.next();
				System.out.print(" Member Name : ");		String name = scanner.next();
				// String 3개 변수를 입력 받아 memberlist 2차원 배열에 저장
					// 1. 빈 공간[정수=0,객체(문자열)=null] 을 찾아서 저장 [ 만약에 빈 공간이 없으면 회원 100명 초과 ]
					// 2. 아이디 중복체크.
				
				// 아이디 중복 체크 [검색]
					// 기존 회원에 id와 동일하면 회원가입 불가
				boolean idcheck = true;
				for(int i=0;i<memberlist.length;i++) { // id check for start
					
					if ( memberlist[i][0]!=null && memberlist[i][0].equals(id) ) {// ==null : 회원이 없다.  !=null : 회원이 존재.
						System.err.println(" 알림)) 이미 사용하고 있는 ID 입니다.");
						idcheck = false; // 저장 X | 회원가입 불가능하게 idcheck 변수를 false로 변경
						break;
					}
				} // id check for end
					
				// 저장 부분
				if (idcheck == true) { // idcheck 가 true 인 경우에만 회원가입 처리
					for(int i=0;i<memberlist.length;i++) {
						if( memberlist[i][0] == null ) {	// i번째 행에 id가 없으면 = 빈 공간
							
							memberlist[i][0]= id; 	
							memberlist[i][1]= password;
							memberlist[i][2]= name;  // i 번째 각 열에 데이터 저장
							System.err.println(" 알림)) 회원가입이 되었습니다. ");
							break; // 저장했으면 끝 [1번 저장]
						} 
					} //저장부분 for end
				} // 저장부분 if end
			}// if end ( ch==1 )
			
			else if (ch ==2) { // 2. 로그인 선택
				
				System.out.println("---- 로그인 페이지 ----");
				System.out.print(" Member ID: "); 			String id = scanner.next();
				System.out.print(" Member Password : "); 	String password = scanner.next();
				
				// 배열 내 데이터가 입력 받은 id와 password가 동일하면 로그인 처리
				 // 로그인 처리 for start
				boolean logincheck = false; // 로그인 성공 기본 값;
				for (int i =0; i<memberlist.length;i++) {
					if( memberlist[i][0] !=null && memberlist[i][0].equals(id) &&	 // null 이 아니다 = 회원이 있다. 
							memberlist[i][1].equals(password)) { 
						// i번째 행에 id와 i번째 행에 password가 입력 받은 값과  equals 같으면
							// null 은 equals 불가능, 비교 연산자(==) 가능
							// null 은 equals 가 불가능
							// null 은 객체가 아니기 때문에 equals 불가능
						System.err.println(" 알림)) 로그인 성공");
						
						logincheck = true; // 로그인 성공 값 저장
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
						while(true) { // 로그인 시 메뉴 무한 루프 [ 종료 조건 : 로그 아웃]
							System.out.println("-------------------");
							System.out.println("------- 방문록 -------");
							System.out.println("번호\t작성자\t제목\t내용");
								// 모든 방문록 출력
								for(int j=0; j<boardlist.length;j++) {
									if( boardlist[j][0]!=null) { // 게시물이 없는 인덱스는 제외
									System.out.printf("%d\t%s\t%s\t%s \n",
											j,
											boardlist[j][2],
											boardlist[j][0],
											boardlist[j][1]);
									}
								}
							System.out.println("1. 방문록 남기기 2. 로그아웃 선택 : "); int ch2 = scanner.nextInt();
							
							if (ch2==1) {
								System.out.println("---------- 글 쓰기 ----------");
								System.out.println(" title : "); 		String title = scanner.next(); // 제목
								System.out.println(" contents : "); 	String contents = scanner.next(); // 내용
								// 저장(내용)
									for(int j = 0 ; j<boardlist.length;j++) {
										if(boardlist[j][0]==null) { // 배열 내 공백 찾아서 저장 | 배열 내 j번째 인덱스 게시물이 공백이며 저장
											boardlist[j][0] = title;
											boardlist[j][1] = contents;
											boardlist[j][2] = id; // 로그인 시 사용된 id를 대입
											System.err.println(" 알림)) 저장이 완료 되었읍!니다.");
											break;
										}
									}
							}
							else if(ch==2) {
								 System.err.println(" 알림)) 로그아웃" );
								 break;	 // 가장 가까운 반복문 탈출								 
							}
							else { System.err.println(" 알림)) 알수 없는 번호 입니다!"); }
						} // 회원 메뉴 end
////////////////////////////////////////////////////////////////////////////////////////////////////////////////						
						
					} //로그인 처리 if end
				} // for end 
				// 로그인 실패 시
				if(logincheck == false) System.err.println("알림 )) 회원 정보가 없거나 다릅니다.");
				
			} // ch==2 if  end
			else { System.err.println(" 알림)) 알수 없는 번호 입니다!"); }
		} // while1 end	 = 초기 메뉴 end
	} // m e
} // c e
