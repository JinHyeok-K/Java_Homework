package Day02;

import java.util.Scanner;

public class Day02_05_문제2_문제14 { // c.s
	
	public static void main(String[] args) { // m.s
		
		// 문제2 : 지폐 세기 
				/*
				 * [ 입력조건 ] 
				 * 		금액 
				 * [ 조건 ] 
				 * 		십만원 부터 백원 까지의 개수 세기 
				 * [ 출력조건 ]
				 * 		예) 356789 입력시 
				 * 		십만원 3장 
				 * 		만원 5장
				 * 		천원 6장 
				 * 		백원 7개
				 * 
				 */
		/*
		// 금액 넣기
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf(" 입력값 : ");	int 입력값 = scanner.nextInt();
		
		int 십만원= 입력값/100000;
		int 만원=입력값/10000;
		int 천원=입력값/1000;
		int 백원 = 입력값%1000;
		
		System.out.println(" 십만원 : " + 십만원);
		
		*/
		
		// 1. 입력 객체
		
		Scanner scanner = new Scanner(System.in);
		// 2. 입력 받은 데이터 -> 변수로 이동
//		System.out.println(" 금액 : " );  int 금액 = scanner.nextInt();
//		// 3. 연산 
//		System.out.println(" 입력한 금액 : " + 금액);
//		System.out.println(" 십만원 : " + (금액/100000) + "장");
//		
//		//금액 = 금액 - (금액/100000)*100000; // 금액에서 십만원 단위 제외
//		금액 -= (금액/100000)*100000;
//		//System.out.println(" 십만원 제외 : " + 금액);
//		System.out.println(" 만원 : " + (금액/10000)+"장");
//		
//		금액 -= (금액/10000)*10000;
//		//System.out.println(" 만원 제외 : " + 금액);
//		System.out.println(" 천원 : " + (금액/1000)+"장");
//		
//		금액 -= (금액/1000)*1000;
//		//System.out.println(" 천원 제외 : " + 금액);
//		System.out.println(" 백원 : " + (금액/100)+"개");
//		
//		
		

		
		
		
		
		//문제3 : 하나의 정수를 입력받아 7의 배수인지 출력[ true , false ]
			//me 1. 입력 객체
//		Scanner scanner = new Scanner(System.in);
//		System.out.println(" 입력 정수 : "); 		int 정1 = scanner.nextInt();
//		
//				
		    //me 2. 입력 받은 데이터 -> 변수로 이동
			//me 3. 변수 7 나눔 -> 나머지가 0일시 배수(true) / 아닐 시 배수 x
		
			// 배수 찾기
				// 값 % 수 햇을 때 나머지가 0 이면 값은 그 수의 배수
//		
//		System.out.println(" 문제3) 정수 입력: "); 		int 문제3 = scanner.nextInt();
//		System.out.println(" 입력한 정수는  7의 배수 판단 : " + (문제3%7 ==0));
//		
//		
//			
//		
//		
//				//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 [ true , false ]
//					// 홀짝 찾기
//						// 홀수 : 값 % 2 햇을 때 나머지가 1 이면 값은 홀수
//						// 짝수 : 값 % 2 했을 때 나머지가 0 이면 값은 짝수
//		
//		System.out.println(" 문제4) 정수 입력 : "); 	int 문제4 = scanner.nextInt();
//		System.out.println(" 입력한 정수는 홀수 판단 : " + (문제4%2 == 1));
//		
//				
//				//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [ true , false ]
//		//me
////		System.out.println(" 문제5) 정수 입력 : "); 	int 문제5 = scanner.nextInt();
////		int 입력값= (문제5%2);
////		System.out.println(입력값);
////		char 홀짝 = (입력값 >0 )? "홀" : "짝";
////		
//		//System.out.println("a"+ 홀짝);
//		//System.out.println(" 입력한 정수의 7의 배수 판단 : " + 문제5%7==0+"이고" + 홀짝 );
//		
//				System.out.println(" 문제5) 정수 입력 : "); int 문제5 = scanner.nextInt();
//				System.out.println("입력한 정수는 의 배수 이면서 짝수 판단 " + (문제5%7==0&&문제5%2==0));
//				
//		
//		
//				
//				//문제6 : 두개의 정수를 입력받아 더 큰지 출력  [ true , false ]
//				
//				System.out.println(" 문제6) 정수1 입력 : ");	int 문제6_1 =scanner.nextInt();
//				System.out.println(" 문제6) 정수2 입력 : ");	int 문제6_2 =scanner.nextInt();
//				
//				int 큰수 = 문제6_1>문제6_2 ? 문제6_1: 문제6_2;
//				System.out.println(" 더 큰 수는 :" + 큰수);
//				
//				
//				
//				//문제7 : 반지름을 입력받아 원 넓이 출력하기 
//						// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
//				
//				System.out.println(" 문제7) 정수 입력 : ");  int 문제7 = scanner.nextInt();
//				System.out.println(" 원 넓이 : " + (문제7*문제7*3.14) );
//				
//				
//				//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
//						// 예) 54.5   84.3 이면    64.285714%
//				
//				//me
//				System.out.println(" 문제8) 실수1 입력: "); double 문제8_1 =scanner.nextDouble();
//				System.out.println(" 문제8) 실수2 입력: "); double 문제8_2 =scanner.nextDouble();
//				
//				double 비율 = (문제8_1/문제8_2)*100;
//				System.out.println(" 실수1의 실수2 백분율 :"+ 비율+"%");
//				System.out.printf(" 실수1의 실수2 백분율 : %.1f %% \n", 비율);
//
//				//문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기]
//						//사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2
//				
//				
////				//me
////				System.out.println(" 문제9) 윗변 입력 : "); int 문제9_1 = scanner.nextInt();
////				System.out.println(" 문제9) 밑변 입력 : ");	int 문제9_2 = scanner.nextInt();
////				System.out.println(" 문제9) 높이 입력 : ");	int 문제9_3 = scanner.nextInt();
////				
////				int 넓이 = ((문제9_1*문제9_2)*문제9_3)/2;
////				System.out.println(" 사다리꼴의 넓이는 : "+넓이);
////			
//				
//				System.out.println(" 문제9) 윗변 입력 : "); double 윗변 = scanner.nextDouble();
//				System.out.println(" 문제9) 밑변 입력 : ");	double 밑변 = scanner.nextDouble();
//				System.out.println(" 문제9) 높이 입력 : ");	double 높이 = scanner.nextDouble();
//				System.out.println(" 사다리꼴의 넓이는 : "+(윗변*밑변)*높이/2);
//				
//				
//				//문제10: 키를 정수를 입력받아 표준체중 출력하기
//						//표준체중 계산식 = > (키 - 100) * 0.9
//				
//				System.out.println(" 문제 10) 키 입력 : "); int 문제10 = scanner.nextInt();
//				int 표준체중 = (int)((문제10-100)*0.9);
//				System.out.println(" 표준체중은 다음과 같다 : "+표준체중);
//				
//				//문제11: 키와 몸무게를 입력받아 BMI 출력하기
//						//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
//				System.out.println(" 문제 11) 키 입력 : "); double 문제11_1 = scanner.nextDouble();
//				System.out.println(" 문제 11) 몸무게 입력 : "); double 문제11_2 = scanner.nextDouble();
//				double a= 문제11_1/100;
//			    
//				double b = 문제11_2/(a*a);
//				int BMI = (int)b;
//				
////				int BMI = (int)((문제11_2/ ((문제11_1/100.0)*(문제11_1/100.0))));
//					int BMI = (int)((문제11_2/ ((문제11_1/100.0)*(문제11_1/100.0))));
//				//System.out.println(" BMI 지수는 : "+ BMI);
//				System.out.printf(" BMI 지수는 : %.2f \n ", BMI);
//						//(int((문제10-100)*0.9);
//				
//				
//				
//				//문제12: inch 를 입력받아 cm 로 변환하기 [ 1 inch -> 2.54cm ] 
//				
//				System.out.println(" 문제 12) 인치 입력 : "); double 문제12 = scanner.nextDouble();
//				//float cm= (float)(문제12*2.54);
//				//System.out.printf(" 변환 값 :%.2f ",cm);
//				System.out.printf(" 변환 값 :%.2f ",(문제12*2.54));
//				
//				//문제13:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
//				//소수 둘째 자리 까지 점수 출력하기
//				//중간고사 반영비율 => 30 %
//				//기말고사 반영비율 => 30 %
//				//수행평가 반영비율 => 40 %
//				
//				System.out.println(" 문제13) 중간고사 입력 :"); double 중간고사=scanner.nextDouble();
//				System.out.println(" 문제13) 기말고사 입력 :"); double 기말고사=scanner.nextDouble();
//				System.out.println(" 문제13) 수행평가 입력 :"); double 수행평가=scanner.nextDouble();
//				// me
//				//double 결과 = (중간고사*0.3)+(기말고사*0.3)+(수행평가*0.4);
//				//System.out.printf(" 결과 : %.2f \n ",결과);
//				
//				중간고사 = 중간고사 *0.3;
//				기말고사 *= 0.3;
//				수행평가 *= 0.4;
//				
//				System.out.printf(" 반영비율별 총점 : %.2f \n ",(중간고사+기말고사+수행평가));
//				
		
				//문제14 :  연산 순서 나열 하고 x와 y값 예측하기  ==> ?? check
//				 	int x = 10;
//					int y = x-- + 5 + --x;
//				    printf(" x의 값 : %d , y의값 :  %d ", x, y)
						// 1. x-- + 5 -> 감소 전에 먼저 + -> 10+5=15 후에  x 감소
						// 2. x-- 는 감소 => [ x= 8]
						// 3. 15 + --x -> [x=8]
						// 4. 15 + 8 = > y : 23
				
								
				//문제15 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
				
				System.out.println(" 문제15) 당신의 나이는? :"); int 나이=scanner.nextInt();
								
			//	char 등급2 = 점수 > 90 ? 'A' : 점수 > 80 ? 'B' : 'C' ;
				
				char 판별 = (나이 >=10 && 나이 <=19)? 'A':(나이 >=20 && 나이 <=39)?'B':'C' ;
				 //char 학생 = (나이 >=10 && 나이 <=19) ? '학'):'B';
				//char 성인 = (나이 >=20 && 나이 <=39);
				//char 중년 = (나이 >=40);
				System.out.println(" A: 학생 | B : 성인 | C :중년 \n당신은 ! : "+ 판별);
				
						
				//문제16 : 3개의 정수를 입력받아 오름차순으로 정렬 
				

//				//문제6 : 두개의 정수를 입력받아 더 큰지 출력  [ true , false ]
//				
//				System.out.println(" 문제6) 정수1 입력 : ");	int 문제6_1 =scanner.nextInt();
//				System.out.println(" 문제6) 정수2 입력 : ");	int 문제6_2 =scanner.nextInt();
//				
//				int 큰수 = 문제6_1>문제6_2 ? 문제6_1: 문제6_2;
//				System.out.println(" 더 큰 수는 :" + 큰수);
//				
				
			
				
				System.out.println("문제 16) 정수입력1"); int 정수1=scanner.nextInt();
				System.out.println("문제 16) 정수입력2"); int 정수2=scanner.nextInt();
				System.out.println("문제 16) 정수입력3"); int 정수3=scanner.nextInt();
				
//				int 큰수 = 문제6_1>문제6_2 ? 문제6_1: 문제6_2;
				//A B C
				// Max value
				//1-1. A>=B && A>=C 
				//   A가 B 보다 크거나 같고 A가 C 보다 크거나 같다  
				//1-2. B>=A&&B>=C  
				//   B가 A보다 크거나 같고 C보다 크거나 같다 
				//  (A>=B && A>=C) ? A : (B>=A && B>=C) ? B : C
				     // A가 B 보다 크거나 같고 A가 C 보다 크거나 같으면 max value에 A 입력 
						// 1-1 비 만족 시 B가 A 보다 크거나 같고 C 보다 크거나 같으면 max value 에 B 입력
				
				// min value -> max value 와 반대
				//2-1. A<=B && A<=C 
				//   A가 B 보다 작거나 같고 A가 C 보다 작거나 같다   
				//2-2. B<=A&&B<=C  
				//   B가 A보다 작거나 같고 C보다 작거나 같다 
				//  (A<=B && A<=C) ? A : (B<=A && B<=C) ? B : C
				     // A가 B 보다 작거나 같고 A가 C 보다 작거나 같으면 min value에 A 입력 
						// 2-1 비 만족 시 B가 A 보다 작거나 같고 C 보다 작거나 같으면 max value 에 B 입력
				
				// mid value
				// A 가 중간 값일 경우   B<A<C    & C<A<B
				//                  A>=B&&A<=C : B<A<C
				//					(정수1>= 정수2 && 정수1 <= 정수3)
				//					 	A>=B&&A<=C ? A -> B<A<C 조건이 맞을 경우 중간값 A
				//	
				//                  A>=C&&A<=B : C<A<B
//				 					(정수1>= 정수3 && 정수1 <= 정수2)	
				//						A>=C&&A<=B ? A : C<A<B 조건이 맞을 경우 중간값 A
 				// B 가 중간 값일 경우   A<B<C & C<B<A
				//					B>=A && B<=C : A<B<C
				//					(정수2>=정수1 && 정수2<=정수3)
				//					B>=C && B<=A : C<B<A
				//					(정수2>=정수3 && 정수2<=정수1)
				// C 가 중간 값일 경우   A<C<B & B<C<A
				//                  C>=A && C<=B : A<C<B 
				//					(정수3>=정수1 && 정수3<=정수2)
				//					C<=B && C>=A : B<C<A
				//					(정수3>=정수2 && 정수3<=정수1)
				// A>=B&&A<=C ? A : A>=C&&A<=B ? A : B>=A && B<=C ? B : B>=C&& B<=A? B : C>=A&& C<=B ? 
				//				C : C<=B && C>=A ? C
				// 
				int 큰값 = 정수1 >=정수2 && 정수1>=정수3 ? 정수1 : 정수2>=정수1&&정수2>=정수3? 정수2 : 정수3; 
				int 작은값 = 정수1 <=정수2 && 정수1<=정수3 ? 정수1 : 정수2<=정수1&&정수2<=정수3? 정수2 : 정수3;
				int 중간값 = (정수1>= 정수2 && 정수1 <= 정수3)? 정수1 : (정수1>= 정수3 && 정수1 <= 정수2)? 정수1 :
						   (정수2>=정수1 && 정수2<=정수3) ? 정수2 : (정수2>=정수3 && 정수2<=정수1) ? 정수2: 
						   (정수3>=정수1 && 정수3<=정수2)? 정수3 :	(정수3>=정수2 && 정수3<=정수1)? 정수3 : 정수1; 
						
						
						
				System.out.printf("오름차순 \nLow value=%d\nMid value=%d\nMax value=%d",작은값,중간값,큰값);
				
			
				//문제17 : 4개의 정수를 입력받아 내림차순으로 정렬 
				// Max & Low 완 Mid1&2 작성
				System.out.println("문제 17) 정수입력1"); int A=scanner.nextInt();
				System.out.println("문제 17) 정수입력2"); int B=scanner.nextInt();
				System.out.println("문제 17) 정수입력3"); int C=scanner.nextInt();
				System.out.println("문제 17) 정수입력4"); int D=scanner.nextInt();
				
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
				int 큰값2 = A>=B && B>=C && C>=D ? A: A>=B && B>=D && D>=C ? A : 
						   A>=C&&C>=B&&B>=D ? A : A>=D&&D>=C&&C>=B? A : A>=C&&C>=D&&D>=B? A:
							
						   B>=A&&A>=C&&C>=D? B : B>=A&&A>=D&&D>=C ? B :	B>=C&&C>=A&&A>=D? B:
						   B>=D&&D>=A&&A>=C? B : B>=D&&D>=C&&C>=A ? B : B>=C&&C>=D&&D>=A? B:
							   
						   C>=B&&B>=A&&A>=D ? C	: C>=B&&B>=D&&D>=A ? C : C>=A&&A>=B&&B>=D? C :
						   C>=D&&D>=B&&B>=A? C: C>=D&&D>=A&&A>=B?C: C>=A&&A>=B&&B>=D?C:
							
						   D>=B&&B>=C&&C>=A ? D : D>=B&&B>=A&&A>=C? D : D>=C&&C>=B&&B>=A? D:
						   D>=A&&A>=B&&B>=C ? D : D>=A&&A>=C&&C>=B ? D : D>=C&&C>=A&&A>=B ? D : A;	   
					    

			    int 작은값2 = A<=B && B<=C && C<=D ? A: A<=B && B<=D && D<=C ? A : 
						   A<=C&&C<=B&&B<=D ? A : A<=D&&D<=C&&C<=B? A : A<=C&&C<=D&&D<=B? A:
							
						   B<=A&&A<=C&&C<=D? B : B<=A&&A<=D&&D<=C ? B :	B<=C&&C<=A&&A<=D? B:
						   B<=D&&D<=A&&A<=C? B : B<=D&&D<=C&&C<=A ? B : B<=C&&C<=D&&D<=A? B:
							   
						   C<=B&&B<=A&&A<=D ? C	: C<=B&&B<=D&&D<=A ? C : C<=A&&A<=B&&B<=D? C :
						   C<=D&&D<=B&&B<=A? C: C<=D&&D<=A&&A<=B?C: C<=A&&A<=B&&B<=D?C:
							
						   D<=B&&B<=C&&C<=A ? D : D<=B&&B<=A&&A<=C? D : D<=C&&C<=B&&B<=A? D:
						   D<=A&&A<=B&&B<=C ? D : D<=A&&A<=C&&C<=B ? D : D<=C&&C<=A&&A<=B ? D : A;	   
				
			    // 중간값 잠시 작은값 복붙시킴 
				int 두번째값 =	A<=B && B<=C && C<=D ? A: A<=B && B<=D && D<=C ? A : 
					   A<=C&&C<=B&&B<=D ? A : A<=D&&D<=C&&C<=B? A : A<=C&&C<=D&&D<=B? A:
							
					   B<=A&&A<=C&&C<=D? B : B<=A&&A<=D&&D<=C ? B :	B<=C&&C<=A&&A<=D? B:
					   B<=D&&D<=A&&A<=C? B : B<=D&&D<=C&&C<=A ? B : B<=C&&C<=D&&D<=A? B:
						   
					   C<=B&&B<=A&&A<=D ? C	: C<=B&&B<=D&&D<=A ? C : C<=A&&A<=B&&B<=D? C :
					   C<=D&&D<=B&&B<=A? C: C<=D&&D<=A&&A<=B?C: C<=A&&A<=B&&B<=D?C:
						
					   D<=B&&B<=C&&C<=A ? D : D<=B&&B<=A&&A<=C? D : D<=C&&C<=B&&B<=A? D:
					   D<=A&&A<=B&&B<=C ? D : D<=A&&A<=C&&C<=B ? D : D<=C&&C<=A&&A<=B ? D : A;	
				
				// 중간값 잠시 작은값 복붙시킴 
				int 세번째값 =	A<=B && B<=C && C<=D ? A: A<=B && B<=D && D<=C ? A : 
					   A<=C&&C<=B&&B<=D ? A : A<=D&&D<=C&&C<=B? A : A<=C&&C<=D&&D<=B? A:
							
					   B<=A&&A<=C&&C<=D? B : B<=A&&A<=D&&D<=C ? B :	B<=C&&C<=A&&A<=D? B:
					   B<=D&&D<=A&&A<=C? B : B<=D&&D<=C&&C<=A ? B : B<=C&&C<=D&&D<=A? B:
						   
					   C<=B&&B<=A&&A<=D ? C	: C<=B&&B<=D&&D<=A ? C : C<=A&&A<=B&&B<=D? C :
					   C<=D&&D<=B&&B<=A? C: C<=D&&D<=A&&A<=B?C: C<=A&&A<=B&&B<=D?C:
						
					   D<=B&&B<=C&&C<=A ? D : D<=B&&B<=A&&A<=C? D : D<=C&&C<=B&&B<=A? D:
					   D<=A&&A<=B&&B<=C ? D : D<=A&&A<=C&&C<=B ? D : D<=C&&C<=A&&A<=B ? D : A;	
				
				
				System.out.printf("\n%d\n,%d\n,%d\n,%d",큰값2,두번째값,세번째값,작은값2);
				
				// Min A = A<B<C<D && A<B<D<C && A<C<B<D  && A<D<B<C  && A<C<D<B  && A<D<C<B
				// Min B = B<A<C<D && B<A<D<C && B<C<A<D  && B<D<A<C  && B<C<D<A  && B<D<C<A
				// Min C = C<A<B<D && C<A<D<B && C<B<A<D  && C<D<A<B  && C<B<D<A  && C<D<B<A				
				// Min D = D<A<B<C && D<A<C<B && D<B<A<C  && D<C<A<B  && D<B<C<A  && D<C<B<A
				
				
				
				// p. 102 확인문제

		
		
	} // m.e

} // c.e
