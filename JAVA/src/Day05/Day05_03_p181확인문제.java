package Day05;

import java.util.Scanner;

public class Day05_03_p181Ȯ�ι��� {
		public static void main(String[] args) {
			
			//p. 181
			
				// 1.
				// 2.
				// 3. 2 : ��ü �񱳽� equals �޼ҵ� ���
				// 4. 2 : ���̰� ���� ��� �� ���� �Ұ�
				// 5. 3 : boolean �ʱⰪ�� ���Τ�
				// 6. 3, 5
				//		{1��},{2��},{3��} ==> 3
				//		{78, 83, 93, 87, 88} ==> 5
				//
				//		int[][] array = {
				//				{95,86},
				//				{83, 92, 96},
				//				{78, 8, 93, 87, 88},
				//		};
						
				//		System.out.println(array.length);
				//		System.out.println(array[2].length);
				// 7.
			
					int max =0; // �ִ� �����ϴ� ����
					int[] array = {1,4,3,8,2}; // ����+�ʱⰪ ����
					
					for (int i = 0 ; i<array.length;i++) {
						// * i �� 0���� array �迭 �� ���� ���� 1�� ����, ���� �ݺ� ó�� ==> 0~4����
						if(max<array[i])max = array[i];
						// * ���࿡ max ���� i�� ° �ε����� ���� �� ũ�� max �� i��° �� ����
						System.out.println("iteration : "+ max); // ���� ���� Ȯ��
					}
					
					System.out.println("max : "+ max);
					
				// 8.
					int[][] array2 = {
							{95, 86}, // 1��
							{83, 92, 96}, // 2��
							{78, 83, 93, 87, 88} // 3��
					};
					

					
					int sum = 0;		// �հ�
					double avg =0.0;	// ���		
					// Ǯ��
					//===================================
					int count = 0; 		// ������ ���� [ĭ ����]
					// 2���� �� ��� ������ ȣ��
					for (int i=0;i<array2.length;i++) {
						// * �� 0���� array2 �迭�� �� ���̱��� 1�� ���� ==> 3�̸����� (0,1,2)
						for (int j=0;j<array2[i].length;j++) {
							// * ���� 0���� �迭�� �� ���� [2, 3, 5] �̸����� 1�� ����
							sum+= array2[i][j]; // �����հ�
						}
						count += array2[i].length;  // �� ������ �����հ�
					}
					avg = (double)sum/count;
					//===================================
					
					System.out.println(" sum : "+ sum);
					System.out.println(" avg : "+ avg);
				
				// 9.
					boolean run = true; 	// while �� ����ġ ����
					int studentNum = 0; 	// �л� �� ����
					int[ ] scores = null;	// ���� �迭 '����' & �޸� �Ҵ� x
					Scanner scanner = new Scanner(System.in); // �Է� ��ü
					
					// while(true) {}
					while(run) { // [���� ���� : 5�� �Է� �� ����]
						
						System.out.println("---------------------------------------------------");
						System.out.println("1. �л� �� 2. ���� �Է� 3. ���� ����Ʈ 4. �м� 5. ����");
						System.out.println("---------------------------------------------------");
						System.out.println("���� : ");
						
						int selectNo = scanner.nextInt();
						if (selectNo==1) { // �л� �� �Է� �ޱ�
							System.out.print("�л���>"); studentNum = scanner.nextInt(); // �л� �� �Է� �ޱ�
								// �Է� ���� �л� �� ��ŭ �迭 ���� ����
							scores = new int[studentNum];  // scores ȣ�� | �Է� ���� �л� �� ��ŭ �迭 ���� ����
						}
						else if(selectNo==2) { // �л� ���� �Է� �ޱ�
							for(int i = 0 ; i<scores.length;i++) { // �迭 �� ��� �ε��� ��ŭ �ݺ� ó��
								System.out.printf("scores[%d] :\n",i); 
								scores[i] = scanner.nextInt(); // �Է¹޾� i��° �ε����� ����
							}							
						}
						else if(selectNo==3) { // �л� ���� ��� �ϱ�
							for(int i = 0 ; i<scores.length;i++) { // �迭 �� ��� �ε��� ��ŭ �ݺ� ó��
								System.out.printf("scores[%d] : %d \n",i,scores[i]); // i ��° �ε��� ���
							}
							
						}
						else if(selectNo==4) {
							int �ְ����� = 0;
							int ���հ� = 0;
							double ������� = 0.0;
							
							for (int i = 0 ; i<scores.length;i++) {
								// �ְ� ���� ���ϱ�
								if(�ְ�����<scores[i]) �ְ����� =scores[i]; // i ��° �ε����� ������ ����
								// ���� �հ�
								���հ� += scores[i];
							}
					
							
							// ������� ���ϱ�
							������� = (double)���հ� / scores.length;
							
							System.out.println("�ְ� ���� : "+�ְ�����);
							System.out.println("��� ���� : "+�������);
						}
						else if(selectNo==5) {
							break; // �ݸ� Ż��
//							run = false; //==> run ���� false �� �����ϸ� while �� ���� ����
						}
						else {System.err.println(" �߸��� �Է�");}
						
						
						
					} //while end
					System.out.println(" ���α׷� ���� ");
		}// main end
}// class end
