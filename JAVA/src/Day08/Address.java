package Day08;

import java.util.Random;

import Day07.Member;

public class Address {
	
	// 1. �ʵ�
	
		//1.�Ա� 
		//2.��� 
		//3.��ü  == > ��ü ��� class
		//4.����  == > ���� ��� class
		//5.���¸��
	String �̸�;
	String id;
	String password;
	int Adds;
	int �ܾ�;
	int ����;
	
	int �Ա�;
	int ���;
	String ��ü;
	String ���¸��;
	String ���°���;
	String �������;
	 
	
	
	// 2. ������
	public Address() {
		
	}

	public Address(String �̸�, int �Ա�,String ��ü, int ���, int ����, String ���¸��,String ���°���,String ������� ) {
		this.�̸� = �̸�; 		this.�Ա� = �Ա�; 		this.��� = ���; 		this.��ü = ��ü; 
		this.���� = ����; 		this.���¸�� = ���¸��; 	this.���°��� = ���°���; 	this.������� = �������;
	}
	public Address(String �̸�, String id, String password, int Adds, int �ܾ�, int ����) {
		this.�̸� = �̸�; 		this.id = id; 		this.password = password; 		this.Adds = Adds; 
		this.�ܾ� = �ܾ�; 		this.���� = ����;
	}
	

	void �Ա�(String loginid) {
		System.out.print("�Ա� �ݾ�");
		int input = Day08_05_�������.scanner.nextInt();
		for (Day08.Member temp : Day08_05_�������.members) {
			
			if(temp != null && temp.id.endsWith(loginid)) {
				temp.�ܾ� +=input;
				System.out.println("���� "+temp.�ܾ�+" ���� �ֽ��ϴ�.");
				return;
			}
			
		}
		
	}
	void ���(String loginid) {
		
		System.out.print(" ��� �ݾ� : ");		int output = Day08_05_�������.scanner.nextInt();
		System.out.print("��� ��ȣ�� �Է��ϼ���"); String pw = Day08_05_�������.scanner.next();
		
		for (Day08.Member temp : Day08_05_�������.members) {
			if(temp !=null && temp.id.equals(loginid) && temp.password.equals(pw)) {
				if(temp.�ܾ�<output) {
					System.out.println("�ܾ��� ���ڶ��ϴ�.");
					return;
				}
				else if(temp.�ܾ�>=output) {
						temp.�ܾ� -= output;
				System.out.println("�ܾ��� "+temp.�ܾ� + " �ֽ��ϴ�.");
				}
			}
			else if(temp!=null && temp.id.equals(loginid) != temp.password.equals(pw)) {
				System.err.println(" ��й�ȣ�� Ʋ���ϴ�. ");
				return;
			}
			
		}
		
	}
	void ��ü(String loginid) { // �Է��� ��ü ���¹�ȣ ���� �� ���� �Ұ� �ۼ� �ؾ���
		System.out.print(" ��ü�Ͻ� ���¹�ȣ�� �Է��ϼ���"); int adds= Day08_05_�������.scanner.nextInt();
		System.out.print(" ��� �ݾ� : ");		int output = Day08_05_�������.scanner.nextInt();
		System.out.print("��� ��ȣ�� �Է��ϼ��� :"); String pw = Day08_05_�������.scanner.next();
		int i =0;
		for (Day08.Member temp : Day08_05_�������.members) {
			if(temp !=null && temp.id.equals(loginid) && temp.password.equals(pw)) {
				if(temp.�ܾ�<output) {
					System.out.println("�ܾ��� ���ڶ��ϴ�.");
					return;
				}
				else if(temp.�ܾ�>=output) {
					for(Day08.Member temp2 : Day08_05_�������.members) {
						if(temp2 !=null && temp2.add_num == adds)  {
							temp.�ܾ�-=output;
							System.out.println("�ܾ��� " + temp.�ܾ� +"���ҽ��ϴ�");
							temp2.�ܾ�+=output;
						return;
						}
						
					}
					
						
				}
					

			}
			else if(temp!=null && temp.id.equals(loginid) != temp.password.equals(pw)) {
				System.err.println(" ��й�ȣ�� Ʋ���ϴ�. ");
					break;
			}
	
//				else  temp.�ܾ�-=output;
//					System.out.println("�ܾ��� "+ + "");
		}
		return;
	}
	
	
	void ����(String loginid) {
		Random random= new Random();
		double add_num = random.nextDouble(9.9)+1; 
		
		System.out.print("���� �ݾ�");  int ����ݾ� = Day08_05_�������.scanner.nextInt();
		System.out.print("\n��� ��ȣ�� �Է��ϼ��� :"); String pw = Day08_05_�������.scanner.next();
		
		for (Day08.Member temp : Day08_05_�������.members) {
			if(temp !=null && temp.id.equals(loginid) && temp.password.equals(pw)) {
				System.out.printf(" ���� ���� ������ %.2f �Դϴ� ��������ðڽ��ϱ�?", add_num );
				System.out.print("1.��  2.�ƴϿ�:"); int se1 = Day08_05_�������.scanner.nextInt();
				if(se1==1) {
					temp.�ܾ� += ����ݾ�; 
					����ݾ� -= ����ݾ�;
					return;
				}
				else if(se1==2) {
					System.out.println(" �ȳ��� ���ʽÿ� ");
					return;
				}
				else System.out.println("�߸��� �Է��Դϴ�.");
			}
			
			else if(temp!=null && temp.id.equals(loginid) != temp.password.equals(pw)) {
				System.err.println(" ��й�ȣ�� Ʋ���ϴ�. ");
					return;
			}
		}
		
		
	}
	void ���¸��() {
		
	}
	
	
	/*
	 * // Day08_05.ȸ����.add System.out.println("======= ���� �޴� =======");
	 * System.out.println("1.�Ա� 2.��� 3.��ü 4.���� 5.���¸��"); System.out.print(" ���� : ");
	 * int ���� = Day08_05.scanner.nextInt(); // �Ա� if(����==1) {
	 * System.out.print(" �Ա� �Ͻô� �ݾ� : "); int �ݾ�=Day08_05.scanner.nextInt();
	 * 
	 * 
	 * } else if(����==2) { System.out.print(" ��� �Ͻô� �ݾ� : "); int
	 * �ݾ�=Day08_05.scanner.nextInt(); } else if(����==3) {
	 * 
	 * } else if(����==4) {
	 * 
	 * } else if(����==5) {
	 * 
	 * } else System.err.println("�߸��� �Է��Դϴ�."); }
	 */
	
}
		
		

