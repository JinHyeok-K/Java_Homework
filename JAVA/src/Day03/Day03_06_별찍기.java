package Day03;

import java.util.Scanner;

public class Day03_06_����� { // c s
	
	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in); // �Է°�ü
		
		
		// �� ���� 1 �Է� ���� �� ��ŭ * ���
		
		System.out.println(" ����1) �� ���� : "); int s1 = scanner.nextInt();
		
		for ( int i =1 ; i<=s1 ; i++) {
			// * i�� 1���� �Է¹��� �� ���� i�� 1�� ����
			System.out.print("*");
		}
		System.out.println("\n-------------------------");
		
		// �� ���� 2 �Է� ���� �� ��ŭ * ��� [ �� 5�� ���� �ٹٲ� ó�� ]	
		System.out.println(" ����2) �� ���� : "); int s2 = scanner.nextInt();
		for ( int i =1 ; i<=s2 ; i++) {
			// * i�� 1���� �Է¹��� �� ���� i�� 1�� ����
			System.out.print("*");
			// 5������ �ٹٲ� -> 5��� ���� -> ��� ã��
			if (i%5 == 0 ) System.out.println( ); // �ٹٲ� ó��
					
		}
		System.out.println("\n-------------------------");
		
		
		
		// ������3 : �Է¹��� �� ��ŭ ���	
		
		System.out.println(" ����3) �ټ� : "); int line3 = scanner.nextInt();
		
		for (int i=1; i<=line3; i++) {
			// * i�� 1���� �Է� ���� �� ������ 1�� ����
			for (int s=1; s<=i; s++) {
			// 1 . �� ���
			System.out.print("*");
			}
			// 2. �ٹٲ� ó��
			System.out.println();
		}
			// ������ 
				// ����ڰ� 3�� �Է� ���� ��
				// i = 1 i<=3 [true]  -> i++
					// s =1   s<=1 [ true ] -> * -> s++
					// s =2   s<=1 [ false ] -> for2 �ݺ��� ����
				// �ٹٲ�
				// i = 2 i<=3 [true] -> i++
					// s =1  s<=2 [true] -> * -> s++
					// s =2  s<=2 [true] -> * -> s++
					// s =3  s<=2 [false] -> for2 �ݺ��� ����
				// �ٹٲ�
				// i = 3 i<=3 [true] -> i++
					// s =1  s<=3 [true] -> * -> s++
					// s =2  s<=3 [true] -> * -> s++
					// s =3  s<=3 [true] -> * -> s++
					// s =4  s<=3 [false] -> for2 �ݺ��� ����
				// �ٹٲ�
				// i = 4  i<=3 [false ] for1 �ݺ��� ����
		System.out.println("\n-------------------------");
		
		
		
		// ������4 : �Է¹��� �� ��ŭ ���	
		
		System.out.println(" ����4) �ټ� : "); int line4 = scanner.nextInt();
		
		for (int i=1; i<=line4; i++) {
			// * i�� 1���� �Է� ���� �� ������ 1�� ����
			for (int s=1; s<=line4-i+1; s++) {
			// 1 . �� ���
			System.out.print("*");
			}
			// 2. �ٹٲ� ó��
			System.out.println();
		}
		
		System.out.println("\n-------------------------");
		
		
		
		// ������5 : �Է¹��� �� ��ŭ ���	
		
		System.out.println(" ����5) �ټ� : "); int line5 = scanner.nextInt();
		
		for (int i =1; i<=line5; i++ ) {
			
			// 1. �������
			for(int b = 1; b<=line5-i; b++) {
				System.out.print(" "); // ���� => �����̽� ��
			}
			// 2. �����
			for (int s = 1 ; s<=i ; s++) {
				System.out.print("*");
						}
			// 3. �ٹٲ�			 
		 System.out.println();	
		}
	
		// ������6 : �Է¹��� �� ��ŭ ���	
		
		System.out.println(" ����6) �ټ� : "); int line6 = scanner.nextInt();
		
		for (int i=1; i<=line6; i++) {
			// 1. ���� ����
			for (int b=1; b<=i-1; b++) {
				System.out.print(" ");
			}
			// 2. �� ����
			for (int s = 1; s<=line6-i+1; s++) {
			System.out.print("*");
			}
			// 3. �ٹٲ�
			System.out.println();
		}
		
		// ������7 : �Է¹��� �� ��ŭ ���	
		
			System.out.println(" ����7) �ټ� : "); int line7 = scanner.nextInt();
				
			// 1. iteration ����
			for (int i = 1 ; i<=line7 ;i++) {
			// 2-1. ���� ���
				for (int b=1; b<=line7-i;b++) {
				    System.out.print(" ");
				}
			// 2-2 �� ���
				for (int s=1; s<=i*2-1;s++) {
				
					System.out.print("*");
					
				}
			System.out.println();	
				
			}
			
		// ������8 : �Է¹��� �� ��ŭ ���	
		
			System.out.println(" ����8) �ټ� : "); int line8 = scanner.nextInt();
				
			// 1. iteration ����
			for (int i = 1 ; i<=line8 ;i++) {
			// 2-1. ���� ���
				for (int b=1; b<=line8-i;b++) {
				    System.out.print(" ");
				}
			// 2-2 �� ���
				for (int s=1; s<=i*2-1;s++) {
				
//						System.out.print("*");
					System.out.print(i);
				}
			System.out.println();	
				
			}
		
			// ������9 : �Է¹��� �� ��ŭ ���	
			
			System.out.println(" ����9) �ټ� : "); int line9 = scanner.nextInt();
					// 0. iteration 
				for ( int i =1 ; i<=line9;i++) {
					//1. ���� �Է�
					for ( int b=1; b<=i-1;b++) {
						System.out.print(" ");
					}
					//2. �� ���
					for (int s = 1; s<=line9*2-(2*i-1);s++) {
//				10-3
				//10-5		
						System.out.print("*");
					}
					System.out.println();	
				}
				
				
				
				
				
			// ������10 : �Է¹��� �ٸ�ŭ ���		
				
				
//				������10 : �Է¹��� �ٸ�ŭ ��� => n=9 �� ������ ������ �ݺ�
//						i	b	s	������ ��
//	        * 			1	4	1 	1	  
//	       ***			2	3	3	2	 	
//	      *****			3	2	5	3	 
//		 *******		4	1	7	4     
//		*********		5	0	9	5	======
//		 *******		6	1	7	6
//		  *****			7	2	5	7
//		   ***			8	3	3	8
//		    *			9	4	1	0
//	-----------------------------------	    
//		    * 			10 	4	1	1
//	       ***			11	3	3	2
//	      *****			12	2	5	3
//		 *******		13	1	7	4
//		*********		14	0	9	5  =======
//		 *******		15	1	7	6
//		  *****			16	2	5	7
//		   ***			17	3	3	8
//		    *			18	4	1	0
 
					// if �Է� �޴� �� 20 
				// �������� 5�� ��� �� 9
				// �������� 1~4�� ��� �� 1 3 5 7
				// �������� 6 7 8 0 �� ��� 7 5 3 1
				// �Է� ���� 1 ���� 100���� 
				// 1�� ��
			System.out.println(" ����10) �ټ� : "); int line10 = scanner.nextInt();
			
			
			
				// 0. iteration 
			// 1. iteration ����
				for (int i = 1 ; i<=line10 ;i++) {
					int less1 = (i%9)+1 ;
//					int less2 = (i%9) ;
					
					//���� ���
//					
					for (int b=1; b<=line10-i;b++) {
					    System.out.print(" ");
					}
//					
					for (int s = 1;s<=less1*2-3;s++) {
						System.out.print(less1);
						
					}
//				// 2-1. ���� ���
//					
//						for (int b=1; b<=line10-i;b++) {
//						    System.out.print(" ");
//						}
//						if (i%9 ==6) {
//							break;
//						}
//					// 2-2 �� ���
//						for (int s=1; s<=i*2-1;s++) {
//							
//								
//							System.out.print("*");
//						}
//						
				System.out.println();	
//					
				}
				
				
			
		
	} // m e

} // c e
