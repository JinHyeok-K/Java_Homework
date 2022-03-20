package Part2_02_06_6;

import java.util.Scanner;

public class Day06_6비회원제게시판1 {
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
	// time 73:15
	// 문제점 : 자료형 실수 
	//			인덱스 당기기 실수
	//		생성자 사용 미숙
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		Board1[] boardlist = new Board1[100];
		
		while(true) {
			
			
			
			
			// 1. 첫화면 [ 모든 게시물(번호,작성자,제목) 출력 ]
			System.out.println("----- 게시판 -----");
			
			
			int index =0;
			for(Board1 temp : boardlist) {
				if(temp!=null) {System.out.printf("%d\t%s\t%s\n", index+1,temp.writter,temp.title);}
				index++;
			}
			
			System.out.println("1.글쓰기 2.글보기"); int ch1=scanner.nextInt();
			
			if(ch1==1) {
				System.out.println("=========글쓰기메뉴=========");
				System.out.println(" 제목 : "); String title =scanner.next();
				System.out.println(" 내용 : "); String contents =scanner.next();
				System.out.println(" 작성자 : "); String writter =scanner.next();
				System.out.println(" 비밀번호 : "); String pw=scanner.next();
				
				Board1 board = new Board1(title, contents, writter, pw);
				
				int i = 0;
				for(Board1 temp : boardlist) {
				
					if(temp==null) {
						boardlist[i] = board;
						System.out.println("게시물등록완료");
						break;
					}
					i++;
				}
			}
			
			else if(ch1==2) {
				System.out.println("글 보기 : 볼 글을 선택하세요"); int ind=scanner.nextInt();
				System.out.printf("%s\t\t\t%s\t\n%s\n",boardlist[ind-1].title,boardlist[ind-1].writter,boardlist[ind-1].contents);
				
				
				System.out.println("---------------------\n");
				System.out.println("1.목록보기 2.삭제 3.수정"); int ch2= scanner.nextInt();
				// 3. 글보기 메뉴 [ 1. 목록보기 2.삭제 3.수정 ]
				if(ch2==1) {}
				else if(ch2==2) {
					System.out.println(" 비밀 번호를 입력하세요");  String del=scanner.next();
					if(boardlist[ind-1].pw.equals(del)) {
						System.out.println(" 삭제 완료");
						boardlist[ind-1]= null;
					
					// 인덱스땡기기 
					//
						for(int i=ind-1;i<boardlist.length;i++) {
							if (i == boardlist.length-1) {
								boardlist[boardlist.length-1]=null;
							}
							else {boardlist[i]  = boardlist[i+1];}
						}
					}
					else {System.out.println("비번 달라");}
				}
				else if(ch2==3) {
					
					System.out.println(" 비밀 번호를 입력하세요");  String pw2=scanner.next();
					
					for(Board1 temp:boardlist) {
						if(temp!=null && temp.pw.equals(pw2)) {
							System.out.println(" 제목 : "); String ti = scanner.next();
							System.out.println(" 내용 : "); String cont = scanner.next();
							
							boardlist[ind-1].title = ti;
							boardlist[ind-1].contents = cont;
							break;
						}
					}
					
					
				}
				else {System.out.println(" 잘못된 입력입니다.");}
			}
			else {System.out.println(" 잘못된 입력입니다.");}
			
			
			
			
		}
	}
}
