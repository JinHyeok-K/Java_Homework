package Day15;

public class ThreadB extends Thread{
	public boolean stop=false; //���� �÷���
	public boolean work=true;	//�۾� ���࿩�� (����
	
	public void run() {
		while(!stop) { // stop �� false �̸� ���ѷ���
			if(work) { // work�� true�̸�
				System.out.println("ThreadB �۾�����");
			} 
			else { // work�� false �̸� �ٸ� �����忡�� �纸
				Thread.yield();
			}
		} //while end
		System.out.println("Thread ����");
	}
	
}
 