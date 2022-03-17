package Homework09_Day05_도서대여;

import java.util.Random;
import java.util.Scanner;

public class 도서대여1 {
	/*
	사용문법 1. 입출력 2.변수/자료형/연산  3.제어/반복 4.제어/반복 5.배열

	* 도서 대여 console 프로그램
	1. 배열 변수
		1. 회원 [ 아이디(중복x) , 비밀번호 ]
		2. 도서 [ 도서명(중복x) , 도서대여여부(대여가능,대여중) , 대여인(로그인시 아이디) ]
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
	*/ //13.08 | pause 13:17 | re 18:17 | pause 18:43 | re 19:00 | pause 19:40 |re 19:50
	// end 21:12
	public static void main(String[] args) {
//		1. 배열 변수
//		1. 회원 [ 아이디(중복x) , 비밀번호 ]
		String[][] 회원 = new String[3][3];
		String[][] 도서 = new String[10][3];
		
		// admin 설정 (난수로 랜덤한 배열에 admin 등록 )
//		Random random = new Random();
//		int admin_address = random.nextInt(회원.length);
//		String admin_ID ="admin";
//		String admin_PW ="admin";
//		회원[admin_address][0] = admin_ID; 회원[admin_address][1] = admin_PW;
////		// admin 등록 확인 code
//		System.out.println(admin_address);
//		System.out.println(회원[admin_address][0]);
//		System.out.println(회원[admin_address][1]);
//		
		// 배열 변수 선언 완료
//		2. 도서 [ 도서명(중복x) , 도서대여여부(대여가능,대여중) , 대여인(로그인시 아이디) ]
		while(true) { //master while start
			// 입력 객체 활성화
			try {
				Scanner scanner = new Scanner(System.in);
	//			2. 초기메뉴
	//			1.회원가입 2.로그인 
	//				1.회원가입시 아이디 중복체크 
	//				2.로그인 성공시 로그인메뉴 , 로그인 실패시 로그인실패 출력 
				System.out.println("===========");
				System.out.println("도서 대여 시스템");
				System.out.print("1.회원 가입 2.로그인 | 선택 :>"); int 초기선택 = scanner.nextInt();
				// 초기메뉴 입력 
				// 회원가입 메뉴 시작
				// 1-1 회원가입
				// 1-2 회원id 중복 체크
				
				
				// 
				
				if(초기선택==1) {
					// id,pw  입력
					System.out.print(" ID : "); String id=scanner.next();
					System.out.print(" PW : "); String pw=scanner.next();
					
					// id 중복 체크
					boolean check =true;
					for (int i=0;i<회원.length;i++) {
						if(회원[i][0]!=null&&회원[i][0].equals(id)) {
							System.out.println("이미 사용하고있는 id입니다.");
							check=false;
							break;
						}
					}
					if(check == true) {
						for (int i=0;i<회원.length;i++) {
							if(회원[i][0]==null) {
								회원[i][0] = id; 회원[i][1] = pw; // 회원 id pw 저장
								System.out.println("회원가입 완료");
								break;
							}
						}
					}	 
				}
				else if(초기선택==2) {
					System.out.println("ID : "); String id= scanner.next();
					System.out.println("pw : "); String pw= scanner.next();
					boolean check = false;
					for(int i=0;i<회원.length;i++){ // 회원 ID 길이만큼 반복 수행 | pw check
						
						if( 회원[i][0] !=null && 회원[i][0].equals(id) &&	 // null 이 아니다 = 회원이 있다. 
								회원[i][1].equals(pw)) {
							System.err.println(" 알림)) 로그인 성공");
							check = true; // 로그인 성공 값 저장
							break;
						}
	//					}else if( 회원[i][0] !=null && 회원[i][0].equals(id) &&	 // null 이 아니다 = 회원이 있다. 
	//							회원[i][1].equals(pw)&&회원[i][0].equals(admin_ID)){
	//						System.err.println(" 알림)) 관리자 로그인 성공");
	//						check = true; // 로그인 성공 값 저장
	//						break;
	//					}
						
					}
						if(check==true) {
							while(check) {
	//						 로그인시 아이디가 admin 이면 관리자메뉴
								if("admin".equals(id)) {
								System.out.println(" ====관리자 메뉴====");
								System.out.print("1.도서등록 2.도서목록 3.도서삭제 4.로그아웃 | 선택 :>"); int ad=scanner.nextInt();
								if(ad==1) { //1 도서등록 시작  1. 도서등록시 도서명을 입력받아 도서 등록처리 
										//도서명으로 등록 => : 도서명 / 도서 대여 여부 / 대여자
								System.out.print(" 등록할 도서 명 : "); String 도서명= scanner.next();
	//										도서명 입력 완료
	//										 도서명 도서 배열 입력 시작 
									for (int i=0;i<도서.length;i++) {
										if(도서[i][0]==null) {
											도서[i][0] = 도서명; 도서[i][1] = "가능"; 도서[i][2] = "-";// 비어있는 배열에 도서명 등록
											System.out.println(" 도서 등록 완료");
											break;
											}
										}
									}else if(ad==2) { // 도서 목록 
										
										System.out.println("===================================");	
										System.out.println("번호\t 도서명 \t대여가능여부\t 대여자");
										for (int i =0 ; i<도서.length;i++) { 
											if(도서[i][0]!=null&&도서[i][1]!=null&&도서[i][2]!=null) {
											System.out.printf("%d\t%s\t%s\t%s \n",i+1,도서[i][0],도서[i][1],도서[i][2]);
											}
										}
									}
									else if(ad==3) { //도서 삭제 
										System.out.print("삭제할 도서를(번호) 선택하세요 : "); int 삭제=scanner.nextInt(); //삭제 = 삭제할 도서 인덱스
										boolean del= true;
										for(int i=0;i<도서.length;i++) {
											if(도서[i][1]=="대여중") {
												System.out.println(" 대여중인 도서 입니다.");
												del = false;
												break;
											}
										}
										if(del=true) {
											System.out.print("선택하신 도서를 삭제합니다. ");
											도서[삭제-1][0] =null;  도서[삭제-1][1] =null; 도서[삭제-1][2] =null;
	//												도서[삭제-1] = null; //입력받은 삭제 index null 처리
											int i1 =삭제-1; // 인덱스 땡기기
											for(int j=i1;j<도서.length;j++) {
												if(j==도서.length-1) {
													도서[도서.length-1][0]=null;
													도서[도서.length-1][1]=null;
													도서[도서.length-1][2]=null;
													break;
												}
											도서[j] = 도서[j+1];
											}
										}
											
		//											
									}
									else if(ad==4) {
										System.out.println(" 로그아웃 합니다.");
										break;
										}
									else {System.out.println("알 수 없는 값을 입력하였습니다. ");}
								}
									if(!"admin".equals(id)) {	
										System.out.println("=========================");
										System.out.print("1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃"); int 회원선택=scanner.nextInt();
										if(회원선택==1 ) {
											System.out.println("검색 할 도서"); String 검색도서 = scanner.next();
											for(int i = 0 ; i<도서.length;i++) {
												if(도서[i][0]!=null&&도서[i][0].equals(검색도서)) {
													System.out.println("=======================");
													System.out.println("도서명\t 대출여부\t 대출자");
													System.out.printf("%s\t%s\t%s\n",도서[i][0],도서[i][1],도서[i][2]);
													
												}
												
											}
											
										}
										else if(회원선택==2) {
											System.out.println("===================================");	
											System.out.println("번호\t 도서명 \t대여가능여부\t 대여자");
											for (int i =0 ; i<도서.length;i++) {
												if(도서[i][0]!=null&&도서[i][1]!=null&&도서[i][2]!=null) {
												System.out.printf("%d\t%s\t%s\t%s \n",i+1,도서[i][0],도서[i][1],도서[i][2]);
												}
											}
										}
										else if(회원선택==3) { //3.도서대여
											System.out.print("대여하실 책?"); String 대여선택=scanner.next();
											boolean borrow=true;
											for (int i=0;i<도서.length;i++) {
												if(도서[i][1]=="대여중") {
													System.out.println(" 대여중인 책 입니다.");
													borrow =false;
													break;
												}
											}
											if (borrow==true) {
												for (int i =0 ; i<도서.length;i++) {
													if(도서[i][0]!=null&&도서[i][0].equals(대여선택)){
		//											if(도서[i][0]!=null&&도서[i][1]!=null&&도서[i][2]!=null) 
													System.out.println("대여 완료");
													도서[i][1]="대여중"; 도서[i][2]=id; 회원[i][2]=도서[i][0];  
													}
												}
											}
										}
										else if(회원선택==4) {
											for (int i =0 ; i<회원.length;i++) {
												if(회원[i][0]!=null&&회원[i][2]==null) {
													System.out.println(" 대여하신 책이 없습니다.");
													break;
												}
												else {
//												for(int j =0 ; j<회원.length;j++) {
													if(회원[i][0]!=null&&회원[i][0].equals(id)&&회원[i][2]!=null) {
													System.out.println(" 대여한 책을 반납합니다.");
													if(도서[i][2]!=null&&도서[i][2].equals(id)) {
														도서[i][1]="가능 "; 도서[i][2]="-";
														
//													}
												}
													}break;
												}
											}
										}
										else if(회원선택==5) {
											System.out.println("로그아웃");
											break;
										}
										else {}
									}
							
							}
						}
				}//if 2 end		
				else { System.out.println("잘못된 입력입니다.");}
			}catch(Exception e) {
				System.out.println("오류 발생");
				System.out.println(e);
			}
		}// while end
//			else { System.out.println(" 잘못된 입력입니다. ");}
		
	}//main end
}//class end
