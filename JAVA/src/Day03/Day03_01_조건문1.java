package Day03;

public class Day03_01_���ǹ�1 { //c.s
	
	
	
	public static void main(String[] args) {//m.s
	
		// 1���� : ��� , �Է�
		// 2���� : ����(����) , ���(����)
				
		// ���
			// ��ǻ���� �Ǵܷ� => ����� ��
			// ���ǽ��� true �̸� ���๮ ó��
			// ����
				// 1. if ( ���ǽ�[ture/false] ) ���๮;
				// 2. if ( ���ǽ� ) ���๮;
				//    else ���๮[����];
				// 3. ���๮�� 2�� �̻�( ; 2�� �̻��̸� ) {   } ���� ó��
				// 4. ����� ���� �ټ� �� �� [ ������ �ټ� �� ��] 
				//	  if ( ����1 ) { ���๮ [��1]; }
				// 	  else if( ����2 ) { ���๮ [��2]; }
				// 	  else if( ����3 ) { ���๮ [��3]; }		
				// 	  else if( ����4 ) { ���๮ [��4]; }
				// 	  else if( ����5 ) { ���๮ [��5]; }
				//	  else { ���๮[����]; }
				// 5. if ��ø
				//    if( ���ǽ� ) {
				//			if( ���ǽ� ){ ���๮; }
				//			else { ���๮; }
				//	  } else {	
				//			if (whrjstlr ) {���๮ ;}
				//			else { ���๮; }
				//    }
				//			
		
		// ����1
		if(3>1) System.out.println("��1) 3�� 1���� ũ��.");
			// ���࿡ 3�� 1���� ũ�� ���O �ƴϸ� ��� X
			// true �̸� ���� 
		// ����2
		if(3>5) System.out.println("��2) 3�� 5���� ũ��.");
			// ���࿡ 3�� 5���� ũ�� ���O �ƴϸ� ��� X 
		// ����3
		if(3>1) System.out.println("��3-1) 3�� 1���� ũ��.");
		else System.out.println("��3-2) 3�� 1���� �۴�.");
			// ���࿡ (3�� 1���� ũ��) ��3-1 ���
			// �ƴϸ� (3�� 1���� ������) �� 3-2 ���
		// ����4
		if(3>2) { // true ���� �� ���� [ ���๮ (;) 2�� �̻� �� �� ]
			System.out.println("true"); 
			System.out.println("3�� 2���� ũ��");
		}// true ���๮ ��
		else { // false ���๮ ����
			System.out.println("false");
			System.out.println("3�� 2���� �۴�.");
		} // false ���๮ ��
				
		
		// ����5
		if(3>5)	System.out.println("��5) 3�� 5���� ũ��");  		//  ���� X
		else if( 3>4) System.out.println("��5) 3�� 4���� ũ��.");	//  ���� X
		else if( 3>3) System.out.println("��5) 3�� 3���� ũ��.");	//  ���� X
		else if( 3>2) System.out.println("��5) 3�� 2���� ũ��.");	//  ���� O
		else System.out.println(" true ����. ");	//  ���� X
		
		
	}//m.e

}//c.e
