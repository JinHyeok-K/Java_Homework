package part2_04_08_5;

public class ����Ϲ�ũ���α׷�_2�ΰ��� {
	// ����� ��ũ ���α׷� [ 2�� ���� ]
			// �䱸����
			// ȸ�� �ֿ��� : 1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��
			// ���� �ֿ��� : 1.���»��� 2.�Ա� 3.��� 4.��ü 5.���� 6.�� ���¸��
					// *ȸ���� ���� ���� ���
					// *������(�����) ���� ��ǰ�� ��� �ϸ� ��ϵ� �����ǰ���� ȸ������ 
					// �����ؼ� ���� ���
			// ���� : ���� , ���� , ȸ��
					// ����Ŭ���� = ����Ŭ���� 
						// �ʵ� : 1.�����̸� 2.�ݾ� 3.���� 4.������[id] 5.��ȯ����
					// ����Ŭ����
						// �ʵ� : 1.���¹�ȣ(�ߺ�x) 2.���ݾ� 3.�̸�[id]
		
		//����
		//����
//	model 1 : ���¹�ȣ, �̸�,phone, id,password, ���ݾ�, �����
// model 2 : 
		
		// ȸ������ Ŭ����(member) - id,pw,�̸�,��ȭ��ȣ => ���¹�ȣ random �߻� -> �迭 ����
		// ���� Ŭ����( account ) = ���¹�ȣ , �̸�, ���ݾ�
		//
	public static void main(String[] args) {
		
		����Ϲ�ũ���α׷�_2�ΰ��� app = new ����Ϲ�ũ���α׷�_2�ΰ���();
		System.out.println(" ȯ���մϴ�. ");
		app.menu();
	}
	
	void menu() {
		
		
		Bank_total_controller contorller = new Bank_total_controller();
		Bank_account_controller acc_con = new Bank_account_controller();
		
		while(true) {
			System.out.println("------------------------------");
			System.out.println("�� ���� ȸ���̽ʴϱ�?"); 
			System.out.println("1.�� 2.�ƴϿ�"); int ch1= Bank_total_controller.scanner.nextInt();
			if(ch1==2) {
				System.out.println("ȸ�������Ͻðڽ��ϱ�?"); 
				System.out.println("1.�� 2.�ƴϿ�"); int ch2= Bank_total_controller.scanner.nextInt(); 
				
				if(ch2==1) { //ȸ������ �޴� ���� �� �ʱ�޴�
					
					boolean result = acc_con.ȸ������();
						if(result)
							System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
						else
							System.err.println("ȸ������ ����");
				}
				else if(ch2==2) {
					System.out.println("�ȳ��� ���ʽÿ�");
					break;
				}
				else {}
			}
			else if(ch1==1) { //�α��� �޴� 
				contorller.startMenu();
			}
		}
	}
	
}



