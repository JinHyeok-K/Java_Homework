package Homework07_Day05_회원제방문록_2D_array_version;

import java.util.Scanner; //입력객체 불러오기

public class 회원제방문록5_1 { //time : [19:04]
//	============================================== 설계 조건 ============================================== 	
	// 회원제 방문록 프로그램 [ 2차원배열 ] 
			// 1. 초기메뉴 [ 1. 회원가입 2.로그인 ] 
				// 1. 회원가입 [ 아이디 , 비밀번호 , 이름 ]
				// 2. 로그인 [ 아이디 , 비밀번호 동일하면 로그인처리 ]
			// 2. 로그인시 메뉴 [ 1. 방문록쓰기 2. 로그아웃 ]
				// 1. 방문록쓰기 [ 제목 , 내용 , 작성자(로그인된아이디) ]
				// 2. 로그아웃 [ 초기메뉴로 돌아가기 ] 
//	==================================================================================================== 
	
//	===================================== 질 문 사 항=======================================================
//	Q1) 이번 과제에서 for문 (반복문) 시 i의(초기값;범위값;증감값) 으로 진행 하였는데
//	 	다른 방법으로 진행하는 방법은?  ( temp 사용해서 |temp 사용방법이 좀 헷갈립니다.)
//	Q2) 코드를 치다보니 모범 코드(강사님 코드)과 좀 다르게 변형이 되었는데
//		메모리나 속도 측면에서 어느것이 더 효율적인지? (코드가 짧아서 큰 차이는 안나는건 알고는 있습니다)
//		강사님코드 : 로그인 메뉴 선택 => 로그인 입력 성공 후 바로 로그인 유지용 while 적용
//	    제 코드 : 로그인 메뉴 선택 => 로그인 입력 성공 & 로그인 실패 처리 후에 로그인 유지용 while 적용
//		
//	====================================================================================================
		public static void main(String[] args) {  // main thread 시작
		
			
			//문제점 : break ;위치 실수
			String[][] 회원 = new String[10][3];   // 2차원배열 회원 선언 10X3 
			String[][] 게시판 = new String[10][3]; // 2차원배열 회원 선언 10X3 
			
			// 배열 선언 완료
			
			while(true) { // master while start  | 무한루프 시작 [종료조건 X]
				Scanner scanner = new Scanner(System.in); //입력 객체 사용
				
				System.out.println("================"); // ==== 출력
				System.out.print("1.회원가입 2. 로그인"); int 초기선택 = scanner.nextInt(); // 회원가입 , 로그인 메뉴 출력 | 초기선택값에 입력값 대입
				
				if(초기선택 == 1) { //초기선택값이 1번일 경우 시작
					// 회원가입
					// 1. 회원가입 [ 아이디 , 비밀번호 , 이름 ]
					
					//1-1 회원가입
					//1-2 id 중복 체크
					// 회원가입용 내용 입력
					
					System.out.print("id : "); String id=scanner.next();   // ID & 비밀번호 & 이름 입력
					System.out.print("pw : "); String pw=scanner.next();
					System.out.print("name : "); String name=scanner.next();
					//1-2 중복체크
					
					boolean check = true; // 진행 or stop 선언 => check 변수에 진행 설정 : id중복체크 용
					for(int i =0; i<회원.length;i++) { // i가 0부터 회원배열의 길이전까지 1씩증가하면서 반복 진행
						if(회원[i][0]!=null&&회원[i][0].equals(id)) { // 회원 배열의 i번째 id 가 null 이 아니고 입력한 id와 같으면
							System.out.println("이미 사용하고 있는 id입니다."); // 이미 사용하고 있는 id 출력
							check = false; // 위 조건 달성 시 check stop  더 이상 진행 X
							break; // 반복문 탈출
						}
					}//중복체크 완료
					
					if(check== true) { //check 변수가 진행일 때 : id중복체크 pass 일 경우 진행
					//입력 완료
						for (int i = 0 ; i < 회원.length ; i++) { // i가 0부터 회원배열의 길이 전까지 1씩 증가하여 반복 시행
							if(회원[i][0]==null) { // 회원배열의 i번째 id 가 비어있다면
								회원[i][0] = id; 회원[i][1] = pw;회원[i][2] = name; //각각 i번째 id,비밀번호,이름 대입
								System.out.println("회원가입 완료"); //회원가입 완료 출력
								break; // 회원의 정보가 저장이 되면 반복문 탈출
							}//회원가입 완료 1-1
						}
					}
					
				}
				else if(초기선택 == 2) { // 로그인 메뉴를 선택 시 
					//	// 2. 로그인 [ 아이디 , 비밀번호 동일하면 로그인처리 ]
					System.out.println("================"); // === 출력
					System.out.print(" id :"); String id=scanner.next(); //로그인을 위한 id & pw 입력  
					System.out.print(" pw :"); String pw=scanner.next();
					//입력완료
					//id 비번 동일시 로긴 체크
					boolean check = false; //로그인 완료시 true => 로그인 메뉴 진행용
					for (int i=0;i<회원.length;i++) {// i가 0부터 회원배열의 길이 전만큼 1씩 증가하여 반복문 시행
						if(회원[i][0]!=null&&회원[i][0].equals(id)&&회원[i][1].equals(pw)) { // 회원 배열의 i번째 id가 null이 아닌 상태에서
							// id 와 비밀번호가 입력한 값과 같다면
							System.out.println("로그인 완료"); //로그인 완료 출력
							check = true; // check 를 진행으로 변경 (switching)
							break;// 로그인 완료 시 반복문 탈출
						}
						else { // 입력값과 배열 내 값이 일치 하지 않는다면
							System.out.println("일치하는 정보가 없습니다."); // 일치하지 않는 정보라 출력
						}break; // 반복문 탈출 => 회원가입창으로 이동
					}
					
					if(check==true) { //로그인 성공시 시행
						//로그인시 방명록 보여줌
						while(true) { // sub while 시작( 로그인  유지용 으로 사용)
						System.out.println("=================="); // == 출력
						System.out.println("번호\t제목\t내용\t작성자"); // 방명록 내용 구분용으로 출력 | 
						for (int i = 0 ; i<게시판.length;i++) { // i가 0부터 게시판의 길이 전 만큼 1씩 증가하여 반복 시행
							if(게시판[i][0]!=null) { //게시판 i번재 배열이 하나라도 null 이라면 작성된 게시글 보여줌 각 다음과 같음 | 번호,제목,내용,작성자
								System.out.printf("%d\t%s\t%s\t%s\n",i+1,게시판[i][0],게시판[i][1],게시판[i][2]); //
							}							
						}// 로그인시 바로 글 나타남
						
						// 작성글 메뉴 
						System.out.println("=================="); // === 출력
						System.out.print("1.방문록 쓰기 2. 로그아웃 | 선택:>"); int 선택=scanner.nextInt(); //로그인 성공 시 선택 메뉴 , 선택값 입력
						//선택 입력
						if(선택 == 1) { // 1번 입력 , 대입 시
							//글 작성 입력
							System.out.print("제목 : "); String 제목 =scanner.next(); //게시글 작성 위해 입력 (제목과 내용)
							System.out.print("내용 : "); String 내용 =scanner.next();
							// 빈공간에 입력값 저장 진행
							for(int i = 0 ; i<게시판.length;i++) { // i가 0부터 게시판의 길이 전만큼 1씩 증가
								if(게시판[i][0]==null) { //게시판 i번째 제목의 내용이 null 이라면
								게시판[i][0] = 제목; 게시판[i][1] = 내용; 게시판[i][2] = id; //입력한 값을 (제목,내용) 
								//게시판의 각 배열에 저장(제목=제목에, 내용=내용에, 그리고 i,3번째 배열엔 로그인한 id 대입  
								System.out.println("작성 완료"); // 대입 완료 후에 작성 완료 출력
								break; // 반복문 탈출 => 로그인 메뉴로 이동
								}
							}
							
						}
						else if(선택 ==2) { // 선택값이 2일 때
							System.out.println("로그아웃 합니다."); //로그아웃 출력
							break; //반복문 탈출  초기메뉴(회원가입,로그인 메뉴)로 이동
						}
						
						}//sub while end
					}
					
					
				}
				
				
			} // master while end
			
		}
}
