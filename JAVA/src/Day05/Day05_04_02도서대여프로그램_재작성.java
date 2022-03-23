package Day05;

import java.util.Scanner;

/*
사용문법 1. 입출력 2.변수/자료형/연산  3.제어/반복 4.제어/반복 5.배열

* 도서 대여 console 프로그램
1. 배열 변수
	1. 회원 [ 아이디(중복x) , 비밀번호 ]
	
	2. 도서 [ 도서명(중복x) , 도서대여여부(대여가능,대여중) , 대여인(로그인시 아이디) ]
	
	회원 [100][3] : [ID][PW][도서대여여부]
	도서목록[100][3] : [도서명][도서대여여부][대여인]
2. 초기메뉴
	1.회원가입 2.로그인 
		1.회원가입시 아이디 중복체크 
		2.로그인 성공시 로그인메뉴 , 로그인 실패시 로그인실패 출력 
3. 로그인시 메뉴 
	1. 도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃
			1. 도서검색시 도서명이 일치하면 도서명과 도서대여여부 출력
		2. 도서목록시 모든 도서명 출력 
		3. 도서대여시 도서대여여부가 가능할때 도서대여 처리
		4. 도서반납시 본인이 대여한 도서만 반납 처리 
		5. 로그아웃 초기메뉴로 

4. 로그인시 아이디가 admin 이면 관리자메뉴 
	1. 도서등록 2.도서목록 3.도서삭제(도전) 4.로그아웃
		1. 도서등록시 도서명을 입력받아 도서 등록처리
		2. 도서목록시 모든 도서명 출력 
		3. 도서삭제시 삭제할 도서명을 입력받아 동일한 도서명 삭제[ null ]
		4. 로그아웃시 초기메뉴로 
*/


public class Day05_04_02도서대여프로그램_재작성 { // class start

	public static void main(String[] args) { //main start
		
		String[][] 회원 = new String[101][3]; 	// 101행 3열 배열 선언
												//admin 계정용으로 1행 더 추가
		String[][] 도서목록 = new String[100][3]; 
		Scanner scanner = new Scanner(System.in);
		
//		Admin (관리자) 설정
		회원[100][0] = "admin";
		회원[100][1] = "admin";
		
		while(true) { //$1 while 도서 대여 프로그램 시작
//		1. 배열 변수
//		1-1. 회원 [ 아이디(중복x) , 비밀번호, 도서 대여 여부 ]
//		2-1. 도서 [ 도서명(중복x) , 도서대여여부(대여가능,대여중) , 대여인(로그인시 아이디) ]
		
//		2.초기메뉴
//		Main menu
		System.out.println(" =================================");
		System.out.println(" ========= 도서 대여 프로그램 =========");
		System.out.println(" 1. 회 원 가 입     	2.  로 그 인    ");
		System.out.println(" =================================");
		System.out.println(" 선택 :    ");
		
//		# 최초 메뉴에서의 선택 (1. 회원 가입 | 2. 로그인)
			int Mainmenu = scanner.nextInt();
			
			if (Mainmenu == 1) { // #1. 회원가입 선택 시
				System.out.println("==== 회원가입 페이지 ====");
				System.out.print(" Member ID: "); 			String id = scanner.next();
				System.out.print(" Member Password : "); 	String password = scanner.next();
				// id | password | 입력
				
				// 1-1 ID 중복 체크
				boolean idcheck = true; // idcheck switch 
				for(int i=0;i<회원.length;i++){ // 회원 ID 길이만큼 반복 수행
					if (회원[i][0]!=null && 회원[i][0].equals(id)) {
						System.err.println(" 알림)) 이미 사용하고 있는 ID 입니다.");
						idcheck = false; // 100회 반복하면서 ID 부분이 null 이 아닌 조건에서 회원 ID 와 입력한 ID 가 동일 시 false;
						break; // 회원 ID 검색 반복문 탈출
					}// 1-1 회원 ID check if 문 end
				} // 1-1 회원 ID check for 문 end
				
				// 1-2 ID/PW/이름 저장 부분
				if (idcheck==true) { // idcheck 가 true 일 때 회원가입 시행 | [ID/PW/이름 저장 부분] if 문 start
					for (int i=0; 0<(회원.length);i++) { // 회원 ID 길이 만큼 반복 | [ID/PW/이름 저장 반복문] start
						if (회원[i][0] == null) { 	// [ID/PW/이름 저장 if문] start
							회원[i][0] = id;				// 회원 배열의 i행 1열 은 ID
							회원[i][1] = password; 		// 회원 배열의 i행 2열은 비밀번호
														// 회원 i 행의 1열이 null 로 초기값이 되어있으면(비어있음),
														// 회원i 행의 1열에  입력한 ID를, i행의 2열에 입력한 password를 저장;
						System.err.println(" 알림)) 회원가입이 되었습니다. "); // 저장 완료
						break;// 저장하는 반복문 탈출
						}// 1-2 [ID/PW/이름 저장 if문] end
					}// 1-2 [ID/PW/이름 저장 반복문] end
				}// 1-2 [ID/PW/이름 저장 부분] if 문 end
			}//1. 회원가입 선택 시 if select end 
			
			if (Mainmenu == 2) {// #2.  로 그 인  선택 시 if문 start
				System.out.println(" 로그인 할 ID :"); 	String id= scanner.next();
				System.out.println(" 비밀 번호 :"); 		String password= scanner.next();
														// ID & Password 입력
				boolean logincheck = false; // 로그인 체크용 switch
				for(int i=0;i<회원.length;i++){ // 회원 ID 길이만큼 반복 수행 | pw check | 2 for 문 start
					if( 회원[i][0] !=null && 회원[i][0].equals(id) &&	 // #null 이 아니다 = 회원이 있다. 
							회원[i][1].equals(password)) { // 2 if문 start
						System.err.println(" 알림)) 로그인 성공");
						logincheck = true; // 로그인 성공 값 저장
					} // 2 if문 end
				}// 2 for 문 end

				
				
				// 2-1 관리자 계정 로그인 
				// login 하는 ID 가 admin 일 시 관리자용 메뉴 open
				while(logincheck) { // 관리자 메뉴 on | 2-1 while start
					if ("admin".equals(id)) { //2-1 if start
						System.out.println(" ==================== ");
						System.out.println(" ===== 관리자 메뉴 ===== ");
						System.out.println(" 1. 도서 등록 2. 도서 목록 3. 도서 삭제 4. 로그아웃  ");
						System.out.println(" 선택 : "); 
					int admin_menu = scanner.nextInt();
//					    =================== 관리자 메뉴내 1번 선택 =================== 
						if (admin_menu==1) { // 도서 등록 갯수 | // 2-1-1 if start
							// 도서 중복 체크 start
							
//							================= 중복 도서 check 추후 수정
//							boolean bookcheck =true; // bookcheck switch
//							for (int j=0;j<도서목록.length;j++) {
//								if (도서목록[j][0]!=null && 도서목록[i][0].equals(bookname)) {
//									System.err.println("이미 등록된 도서 입니다.");
//									bookcheck =false;
//									break;
//								}
//							}
//							================= 중복 도서 check 추후 수정
							
						System.out.println("등록하실 도서의 갯수를 입력하세요"); int regist_book_num =scanner.nextInt();
							for(int j=0;j<regist_book_num;j++) { // 도서 등록 갯수 만큼 등록 시작 | 2-1-1 for start
								System.out.println(" 등록하는 도서 :"); String bookname= scanner.next();
								
								
								도서목록[j][0]=bookname;
								도서목록[j][1]="대여가능";
								도서목록[j][2]="대여가능";
							} // 2-1-1 for start
						}// 2-1-1 if start
//						=================== 관리자 메뉴내 2번 선택 =================== 
						/*
						 	// 1-1 도서 중복 체크 예정용 참고 code
							boolean idcheck = true; // idcheck switch 
							for(int i=0;i<회원.length;i++){ // 회원 ID 길이만큼 반복 수행
								if (회원[i][0]!=null && 회원[i][0].equals(id)) {
									System.err.println(" 알림)) 이미 사용하고 있는 ID 입니다.");
									idcheck = false; // 100회 반복하면서 ID 부분이 null 이 아닌 조건에서 회원 ID 와 입력한 ID 가 동일 시 false;
									break; // 회원 ID 검색 반복문 탈출
								}// 1-1 회원 ID check if 문 end
							} // 1-1 회원 ID check for 문 end
						 */
						
						
						if (admin_menu==2) { // 2-1-2 도서 목록 펼침 if start
							int count_book=0; // count_book 선언
							for (int j=0;j<도서목록.length;j++) { // 2-1-2-1 도서 목록 펼침 for start
								if(도서목록[j][0]!=null) {  //2-1-2-1 도서 목록 펼침 if start | 보유도서 수 count
									count_book++; // 도서가 등록된 것 하나당 count_book 1씩 증가
								} //2-1-2-1 도서 목록 펼침 if end | 보유도서 수 count
							}// 2-1-2-1 도서 목록 펼침 for end
							if (count_book<=0) { // 2-1-2-2 if start (등록 보유 도서 없음 알림) | count_book 이 없을 때 = null
								System.err.println("등록된 도서가 없습니다. 새로 도서를 추가해 주세요");
							} // 2-1-2-2 if end (등록 보유 도서 없음 알림)
							else if(count_book>0) { // 2-1-2-3 if start (등록 보유 도서 펼침) | count_book 이 있을 때 = 도서 보유중
								System.out.println("도서 이름"+"\t"+"대여 가능 여부"+"\t"+"대여자");
								for (int j=0;j<도서목록.length;j++) { // 2-1-2-3 for start | 도서목록 출력
									if(도서목록[j][0]!=null) { // 2-1-2-3-1 if start | null 아닌 값 확인
									System.out.println(도서목록[j][0]+"\t"+도서목록[j][1]+"\t\t"+도서목록[j][2]);
									}  // 2-1-2-3-1 if end | null 아닌 값 확인
								} // 2-1-2-3 for end | 도서목록 출력
							}// 2-1-2-3 if end (등록 보유 도서 펼침)
						}// 2-1-2 도서 목록 펼침 if end 
						
//						=================== 관리자 메뉴내 3번 선택 =================== 	
						if (admin_menu==3) { // 2-1-3 도서 삭제 메뉴 if 시작 |
							int count_null_book = 0; // 도서 삭제용 check 변수 선언
							for(int j=0;j<도서목록.length;j++) { //2-1-3 도서목록 check for start
								if(도서목록[j][0]!=null) { // 2-1-3-1 변수 counting if start
									count_null_book++;
								} // 2-1-3-1  변수 counting if end
								if(count_null_book<=0) { // 2-1-3-2 null 도서 check if start
									System.err.println("삭제할 도서가 없습니다.");
									break;
								} // 2-1-3-2 null 도서 check if end
								else if(count_null_book>0) { // 2-1-3-3 삭제 도서 check if start
									System.out.println("도서 이름"+"\t"+"대여 가능 여부"+"\t"+"대여자");
									for (int p=0;p<도서목록.length;p++) { // 2-1-3-3-1 보유 도서 목록 출력 for start
										if(도서목록[p][0]!=null) { // 2-1-3-3-1-1 보유 도서 목록 출력 if start
										System.out.println(도서목록[p][0]+"\t"+도서목록[p][1]+"\t\t"+도서목록[p][2]);
										}  // 2-1-3-3-1-1 보유 도서 목록 출력 if end
									}  // 2-1-3-3-1 보유 도서 목록 출력 for end
									System.out.println("삭제하실 도서의 번호를 입력 해 주세요"); int del_book=scanner.nextInt();
									도서목록[del_book-1][0] = null; 
									도서목록[del_book-1][1] = null;
									도서목록[del_book-1][2] = null;
									break;
									// index 번호가 0번부터 저장되므로 1번쨰느 0번째로 하기 위해 -1 진행
								} // 2-1-3-3 삭제 도서 check if start
							}//2-1-3 도서목록 check for end
						}  // 2-1-3 도서 삭제 메뉴 if end |
						if (admin_menu==4) { // 2-1-4 if start
							break;
						} // 2-1-4 if end
//						logincheck =false;
					}//2-1 if end
//					logincheck =false;
//					"admin".equals(id)
//					else 
					// 일반 회원 로그인 후 메뉴창 2-1	
					if (!"admin".equals(id)) { // 일반회원 menu 2-1 if start 
						// 일반 회원 로그인 완료 후 메뉴 창 =========================
						System.out.println("=========================");
						System.out.println("1.대출 현황   2.도서 메뉴 3. 로그아웃");
						System.out.println("=========================");
						System.out.println(" 선택 :    ");
						// ==================================================
						int submenu =scanner.nextInt();
						if (submenu ==1) { // 2-1-1 일반 회원 대출 내역 확인 if start
							for (int i=0;i<회원.length;i++) { //2-1-1-1 대출 현황 파악 for 문 start
								if(회원[i][2]==null) { // 2-1-1-1-1 대출 현황 파악 if 문 start
									System.err.println("대출 내역이 없습니다.");
									break;
								}// 2-1-1-1-1 대출 현황 파악 if 문 start
							}// 2-1-1-1 대출 현황 파악 for 문 end
						}// 2-1-1 일반 회원 대출내역 확인 if end
						
						if (submenu==2) { // 2-1-2 도서 메뉴 펼침 if start
							while(logincheck) {
								System.out.println(" ==================== ");
								System.out.println(" ===== 도서 메뉴 ===== ");
								System.out.println(" 1. 도서 목록 2. 도서 대출 3. 도서 반납 4. 뒤로  ");
								System.out.println(" 선택 : "); 
							int book_menu = scanner.nextInt();
								if (book_menu == 1) {
									int book_check = 0;
									for (int j =0;j<도서목록.length;j++) {
										if(도서목록[j][0]!=null) {
											book_check++;
										}
									}
									if(book_check<=0) {
										System.err.println("도서 목록이 없습니다.");
									}
									else if(book_check>0) {
										System.out.println("도서 이름"+"\t"+"대여 가능 여부"+"\t"+"대여자");
										for (int p=0;p<도서목록.length;p++) { // 2-1-3-3-1 보유 도서 목록 출력 for start
											if(도서목록[p][0]!=null) { // 2-1-3-3-1-1 보유 도서 목록 출력 if start
											System.out.println(도서목록[p][0]+"\t"+도서목록[p][1]+"\t\t"+도서목록[p][2]);
											}  // 2-1-3-3-1-1 보유 도서 목록 출력 if end
										}
									}
									
								}
								if (book_menu == 2){
									System.out.println(" 대출하실 도서를 선택해 주세요");
									System.out.println(" 선택 : ");
									int select_book = scanner.nextInt();
								//		회원["id"][2] = 도서목록[select_book][0];
										도서목록[select_book-1][1] = "대출중";
										도서목록[select_book-1][2] = id;
								}
								
								if (book_menu == 3){
									System.out.println(" 도서를 반납합니다.");
									System.out.println(" 아무 숫자를 눌러주세요");
									int select_book2 = scanner.nextInt();
										도서목록[select_book2-1][1] = "대여 가능";
										도서목록[select_book2-1][2] = "대여 가능";
								}
								
								if (book_menu == 4){
									break;
								}
						}// 2-1-2 도서 메뉴 펼침 if end
						}	
							
						if (submenu==3) {
							break;
						}
							
						
					}// 일반회원 menu 2-1 if start
				} // 2-1 while end
				logincheck =false;
				
					
				
				
				
				// 일반 회원 로그인 후 메뉴창 2-1
				while(logincheck) { // logincheck 가 true 일 때 로그인 후 메뉴창 open | 2-1 while start
					int submenu = scanner.nextInt();
					if (submenu ==1) {
						for (int i=0;i<회원.length;i++) { // 대출 현황 파악 for 문
							if(회원[i][2]==null) {
								System.err.println("대출내역이 없습니다.");
								break;
							}
						}
					}
				} // 2-1 while end
			
				
//				System.out.println(" 로그인 할 ID :"); 	String 11= scanner.next(); // 2번 선택 후 메뉴 표시
				
			if(logincheck == false) System.err.println("알림 )) 회원 정보가 없거나 다릅니다.");
			} // 2.  [로 그 인  선택 시] if 문 end	
			
		} // $1 while 도서 대여프로그램 무한반복[while] end
	} // main end
}// class end
