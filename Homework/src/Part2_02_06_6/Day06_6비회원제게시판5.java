package Part2_02_06_6;

import java.lang.reflect.Member;
import java.util.Scanner;

public class Day06_6비회원제게시판5 {
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
	// time [29"16]
	// 문제점 :괄호미숙 // 졸면서코딩
	
	// 1. 첫화면 [ 모든 게시물(번호,작성자,제목) 출력 ]
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in); //입력객체 로드
		Board5[] boardlist = new Board5[100]; // 배열 설정 100개
		
		while(true) { //무한루프 시작
			
			System.out.println("번호\t제목\t작성자"); // 번호/제목/작성자 출력
			int index = 0; //최초 인덱스 설정
			for(Board5 temp : boardlist) { // 배열 크기만큼 반복문 시작
				if(temp!=null) { // temp 가 null이 아닐때
					System.out.printf("%d\t%s\t%s\n",index+1,temp.title,temp.writter); // 인덱스, temp번째 타이틀, temp번째 저자 출
				}
				index++; //인덱스 1 증가
				
			}
			// 2. 메뉴 [ 1. 글쓰기 2.글보기 ]
			System.out.println("1.글쓰기 2글보기"); int ch=scanner.nextInt(); //최초 메뉴 출력 / 및 선택
			if(ch==1) { //글쓰기 선택
				System.out.println("글 쓰기 메뉴"); 
				System.out.println(" 제목 :"); String title = scanner.next();
				System.out.println(" 내용 :"); String contents = scanner.next();
				System.out.println(" 작성자 :"); String writter = scanner.next();
				System.out.println(" 비밀번호 :"); String password= scanner.next();
				//글쓰기 메뉴에 해당되는 객체값 입력 : 제목,내용,저자,비밀번호
				Board5 board = new Board5(title, contents, writter, password);
				// board  배열에 입력값 저장
				int i=0; // 정수 i 0으로 초기화
				for(Board5 temp : boardlist) { //배열길이만큼 반복문 시작
					if(temp==null) { // 배열의 temp번째  가 null이라면
						boardlist[i] = board; //i번째 배열에 (최초 0) board 배열값 대입 
						System.out.println("등록 완료");//등록완료 출력
						break;//배열 저장 완료 후에 반복문 탈출
					}
					i++; // i값 1씩증가 (루프당)
				}
			}
			else if(ch==2) { // 볼 글 입력
				System.out.println("보실 글 번호를 입력 "); int view=scanner.nextInt(); // 게시물 선택
				System.out.printf("%d\t%s\t%s\t%s\n",view,boardlist[view-1].title,boardlist[view-1].writter,
						boardlist[view-1].contents);  // 선택한 게시물 출력
				System.out.println("1.목록보기 2.삭제. 3수정"); int ch2 =scanner.nextInt(); //게시물 출력 시 선택 메뉴 및 선택
				if(ch2 ==1) {} //목록보기시 뒤로
				else if(ch2 ==2){ // 삭제 선택
					System.out.println("비밀번호 입력"); String password= scanner.next(); //비밀번호 입력
					if(boardlist[view-1].password.equals(password)) { // 선택한 게시글의 비밀번호와 입력한 비밀번호가 같으면 게시물 삭제
						boardlist[view-1] =null;
						System.out.println("삭제되었습니다."); //게시물 삭제 안내 메세지
					
						for(int i = view-1;i<boardlist.length;i++) {// 인덱스 땡기기 | 선택한 게시물번호에서부터 배열길이까지 1씩증가  
							if(i==boardlist.length-1) { // i가 최대배열길이-1 과 같으면
								boardlist[boardlist.length-1] = null; //배열의 최대배열-1 의 값을null 처리
							}
							else boardlist[i] = boardlist[i+1]; // 그 외 i번째 배열에 i+1 배열의 값 대입
						}
					
					}else System.out.println("비밀번호가 다릅니다."); // 비밀번호 미스매칭시 출력
				}
				else if(ch2 ==3){ //수정 메뉴 선택
					System.out.println("비밀번호 입력"); String password= scanner.next(); //비밀번호 입력 안내 및 입력
					if(boardlist[view-1].password.equals(password)) { //선택한 게시글의 비밀번호와 입력한 비밀번호가 같으면
						
						System.out.println("수정합니다."); //수정 메세지 출력
						System.out.println(" 제목 : "); String title= scanner.next(); //제목,내용,작성자 입력
						System.out.println(" 내용 : "); String contents= scanner.next();
						System.out.println(" 작성자 : "); String writter= scanner.next();
						boardlist[view-1].title=title; //입력된 값을 해당 배열에(해당게시물) 덮어씌우기
						boardlist[view-1].contents=contents;
						boardlist[view-1].writter=writter;
					}
					else System.out.println("비밀번호가 다릅니다."); //비밀번호가 다를 시 출력
				}
			}
		}
	}
}
