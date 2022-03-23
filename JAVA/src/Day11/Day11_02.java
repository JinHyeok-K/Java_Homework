package Day11;

public class Day11_02 {
	
	// p . 422
		// ��ǻ���� �ϵ���� ������ ���� [ ���� �Ұ��� ]
		// ������� �߸��� ���� or �������� �߸��� �ڵ� �� ������ ����
		// ���� : 1. �Ϲݿ��� 2. ���࿹��
			// �Ϲݿ��� : ������[����]���� ���� �˻� [ �����ڿ��� ���� ����ó��(���� ��) = �ܺ���� (IO) ]
			// ���࿹�� : ������[����]�Ŀ� ���� �˻� [ �������� ������ �Ǵ��ؼ� ����ó�� ]
					// �Ϲ������� ��,��¿��� �߻� 
		// ����ó��
			// ���� : ���� �߻� �� ���α׷��� ����ȴ�. => �������� ����
			// ���� ������ �߻��ϸ� ��ü �ڵ尡 ���� [ ���α׷��� ������� �ʰ� ]
	
		/*
		 *  try{
		 **  	// ���ܰ� �߻��� �� ���� �ڵ�
		 *  }catch( ����Ŭ���� ��ü��){
		 *  	// ���࿡ ���ܰ� �߻��ϸ� ����Ǵ� �ڵ�
		 *   }
		 */
	public static void main(String[] args) {
		
		// p.423 [NullPointerException]
		try {
		String data = null;
		System.out.println(data.toString()); // ObjectŬ���� �޼ҵ� : toString() : ��ü�������
			// ���� ������ ��������. -> �����Ŀ� �����߻� [ ���࿹�� ]
		
		// ������ �߻��ϴ� ���� : null�� �޸� �Ҵ��� ���� ������ ��ü ���� ��� �Ұ� [NullPointerException]
		}// try end
//		catch(NullPointerException ��ü��) { // ==> Exception ����(super class)
		catch(Exception ��ü��) { 
			System.out.println("���ܹ߻�: " + ��ü��);
		}
		
		// p.424  [ArrayIndexOutOfBoundsException]
		try { // ���ܰ� �߻� �� �� ���� �ڵ�
		String[] �迭 = new String[2]; // String 2���� ������ �� �ִ� �迭
		�迭[0] = "a"; �迭[1] = "b"; �迭[2] = "C";
		}catch(ArrayIndexOutOfBoundsException e) {
				 // ���ܹ߻��� ����Ŭ���� ��ü�� = ��ü�� ������ ������ �����
			// ���࿡ ���ܰ� �߻��ϸ� ����Ǵ� �ڵ�
			System.out.println("���ܹ߻�: "+e);
		}
		
		// p.426 [NumberFormatException]
		try {
		String  data1 ="100"; //���ڿ�
		String  data2 = " a100"; //���ڿ�
		int value1 = Integer.parseInt(data1); // "100" -> 100
		int value2 = Integer.parseInt(data2); // "a100" -> X [a�� ������ ǥ�� �Ұ���]
			      // Integer.paeseInt(���ڿ� ) ; ���ڿ� -> ����
		// ���� �߻� ���� : ���ڿ� �� ���� ������ ��ȯ�� ���������� ���ڿ� �� �������� ��ȯ�� �Ұ���
		// ������ �߻��ϸ� catch �̵� [ ���� �߻� ���� �ڵ� ���� X ]
		int result = value1+value2;
		System.out.println(data1+"+"+data2+"="+result);
		}catch( NumberFormatException e){
			System.out.println("���� �߻� :"+e);
		}
		
		// p.428
		// ���� ǥ�ÿ� exception => try& catch  �ƴ϶�� �� ����
		String ���ڿ� =  "������";   // �ڹ� Ŭ���� ��  �ϳ� [ ������ Object ���
		Object ���۰�ü ;           //�ڹ� Ŭ���� �� �ֻ��� Ŭ����
		
		���۰�ü = ���ڿ�;	// �ڽ� --> �θ� [����]	
		���ڿ� = (String)���۰�ü;	// �θ� --> �ڽ� [����]
			//	��������Ȳ
			// �����߿� �� ��ȯ
		
		//����ó�� �Ǵ�(IO : Input Output)
			// ��,��� (����� ����) ���õ� �ڵ� [ ������ ����ó�� ]

		
		
		
	}//main end
}//class end
