package part2_04_08_5;

import java.util.ArrayList;

public class Bank_account_controller {

	// 계정 관련 등록 ( 회원:id,비번,이름,전화번호,계좌 / 관리자 ID 등록)
	static Bank_total_controller controller =new Bank_total_controller();
	static ArrayList<Account> account = new ArrayList<>();
	static ArrayList<Bankbook> booklist = new ArrayList<>();
	static ArrayList<Loan> loanlist = new ArrayList<>();
	boolean 회원가입() {
		System.out.println("회원가입 페이지");  
		System.out.print(" ID : "); String id=Bank_total_controller.scanner.next();
		System.out.print(" Password : "); String password=Bank_total_controller.scanner.next();
		System.out.print(" Name : "); String name=Bank_total_controller.scanner.next();
		System.out.print(" Phone : "); String phone=Bank_total_controller.scanner.next();
		
		
		for(Account temp :account ){
			if(temp!=null&& temp.getId().equals(id)) {
				System.out.println("동일한 ID가 존재합니다.");
				return false;
			}
		}
//		boolean Loan_check = false;
		Account accountlist = new Account(id, password, name, phone,false);
		controller.account.add(accountlist);
		return true;
	}
	
	
	String 로그인() { // 로그인용 (일반 회원 or 관리자)
		System.out.println("로그인 페이지");
		System.out.print(" ID : "); String id=Bank_total_controller.scanner.next();
		System.out.print(" Password : "); String password=Bank_total_controller.scanner.next();
		
		for(Account temp : account){
			if(temp!=null&& temp.getId().equals(id)&&
					temp.getPassword().equals(password)) {
				System.out.println("로그인 성공 어서오십시오");
				return temp.getId();
			}
		}
		return null;
	}
	
	void 아이디찾기() {
		System.out.println("아이디 찾기 페이지");
		System.out.print(" Name : "); String name=Bank_total_controller.scanner.next();
		System.out.print(" Phone : "); String phone=Bank_total_controller.scanner.next();
		
		for(Account temp : account) {
			if(temp!=null && temp.getName().equals(name)&&
					temp.getPhone().equals(phone)) {
				System.out.println("회원님의  ID 는 : "+temp.getId());
			}
		}
		System.out.println(" 일치하는 회원이 없습니다.");
	}
	void 비밀번호찾기() {
		System.out.println("비밀번호 찾기 페이지");
		System.out.print(" id : "); String id=Bank_total_controller.scanner.next();
		System.out.print(" Phone : "); String phone=Bank_total_controller.scanner.next();
		
		for(Account temp : account) {
			if(temp!=null && temp.getName().equals(id)&&
					temp.getPhone().equals(phone)) {
				System.out.println("회원님의  P 는 : "+temp.getPassword());
			}
		}
		System.out.println(" 일치하는 회원이 없습니다.");
	}
	void 계좌생성(String loginid) {
		System.out.println("계좌 생성 메뉴");
		boolean add_pass = true;
		int address = controller.random.nextInt(1000);
		for(Bankbook temp: booklist) {
			if(temp!=null && temp.getBankbook_number()==address) {
				add_pass=false;
				break;
			}
		}
		if(add_pass=true) {
		Bankbook books = new Bankbook(address, 0, loginid,0);
		controller.booklist.add(books);
		System.out.println("계좌 생성 완료");
		}
//		private int Bankbook_number;
//		private int save_money;
//		private String id;
//		private String name;
	}
	
	void 대출계좌생성(String loginid) {
		boolean add_pass = true;
		int loan_address = controller.random.nextInt(1000);
		for(Bankbook temp: booklist) {
			if(temp!=null && temp.getLoan_address()==loan_address){
				add_pass=false;
				break;
			}
		}
		if(add_pass=true) {
			for(Bankbook temp2: booklist) {
				if(temp2!=null && temp2.getId().equals(loginid)) {
							temp2.setLoan_address(loan_address);
							System.out.println("고객님이 신청하신 대출상품의 계좌는 :"+temp2.getLoan_address()+"입니다.");
							return;
						}
							
					}
				}
	
					
	}
	
}				
					