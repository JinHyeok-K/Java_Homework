package part2_04_08_5;

import java.util.ArrayList;

public class Bank_account_controller {

	// ���� ���� ��� ( ȸ��:id,���,�̸�,��ȭ��ȣ,���� / ������ ID ���)
	static Bank_total_controller controller =new Bank_total_controller();
	static ArrayList<Account> account = new ArrayList<>();
	static ArrayList<Bankbook> booklist = new ArrayList<>();
	static ArrayList<Loan> loanlist = new ArrayList<>();
	boolean ȸ������() {
		System.out.println("ȸ������ ������");  
		System.out.print(" ID : "); String id=Bank_total_controller.scanner.next();
		System.out.print(" Password : "); String password=Bank_total_controller.scanner.next();
		System.out.print(" Name : "); String name=Bank_total_controller.scanner.next();
		System.out.print(" Phone : "); String phone=Bank_total_controller.scanner.next();
		
		
		for(Account temp :account ){
			if(temp!=null&& temp.getId().equals(id)) {
				System.out.println("������ ID�� �����մϴ�.");
				return false;
			}
		}
//		boolean Loan_check = false;
		Account accountlist = new Account(id, password, name, phone,false);
		controller.account.add(accountlist);
		return true;
	}
	
	
	String �α���() { // �α��ο� (�Ϲ� ȸ�� or ������)
		System.out.println("�α��� ������");
		System.out.print(" ID : "); String id=Bank_total_controller.scanner.next();
		System.out.print(" Password : "); String password=Bank_total_controller.scanner.next();
		
		for(Account temp : account){
			if(temp!=null&& temp.getId().equals(id)&&
					temp.getPassword().equals(password)) {
				System.out.println("�α��� ���� ����ʽÿ�");
				return temp.getId();
			}
		}
		return null;
	}
	
	void ���̵�ã��() {
		System.out.println("���̵� ã�� ������");
		System.out.print(" Name : "); String name=Bank_total_controller.scanner.next();
		System.out.print(" Phone : "); String phone=Bank_total_controller.scanner.next();
		
		for(Account temp : account) {
			if(temp!=null && temp.getName().equals(name)&&
					temp.getPhone().equals(phone)) {
				System.out.println("ȸ������  ID �� : "+temp.getId());
			}
		}
		System.out.println(" ��ġ�ϴ� ȸ���� �����ϴ�.");
	}
	void ��й�ȣã��() {
		System.out.println("��й�ȣ ã�� ������");
		System.out.print(" id : "); String id=Bank_total_controller.scanner.next();
		System.out.print(" Phone : "); String phone=Bank_total_controller.scanner.next();
		
		for(Account temp : account) {
			if(temp!=null && temp.getName().equals(id)&&
					temp.getPhone().equals(phone)) {
				System.out.println("ȸ������  P �� : "+temp.getPassword());
			}
		}
		System.out.println(" ��ġ�ϴ� ȸ���� �����ϴ�.");
	}
	void ���»���(String loginid) {
		System.out.println("���� ���� �޴�");
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
		System.out.println("���� ���� �Ϸ�");
		}
//		private int Bankbook_number;
//		private int save_money;
//		private String id;
//		private String name;
	}
	
	void ������»���(String loginid) {
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
							System.out.println("������ ��û�Ͻ� �����ǰ�� ���´� :"+temp2.getLoan_address()+"�Դϴ�.");
							return;
						}
							
					}
				}
	
					
	}
	
}				
					