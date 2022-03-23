package Day07;

import java.util.Scanner;

public class Member {


	
	// 1. �ʵ�
	int mno;			// ȸ����ȣ [�ڵ���ȣ,�ߺ�X]
	public String id;			// ���̵� [ �ߺ� X ]
	public String password;	// ��й�ȣ
	public String name;		// �̸�
	public String phone;   	// ����ó
	
	// 2. ������ [ �����ڸ� == Ŭ������ ]
		// 1. �� ������ [ �⺻ ������ ] => �޼ҵ� ȣ��� ��ü ������
	public Member() { }
		// 2. ��� �ʵ带 �޴� ������ : ȸ�� ���Կ� ��ü ���� ��
	public Member(int mno, String id, String password, String name, String phone) {
		
		this.mno = mno;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}


	
	// 3. �޼ҵ�
		// 1. ȸ������ �޼ҵ� [ �μ� x ��ȯ o : ���Լ��� True : ���Խ��� False ]
		// 
	boolean ȸ������() {
		// 1. �Է� �ޱ� [ id, pw ,name, phone]
		System.out.println(" ----- ȸ������ ������ ----- ");
		System.out.println(" ----- �Է����ּ��� ----- ");
		System.out.print(" ID : "); 		String id 		=	Day07_05_BookApplication.scanner.next();
		
		// * ���̵� �ߺ�üũ
//		boolean idcheck = false;  => �帧 ����� boolean
		for(Member temp : Day07_05_BookApplication.members) {
			if(temp != null && temp.id.equals(id)) {
				// ���࿡ ������ �ƴϸ鼭 �迭 �� ID �� �Է¹��� ID �� �����ϸ�
					System.err.println("�˸� ) ���� ������� ���̵� �̤Ӥ��ϴ�.");
					return false; // �Լ�����--> ���̵� �ߺ��Ǿ��� ������ false[���� ����]
			}
		}
		
		System.out.print(" Password : ");	String password =	Day07_05_BookApplication.scanner.next();
		System.out.print(" Name : "); 		String name 	=	Day07_05_BookApplication.scanner.next();
		System.out.print(" Phone : "); 		String phone 	=	Day07_05_BookApplication.scanner.next();
			// * scanner ��ü�� �ٸ�  Ŭ���� �� static ����Ǿ����� 	// * Ŭ������.�ʵ��/�޼ҵ��
			// * static �ʵ�, �޼ҵ�� ��ü���� ȣ�� ����
		
			
			// * ȸ����ȣ �ڵ����� [ ���� �ֱٿ� ������ ȸ����[������ȸ��] ��ȣ +1 ]
		int bno=0; // ȸ����ȣ �����ϴ� ����
		int j = 0; // �ݺ�Ƚ�� [�ε���] 
		for(Member temp : Day07_05_BookApplication.members) {
			if (temp==null) { // null ã�� [null ã���� �� null -1 �ϸ� ������ ȸ�� ]
				if (j==0) {
					bno=1; // ù��° index�� null => ù ȸ�� => ùȸ����ȣ = 1�ο�
					break;
				}
				bno =(Day07_05_BookApplication.members[j-1].mno+1);
												// null �� [������ ȸ��]��ȣ�� +1
				break;
			}
			j++; // �ε��� ����
		}
		
		
		
		// 2. 4�� ���� -> ��üȭ -> 1��
		Member member = new Member(bno, id, password, name, phone); // ��� �ʵ� �޴� �����ڷ� ��ü ����
		// 3. �迭 �� �� ������ ã�Ƽ� ���ο� ȸ��[��ü] �ֱ� | 4. ���� ���� �� true ��ȯ ���� �� false ��ȯ
		int i = 0; // �ݺ�Ƚ�� [�ε��� üũ ]
		for (Member temp : Day07_05_BookApplication.members) {
			if(temp==null) { // �� �����̸� 
				Day07_05_BookApplication.members[i] = member; // �� �ε����� ���ο� ȸ�� ����
				System.out.println(" �˸�)) ȣ������ ȣ����ȣ :  "+ bno );
				return true; // ȸ�� ���� �޼ҵ� ���� [ ��ȯ : true (����) ]
			}
			i++; // i����
		}
		return false; // ȸ������ �޼ҵ� ���� [��ȯ : false (����)]
	}
	
		// 2. �α��� �޼ҵ� [�μ�x ��ȯO ]
			// �α��� ���� �� ������ ���̵� ��ȯ / ���� �� Null ��ȯ
	String �α���() {
		System.out.println(" ----- �α��� ������ ----- ");
			// 1. �Է¹ޱ�
		System.out.print(" ID : "); 		String id 		=	Day07_05_BookApplication.scanner.next();
		System.out.print(" Password : ");	String password =	Day07_05_BookApplication.scanner.next();
			// 2. �迭 �� ��ü id�� password �� �Է��� ���� �����ϸ�
//		int i = 0;
		for ( Member temp : Day07_05_BookApplication.members) {
			if( temp!=null&&temp.id.equals(id)&&temp.password.equals(password)) {
				System.out.print(" �˸�)) �α��� ���� ");
				// * ������ �ƴϸ鼭 id �� password �� �����ϸ�
				return temp.id; // ������ id��ȯ
			}
			
		}
			// 3. �α��� ������ �Է��� id ��ȯ /���н� null
			System.out.print(" �˸�)) �α��� ���� ");
			return null;
		
	}
	
	
		// 3. ���̵�ã�� �޼ҵ� // �̸� ����ó
	void ���̵�ã��() {
		System.out.println(" ----- ���̵�ã�� ������ ----- ");
		System.out.print(" Name : "); 		String name 		=	Day07_05_BookApplication.scanner.next();
		System.out.print(" phone : ");		String phone 		=	Day07_05_BookApplication.scanner.next();

		for (Member temp: Day07_05_BookApplication.members) {
			if( temp!=null&& temp.name.equals(name) && temp.phone.equals(phone) ) {
				System.out.println("����� ID �� "+temp.id+"�Դϴ�.");
				return;
			}
//			else {System.out.println(" Ȯ�� ���� �ʴ� ���� �Դϴ�.");}
//			return;
		}
		System.out.println(" Ȯ�� ���� �ʴ� ���� �Դϴ�.");
//		return;
	}
	
		// 4. ��й�ȣã�� �޼ҵ� // ���̵� ����ó
	void ��й�ȣã��() {
		System.out.println(" ----- ��й�ȣã�� ������ ----- ");
		System.out.print(" ID : "); 		String id 		=	Day07_05_BookApplication.scanner.next();
		System.out.print(" phone : ");		String phone 		=	Day07_05_BookApplication.scanner.next();
		for (Member temp: Day07_05_BookApplication.members) {
			if(temp!=null && temp.id.equals(id)&&temp.phone.equals(phone)) {
//				System.out.println("����� ��й�ȣ �� "+temp.password+"�Դϴ�.");
				System.out.println("��й�ȣ�� �� ���� �� �ּ���.");
				System.out.print(" �缳�� �Ͻ� Password : ");		String password =Day07_05_BookApplication.scanner.next();
				temp.password =password;
				return; //������ �� ã������ �ش� �޼ҵ� ����
			}
			
		}
		System.out.println(" Ȯ�� ���� �ʴ� ���� �Դϴ�.");
//		return;
	} 	
	
}
	
		// 5. ȸ������ �޼ҵ�
		// 6. ȸ��Ż�� �޼ҵ�