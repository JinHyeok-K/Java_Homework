package Day11;

public class Day11_03 {

	//p.422 ���� ������ [throws Exception]
		// ���� : ��� �޼ҵ忡�� try{}catch(){} ���� �ڵ� ������ -> �Ѱ����� ���� �̵�
	
	public static void main(String[] args) {
		try {	findclass();}
		catch(Exception e) { }
		try {withdraw(30000);}
		catch(Exception e) { System.out.println(e);}
	}
	public static void findclass() throws Exception{
//		1. ���� ������[�޼ҵ��() throws ����Ŭ������] ���ܰ� �߻� �� ȣ���� ������ ����
		Class clazz = Class.forName("java.lang.String2");
		
//		2. try ~ catch
//		try { // ���ܰ� �߻��� �� ���� �ڵ�[���࿹��] Ȥ�� �Ϲݿ���[������]
//				Class clazz = Class.forName("java.lang.String2");
//						//Ŭ���� ã�� �Ӹ޼ҵ�
//		}catch(Exception e) { // ���ܰ� �߻��ϸ� ����Ǵ� �ڵ�
//			// Exception : ���� Ŭ������ ���� Ŭ���� �̹Ƿ� ��� ���ܸ� ���尡��
//			System.out.println(e);
//		}
		
	}
	
	// p. 444~445 : ���� �����
	public static void withdraw( int money) throws Exception {
		if(20000 <money) {
			throw new Exception("�ܰ����"); 
							//�����޼��� �߻�
		}
	}
	
	
}
