package Day08_03; // A Ŭ������ ���� ��Ű��

public class B {
	// A�� ��Ű���� ������ Ŭ������ �ٸ�
		// public, default ����
		// private ���� �Ұ���
	
		// 1. �ʵ�
		A a1 = new A(true); 	 //  �� Ŭ�������� public ȣ�� ����
		 
		A a2 = new A(1);		 // �� Ŭ�������� default ȣ�� ����
//		A a3 = new A("���ڿ�");	 // �� Ŭ�������� private ȣ�� �Ұ��� 
	
		// 2. ������
		public B() {
			
			A a = new A(true);
			a.field1=1;
			a.field2=1;
			// a.field3; ��� �Ұ���
			
			a.method1();
			a.method2();
			//a.method3(); //�Ұ���
		}
		// 3. �޼ҵ�
	
	// �� ���� Ŭ���� ���� A
			// 1. �ʵ�
			
			
		
	
}
