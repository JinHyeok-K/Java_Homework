package Day15;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
		while(true) {	
			// 1. 모든 차량 표 출력
				//
					// 배열이나 리스트 내 모든 객체 호출 반복문
				//
			
			System.out.println("1.입차 2. 출차 : ");
			int ch=scanner.nextInt();
			
			if(ch==1) {
				// 1. 차량번호 입력
				//입력
				// 2. 입력받은 차량번호 컨트롤내 메소드에게 넘김
				// 3 . 메소드 결과에 따른 출력
				boolean 결과 =  Controller.입차(null)	;
			}
			else if(ch==2) {
				// 1. 차량번호 입력
				//입력
				// 2. 입력받은 차량번호 컨트롤내 메소드에게 넘김
				// 3 . 메소드 결과에 따른 출력
			boolean 결과 =  Controller.입차(null)	;
			
			}
		}
	}
}
