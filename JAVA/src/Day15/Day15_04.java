package Day15;

public class Day15_04 {
	// 12 �� :������ :�ڵ带 �о��ִ� ����
		// �ڵ� -> ���� -> ���μ���[���α׷�]
		// ���� : ����ó�� 
			//  main �޼ҵ忡 main ������ ����
	
		// �����
			// 1.  Thread class
			// 2. Runnable interface
	
		// run �޼ҵ� : ��Ƽ�������� �����ڵ�
	

	public static void main(String[] args) {
		// ��1)  Thread class  �� �̿��� ���� ó�� ��ü �����
		
		//���� class �� Thread
		���� m1 = new ����();
		m1.start();
		 // run �޼ҵ� ���� -> ������ ����
		
		
		//  ä�� Class �� Thread
		// ��2)  Runnable interface �� �̿��� ���� ó�� ��ü �����
		ä�� c1 =new ä��();
		//c1.start(); // Runnable �� start() �޼ҵ带 ������ ���� ����
		Thread thread =new Thread(c1);
		thread.start();
		
		
		
		/// Main Thread
		while(true) {
			System.out.println(" ���α׷� �۵��� ");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
	
		
	
	
	
	
	
	
}
	
	
	
	
