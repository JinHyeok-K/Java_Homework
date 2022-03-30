package part2_06_09_6;

import java.util.ArrayList;
import java.util.Scanner;

public class 은행계좌프로그램1 {
	// 은행계좌프로그램 [ 상속 ] 
			// 은행[super]
			// 국민은행[sub] , 신한은행[sub] , 하나은행[sub]
			// 주 기능 : 1.계좌생성 2.입금 3.출금 4.이체 5.내계좌목록 6.대출 
		
	// ** main 밖에서 선언하는 이유 
		//* 모든 클래스에서 사용하기 위해 static 배열로 선언
		// static변수는 프로그램 시작시 메모리할당 -> 프로그램 종료시 메모리초기화
	
	public static ArrayList<한국은행1> 계좌리스트 = new ArrayList<>();
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			은행컨트롤러1 은행컨트롤러 = new 은행컨트롤러1();
			System.out.println("========== 은행 메뉴 ===========");
			System.out.println("1.계좌생성 2.입금 3.출금 4.이체 5.내계좌목록 6.대출"); int ch = scanner.nextInt();
			
			if(ch==1) {
				
				System.out.println("성함"); String name = scanner.next();
				System.out.println("비밀번호"); String password = scanner.next();
				System.out.println("희망 은행?");
				System.out.println("1. 국민은행 2. 붓싼은행"); int chbank= scanner.nextInt();
				
				
				은행컨트롤러.계좌생성(name, password, chbank);
				
				
				
				
				
				
				
				
			}
				
			
			
			
			
			
			
		
			
			
		}
	}
}
