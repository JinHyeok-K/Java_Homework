package Day15;

import java.awt.Toolkit;

public class Day15_07 {
	
	
	public static void main(String[] args) {
		
		// p601. ������ ����
			// 1. Thread.sleep(�и���): �־��� �ð����� �Ͻ� ����
					// �ð�����: �и��� 1/1000�� ����ũ���� 1/1000000 
					// �Ϲݿ��ܹ߻� : �Ͻ����� ���¿��� �־��� �ð��� �Ǳ� ���� ������[����]
		
			// 2. Thread.yield() : �ٸ� �����忡�� ���� �纸
		
		
		
		// p602. sleep ����
//		Toolkit toolkit	= Toolkit.getDefaultToolkit(); //�Ҹ� ���� Ŭ����
//		for(int i = 0 ; i<10;i++) { // 10�� �ݺ�
//			toolkit.beep(); // �Ҹ����� [�Ҹ��� 1�� �۵��߿� for�� ����]
//			try {Thread.sleep(3000);
//			} catch (Exception e) {	} // �� ������(main) 3�ʰ� �Ͻ�����
//		}
		
		
		
		//  p604~606 yield()
			//1 .��ü ����
		ThreadA threadA =new ThreadA();
		//	  2/ ��ü ����
		ThreadB threadB = new ThreadB();
		//3. thread ����
		threadA.start();
		threadB.start();
		//4 .  ������ 3�ʰ� �Ͻ����� 
		try {Thread.sleep(3000);}
		catch(Exception e) {}
		// 5.  ������ A�� work �� ���� [�ش� ������ �Ͻ�����]
		threadA.work =false;// -> Thread.yield
	
		//4 .  ������ 3�ʰ� �Ͻ����� 
				try {Thread.sleep(3000);}
				catch(Exception e) {}
				// 5.  ������ A�� work �� ���� [ �ش� ������ �Ͻ����� Ǯ��]
				threadA.work =true;	
	
				// ������ 3�ʰ� �Ͻ�����
				try {Thread.sleep(3000);}
				catch(Exception e) {}
	}			// ������ A/ ������ B wg
				
		
	
}
