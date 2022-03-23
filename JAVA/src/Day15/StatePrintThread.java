package Day15;

public class StatePrintThread extends Thread{
	
	//�ʵ�
	private Thread targetThread;
	
	//������
	public StatePrintThread(Thread targetThread) {// �ܺη� ���� ���� ������ ��ü�� ���� ����
		this.targetThread =targetThread;
	}
//	public StatePrintThread(TargetThread TargetThread) {
//		this.targetThread =targetThread;
//	}
	//  ����ó��
	public void run() {
		while(true) {
			// ������ ���� ȣ��
			Thread.State state= targetThread.getState(); // ���� ������ ���� ȣ��
			System.out.println("Ÿ�� ������ ���� :"+state);
			// ������ ���� ����
			if(state==Thread.State.NEW) { // NEW : ������ �������� ��
				targetThread.start();
			}
			if(state==Thread.State.TERMINATED) { // TERMINATED : ������ ������� ��
				break;
			}
		}
		//0.5�ʰ� �Ͻ� ����
		try {Thread.sleep(500);}catch(Exception e) {}
	}
	
}
