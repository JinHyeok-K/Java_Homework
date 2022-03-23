package part2_04_08_5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import test2.Controller;

public class Bank_total_controller {
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Account> account = new ArrayList<>(); // ȸ�� ������Ͽ� ����Ʈ
	static ArrayList<Loan> loanlist = new ArrayList<>(); // ���� ��ǰ ����� ����Ʈ
	static ArrayList<Bankbook> booklist = new ArrayList<>();
	static Random random = new Random();
	static Loan_controller loan_controller = new Loan_controller();
	static Bank_total_controller controller = new Bank_total_controller();
	//ȸ���޴� 
	// 1. ȸ������ 
		// Bank_account Controller  ȸ������
	// 2. �α��� �޴�
		// Bank account controller �α���
	// 3. ���̵�ã�� 
		// Bank account Controller  ���̵�ã�� 
	// 4. ��й�ȣ ã��  
		// Bank account Controller ��й�ȣã��   
	
	//��Ʈ�� �޴�
	
	// 1. ���»��� 
		// Bank account Controller  ���»���
	// 2. �Ա�
		// Bank total Controller  �Ա�
	// 3. ���
		// Bank total Controller 
	// 4. ��ü
		// Bank total Controller 
	// 5. ����
		// Bank total Controller 
	// 6. �� ���¸��
		// Bank total Controller 
	static Bank_account_controller account_controller = new Bank_account_controller();

	public void startMenu() {
		while (true) {

			System.out.println("=========================================");
			System.out.print("1.�α��� , 2.���̵�ã�� , 3.��й�ȣã�� "); // ����â ���
			int ch1 = scanner.nextInt();
			if (ch1 == 1) {
				String result = account_controller.�α���();
				if (result == null) {}
//					System.out.println("��ġ�ϴ� ȸ���� �����ϴ�.");
				else if (result == "admin") {
					System.out.println("\n ����������"); // �����ڿ� �ȳ� ���
					�����ڸ޴�();
				} else
					System.out.println("����ʽÿ�");
					ȸ���޴�(result);
			} else if (ch1 == 2) {
				account_controller.���̵�ã��();

			} else if (ch1 == 3) {
				account_controller.��й�ȣã��();
			}  
			else
				System.err.println(" �߸��� ���� �Է��Ͽ����ϴ�.");
		}
	}

	void ȸ���޴�(String loginid) {
	 while(true) {
		System.out.print("1.���»��� 2.�Ա� 3.��� 4.��ü 5.���� 6.�� ���¸�� 7.�ڷ�:");
		int ch1 = scanner.nextInt();
		if (ch1 == 1) {
			account_controller.���»���(loginid);
		}
		else if(ch1==2) {
			controller.�Ա�(loginid);
			
		}
		else if(ch1==3) {
			controller.���(loginid);
		}
		else if(ch1==4) {
			controller.��ü(loginid);
		}
		else if(ch1==5) {
			controller.����(loginid);
		}
		else if(ch1==6) {
			System.out.println("----------------------");
			System.out.println("\t�� ���� ���");
			System.out.println("�Ϲݰ���\t\t�������");
			for(Bankbook temp:booklist) {
				if(temp!=null && temp.getId().equals(loginid)) {
					if(temp!=null && temp.getLoan_address()==0) {
						System.out.printf("%d\t\t",temp.getBankbook_number()+"\t\t"+" - ");
					}
					else if(temp!=null && temp.getLoan_address()!=0) {
						System.out.printf("%d\t\t",temp.getBankbook_number(),temp.getLoan_address());
					}
						
				}
			}
			System.out.println("\n----------------------");
		}
		else if(ch1==7) {break;}
	 }
	}
	
	void �Ա�(String loginid) {
		System.out.println("----- �Ա� �޴� -----");
		System.out.println("�Ա��Ͻ� ���� �Է� : "); int �����Է�=scanner.nextInt();
		for(Bankbook temp:booklist) {
			if(temp!=null && temp.getBankbook_number()==�����Է�) {
				System.out.println("�󸶸� �Ա��Ͻðڽ��ϱ�?");
				int in_money = scanner.nextInt();
				temp.setSave_money(temp.getSave_money()+in_money);
				System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
			}
		}
		System.out.println(" �ش���°� �����ϴ�. ");
		
	}
	void ���(String loginid) {
		System.out.println("----- �Ա� �޴� -----");
		System.out.println("����Ͻ� ���� �Է� : "); int �����Է�=scanner.nextInt();
		for(Bankbook temp:booklist) {
			if(temp!=null && temp.getBankbook_number()==�����Է�) {
				System.out.println(" �󸶸� ��� �Ͻðڽ��ϱ�? ");
				int out_money = scanner.nextInt();
				if(temp.getSave_money()<out_money) {
					System.out.println("�ܾ��� �����մϴ�.");
				}
				else if (temp.getSave_money()>=out_money) {
					System.out.println("��й�ȣ�� �Է� �ϼ���");
					String password =scanner.next();
					for(Account temp2:account) {
						if(temp2!=null &&temp2.getId().equals(loginid)&& temp2.getPassword().equals(password)){
							temp.setSave_money(temp.getSave_money()-out_money);
							System.out.println("����� �Ϸ�Ǿ����ϴ�.");
						}
						System.out.println("�Է��� ��й�ȣ�� �ƴմϴ�.");
					}
				}
				else System.out.println(" �ش���°� �����ϴ�. ");
			}
		}
	}
	void ��ü(String loginid) {
		System.out.println(" ��ü �޴� ");
		System.out.println("����Ͻ� ���� �Է� : "); int ��ݰ���=scanner.nextInt();
		System.out.println("�۱��Ͻ� ���� �Է� : "); int �۱ݰ���=scanner.nextInt();
		for(Bankbook temp:booklist) {
			if(temp!=null && temp.getBankbook_number()==��ݰ���) {
				if(temp!=null && temp.getBankbook_number()==�۱ݰ���) {
					System.out.println(" �󸶸� ��� �Ͻðڽ��ϱ�? ");
					int out_money = scanner.nextInt();
					if(temp.getSave_money()<out_money) {
						System.out.println("�ܾ��� �����մϴ�.");
					}
					else if (temp.getSave_money()>=out_money) {
						System.out.println("��й�ȣ�� �Է� �ϼ���");
						String password =scanner.next();
						for(Account temp2:account) {
							if(temp2!=null &&temp2.getId().equals(loginid)&& temp2.getPassword().equals(password)){
								temp.setSave_money(temp.getSave_money()-out_money);
								System.out.println("�۱��� �Ϸ�Ǿ����ϴ�.");
							}
							System.out.println("�Է��� ��й�ȣ�� �ƴմϴ�.");
						}
					}
					
				}System.out.println(" �Է��Ͻ� ���°� �����ϴ�.");
				
			}System.out.println(" �Է��Ͻ� ���°� �����ϴ�.");
			
		}
	
	}
	void ����(String loginid) {
		System.out.println(" ���� �޴� ");
		System.out.print("1.�����ǰ���� 2.�����û"); int ���⼱�� = scanner.nextInt();
		if(���⼱�� == 1) {
			loan_controller.�����ǰ����();
		}
		if(���⼱�� == 2)
			loan_controller.�����û(loginid);
		
	}
	
	
	

	// ������ �޴�
	void �����ڸ޴�() {
		
		System.out.println(" ============ ������ �޴� ============");
		System.out.println("1.�����ǰ��� 2.����ȸ������"); int ch1= scanner.nextInt();
		if(ch1 == 1 ) {
			
			loan_controller.�����ǰ���();
		}
		else if(ch1 == 2) {
			
			loan_controller.����ȸ������();
		}
		else System.out.println(" �߸� �Է��� ���Դϴ�.");
	}
}
