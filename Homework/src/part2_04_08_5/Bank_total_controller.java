package part2_04_08_5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import test2.Controller;

public class Bank_total_controller {
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Account> account = new ArrayList<>(); // 회원 계정등록용 리스트
	static ArrayList<Loan> loanlist = new ArrayList<>(); // 대출 상품 저장용 리스트
	static ArrayList<Bankbook> booklist = new ArrayList<>();
	static Random random = new Random();
	static Bank_total_controller controller = new Bank_total_controller();
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
		while (true) {

			System.out.println("=========================================");
			System.out.print("1.로그인 , 2.아이디찾기 , 3.비밀번호찾기"); // 선택창 출력
			int ch1 = scanner.nextInt();
			if (ch1 == 1) {
				String result = account_controller.로그인();
				if (result == null)
					System.out.println("일치하는 회원이 없습니다.");
				else if (result == "admin") {
					System.out.println("\n 관리자접속"); // 관리자용 안내 출력
					관리자메뉴();
				} else
					System.out.println("어서오십시오");
				회원메뉴(result);
			} else if (ch1 == 2) {
				account_controller.아이디찾기();

			} else if (ch1 == 3) {
				account_controller.비밀번호찾기();
			} else
				System.err.println(" 잘못된 값을 입력하였습니다.");
		}
	}

	void 회원메뉴(String loginid) {
		// 계좌 주요기능 : 1.계좌생성 2.입금 3.출금 4.이체 5.대출 6.내 계좌목록
		System.out.print("1.계좌생성 2.입금 3.출금 4.이체 5.대출 6.내 계좌목록 :");
		int ch1 = scanner.nextInt();
		if (ch1 == 1) {
			account_controller.계좌생성(loginid);
		}
		else if(ch1==2) {
			controller.입금(loginid);
			
		}
		else if(ch1==3) {
			controller.출금(loginid);
		}
		else if(ch1==4) {
			controller.이체(loginid);
		}
		else if(ch1==5) {
			controller.대출(loginid);
		}
		else if(ch1==6) {
			System.out.println("----------------------");
			System.out.println("\t내 계좌 목록");
			for(Bankbook temp:booklist) {
				if(temp!=null && temp.getId().equals(loginid)) {
					System.out.println(temp.getBankbook_number());
					
				}
			}
			System.out.println("----------------------");
		}
		

	}
	
	void 입금(String loginid) {
		System.out.println("----- 입금 메뉴 -----");
		System.out.println("입금하실 계좌 입력 : "); int 계좌입력=scanner.nextInt();
		for(Bankbook temp:booklist) {
			if(temp!=null && temp.getBankbook_number()==계좌입력) {
				System.out.println("얼마를 입금하시겠습니까?");
				int in_money = scanner.nextInt();
				temp.setSave_money(temp.getSave_money()+in_money);
				System.out.println("입금이 완료되었습니다.");
			}
		}
		System.out.println(" 해당계좌가 없습니다. ");
		
	}
	void 출금(String loginid) {
		System.out.println("----- 입금 메뉴 -----");
		System.out.println("출금하실 계좌 입력 : "); int 계좌입력=scanner.nextInt();
		for(Bankbook temp:booklist) {
			if(temp!=null && temp.getBankbook_number()==계좌입력) {
				System.out.println(" 얼마를 출금 하시겠습니까? ");
				int out_money = scanner.nextInt();
				if(temp.getSave_money()<out_money) {
					System.out.println("잔액이 부족합니다.");
				}
				else if (temp.getSave_money()>=out_money) {
					System.out.println("비밀번호를 입력 하세요");
					String password =scanner.next();
					for(Account temp2:account) {
						if(temp2!=null && temp2.getPassword().equals(password)){
							temp.setSave_money(temp.getSave_money()-out_money);
							System.out.println("출금이 완료되었습니다.");
						}
						System.out.println("입력한 비밀번호가 아닙니다.");
					}
				}
				else System.out.println(" 해당계좌가 없습니다. ");
			}
		}
	}
	void 이체() {
		System.out.println(" 이체 메뉴 ");
		System.out.println("출금하실 계좌 입력 : "); int 계좌입력1=scanner.nextInt();
		System.out.println();
		
	}
	
	
	void 대출() {}
	
	
	

	// 관리자 메뉴
	void 관리자메뉴() {

	}
}
