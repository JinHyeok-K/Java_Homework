package Day15;

public class Day15_02 {
	public static void main(String[] args) {
		// �������̽� [ ]
			// * ������ ������ ����(���δٸ�) ��ü�� �����ϱ� ����
			// 1. �������̽��� ���
				//	1. ����ʵ� 2.�߻�޼ҵ� 3.����Ʈ�޼ҵ� 4.�����޼ҵ�
			// 2. �����					
				// public class  Ŭ������ implements �������̽���
				// !! �ʼ� :  �߻� �޼ҵ� ����
			// 3. ���� ��ü ����
				// * Ŭ�����κ��� �޸� �Ҵ� ������
			// 4. �͸� ��ü ����
				// * �������̽����� ���� ����
		
		// ��) ������ü ����� :������ �޼ҵ� ���� ����
		�����е� pad1 = new �����ý��丮();
	// �������̽��� ��ü�� = new (������)Ŭ������(=������) ();
//		�����е� pad3 = new �����ý��丮();
		
		
		// ��2 ) �͸� ��ü �����:������ �޼ҵ� ���� �Ұ�
	// �������̽��� ��ü��= new �������̽���() { �߻�޼ҵ� ���� };
		�����е� pad2 = new �����е�() {
			
			@Override
			public void C��ư() {}
			
			@Override
			public void B��ư() {}
			
			@Override
			public void A��ư() {}
		}; // ���� ��
		
//		�����е� pad4 = new �����е�() {
//			@Override
//			public void A��ư() {	}
//			@Override
//			public void B��ư() {}
//			@Override
//			public void C��ư() {}
//			
//		};
		/////////////////////////////////////////////
		 // *�������̽� ������ ��ü ��ü
		 // ���� ��ü
		pad1 = new ���Ŀ¶���();
		//
		���� g1 = new ����();
		g1 = new �����ý��丮(); // ���� ��ü
		g1 = new ���Ŀ¶���();
//////////////////////////////////////////////////////////////////////////////////////
		//				 ��� [extends] vs �������̽�[interface]
		//���� ��:			1 ��		   vs 	 ����[������]
		//override			������[����]   vs   ����[����]
		// ������				�θ�<-�ڽ�    vs    �θ�<-�ڽ�
		// ���� 				���� ����     vs   ������ ���� ���� �ٸ� Ŭ�������� ����
		// 							   vs		�߻�	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}