package part2_04_08_5;

import java.util.ArrayList;

public class Bank_account_controller {

	// ���� ���� ��� ( ȸ��:id,���,�̸�,��ȭ��ȣ,���� / ������ ID ���)
	Bank_total_controller controller =new Bank_total_controller();
	ArrayList<Account> account = new ArrayList<>();
	boolean ȸ������() {
		System.out.println("ȸ������ ������");  
		System.out.print(" ID : "); String id=controller.scanner.next();
		System.out.print(" Password : "); String password=controller.scanner.next();
		System.out.print(" Name : "); String name=controller.scanner.next();
		System.out.print(" Phone : "); String phone=controller.scanner.next();
		
		
		for(Account temp : account){
			if(temp!=null&& temp.getId().equals(id)) {
				System.out.println("������ ID�� �����մϴ�.");
				return false;
			}
		}
		Account accountlist = new Account(id, password, name, phone);
		controller.account.add(accountlist);
		return true;
	}
	
	
	String �α���() { // �α��ο� (�Ϲ� ȸ�� or ������)
		System.out.println("�α��� ������");
		System.out.print(" ID : "); String id=controller.scanner.next();
		System.out.print(" Password : "); String password=controller.scanner.next();
		
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
		System.out.print(" Name : "); String name=controller.scanner.next();
		System.out.print(" Phone : "); String phone=controller.scanner.next();
		
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
		System.out.print(" id : "); String id=controller.scanner.next();
		System.out.print(" Phone : "); String phone=controller.scanner.next();
		
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
		int address = controller.random.nextInt(1000);
		Bankbook books = new Bankbook(address, 0, loginid);
		controller.booklist.add(books);
		System.out.println("���� ���� �Ϸ�");
//		private int Bankbook_number;
//		private int save_money;
//		private String id;
//		private String name;
	}
	
	
	
	
	
	
}
