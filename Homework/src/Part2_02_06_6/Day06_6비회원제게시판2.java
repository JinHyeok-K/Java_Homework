package Part2_02_06_6;

import java.util.Scanner;

public class Day06_6비회원제게시판2 {
	// 비회원제 게시판 [ 클래스 버전 ]
	// 0. 게시물 설계 => 클래스 선언 
		// 필드 : 제목 , 내용 , 작성자 , 비밀번호
		// 생성자 : 사용유무 선택
	// 1. 첫화면 [ 모든 게시물(번호,작성자,제목) 출력 ]
	// 2. 메뉴 [ 1. 글쓰기 2.글보기 ]
		// 1. 글쓰기 [ 제목 , 내용 , 작성자 , 비밀번호 => 4개변수 -> 객체화 ]
		// 2. 글보기 [ 해당 글번호의 입력받아 해당 글 상세페이지(번호,작성자,제목,내용) 표시 ]
			// 글번호는 배열에 저장되는 순서 [ 인덱스 ]
			// 글보기 메뉴 
	// 3. 글보기 메뉴 [ 1. 목록보기 2.삭제 3.수정 ]
		// 1. 삭제시 :  비밀번호 입력받아 동일하면 삭제
		// 2. 수정시 :  비밀번호 입력받아 동일하면 제목과 내용만 수정 
	// time 44:10
	// 문제점 : 괄호 실수
	// 		  반복문 인자 실수
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		Board2[] boardlist = new Board2[100];
		// 1. 첫화면 [ 모든 게시물(번호,작성자,제목) 출력 ]
		while(true) {
					System.out.println("번호\t제목\t작성자");
			int index=0;
			for(Board2 temp : boardlist) {
				if(temp!=null) {
					
					System.out.printf("%d\t%s\t%s\n",index+1,temp.title,temp.writter);
				}
				index++;
			}
			
			
			
			// 2. 메뉴 [ 1. 글쓰기 2.글보기 ]
			System.out.println("1.글쓰기 2.글보기");  int ch1=scanner.nextInt();
			
			if(ch1==1) {
				System.out.println("글 쓰기 메뉴 ");
				System.out.println("제목 :"); String title=scanner.next();
				System.out.println("내용 :"); String contents=scanner.next();
				System.out.println("작성자 :"); String writter=scanner.next();
				System.out.println("비밀번호 :"); String password=scanner.next();
				
				Board2 board = new Board2(title, contents, writter, password);
				int i=0;
				for(Board2 temp : boardlist) {
					if(temp==null) {
						boardlist[i]= board;
						System.out.println("게시글 등록 완료");
						break;
					}
					i++;
				}
						
			}
			else if(ch1==2) {
				System.out.println("==========글보기==========");
				// 2. 글보기 [ 해당 글번호의 입력받아 해당 글 상세페이지(번호,작성자,제목,내용) 표시 ]
				// 3. 글보기 메뉴 [ 1. 목록보기 2.삭제 3.수정 ]
				// 1. 삭제시 :  비밀번호 입력받아 동일하면 삭제
				// 2. 수정시 :  비밀번호 입력받아 동일하면 제목과 내용만 수정 
				System.out.println("볼 글 번호를 입력하세요"); int view=scanner.nextInt();
				System.out.printf("%d\t%s\t%s\n%s\n",view,boardlist[view-1].title,boardlist[view-1].writter,
									boardlist[view-1].contents);
				System.out.println("1.목록보기 2.삭제 3.수정"); int ch2 = scanner.nextInt();
				if(ch2==1) {}
				else if(ch2==2) {
					System.out.println("비밀번호를 입력하세요"); String password=scanner.next();
					if(boardlist[view-1].password.equals(password)) {
						boardlist[view-1] = null;
						System.out.println("삭제 완료");
						
						for (int i=view-1;i<boardlist.length;i++) {
							if(i==boardlist.length-1) {
								boardlist[boardlist.length-1] = null;
								
							}
							else {
								boardlist[i] = boardlist[i+1];
							}
						}
					}
					else {System.out.println("비밀번호가 틀립니다.");}	
				}
				else if(ch2==3) {
					System.out.println(" 비밀번호를 입력하세요 "); String password1 =scanner.next();
					if(boardlist[view-1].password.equals(password1)) {
						System.out.println(" 수정합니다.");
						System.out.println(" 제목 : "); String 제목 =scanner.next();
						System.out.println(" 내용 : "); String 내용=scanner.next();
						System.out.println(" 작성자 : "); String 작성자=scanner.next();
						
						boardlist[view-1].title=제목;
						boardlist[view-1].contents=내용;
						boardlist[view-1].writter=작성자;
					}
				}
			}
		}
	}
}


