package Day06;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.Content;

public class Day06_06_비회원제게시판 { // class start
	
			// 게시판 [클래스 버전]
				// 0. 게시물 설계 => 클래스 선언
					// 1. 필드 : 제목, 내용, 작성자, 비밀번호
					// 생성자 : 사용 유무 선택-> 사용
				// 1. 첫 화면 [모든 게시물 출력(번호, 제목, 작성자)]
				// 2. 메뉴 [ 1. 글 쓰기 2. 글 보기]
					// 1. 글 쓰기 [ 제목, 내용, 작성자, 비밀번호를 입력받아 객체 생성] => 4개 변수 객체화
					// 2. 글 보기 [ 해당 글 번호의 입력받아 해당 글 상세페이지(번호, 작성자, 제목, 내용 모두 출력) ]
						// 글 번호는 배열에 저장되는 순서 [인덱스]
						// 글 보기 메뉴
				// 3. 글 보기 메뉴 [1. 뒤로가기 (목록보기) 2.삭제 3. 수정]
					// 1. 삭제 시 : 비밀번호 입력받아 동일하면 삭제
					// 2. 수정 시 : 비밀번화 입력받아 동일하면 제목과 내용만 수정
	
	
	public static void main(String[] args) { // main start
		
		// 준비 [ 모든 { } 안에서 사용되는 변수 선언]
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[100];
			// * Board 객체를 100개를 저장할 수 있는 1차원 배열 선언
		
		// 프로그램 실행
		while(true) { //프로그램 실행 무한루프 [종료조건 : x ]
			
			System.out.println(" --------- 커뮤니티 ------------");
			//  ====== ====== ====== ====== ====== 모든 게시물 조회 start ====== ====== ============ ====== ====== ====== ======
			System.out.println("번호\t작성자\t내용");
				// 배열 내 모든 객체(게시물) 출력 반복문
				int index = 0; // 인덱스 변수 [ 배열 내 객체 수 체크 ]
				for (Board board : boardlist) {
					
					if(board!=null) { // 만약에 해당 board 객체가 내용 물이 있으면 출력
					System.out.printf("%d\t%s\t%s \n", 
							index,board.writter,board.title);
					} // 형식문자 : %s 문자 %d 숫자
							// %숫자s: 숫자만큼 자리 차지 [만약에 해당 데이터 만큼 없으면 공백]
					index++; //인덱스 증가
				}
			//  ====== ====== ====== ====== ====== 모든 게시물 조회 end ====== ====== ====== ============ ====== ====== ======
			
			//  ====== ====== ====== ====== ====== 글 쓰기 Code start ====== ====== ============ ====== ====== ======
			System.out.println("1. 글 쓰기 2. 글 보기");
			int ch = scanner.nextInt();
			if( ch==1) { // 1. 글 쓰기
				// 1. 4개 변수를 입력 받는다.
				System.out.println(" ------------------ 글 쓰기 페이지 ---------------------- ");
				System.out.println(" title : "); 			String  title =scanner.next();
				System.out.println(" contents : ");			String  contents = scanner.next();
				System.out.println(" writter : ");			String	writter = scanner.next();
				System.out.println(" password : ");			String	password = scanner.next();
				// 2. 4개 변수를 객체화 [ 객체를 만들어서 4개 변수를 객체 내 필드에 저장 ]
				Board board = new Board(title,contents,writter,password);
							// 4개 필드를 갖는 생성자 사용
				// 3. 배열 내 빈 공간을 찾아서 빈 공간에 객체 대입
				int i =0;
				for(Board temp : boardlist) {// 빈 공간 찾았으면
					if(temp==null) {
						boardlist[i]=board; // 해당 인덱스에 새로운 객체 저장
						break;
					}
					i++;
				}
				//  ====== ====== ====== ====== ====== 글 쓰기 Code end ====== ====== ====== ============ ====== ====== ======
			}
			else if(ch==2){	// 2. 글 보기
				System.out.println(" 게시물 번호(인덱스) 선택 : "); int bno=scanner.nextInt();
				System.out.println(" ------------ 게시물 상세 페이지 --------------");
				// 반복문 사용 목적 X => 출력할 위치[인덱스] 입력 받았기 때문에(int bno=index 번호)
				System.out.printf("작성자 : %s 제목 : %s \n", 
						boardlist[bno].writter,boardlist[bno].title);
				
				System.out.printf("내용: %s \n",boardlist[bno].contents);
				System.out.println("-------------------------------");
				System.out.println("1. 목록보기(뒤로가기) 2. 글삭제 3. 글수정");
				int ch2 = scanner.nextInt();
				if (ch2==1)	{
					
				}
			//  ====== ====== ====== ====== ====== 글 삭제 Code start ====== ====== ====== ============ ====== ====== ======
				else if( ch2==2) { // 2. 글삭제 
					// 비밀 번호 입력 받아 게시글 비밀번호 동일 시 삭제
					System.err.println("삭제 하려면 비밀번호가 필요");
					System.out.println(" 비밀번호 : "); String pwcheck=scanner.next();
					
					if (boardlist[bno].password.equals(pwcheck)) {
						boardlist[bno] = null;
						
						for(int i = bno;i<boardlist.length;i++) {
										// 배열 길이 = 100 인덱스 : 0~99
							// * 검색된 게시물의 인덱스 부터 마지막 인덱스 까지 1씩 증가
							if( i == boardlist.length-1) boardlist[ boardlist.length-1 ] = null;
							// i가 마지막인덱스 와 같으면 마지막인덱스에는 null 대입
							else boardlist[i]=boardlist[i+1]; // 삭제된 게시물 다음 게시물
							//마지막 인덱스가 아니면 인덱스 당기기
							/*
							  // 만약에 2번 인덱스 삭제시
							   * 2인덱스 = 3인덱스
							   * 3인덱스 = 4인덱스
							   * .
							   * .
							   * .
							   * 98인덱스 = 99인덱스 [0번~99번 -> 100개 인덱스]
							   * 99인덱스 = null [99번 인덱스 : 마지막 인덱스
							
							
							
							*/
							if(i==boardlist.length-1) 
								boardlist[boardlist.length-1]=null;;	
								// i가 마지막 인덱스와 같으면 마지막 인덱스에는 null 대입
								
						}
					}
					else {
						System.err.println(" 알림)) 비밀번호가 다릅니다 [삭제  실패 ]");
					}
					// 삭제 후에 삭제된 인덱스 뒤로 한깐 씩 앞으로 이동
						// why? 만약에 안하면 해당 코드가 없을 경우 배열 내 공백 발생 
							// ex ) 0 , 1, 2 중 삭제 1을 하면 0, 2 존재 '1'이 공백
					
				}
//				====== ====== ====== ======  글 삭제 Code end ====== ====== ====== ============ ====== ====== ======

//				====== ====== ====== ======  글 수정 Code start ====== ====== ====== ============ ====== ====== ======
				else if (ch2==3) {
					// 1. 비밀번호 입력 받기
					System.err.println("수정 하려면 비밀번호가 필요");
					System.err.println(" 비밀번호 : "); String pwcheck=scanner.next();
					// 2. bno: 현게시물(보고있는 게시물) 의 인덱스 객체 내 비밀 번호와 동일 한지 확인
					if (boardlist[bno].password.equals(pwcheck)) {
						// 해당 게시물의 제목과 내용을 새로 입력받아 현 게시물 객체에 제목과 내용에 대입.
						System.out.println(" title 변경 : "); 	boardlist[bno].title = scanner.next();
						System.out.println(" 내용 변경 : "); 		boardlist[bno].contents = scanner.next();
					}
					else System.out.println("알림) 패스워드가 다릅니다 [수정 실패]");
				}
//				====== ====== ====== ======  글 수정 Code end ====== ====== ====== ============ ====== ====== ======
				else {System.err.println("알림) 알수 없는 입력입니다.");}
			}
			else {
				System.err.println("알림) 알수 없는 입력입니다.");
			}
			
			
			
		} // 프로그램 while end
	} // main end
} // class end
