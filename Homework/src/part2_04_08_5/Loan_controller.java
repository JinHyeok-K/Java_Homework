package part2_04_08_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Loan_controller {
	Bank_total_controller controller = new Bank_total_controller();
	ArrayList<Account> account = new ArrayList<>();
	ArrayList<Bankbook> booklist = new ArrayList<>();
	ArrayList<Loan> loanlist = new ArrayList<>();
	Bank_account_controller account_controller = new Bank_account_controller();
	void 대출상품등록() { //관리자 로그인 시 관리자메뉴에서 선택
		
		System.out.println(" 대출 상품 등록");
		System.out.print(" 대출 상품 이름 "); String loan_name =controller.scanner.next();
		System.out.print(" 대출 가능 금액 "); int loan_money = controller.scanner.nextInt();
		System.out.print(" 대출 이자율 "); long loan_interest = controller.scanner.nextLong();
		
		Loan loan = new Loan(loan_name, loan_money, loan_interest, null,0);
		
		loanlist.add(loan);
		System.out.println(" 대출 상품 등록 완료");
		
	}
	void 대출회원관리() {
		
		
		System.out.println("--------------------");
		System.out.println("\t대출회원관리");
		System.out.println("대출상품\t\t대출금\t\t대출상품이율\t\t대출자");
		for(Loan temp : loanlist) {
			if(temp!=null && temp.getLoan_customer()!=null) {
				System.out.println(temp.getLoan_name()+temp.getLoan_moeny()+
						temp.getLoan_interest()+temp.getLoan_customer());
			}
			
		}System.out.println("--------------------");
	}
	
	
	void 대출상품정보() {
		System.out.println("대출 상품 조회");
		System.out.println("\t대출상품명\t대출금액\t이자율");
		for(Loan temp: loanlist) {
			if(temp!=null) {
				System.out.printf("\t%s\t%d\t%d",temp.getLoan_name(),temp.getLoan_moeny(),temp.getLoan_interest());
			}
		}
	}
	
	void 대출신청(String loginid) {
		System.out.println("대출 신청 메뉴");
		System.out.println("신청하실 대출 상품"); String 대출신청 = controller.scanner.next();
		for(Loan temp : loanlist) {
			if(temp!=null && temp.getLoan_name().equals(대출신청)) {
				System.out.println(대출신청+" 상품을 신청하셨습니다. 맞습니까?"); int ch=controller.scanner.nextInt();
				if(ch==1) {
					System.out.println(temp.getLoan_name()+" 의 대출을 진행하겠습니다.");
					for(Account temp2: account) {
						System.out.println(" 비밀번호를 입력해 주십시오"); String pw = controller.scanner.next();
						if(temp2!=null && temp2.getId().equals(loginid)&& temp2.getPassword().equals(pw)) {
							System.out.println("대출 신청이 완료 되었습니다.");
							account_controller.대출계좌생성(loginid);
							System.out.println("신청하신 상품은 "+temp.getLoan_name()+"이며,");
							System.out.println("대출금리는 "+temp.getLoan_interest()+" 입니다.");
							System.out.println("본 시스템 특성상 선 이자를 제하고 지급합니다.");
							System.out.println("감사합니다.");
							long real_interest= (1-(temp.getLoan_interest()/100)); 
							for(Bankbook temp3 : booklist) {
								if(temp3!=null&& temp3.getId().equals(loginid)) {
									temp3.setSave_money((temp3.getSave_money() +(int)(temp3.getLoan_address()+ 
											(temp.getLoan_moeny()*real_interest))));
									System.out.println(" 회원님의 통장에 대출금이 지급되었습니다.");
									temp2.setLoan_Repayment(false);
								}
							}
						}
						else System.out.println(" ID 혹은 비밀번호가 다릅니다.");
					}
				}
				
			}
		}
	}
	
	
	void 대출상환(String loginid) {
		System.out.println("대출 상환 메뉴");
		System.out.println(" 상환하실 대출 상품을 선택해 주세요");
		for(Account temp:account) {
			if(temp!=null && temp.getId().equals(loginid)) {
				System.out.println("---------고객님의 현재 대출중인 상품 -------");
				for(Bankbook bank: booklist) {
					if(bank!=null) {
						for(Loan loan:loanlist) {
							if(loan!=null && loan.getLoan_customer().equals(loginid)) {
							System.out.println(loan.getLoan_name()+"t"+loan.getLoan_moeny());
							}
							System.out.println("상환하시겠습니까?");
							System.out.println("1.예 2.아니오"); int ch=controller.scanner.nextInt();
							if(ch==1) {
								System.out.println("상환하실 대출(계좌)을 선택해 주세요"); int 상환계좌 = controller.scanner.nextInt();
								if(bank.getLoan_address()==  상환계좌) {
//										
									System.out.println(bank.getLoan_address()+" 을 상환합니다.");
									if(loan.getLoan_moeny()>bank.getSave_money() ) {
											System.out.println("상환금액이 부족합니다.");
									}
									
									if(bank.getSave_money()>=loan.getLoan_moeny()) {
										bank.setSave_money(bank.getSave_money()-loan.getLoan_moeny());
										temp.setLoan_Repayment(true);
										System.out.println("상환이 완료되었습니다.");
									}
								}
							}
						}
					}
				}
			}
		}
		
		
	}
	
	
	
	
	
}
