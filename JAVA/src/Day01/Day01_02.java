


package Day01;

public class Day01_02 { // c.s
	
	// 1. ���
		// A. print() : ��� ��
		// B. printf() : ��¿� �ٹ̱� 
			// ���� 
				// %s : ���ڿ� ��ü
				// %d : ����(n) ���� �ڸ�
				// %f : �Ǽ� ���� �ڸ�
			//  ���� ���� [ \ : �������� ��ȭ ��ȣ ]
				// \n : �ٹٲ� --> line
				// \t : �鿩���� [ 5ĭ ] --> tap
	// C. println() : ��� �� ��ĭ ����(�� �ٲ�)
	
	// 1. System : System Class [ �� ��� ���õ� ������� �ڵ� ���� ]
	// 2. out : ��� ��Ʈ��
	// 3. print() : ��� �Լ�
	// 4. ; : ���� code �� �˸�
	// * �ý��� Ŭ���� �� out �̶�� ��� ��Ʈ���� ����  print �Լ��� ����ؼ�
	// console �� ���ϴ� ��� ��� �� �� �ִ�.
	
	
	public static void main(String[] args) { // m.s
		
		// 1. �⺻ ���
		System.out.print("��ȣ3���ٸ�");   // ; : code ���� ����
		System.out.print("Java 1����");  // ���� ó�� "  "  ó��
		System.out.print(123);			// ���� " " ó�� X
			// * �̸� ������� �ܾ� [ ����� ] �� ������ ��� ���ڴ� " " ó��
			
		// 2. �ڵ� �ϼ� ( syso + ctrl + space bar)
		System.out.println("�ڹٴ� ��ü�����̴�.");
		System.out.println("���S�S");
		System.out.println(123);
	
		// 3. ���� ���
		System.out.printf("%s" , "�ϰ������");
		System.out.printf("java %d����",1);
		System.out.printf("%d",59103);
		
		
		System.out.println("\t\t[[�⼮��]]");
		// ���� 1  [ �⼮�� ]
		
		System.out.println("\n\t\t[[�⼮��]]");
		System.out.println("-------------------------------------------");
		System.out.println("�̸�\t1����\t2����\t3����\t���");
		System.out.println("��ȣ��\t �⼮\t �Ἦ\t �⼮");
		System.out.println("���缮\t �⼮\t �⼮\t �Ἦ");
		System.out.println("-------------------------------------------");
		
		
		// ���� 2 [ ���� 1 --> printf �� ]
		
		
		System.out.printf("\n\t\t%s","[[�⼮��]]\n");
		System.out.printf("-------------------------------------------\n");
		System.out.printf("%s\t%s\t%s\t%s\t%s\n","�̸�","1����","2����","3����","���");
		System.out.printf("%s\t%s\t%s\t%s\t\n","��ȣ��"," �Ἦ"," �⼮"," �⼮");
		System.out.printf("%s\t%s\t%s\t%s\t\n","���缮"," �Ἦ"," �⼮"," �⼮");
		
		// ����1 : �����
		
				/*		\    /\
						 )  ( ')
						(  /  )
						 \(__)|
				*/ 
		System.out.println("\n[[��!��!��!]]");
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
		
		//  '/' ǥ�� �ϱ����ؼ�  " // " --> / ���(�ι� �Է�) 
		
		
		// ����2 : ������ 
				/*
						|\_/|
						|q p|   /}
						( 0 )"""\
						|"^"`    |
						||_/=\\__|
				*/	
		System.out.println("\n ����Ű");
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"'    |");
		System.out.println("||_/=\\\\__|");
		
		// " <�� ��� ��  \" �ؾ� " ���  
		
	} // m.e
	

	

} // c.e
