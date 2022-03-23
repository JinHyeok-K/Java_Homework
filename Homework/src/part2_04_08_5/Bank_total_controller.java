package part2_04_08_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank_total_controller {
	static Scanner scanner =new Scanner(System.in);
	static ArrayList<Account> account = new ArrayList<>(); //회원 계정등록용 리스트
	static ArrayList<Loan_List> loanlist = new ArrayList<>(); // 대출 상품 저장용 리스트
	//회원메뉴 
	// 1. 회원가입 
		// Bank_account Controller  회원가입
	// 2. 로그인 메뉴
		// Bank account controller 로그인
	// 3. 아이디찾기 
		// Bank account Controller  아이디찾기 
	// 4. 비밀번호 찾기  
		// Bank account Controller 비밀번호찾기   
	
	//컨트롤 메뉴
	
	// 1. 계좌생성 
		// Bank account Controller  계좌생성
	// 2. 입금
		// Bank total Controller  입금
	// 3. 출금
		// Bank total Controller 
	// 4. 이체
		// Bank total Controller 
	// 5. 대출
		// Bank total Controller 
	// 6. 내 계좌목록
		// Bank total Controller 
	Bank_account_controller account_controller = new Bank_account_controller();
	
	public void startMenu() {
		while(true) {
			
			System.out.println("=========================================");
			System.out.print("1.로그인 , 2.아이디찾기 , 3.비밀번호찾기"); //선택창 출력 
			int ch1=scanner.nextInt();
			if(ch1==1) {
				String result =account_controller.로그인();
				if(result==null)
					System.out.println("일치하는 회원이 없습니다.");
				else if(result=="admin") {
					System.out.println("\n 관리자접속"); //관리자용 안내 출력
					관리자메뉴(); 
				}
				else 
					System.out.println("어서오십시오");
					회원메뉴(result);
			}
			else if(ch1==2) {
					account_controller.아이디찾기();
					
			}
			else if(ch1==3) {
					account_controller.비밀번호찾기();
			}
			else System.err.println(" 잘못된 값을 입력하였습니다.");
		}
	}
	void 회원메뉴(String loginid) {
		// 계좌 주요기능 : 1.계좌생성 2.입금 3.출금 4.이체 5.대출 6.내 계좌목록
		System.out.print("1.계좌생성 2.입금 3.출금 4.이체 5.대출 6.내 계좌목록 :");
		int ch1 = scanner.nextInt();
		if(ch1==1) {
			account_controller.계좌생성();
			
		}
		
	}
	
	//관리자 메뉴
	void 관리자메뉴() {
		
		
	}
}
