package Day03;

import java.util.Scanner;

public class Day03_04_���ǹ�4 { //cs
	
	public static void main(String[] args) { //ms
		
		Scanner scanner = new Scanner(System.in);
		
		
		// ��� : 1. if ��  2. switch��
			// if : �� �˻� (true Ȥ�� false) / ����� ���� ������ ���� �ʴ� ���
					// >= <= > < == !=
			// switch : ������ �˻�(���� ����)	 	/����� ���� ������ �ִ� ���
				// ����
					// switch (�˻���) { 
					// 		case '���ð�' : ���๮;
					//		case '���ð�' : ���๮;			
					//		case '���ð�' : ���๮;
					//		default : ���๮;
					// }
				// break; : ���� ����� switch Ȥ�� �ݺ��� Ż�� [������]
		
		
				// ��1) ���� 90 A | ���� 80 B | ���� 70 C | �� �� Ż��
		
				int ���� =80;
				if(����==90) System.out.println("A���");
				else if(����==80) System.out.println("B���");
				else if(����==70) System.out.println("C���");
				else System.out.println("Ż��");
				
				System.out.println("======================");
				
				switch(����) {
					case 90 : System.out.println("A���");	break;
					case 80 : System.out.println("B���");	break;
					case 70 : System.out.println("C���");	break;
					default : System.out.println("Ż ��");
				}
				
				// ��2) 
				int ��ư = 3;
				switch (��ư) {
					case 1 : System.out.println("1������ �̵�");	break;
					case 2 : System.out.println("2������ �̵�");	break;
					case 3 : System.out.println("3������ �̵�");	break;
					case 4 : System.out.println("4������ �̵�");	break;
					default : System.out.println("����");
				}
				
				// ��3)
				System.out.println();
				char ��� = 'B';
				switch (��� ) {
					case 'A' : 
					case 'B' : System.out.println("��� ȣ��"); break;
					case 'C' :
					case 'D' : System.out.println("�Ϲݳ�"); break;
				default : System.out.println("�ճ�");
				}
				
				// ��4)
				String ���� = "����";
				switch(����) { // ���������� ������ .equals ��� 
				case "����" : System.out.println("700��");	 break;
				case "����" : System.out.println("700��");	break;
				default : System.out.println("300��");
				}
				
				// ����1 ) ����,����,���� ������ �Է¹޾�  
	 			// 	����� 90���̻��̸� A���
	 			//  80���̻��̸� B��� ������ Ż��
				
				System.out.println(" ���� ���� : "); int ����= scanner.nextInt();
				System.out.println(" ���� ���� : "); int ����= scanner.nextInt();
				System.out.println(" ���� ���� : "); int ����= scanner.nextInt();
				
				int ��� = (����+����+����)/3;
				
				System.out.println("��� : "+ ��� + "| ������/10 "+���/10);
				
				switch( ��� /10) { // ������� 1�� �ڸ� ����
					case 9 : System.out.println("A���"); 	break;
					case 8 : System.out.println("B���");		break;
					default : System.out.println("Ż��");
					
				}
				
				
				
				
	} // me

}// ce
