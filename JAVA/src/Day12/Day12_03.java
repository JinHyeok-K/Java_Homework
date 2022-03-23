package Day12;

import java.io.IOException;

public class Day12_03 {
	
	public static void main(String[] args) throws IOException {
	
		// 도서 검색 프로그램
			// [조건]
			// 1. 입력 받기 [ System.in.read() ]
			// 2. String 배열 내 여러 도서가 저장
				// String[] 도서목록 ={
				//			"된다! 네이버 블로그&포스트 "
				//			"스프링 부트 실전 활용 마스터"
				// 			"Tucker 의 Go 언어 프로그래밍"
				//			"혼자 공부하는 C 언어 "
				// 1. 
			// 3. 검색기능, 수정기능
				// 검색기능 : 특정 문자를 입력받아 도서 내 포함된 문자가 있으면 모두 출력
					// 예시) 언어 검색 -> " Tucker 의 Go 언어 프로그래밍 " / "혼자 공부하는 C 언어 "
				// 수정기능 : 수정할 도서명의 일부를 입력받아 출력된 도서명중 번호를 선택후 수정기능 적용
					// 예시) '언어' 와 Language 입력 -> 선택된 도서명의 수정할 문자와 새로운 문자 입력받아 ->  수정 완료 
					// 혼자 공부하는 C 언어 ->  혼자 공부하는 C Language 
		/*
		 *  [ ][ ][ ][ ][ ][ ]
		 *  [ ][ ][ ][ ][ ][ ]
		 *  [ ][ ][ ][ ][ ][ ]		
		 * 	[ ][ ][ ][ ][ ][ ]
		 * 	[ ][ ][ ][ ][ ][ ]
		 *  [ ][ ][ ][ ][ ][ ] 
		 * 
		 * 
		 * 
		 */
//		String[] 도서목록 = new String[4];
//		도서목록[0] = "된다! 네이버 블로그&포스트 ";    도서목록[1] = "스프링 부트 실전 활용 마스터";
//		도서목록[2] = "Tucker 의 Go 언어 프로그래밍";	도서목록[3] =	"혼자 공부하는 C 언어 ";
//		
		String[] 도서목록 = {"된다! 네이버 블로그&포스트","스프링 부트 실전 활용 마스터",
							"Tucker의 Go 언어 프로그래밍","혼자 공부하는 C언어"};
		
		while(true) {
			System.out.println("1. 검색 2. 수정");
			byte[] bytes = new byte[100];
			int count = System.in.read(bytes); // 키보드로부터 [스트림]바이트를 읽어오기 // 일반 예외 [예외 떠 넘기기]
			// count 변수 : 읽어온 바이트 개수
			String ch = new String(bytes,0,count-2); // 바이트 배열 --> 문자열 변환 [ -2차감 =\n\r ]
			
			if( ch.equals("1")) {
				System.out.println(" *** 검색 *** ");
				System.out.println(" 검색 : "); count = System.in.read(bytes);
				String search = new String(bytes,0,count-2); // 찾을 문자
				
				
				System.out.println(" *** 검색 결과 *** ");
				for ( String temp : 도서목록) { // 모든 배열 내 문자열을 하나씩 꺼내오기
					/*방법 1
					if(temp.indexOf(search)!= -1) { // 해당 문자열 내 찾을 문자의 인덱스가 존재하면
						// indexOf 메소드 -1 반환되는 경우는 동일한 단어가 없을 경우 [검색 x]
						System.out.println(temp); //해당 문자열 내 찾을 문자가 존재하면 출력
						
					}*/
					//방법 2
					if(temp.contains(search)) {
						// 문자열.contains("찾을문자") : 문자열 내 찾을 문자가 true[있다] / false[없다] 반환
						System.out.println(temp);
					}
					
				}
				
				
				
				
				
				
				
			}else if(ch.equals("2")) {
				System.out.println(" *** 수정 ***");
				System.out.println("수정할 도서명 [일부] : ");
				count = System.in.read(bytes); // 키보드로부터 바이트 읽어와서 배열에 저장
				String search = new String(bytes,0,count-2); // 0번 인덱스 바이트로부터 -2 제외한 인덱스 까지
				int i =0 ;
				for (String temp : 도서목록) {
					
					if(temp.contains(search)) {
						// 문자열.contains("찾을문자") : 문자열 내 찾을 문자가 true[있다] / false[없다] 반환
						System.out.println("도서번호 : "+i+" 교재명 : "+temp);
					}
					i++;
				}
				System.out.println("도서번호 선택 : ");
					count = System.in.read(bytes);
				String ch2 =new String (bytes,0,count -2);
				//ch2 문자열로 입력 받음 --> 인덱스 [숫자 ] 변환
					int index =Integer.parseInt(ch2);
				 
				//	수정 내용 입력받기
				System.out.println("기존 문자 :");
					count =System.in.read(bytes);
					String oldstr =new String(bytes,0,count-2);
				System.out.println("새로운 문자:");
					count =System.in.read(bytes);
					String newstr =new String(bytes,0,count-2);
				//수정처리
				도서목록[index] = 도서목록[index].replace(oldstr, newstr);
				// 배열 내 도서명 = 수정된 도서명
				System.out.println("변경 되었습니다.");
				
			}
			
			
			
		}
		
		
	}
}
