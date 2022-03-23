package Day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Controller {
	// 모든 메소드는 static 
	
	//0. 게시물 리스트
	
	public static ArrayList<Board> boardlist= new ArrayList<>();

	
	
	//2. 쓰기 메소드
	public static void write(String 제목, String 내용, String 작성자, String 비밀번호) {
		// 1. 객체화
		Board board  = new Board(제목,내용,작성자,비밀번호);
		// 2. 리스트에 저장
		boardlist.add(board);
		// 3. 파일에 저장
		save();
	}

	//4. 수정 메소드
	public static boolean update(int index, String password, String title, String contents) {
		if(password.equals(boardlist.get(index).getPassword())) {
			
			boardlist.get(index).setTitle(title);
			boardlist.get(index).setContents(contents);
			save();
			return true;
		}else {
			return false;
		}
	}
	
	//5. 삭제 메소드
	public static boolean delete(int index, String password) {
		
		if(password.equals(boardlist.get(index).getPassword())){
			// 입력받은 패스워드와 해당 인덱스 게시물번호의 패스워드가 같으면
			boardlist.remove(index); // add(객체):추가 get(인덱스) : 호출  remove(인덱스or 객체):삭제
			save();
			return true;
		}else {
			return false;
			
		}
		// 입력받은 패스워드와 해당 인덱스 게시물번호의 패스워드가 같으면
	}
	//6. 댓글쓰기 메소드
	public static void replywrite() {}
	//7. 게시물저장 메소드
	public static void save() {
		// 리스트 내 모든 게시물을 파일에 저장
		try {
			// 1. 파일 출력 클래스
			FileOutputStream outputStream = new FileOutputStream("D:/JAVA/게시물파일.txt");
			// 2. 파일에 작성할 내용 [한줄씩 = 게시물 1개씩 = 객체 1개씩]
			for (Board board : boardlist) {

				String 작성내용 = board.getTitle()+","+board.getContents()+","+
								board.getPassword()+","+board.getWritter()+","+
								board.getViewcount()+","+board.getDate()+"\n";
				// 3. 내용[문자열] => 바이트열 변환 [ 외부통신 (스트림 ) : 통신단위 byte]
				// 4  내보내기[ write() ]
				outputStream.write(작성내용.getBytes());
			}
		}catch(Exception e) {
			System.out.println("알림) 파일 저장 실패[관리자에게 문의]");
		}
	}
	//8. 게시물불러오기 메소드 [ 프로그램 시작 시 ] ---> 리스트
	public static void load() { 
		// 1. 파일 입력 클래스
		try{
			FileInputStream inputStream = new FileInputStream("D:/JAVA/게시물파일.txt");
				// 2. 바이트배열 선언
			byte[] bytes = new byte[1024];
				// 3. 모든 바이트 읽어와서 바이트에 저장
			inputStream.read(bytes);
				// 4. 바이트 -> 문자열 변환
			String file = new String (bytes);
			 	// 5. 문자열 자르기 [ 한 줄씩[ \n ]-> 1개 객체 ]
			String[] boards = file.split("\n");
			int i=0;
			for(String temp : boards) { // 배열 내 문자열 하나 씩 꺼내기
				if(i+1==boards.length) break;
				String[] field = temp.split(",");
				Board board = new Board(field[0],field[1],
						field[2],field[3],Integer.parseInt(field[4]),field[5],null);
				boardlist.add(board);
			}
			// 6. 문자열 자르기 [ 한줄 [,] -> 각 필드 ]
			// 7. 객체화
			// 8. 리스트 담기
		}catch(Exception c){System.err.println("알림 파일로드 실패");}
			
		
	}
	//9. 댓글저장 메소드
//	public static void boardlist() {}
	//10. 댓글불러오기 메소드
//	public static void boardlist() {}
	
}
