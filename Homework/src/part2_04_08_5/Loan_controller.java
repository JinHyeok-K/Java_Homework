package part2_04_08_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Loan_controller {
	Bank_total_controller controller = new Bank_total_controller();
	ArrayList<Account> account = new ArrayList<>();
	ArrayList<Bankbook> booklist = new ArrayList<>();
	ArrayList<Loan> loanlist = new ArrayList<>();
	Bank_account_controller account_controller = new Bank_account_controller();
	void �����ǰ���() { //������ �α��� �� �����ڸ޴����� ����
		
		System.out.println(" ���� ��ǰ ���");
		System.out.print(" ���� ��ǰ �̸� "); String loan_name =controller.scanner.next();
		System.out.print(" ���� ���� �ݾ� "); int loan_money = controller.scanner.nextInt();
		System.out.print(" ���� ������ "); long loan_interest = controller.scanner.nextLong();
		
		Loan loan = new Loan(loan_name, loan_money, loan_interest, null,0);
		
		loanlist.add(loan);
		System.out.println(" ���� ��ǰ ��� �Ϸ�");
		
	}
	void ����ȸ������() {
		
		
		System.out.println("--------------------");
		System.out.println("\t����ȸ������");
		System.out.println("�����ǰ\t\t�����\t\t�����ǰ����\t\t������");
		for(Loan temp : loanlist) {
			if(temp!=null && temp.getLoan_customer()!=null) {
				System.out.println(temp.getLoan_name()+temp.getLoan_moeny()+
						temp.getLoan_interest()+temp.getLoan_customer());
			}
			
		}System.out.println("--------------------");
	}
	
	
	void �����ǰ����() {
		System.out.println("���� ��ǰ ��ȸ");
		System.out.println("\t�����ǰ��\t����ݾ�\t������");
		for(Loan temp: loanlist) {
			if(temp!=null) {
				System.out.printf("\t%s\t%d\t%d",temp.getLoan_name(),temp.getLoan_moeny(),temp.getLoan_interest());
			}
		}
	}
	
	void �����û(String loginid) {
		System.out.println("���� ��û �޴�");
		System.out.println("��û�Ͻ� ���� ��ǰ"); String �����û = controller.scanner.next();
		for(Loan temp : loanlist) {
			if(temp!=null && temp.getLoan_name().equals(�����û)) {
				System.out.println(�����û+" ��ǰ�� ��û�ϼ̽��ϴ�. �½��ϱ�?"); int ch=controller.scanner.nextInt();
				if(ch==1) {
					System.out.println(temp.getLoan_name()+" �� ������ �����ϰڽ��ϴ�.");
					for(Account temp2: account) {
						System.out.println(" ��й�ȣ�� �Է��� �ֽʽÿ�"); String pw = controller.scanner.next();
						if(temp2!=null && temp2.getId().equals(loginid)&& temp2.getPassword().equals(pw)) {
							System.out.println("���� ��û�� �Ϸ� �Ǿ����ϴ�.");
							account_controller.������»���(loginid);
							System.out.println("��û�Ͻ� ��ǰ�� "+temp.getLoan_name()+"�̸�,");
							System.out.println("����ݸ��� "+temp.getLoan_interest()+" �Դϴ�.");
							System.out.println("�� �ý��� Ư���� �� ���ڸ� ���ϰ� �����մϴ�.");
							System.out.println("�����մϴ�.");
							long real_interest= (1-(temp.getLoan_interest()/100)); 
							for(Bankbook temp3 : booklist) {
								if(temp3!=null&& temp3.getId().equals(loginid)) {
									temp3.setSave_money((temp3.getSave_money() +(int)(temp3.getLoan_address()+ 
											(temp.getLoan_moeny()*real_interest))));
									System.out.println(" ȸ������ ���忡 ������� ���޵Ǿ����ϴ�.");
									temp2.setLoan_Repayment(false);
								}
							}
						}
						else System.out.println(" ID Ȥ�� ��й�ȣ�� �ٸ��ϴ�.");
					}
				}
				
			}
		}
	}
	
	
	void �����ȯ(String loginid) {
		System.out.println("���� ��ȯ �޴�");
		System.out.println(" ��ȯ�Ͻ� ���� ��ǰ�� ������ �ּ���");
		for(Account temp:account) {
			if(temp!=null && temp.getId().equals(loginid)) {
				System.out.println("---------������ ���� �������� ��ǰ -------");
				for(Bankbook bank: booklist) {
					if(bank!=null) {
						for(Loan loan:loanlist) {
							if(loan!=null && loan.getLoan_customer().equals(loginid)) {
							System.out.println(loan.getLoan_name()+"t"+loan.getLoan_moeny());
							}
							System.out.println("��ȯ�Ͻðڽ��ϱ�?");
							System.out.println("1.�� 2.�ƴϿ�"); int ch=controller.scanner.nextInt();
							if(ch==1) {
								System.out.println("��ȯ�Ͻ� ����(����)�� ������ �ּ���"); int ��ȯ���� = controller.scanner.nextInt();
								if(bank.getLoan_address()==  ��ȯ����) {
//										
									System.out.println(bank.getLoan_address()+" �� ��ȯ�մϴ�.");
									if(loan.getLoan_moeny()>bank.getSave_money() ) {
											System.out.println("��ȯ�ݾ��� �����մϴ�.");
									}
									
									if(bank.getSave_money()>=loan.getLoan_moeny()) {
										bank.setSave_money(bank.getSave_money()-loan.getLoan_moeny());
										temp.setLoan_Repayment(true);
										System.out.println("��ȯ�� �Ϸ�Ǿ����ϴ�.");
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
