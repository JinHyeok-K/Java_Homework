/*package Day08;


public class Member {


		// 1.�ʵ�
			// ȸ����ȣ [ �ڵ���ȣ , �ߺ�x ] 
		String id;
		String �̸�;		// ���̵� [ �ߺ�x ]
		String password;// ��й�ȣ
		String ��ȭ��ȣ;
		int ���¹�ȣ;	// �̸�
		int �ܾ�;	// ����ó
//		�̸�/��й�ȣ/���¹�ȣ/�ܾ�
		// 2.������ [ �����ڸ� == Ŭ������ ]
			// 1. �������[�⺻������] : �޼ҵ�ȣ��� ��ü������
		public Member() { }
			// 2. ��� �ʵ带 �޴� ������ : ȸ�����Կ� ��ü������
		public Member(String id, String �̸�, String password,String ��ȭ��ȣ, int ���¹�ȣ, int �ܾ�) {
			
			this.id =id;
			this.password = password;
			this.�̸� = �̸�;
			this.��ȭ��ȣ = ��ȭ��ȣ;
			this.���¹�ȣ = ���¹�ȣ;
			this.�ܾ� = �ܾ�;
		}
		boolean ȸ������() {
		
			System.out.println(" ----- ���� ���� ������ ----- ");
			System.out.print(" ȸ�� �̸�"); String �̸�= Day08_05.scanner.next();
			System.out.print(" id");		 String id= Day08_05.scanner.next();
			System.out.print(" ��� ��ȣ"); String password=Day08_05.scanner.next();
			System.out.print(" ��ȭ��ȣ"); String ��ȭ��ȣ=Day08_05.scanner.next();
			
			int ���¹�ȣ = (int)(Math.random() * (999999 - 100000 + 1)) + 100000000;
// 			System.out.println(���¹�ȣ);
 			int �ܾ� = 0;
 			Member member = new Member(�̸�, id, password, ��ȭ��ȣ, ���¹�ȣ, �ܾ�); // ��� �ʵ� �޴� �����ڷ� ��ü����
			
				int i=0;
				for(Member temp:Day08_05.members) {
					if(temp==null) {
						Day08_05.members[i] = member;
						System.out.println(�ܾ�);
					return true;	
					}
					i++;
				}
				
			return false;
		}
		String �α���() {
			System.out.println(" ----- �α��� ������ ------");
			// 1. �Է¹ޱ� 
			System.out.print(" �̸� : ");		String �̸� = Day08_05.scanner.next();
			System.out.print(" ��й�ȣ : ");	String password = Day08_05.scanner.next();
			// 2. �迭�� ��ü id�� password�� �Է��� ���� �����ϸ� 
			for( Member temp : Day08_05.members ) {
				if(  temp != null && temp.�̸�.equals(�̸�) 
						&& temp.password.equals(password) ) {
					// * ������ �ƴϸ鼭 id�� password�� �����ϸ� 
					return temp.�̸�; // ������ id ��ȯ
				}
			}
			// 3. �α��� ������ �Է��� id ��ȯ / ���н� null 
			return null; // ���н� null ��ȯ
		}
		void ���̵�ã��() {
			System.out.println(" ----- ���̵�ã�� ������ ------");
			// 1.�Է¹ޱ� 
			System.out.print(" �̸� : "); String �̸� = Day08_05.scanner.next();
			System.out.print(" ����ó : "); String phone = Day08_05.scanner.next();
			// 2. �Է¹��� ���� �迭�� ã�� 
			for( Member temp : Day08_05.members ) {
				if( temp !=null && temp.�̸�.equals(�̸�) && 
						temp.��ȭ��ȣ.equals(phone) ) {
					//* ������ �ƴϸ鼭 �ش� ��ü�� name,phone �� �Է¹��� ���� �����ϸ� 
					System.out.println(" �˸�]] ȸ���� ���̵� : " + temp.id); // ã�� id �ȳ�
					return; // ������ ���� ã������ �ش� �޼ҵ� ���� 
				}
			}
			// 3. ã������ ã��id ����ϰ� ��ã������ ���� ��� 
			System.out.println(" �˸�]] ������ ȸ�������� �����ϴ�. ");
		}
			// 4. ��й�ã�� �޼ҵ� [ �μ�x��ȯx ] : ���̵� , ����ó
		void ��й�ȣã��() {
			System.out.println(" ----- ��й�ȣã�� ������ ------");
			System.out.print(" ���̵� : ");	String id = Day08_05.scanner.next();
			System.out.print(" ����ó : ");	String phone = Day08_05.scanner.next();
			for( Member temp : Day08_05.members ) {
				if( temp != null && temp.�̸�.equals(id) &&
						temp.��ȭ��ȣ.equals(phone) ) {
					System.out.println(" �˸�]] ȸ���� ��й�ȣ : " + temp.password );
					return; // ������ �� ã������ �ش� �޼ҵ� ���� 
				}
			}
			System.out.println(" �˸�]] ������ ȸ�������� �����ϴ�. ");
		}
		
		
}// class end
*/

package Day08;


public class Member {//cs //Day08_5_test , Day08 Member


//1.�ʵ�

int add_num;		//���¹�ȣ
String id;			//���̵�	[�ߺ�x]
String password;	//��й�ȣ
String name;		//�̸�
String phone;		//����ó
int �ܾ�;
int �����ܾ�;

//2.������
	//1.�������
public Member() {//�޼ҵ�ȣ���

}
	//2.��� �ʵ带 �޴� ������ //ȸ�����Կ�

public Member( int add_num, String id, String password, String name, String phone, int �ܾ�,int �����ܾ�) {

	this.add_num = add_num;
	this.id = id;
	this.password = password;
	this.name = name;
	this.phone = phone;
	this.�ܾ� = �ܾ�;
	this.�����ܾ� = �����ܾ�;
}

//3.�޼ҵ�
	//1.ȸ������ �޼ҵ�
	boolean ȸ������() {
		System.out.println("---------ȸ������ ������--------");
		System.out.println("���̵� : "); String id =  Day08_05_�������.scanner.next();
		System.out.println("��й�ȣ : "); String password = Day08_05_�������.scanner.next();
		System.out.println("�̸� : "); String name = Day08_05_�������.scanner.next();
		System.out.println("����ó : "); String phone = Day08_05_�������.scanner.next();

		//*���̵��ߺ�üũ
		for(Member temp : Day08_05_�������.members) {
			if(temp != null && temp.id.equals(id) ) {
				System.err.println("�˸�)) ���� ������� ���̵��Դϴ�.");
				return false;//�Լ����� -> �ߺ��Ǿ��� ������ ���Խ���(false)
			}
		}//���̵��ߺ�üũ ��

		int i = 0;
		int add_num = (int)(Math.random() * (999999 - 100000 + 1)) + 100000000;
		int �ܾ� = 0;
		int �����ܾ� = 0;
		Member member = new Member(add_num, id, password, name, phone,�ܾ�,�����ܾ�);
		

		for(Member temp : Day08_05_�������.members) {
			if(temp == null) {
				Day08_05_�������.members[i] = member;
				System.out.println("�˸�)) �������������̵�� ���ԵǾ����ϴ�. : " + id);
				System.out.println("�˸�)) ȸ������ ���¹�ȣ�� : " +add_num+"�Դϴ� ");
				System.out.println(�ܾ�);
				return true;
				}
				i++;
		}

		return false;
	}//ȸ������ end

	//2.�α��� �޼ҵ�
	String �α���() {
		System.out.println("--------�α��� ������----------");
		//1.�Է¹ޱ�
		System.out.println("���̵� : "); 		String id = Day08_05_�������.scanner.next();
		System.out.println("��й�ȣ : "); 	String password = Day08_05_�������.scanner.next();
		//2. �迭�� ��ü idȭ password�� �Է��� ���� �����ϸ�
		for( Member temp : Day08_05_�������.members)	{
			if(temp != null && temp.id.equals(id) && temp.password.equals(password) ) {
			//*������ �ƴϸ鼭 id�� password�� �����ϸ�
				return temp.id;	//������ id ��ȯ
			}
		}
		//3.�α��� ������ �Է��� id��ȯ / ���н� null
		return null;//���н� null��ȯ
	}


}//ce
			
			
