package Day02;

import java.util.Scanner;

public class Day02_05_����2_����14 { // c.s
	
	public static void main(String[] args) { // m.s
		
		// ����2 : ���� ���� 
				/*
				 * [ �Է����� ] 
				 * 		�ݾ� 
				 * [ ���� ] 
				 * 		�ʸ��� ���� ��� ������ ���� ���� 
				 * [ ������� ]
				 * 		��) 356789 �Է½� 
				 * 		�ʸ��� 3�� 
				 * 		���� 5��
				 * 		õ�� 6�� 
				 * 		��� 7��
				 * 
				 */
		/*
		// �ݾ� �ֱ�
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf(" �Է°� : ");	int �Է°� = scanner.nextInt();
		
		int �ʸ���= �Է°�/100000;
		int ����=�Է°�/10000;
		int õ��=�Է°�/1000;
		int ��� = �Է°�%1000;
		
		System.out.println(" �ʸ��� : " + �ʸ���);
		
		*/
		
		// 1. �Է� ��ü
		
		Scanner scanner = new Scanner(System.in);
		// 2. �Է� ���� ������ -> ������ �̵�
//		System.out.println(" �ݾ� : " );  int �ݾ� = scanner.nextInt();
//		// 3. ���� 
//		System.out.println(" �Է��� �ݾ� : " + �ݾ�);
//		System.out.println(" �ʸ��� : " + (�ݾ�/100000) + "��");
//		
//		//�ݾ� = �ݾ� - (�ݾ�/100000)*100000; // �ݾ׿��� �ʸ��� ���� ����
//		�ݾ� -= (�ݾ�/100000)*100000;
//		//System.out.println(" �ʸ��� ���� : " + �ݾ�);
//		System.out.println(" ���� : " + (�ݾ�/10000)+"��");
//		
//		�ݾ� -= (�ݾ�/10000)*10000;
//		//System.out.println(" ���� ���� : " + �ݾ�);
//		System.out.println(" õ�� : " + (�ݾ�/1000)+"��");
//		
//		�ݾ� -= (�ݾ�/1000)*1000;
//		//System.out.println(" õ�� ���� : " + �ݾ�);
//		System.out.println(" ��� : " + (�ݾ�/100)+"��");
//		
//		
		

		
		
		
		
		//����3 : �ϳ��� ������ �Է¹޾� 7�� ������� ���[ true , false ]
			//me 1. �Է� ��ü
//		Scanner scanner = new Scanner(System.in);
//		System.out.println(" �Է� ���� : "); 		int ��1 = scanner.nextInt();
//		
//				
		    //me 2. �Է� ���� ������ -> ������ �̵�
			//me 3. ���� 7 ���� -> �������� 0�Ͻ� ���(true) / �ƴ� �� ��� x
		
			// ��� ã��
				// �� % �� ���� �� �������� 0 �̸� ���� �� ���� ���
//		
//		System.out.println(" ����3) ���� �Է�: "); 		int ����3 = scanner.nextInt();
//		System.out.println(" �Է��� ������  7�� ��� �Ǵ� : " + (����3%7 ==0));
//		
//		
//			
//		
//		
//				//����4 : �ϳ��� ������ �Է¹޾� Ȧ�� ���� Ȯ�� [ true , false ]
//					// Ȧ¦ ã��
//						// Ȧ�� : �� % 2 ���� �� �������� 1 �̸� ���� Ȧ��
//						// ¦�� : �� % 2 ���� �� �������� 0 �̸� ���� ¦��
//		
//		System.out.println(" ����4) ���� �Է� : "); 	int ����4 = scanner.nextInt();
//		System.out.println(" �Է��� ������ Ȧ�� �Ǵ� : " + (����4%2 == 1));
//		
//				
//				//����5 : �ϳ��� ������ �Է¹޾� 7�� ��� �̸鼭 ¦�� ���� Ȯ�� [ true , false ]
//		//me
////		System.out.println(" ����5) ���� �Է� : "); 	int ����5 = scanner.nextInt();
////		int �Է°�= (����5%2);
////		System.out.println(�Է°�);
////		char Ȧ¦ = (�Է°� >0 )? "Ȧ" : "¦";
////		
//		//System.out.println("a"+ Ȧ¦);
//		//System.out.println(" �Է��� ������ 7�� ��� �Ǵ� : " + ����5%7==0+"�̰�" + Ȧ¦ );
//		
//				System.out.println(" ����5) ���� �Է� : "); int ����5 = scanner.nextInt();
//				System.out.println("�Է��� ������ �� ��� �̸鼭 ¦�� �Ǵ� " + (����5%7==0&&����5%2==0));
//				
//		
//		
//				
//				//����6 : �ΰ��� ������ �Է¹޾� �� ū�� ���  [ true , false ]
//				
//				System.out.println(" ����6) ����1 �Է� : ");	int ����6_1 =scanner.nextInt();
//				System.out.println(" ����6) ����2 �Է� : ");	int ����6_2 =scanner.nextInt();
//				
//				int ū�� = ����6_1>����6_2 ? ����6_1: ����6_2;
//				System.out.println(" �� ū ���� :" + ū��);
//				
//				
//				
//				//����7 : �������� �Է¹޾� �� ���� ����ϱ� 
//						// �� ���� ���� => ������ * ������ * ������[3.14]
//				
//				System.out.println(" ����7) ���� �Է� : ");  int ����7 = scanner.nextInt();
//				System.out.println(" �� ���� : " + (����7*����7*3.14) );
//				
//				
//				//����8 : �� �Ǽ��� �Է¹޾� �սǼ��� ���� ���� ���� ��% ���� ����ϱ�
//						// ��) 54.5   84.3 �̸�    64.285714%
//				
//				//me
//				System.out.println(" ����8) �Ǽ�1 �Է�: "); double ����8_1 =scanner.nextDouble();
//				System.out.println(" ����8) �Ǽ�2 �Է�: "); double ����8_2 =scanner.nextDouble();
//				
//				double ���� = (����8_1/����8_2)*100;
//				System.out.println(" �Ǽ�1�� �Ǽ�2 ����� :"+ ����+"%");
//				System.out.printf(" �Ǽ�1�� �Ǽ�2 ����� : %.1f %% \n", ����);
//
//				//����9 : ��ٸ��� ���� ���ϱ�[������ �غ� ���̸� �Է¹޾� ����ϱ�]
//						//��ٸ��� ���� = > (���� * �غ�) * ���� / 2
//				
//				
////				//me
////				System.out.println(" ����9) ���� �Է� : "); int ����9_1 = scanner.nextInt();
////				System.out.println(" ����9) �غ� �Է� : ");	int ����9_2 = scanner.nextInt();
////				System.out.println(" ����9) ���� �Է� : ");	int ����9_3 = scanner.nextInt();
////				
////				int ���� = ((����9_1*����9_2)*����9_3)/2;
////				System.out.println(" ��ٸ����� ���̴� : "+����);
////			
//				
//				System.out.println(" ����9) ���� �Է� : "); double ���� = scanner.nextDouble();
//				System.out.println(" ����9) �غ� �Է� : ");	double �غ� = scanner.nextDouble();
//				System.out.println(" ����9) ���� �Է� : ");	double ���� = scanner.nextDouble();
//				System.out.println(" ��ٸ����� ���̴� : "+(����*�غ�)*����/2);
//				
//				
//				//����10: Ű�� ������ �Է¹޾� ǥ��ü�� ����ϱ�
//						//ǥ��ü�� ���� = > (Ű - 100) * 0.9
//				
//				System.out.println(" ���� 10) Ű �Է� : "); int ����10 = scanner.nextInt();
//				int ǥ��ü�� = (int)((����10-100)*0.9);
//				System.out.println(" ǥ��ü���� ������ ���� : "+ǥ��ü��);
//				
//				//����11: Ű�� �����Ը� �Է¹޾� BMI ����ϱ�
//						//BMI ���� = > ������ / ((Ű / 100) * (Ű / 100))
//				System.out.println(" ���� 11) Ű �Է� : "); double ����11_1 = scanner.nextDouble();
//				System.out.println(" ���� 11) ������ �Է� : "); double ����11_2 = scanner.nextDouble();
//				double a= ����11_1/100;
//			    
//				double b = ����11_2/(a*a);
//				int BMI = (int)b;
//				
////				int BMI = (int)((����11_2/ ((����11_1/100.0)*(����11_1/100.0))));
//					int BMI = (int)((����11_2/ ((����11_1/100.0)*(����11_1/100.0))));
//				//System.out.println(" BMI ������ : "+ BMI);
//				System.out.printf(" BMI ������ : %.2f \n ", BMI);
//						//(int((����10-100)*0.9);
//				
//				
//				
//				//����12: inch �� �Է¹޾� cm �� ��ȯ�ϱ� [ 1 inch -> 2.54cm ] 
//				
//				System.out.println(" ���� 12) ��ġ �Է� : "); double ����12 = scanner.nextDouble();
//				//float cm= (float)(����12*2.54);
//				//System.out.printf(" ��ȯ �� :%.2f ",cm);
//				System.out.printf(" ��ȯ �� :%.2f ",(����12*2.54));
//				
//				//����13:  �߰����, �⸻���, �����򰡸� �Է¹޾� �ݿ������� ����ϱ�
//				//�Ҽ� ��° �ڸ� ���� ���� ����ϱ�
//				//�߰���� �ݿ����� => 30 %
//				//�⸻��� �ݿ����� => 30 %
//				//������ �ݿ����� => 40 %
//				
//				System.out.println(" ����13) �߰���� �Է� :"); double �߰����=scanner.nextDouble();
//				System.out.println(" ����13) �⸻��� �Է� :"); double �⸻���=scanner.nextDouble();
//				System.out.println(" ����13) ������ �Է� :"); double ������=scanner.nextDouble();
//				// me
//				//double ��� = (�߰����*0.3)+(�⸻���*0.3)+(������*0.4);
//				//System.out.printf(" ��� : %.2f \n ",���);
//				
//				�߰���� = �߰���� *0.3;
//				�⸻��� *= 0.3;
//				������ *= 0.4;
//				
//				System.out.printf(" �ݿ������� ���� : %.2f \n ",(�߰����+�⸻���+������));
//				
		
				//����14 :  ���� ���� ���� �ϰ� x�� y�� �����ϱ�  ==> ?? check
//				 	int x = 10;
//					int y = x-- + 5 + --x;
//				    printf(" x�� �� : %d , y�ǰ� :  %d ", x, y)
						// 1. x-- + 5 -> ���� ���� ���� + -> 10+5=15 �Ŀ�  x ����
						// 2. x-- �� ���� => [ x= 8]
						// 3. 15 + --x -> [x=8]
						// 4. 15 + 8 = > y : 23
				
								
				//����15 : ���̸� �Է¹޾� ���̰� 10���̻��̸� �л� , 20���̻��̸� ���� , 40���̻��̸� �߳� ���� ����ϱ�
				
				System.out.println(" ����15) ����� ���̴�? :"); int ����=scanner.nextInt();
								
			//	char ���2 = ���� > 90 ? 'A' : ���� > 80 ? 'B' : 'C' ;
				
				char �Ǻ� = (���� >=10 && ���� <=19)? 'A':(���� >=20 && ���� <=39)?'B':'C' ;
				 //char �л� = (���� >=10 && ���� <=19) ? '��'):'B';
				//char ���� = (���� >=20 && ���� <=39);
				//char �߳� = (���� >=40);
				System.out.println(" A: �л� | B : ���� | C :�߳� \n����� ! : "+ �Ǻ�);
				
						
				//����16 : 3���� ������ �Է¹޾� ������������ ���� 
				

//				//����6 : �ΰ��� ������ �Է¹޾� �� ū�� ���  [ true , false ]
//				
//				System.out.println(" ����6) ����1 �Է� : ");	int ����6_1 =scanner.nextInt();
//				System.out.println(" ����6) ����2 �Է� : ");	int ����6_2 =scanner.nextInt();
//				
//				int ū�� = ����6_1>����6_2 ? ����6_1: ����6_2;
//				System.out.println(" �� ū ���� :" + ū��);
//				
				
			
				
				System.out.println("���� 16) �����Է�1"); int ����1=scanner.nextInt();
				System.out.println("���� 16) �����Է�2"); int ����2=scanner.nextInt();
				System.out.println("���� 16) �����Է�3"); int ����3=scanner.nextInt();
				
//				int ū�� = ����6_1>����6_2 ? ����6_1: ����6_2;
				//A B C
				// Max value
				//1-1. A>=B && A>=C 
				//   A�� B ���� ũ�ų� ���� A�� C ���� ũ�ų� ����  
				//1-2. B>=A&&B>=C  
				//   B�� A���� ũ�ų� ���� C���� ũ�ų� ���� 
				//  (A>=B && A>=C) ? A : (B>=A && B>=C) ? B : C
				     // A�� B ���� ũ�ų� ���� A�� C ���� ũ�ų� ������ max value�� A �Է� 
						// 1-1 �� ���� �� B�� A ���� ũ�ų� ���� C ���� ũ�ų� ������ max value �� B �Է�
				
				// min value -> max value �� �ݴ�
				//2-1. A<=B && A<=C 
				//   A�� B ���� �۰ų� ���� A�� C ���� �۰ų� ����   
				//2-2. B<=A&&B<=C  
				//   B�� A���� �۰ų� ���� C���� �۰ų� ���� 
				//  (A<=B && A<=C) ? A : (B<=A && B<=C) ? B : C
				     // A�� B ���� �۰ų� ���� A�� C ���� �۰ų� ������ min value�� A �Է� 
						// 2-1 �� ���� �� B�� A ���� �۰ų� ���� C ���� �۰ų� ������ max value �� B �Է�
				
				// mid value
				// A �� �߰� ���� ���   B<A<C    & C<A<B
				//                  A>=B&&A<=C : B<A<C
				//					(����1>= ����2 && ����1 <= ����3)
				//					 	A>=B&&A<=C ? A -> B<A<C ������ ���� ��� �߰��� A
				//	
				//                  A>=C&&A<=B : C<A<B
//				 					(����1>= ����3 && ����1 <= ����2)	
				//						A>=C&&A<=B ? A : C<A<B ������ ���� ��� �߰��� A
 				// B �� �߰� ���� ���   A<B<C & C<B<A
				//					B>=A && B<=C : A<B<C
				//					(����2>=����1 && ����2<=����3)
				//					B>=C && B<=A : C<B<A
				//					(����2>=����3 && ����2<=����1)
				// C �� �߰� ���� ���   A<C<B & B<C<A
				//                  C>=A && C<=B : A<C<B 
				//					(����3>=����1 && ����3<=����2)
				//					C<=B && C>=A : B<C<A
				//					(����3>=����2 && ����3<=����1)
				// A>=B&&A<=C ? A : A>=C&&A<=B ? A : B>=A && B<=C ? B : B>=C&& B<=A? B : C>=A&& C<=B ? 
				//				C : C<=B && C>=A ? C
				// 
				int ū�� = ����1 >=����2 && ����1>=����3 ? ����1 : ����2>=����1&&����2>=����3? ����2 : ����3; 
				int ������ = ����1 <=����2 && ����1<=����3 ? ����1 : ����2<=����1&&����2<=����3? ����2 : ����3;
				int �߰��� = (����1>= ����2 && ����1 <= ����3)? ����1 : (����1>= ����3 && ����1 <= ����2)? ����1 :
						   (����2>=����1 && ����2<=����3) ? ����2 : (����2>=����3 && ����2<=����1) ? ����2: 
						   (����3>=����1 && ����3<=����2)? ����3 :	(����3>=����2 && ����3<=����1)? ����3 : ����1; 
						
						
						
				System.out.printf("�������� \nLow value=%d\nMid value=%d\nMax value=%d",������,�߰���,ū��);
				
			
				//����17 : 4���� ������ �Է¹޾� ������������ ���� 
				// Max & Low �� Mid1&2 �ۼ�
				System.out.println("���� 17) �����Է�1"); int A=scanner.nextInt();
				System.out.println("���� 17) �����Է�2"); int B=scanner.nextInt();
				System.out.println("���� 17) �����Է�3"); int C=scanner.nextInt();
				System.out.println("���� 17) �����Է�4"); int D=scanner.nextInt();
				
				System.out.printf("\n%d,%d,%d,%d",A,B,C,D);
				
				// A B C D 
				// Max A = 1)D<C<B<A && 2) C<D<B<A && 3) D<B<C<A  && 4)C<B<D<A  && 5) B<C<D<A  && 6)B<D<C<A
				//         1)A>=B&& B>=C && C>=D
				//                      2) A>=B && B>=D && D>= C
				//									  3) A>=C&&C>=B&&>B>=D
				//													 4) A>=D&&D>=B&&B>=C
				//																    5) A>=D&&D>=C&&C>=B
				//																			6) A>=C&&C>=D&&D>=B
				// Max B = D<C<A<B && C<D<A<B && D<A<C<B  && C<A<D<B  && A<C<D<B  && A<D<C<B
				//         B>=A&&A>=C&&C>=D 
				//					B>=A&&A>=D&&D>=C
				//  							B>=C&&C>=A&&A>=D
				//										B>=D&&D>=A&&A>=C
				//												B>=D&&D>=C&&C>=A
				// 														B>=C&&C>=D&&D>=A
				
				// Max C = D<A<B<C && A<D<B<C && D<B<A<C  && A<B<D<C  && B<A<D<C  && B<D<A<C	
//						   C>=B&&B>=A&&A>=D
				//					C>=B&&B>=D&&D>=A
//				//								C>=A&&A>=B&&B>=D
//														C>=D&&D>=B&&B>=A
//																C>=D&&D>=A&&A>=B	
//																		C>=A&&A>=B&&B>=D
																		
				// Max D = A<C<B<D && C<A<B<D && A<B<C<D  && C<B<A<D  && B<C<A<D  && B<A<C<D	
//						   D>=B&&B>=C&&C>=A
//						   			D>=B&&B>=A&&A>=C
//						   					D>=C&&C>=B&&B>=A
//						   							D>=A&&A>=B&&B>=C
//						   									D>=A&&A>=C&&C>=B
//						   											D>=C&&C>=A&&A>=B
//				
//				
				int ū��2 = A>=B && B>=C && C>=D ? A: A>=B && B>=D && D>=C ? A : 
						   A>=C&&C>=B&&B>=D ? A : A>=D&&D>=C&&C>=B? A : A>=C&&C>=D&&D>=B? A:
							
						   B>=A&&A>=C&&C>=D? B : B>=A&&A>=D&&D>=C ? B :	B>=C&&C>=A&&A>=D? B:
						   B>=D&&D>=A&&A>=C? B : B>=D&&D>=C&&C>=A ? B : B>=C&&C>=D&&D>=A? B:
							   
						   C>=B&&B>=A&&A>=D ? C	: C>=B&&B>=D&&D>=A ? C : C>=A&&A>=B&&B>=D? C :
						   C>=D&&D>=B&&B>=A? C: C>=D&&D>=A&&A>=B?C: C>=A&&A>=B&&B>=D?C:
							
						   D>=B&&B>=C&&C>=A ? D : D>=B&&B>=A&&A>=C? D : D>=C&&C>=B&&B>=A? D:
						   D>=A&&A>=B&&B>=C ? D : D>=A&&A>=C&&C>=B ? D : D>=C&&C>=A&&A>=B ? D : A;	   
					    

			    int ������2 = A<=B && B<=C && C<=D ? A: A<=B && B<=D && D<=C ? A : 
						   A<=C&&C<=B&&B<=D ? A : A<=D&&D<=C&&C<=B? A : A<=C&&C<=D&&D<=B? A:
							
						   B<=A&&A<=C&&C<=D? B : B<=A&&A<=D&&D<=C ? B :	B<=C&&C<=A&&A<=D? B:
						   B<=D&&D<=A&&A<=C? B : B<=D&&D<=C&&C<=A ? B : B<=C&&C<=D&&D<=A? B:
							   
						   C<=B&&B<=A&&A<=D ? C	: C<=B&&B<=D&&D<=A ? C : C<=A&&A<=B&&B<=D? C :
						   C<=D&&D<=B&&B<=A? C: C<=D&&D<=A&&A<=B?C: C<=A&&A<=B&&B<=D?C:
							
						   D<=B&&B<=C&&C<=A ? D : D<=B&&B<=A&&A<=C? D : D<=C&&C<=B&&B<=A? D:
						   D<=A&&A<=B&&B<=C ? D : D<=A&&A<=C&&C<=B ? D : D<=C&&C<=A&&A<=B ? D : A;	   
				
			    // �߰��� ��� ������ ���ٽ�Ŵ 
				int �ι�°�� =	A<=B && B<=C && C<=D ? A: A<=B && B<=D && D<=C ? A : 
					   A<=C&&C<=B&&B<=D ? A : A<=D&&D<=C&&C<=B? A : A<=C&&C<=D&&D<=B? A:
							
					   B<=A&&A<=C&&C<=D? B : B<=A&&A<=D&&D<=C ? B :	B<=C&&C<=A&&A<=D? B:
					   B<=D&&D<=A&&A<=C? B : B<=D&&D<=C&&C<=A ? B : B<=C&&C<=D&&D<=A? B:
						   
					   C<=B&&B<=A&&A<=D ? C	: C<=B&&B<=D&&D<=A ? C : C<=A&&A<=B&&B<=D? C :
					   C<=D&&D<=B&&B<=A? C: C<=D&&D<=A&&A<=B?C: C<=A&&A<=B&&B<=D?C:
						
					   D<=B&&B<=C&&C<=A ? D : D<=B&&B<=A&&A<=C? D : D<=C&&C<=B&&B<=A? D:
					   D<=A&&A<=B&&B<=C ? D : D<=A&&A<=C&&C<=B ? D : D<=C&&C<=A&&A<=B ? D : A;	
				
				// �߰��� ��� ������ ���ٽ�Ŵ 
				int ����°�� =	A<=B && B<=C && C<=D ? A: A<=B && B<=D && D<=C ? A : 
					   A<=C&&C<=B&&B<=D ? A : A<=D&&D<=C&&C<=B? A : A<=C&&C<=D&&D<=B? A:
							
					   B<=A&&A<=C&&C<=D? B : B<=A&&A<=D&&D<=C ? B :	B<=C&&C<=A&&A<=D? B:
					   B<=D&&D<=A&&A<=C? B : B<=D&&D<=C&&C<=A ? B : B<=C&&C<=D&&D<=A? B:
						   
					   C<=B&&B<=A&&A<=D ? C	: C<=B&&B<=D&&D<=A ? C : C<=A&&A<=B&&B<=D? C :
					   C<=D&&D<=B&&B<=A? C: C<=D&&D<=A&&A<=B?C: C<=A&&A<=B&&B<=D?C:
						
					   D<=B&&B<=C&&C<=A ? D : D<=B&&B<=A&&A<=C? D : D<=C&&C<=B&&B<=A? D:
					   D<=A&&A<=B&&B<=C ? D : D<=A&&A<=C&&C<=B ? D : D<=C&&C<=A&&A<=B ? D : A;	
				
				
				System.out.printf("\n%d\n,%d\n,%d\n,%d",ū��2,�ι�°��,����°��,������2);
				
				// Min A = A<B<C<D && A<B<D<C && A<C<B<D  && A<D<B<C  && A<C<D<B  && A<D<C<B
				// Min B = B<A<C<D && B<A<D<C && B<C<A<D  && B<D<A<C  && B<C<D<A  && B<D<C<A
				// Min C = C<A<B<D && C<A<D<B && C<B<A<D  && C<D<A<B  && C<B<D<A  && C<D<B<A				
				// Min D = D<A<B<C && D<A<C<B && D<B<A<C  && D<C<A<B  && D<B<C<A  && D<C<B<A
				
				
				
				// p. 102 Ȯ�ι���

		
		
	} // m.e

} // c.e
