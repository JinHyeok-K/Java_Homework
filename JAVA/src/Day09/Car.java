package Day09;

public class Car { // class ����
	
	// 1. �ʵ�
	Tire frontLeftTire = new Tire("�տ���",6);
	Tire frontRightTire = new Tire("�տ�����",2);
	Tire backLeftTire = new Tire("�ڿ���",3);
	Tire backtRightTire = new Tire("�ڿ�����",4);
// ���� Ŭ������ ��ü�� = new �����(Ÿ�̾���ġ, Ÿ�̾����) 
	// 2. ������
	// 3. �޼ҵ�
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		if (frontLeftTire.roll()==false) {stop(); return 1;}
		// Ÿ�̾ ȸ���� �޴µ� ����� false �̸� ��ũ
		// true �̸� ���� ����
		if(frontRightTire.roll()==false){stop(); return 2;}
		if(backLeftTire.roll()==false){stop(); return 2;}
		if(backtRightTire.roll()==false){stop(); return 2;}
		return 0;
	}
	void stop(){
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
		

}
