package Day15;

public class TargetThread {
	
	public void run() { // ������ ���� : NEW : ��ü �����ǰ� ��Ƽ������ ���� ��
		for(long i=0;i<1000000000;i++) {} // ������ ���� : RUNNABLE :��Ƽ������ ���� ��
		
		try {
			//1.5�ʰ� �Ͻ� ����
			Thread.sleep(1500);	 			// ������ ���� : WAITING : ��Ƽ������ �Ͻ�����
			
		}catch(Exception e) {}
		
		for(long i=0; i<1000000000; i++) {}
		
		
	} // run �޼ҵ尡 ����Ǹ� ������ ���� :  TERMINATED : ��Ƽ������ ����
	
	
}
