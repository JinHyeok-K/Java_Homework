package Day15;

public class Calculator {
	//�ʵ�
	private int memory;
	//�޼ҵ�
	public int getMemory() {
		return memory;		
	}
	//�޼ҵ�
		// ������ : ������ 1�� 100�ְ� (������2 �� 50�ְ� [�� ����] ) 100���
		// �����ذ�[ synchronized : ����ȭ)
				// ������ 2�� ������1�� �޼ҵ� ���ᰡ �ɶ����� ������(waiting)
	public synchronized void setMemory(int memory) {
		this.memory=memory;
		try{Thread.sleep(2000);}
		catch(Exception e) {}
		
		
	System.out.println(Thread.currentThread().getName()+":"+this.memory);	
		
	}
}
