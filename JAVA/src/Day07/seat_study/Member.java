package Day07.seat_study;

public class Member {// class start
	/*
	 * 	1. �ʵ�
	 *  	[��ȣ,���̵�,��й�ȣ,�̸�,����ó]
		2. ������
		
		3. �޼ҵ�
			[1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��]
	 * 
		 
	 * 
	 * 
	 */
	// 1. �ʵ�
	//	[��ȣ,���̵�,��й�ȣ,�̸�,����ó]
	int id_num;
	String	id;
	String	password;
	String	name;
	String  phone;
	
	// 2. ������
		// 1. �� ������
	Member(){} 
		// 2. Ǯ ������
	public Member(int id_num, String id, String password, String name, String phone) {
		this.id_num = id_num;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	
	
	//3 �޼ҵ�
		// 1. ȸ������ �޼ҵ� [ �μ�x ��ȯo : ���Լ���TRUE / ���Խ���FALSE]
	void join() {
			// 1. �Է�
		System.out.println(" === ȸ�� ���� ������ ===");
			// 1-1 ID �ߺ� check
		System.out.print(" ID : "); 	String id		= BookApp.scanner.next();
		for(Member temp:BookApp.members) {
			if (temp!=null&&temp.id.equals(id)) {
				System.err.println(" �̹� �����ϴ� ID");
				return;
			}
		}
		
		System.out.print(" PW : "); 	String password	= BookApp.scanner.next();
		System.out.print(" name : "); 	String name		= BookApp.scanner.next();
		System.out.print(" phone : "); 	String phone	= BookApp.scanner.next();
			// 2. �迭�� ����
		Member member = new Member(id_num,id,password,name,phone);
		
			// 2-1 ȸ�� ID��ȣ ����[�ε���]
				// * ȸ����ȣ �ڵ��ο� [ ���� �ֱٿ� ������ ȸ��[������ȸ��]�� ��ȣ + 1 ]
		int uno=0; // ȸ����ȣ ���� ����
		int i=0;
		for (Member temp:BookApp.members) {
			if(temp==null ) {
				if(i==0) {
					uno=1;
					return;
				}
				else { // i�� 0�� �ƴϸ� (= ���۹�ȣ: 1
					uno = BookApp.members[i-1].id_num+1;// ȸ�� ��ȣ�� BookApp ����� i-1�ε���
						//	  1,2,3...n-1,n,n+1.... => n��° �ε��� ã�� (n��°�� null �̹Ƿ� �ֱ� ��� �ε����� n-1)
						// ex) i=1 �� �� ����迭 0��° ȸ�� ���̵�� 0+1 => 1
						//    �ε���= 0���� ����  i=0:1��° ȸ�� / i=1:2��° ȸ��/ i=2:3��° ȸ��
					return;
				}
			}
		}
	}
	
		// 2. �α��� �޼ҵ� [ �μ�x��ȯo : ]
			// �α��μ����� ������ ���̵��ȯ / ���н� NULL ��ȯ
	void login() {
		System.out.println(" --- �α��� ������ --- ");
		 // �Է� ���� ID �� ��й�ȣ�� �����ؾ� �α��� ����
		System.out.print(" ID :"); String id=BookApp.scanner.next();
		System.out.print(" PW :"); String password=BookApp.scanner.next();
		// �� ����
			// �󸶸�ŭ?
				// ID ���� �������� ����Ǵ� �迭�� ���̸�ŭ (100ĭ : 100ȸ)
		for (Member temp: BookApp.members) {
			
			if( temp!=null && temp.id.equals(id) && temp.password.equals(password) ) {
				// ������� ���� | ID�� ��й�ȣ�� �����ϸ�
				System.err.println(" �˸�) �α��� ����");
				return;
			}
			System.err.println(" �˸�) �α��� ����");
		}
	}
	
		// 3. ���̵�ã�� �޼ҵ� [ �μ�x��ȯx] : �̸� , ����ó
	void find_id(){
		 	// �Է��� �̸� ����ó ���� �� (��) -> id ����
		System.out.println(" --- ID ã�� ������ --- ");
		System.out.print(" �̸� : "); 	String name 	= BookApp.scanner.next();
		System.out.print(" ����ó : "); 	String phone	= BookApp.scanner.next();
			// �� ����
		
		for (Member temp : BookApp.members) {
			
			if (temp!=null&&temp.name.equals(name)&&temp.phone.equals(phone)) {
				
				System.err.println(" ����� ID �� "+temp.id+"�Դϴ�.");
				return;
				
			}
			System.err.println(" ��ġ�ϴ� ������ �����ϴ�.");
		}
	}
		// 4. ��й�ã�� �޼ҵ� [ �μ�x��ȯx ] : ���̵� , ����ó
	void find_pw() {
		for (Member temp : BookApp.members) {
			
			if (temp!=null&&temp.id.equals(id)&&temp.phone.equals(phone)) {
				
				System.err.println(" ���ο� ��� ��ȣ�� �����ϼ���");
				temp.password = BookApp.scanner.next();
				return;
			}
		}
	}
		// 5. ȸ������ �޼ҵ�
	void user() {
		
	}
		// 6. ȸ��Ż�� �޼ҵ�
	void exit() {
		
	}
	
	
}// class end
