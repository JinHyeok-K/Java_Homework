package Day11;

import java.util.Scanner;

public class Day11_04_BoardApp {
	//게시판 => Base
	/* CRUD [ Creat[쓰기] / Read[읽기] / update[수정] / delete[삭제] ]
	 * 게시판 + 댓글+(회원)
	 * 비회원제 게시판 / 댓글 프로그램 [ 예외처리, 파일처리, 리스트 ]
	 * 		// [Model]게시물 클래스
	 * 				// 필드
	 * 					// 제목, 내용, ,비밀번호,작성자, 작성일, 조회수 , 댓글리스트 					
	 * 		// [Model]댓글 클래스
	 * 				// 내용, 작성자, 작성일 					
	 * 		// [Controller]컨트롤러 클래스
	 * 				// 1.목록 2.쓰기 3.보기 4.수정 5삭제 6.댓글쓰기
	 * 				// 7.게시물저장 8.게시물불러오기 9.댓글저장 10.댓글불러오기 
	 * 		// [View] Day11_04_BoardApp 클래스
	 * 				// 입출력[입력받아 컨트롤러에게 입력받은 값 전달]
	 */
	public static void main(String[] args) {//main start
		Scanner scanner =new Scanner(System.in); //1.입력객체
		Controller.load()	;
//		System.out.println("확인"+Controller.boardlist);
		
		while(true) {
			try { // 예외 발생 : 유저가 문자입력 시 예외 발생 => catch로 이동
				//모든 게시물 출력
				System.out.printf("%s\t%s\t%s\t%s\t%s\t \n","번호","제목","작성자","작성일","조회수");
				int i =0; // 리스트 내 인덱스
				for(Board board :Controller.boardlist) {
					System.out.printf("%s\t%s\t%s\t%s\t%s\t \n",i+1,board.getTitle(),board.getWritter(),
							board.getDate(),board.getViewcount());
					i++;
				}
//				Controller.boardlist(); // 객체 메소드 호출 되는 이유 : static 메소드라 가능
				System.out.println("1.쓰기 2.보기 선택 : "); 
				int ch = scanner.nextInt();
				if (ch==1) {
					System.out.println("*** 게시물 등록 ***");
					//nextLine() : 공백포함 입력가능 [문제! : nextLine 앞에  next 하나로 취급 ]
					// 해결방법 : 중간에 일반 next 와 nextLine 사이에 nextLine() 하나 추가
					scanner.nextLine();//line 28+line 33 묶음
					System.out.print(" 제목 : "); String 제목 = scanner.nextLine();
					System.out.print(" 내용 : "); String 내용 = scanner.nextLine();
					System.out.print(" 작성자 : "); String 작성자 = scanner.next();
					System.out.print(" 비밀번호[수정/삭제시] : "); String 비밀번호 = scanner.next();
					Controller.write(제목,내용,작성자,비밀번호); // 인수전달
				}
				else if (ch==2) {
					// 
					// 해당 게시물 번호[인덱스 ] 를 입력받아 게시물 정보 모두 출력
					System.out.println("게시물 선택 ");
					System.out.print( "선택 :> "); int select = scanner.nextInt();
					int index = select-1;
					Board temp = Controller.boardlist.get(index); //해당 인덱스의 객체를 임시 객체 [ 코드 줄이기 ]
					System.out.println(" *** 게시물 보기 *** ");
					System.out.println(" 제목 : "+temp.getTitle());
					System.out.println(" 작성자 : "+temp.getWritter()+" 작성일  :"+temp.getDate()+" 조회수 : "+temp.getViewcount());
					System.out.println(" 내용 :"+temp.getContents());
					// 댓글 출력 [추후]
					// 메뉴
					System.out.println("1.뒤로가기 2.수정 3.삭제 4.댓글쓰기 | 선택: "); int ch2 = scanner.nextInt();
					if(ch2 ==1) { }
					else if(ch2 ==2) {
						System.out.print("현 게시물 비밀 번호 :"); String password = scanner.next();
						scanner.nextLine();
						System.out.print("수정할 제목 : "); String title = scanner.nextLine();
						System.out.print("수정할 내용 : "); String contents = scanner.nextLine();
						Controller.update(index,password,title,contents); //수정할 인덱스 번호,패스워드,  수정할 제목, 수정할 내용 => 인수
						boolean result =Controller.update(index, password, title, contents);
						if(result) System.err.print("알림) 수정성공");
						else System.err.println("알림)수정 실패");
					}
					else if(ch2 ==3) {
						
						System.out.print("현 게시물 비밀 번호 :  "); String password=scanner.next();
						
						Controller.delete(index, password); //삭제할 인덱스 번호,패스워드 => 인수
						boolean result = Controller.delete(index, password);
						if(result ==true ) {System.out.println("삭제 성공");}
						else { System.out.println(" 삭제 실패) 패스워드가 다릅니다.");
						}
					}
						
					else if(ch2 ==4) {
						Controller.replywrite(); // 인덱스 번호, 댓글내용, 댓글패스워드, 댓글 작성자 => 내용
					}
					else {}
				}
				else {}
				
			}catch(Exception e) {
			System.err.println(" 알림) 번호로 입력해 주세요");
			scanner = new Scanner(System.in); // 다시 메모리 할당 [ 기존 내용물 삭제 ]
			//다시 메모리 할당 말고 while 안에 넣어 사용
		}
			
		
		}// while end
		
	}//main end
}// class end
