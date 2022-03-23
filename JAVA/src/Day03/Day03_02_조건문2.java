package Day03;

import java.util.Scanner;

public class Day03_02_조건문2 { // c s 
	
	public static void main(String[] args) { //m s
		
		// 입력 객체 = {  } 당 1번 선언 
		Scanner scanner = new Scanner(System.in);
		// : 현재 main {} 내에서 1번 선언 중
		
		// 문제 1 : 2개의 정수를 입력 받아서 더 큰 출력
		System.out.println(" 정수1 입력 : ");
		int 정수1 = scanner.nextInt();
				// int 형 변수 선언(정수1)하고 입력 받은 값(데이터)을 정수로 가져와서 대입
		System.out.println(" 정수2 입력 : ");
		int 정수2 = scanner.nextInt();
				// int 형 변수 선언(정수1)하고 입력 받은 값(데이터)을 정수로 가져와서 대입
		  	// 제어
		if ( 정수1 > 정수2 )	System.out.println("더 큰수 : " + 정수1);
				// 만약에 입력 받은 정수1 변수가 정수2 변수보다 더 크면 실행 아니면 다음 조건
		else if (정수1<정수2)	System.out.println("더 큰수 : " + 정수2);
				// [다음 조건 ]만약에 입력 받은 정수1 변수가 정수2 변수보다 더 작으면 실행 아니면 그외
		else 				System.out.println(" 같다 ");
				// 나머지[그외] 실행
		
		// 문제 2 : 3개의 정수를 입력 받아서 가장 큰 수 출력
			
		System.out.println(" 문제2) 정수21 입력 : "); 	int 정수21 = scanner.nextInt(); // 변수명 중복 X
		System.out.println(" 문제2) 정수22 입력 : "); 	int 정수22 = scanner.nextInt();
		System.out.println(" 문제2) 정수23 입력 : ");	int 정수23 = scanner.nextInt();
		
		  // Swap
		int max = 정수21; // 가장 큰 수를 저장하는 임시 저장
			// max에 첫번째 값 넣어두기
		if ( max < 정수22) {
			// 만약에 max 보다 정수22가 더 크면 교체
//			int temp = 정수22; // 임시 변수 [스왑용]
//			정수22 = max;
//			max = temp;
			max = 정수22;}
		if ( max < 정수23) { max = 정수23;}
		System.out.println(" 가장 큰 수 : "+ max);
		
		// 문제 3 : 4개의 정수를 입력 받아서 가장 큰 수 출력
		
		System.out.println(" 문제3) 정수31 입력 : "); 	int 정수31 = scanner.nextInt();
		System.out.println(" 문제3) 정수32 입력 : ");	int 정수32 = scanner.nextInt();
		System.out.println(" 문제3) 정수33 입력 : ");	int 정수33 = scanner.nextInt();
		System.out.println(" 문제3) 정수34 입력 : ");	int 정수34 = scanner.nextInt();
		
		int max2 = 정수31; 
		if ( max2 < 정수32) { max2 = 정수32;}
		if ( max2 < 정수33) { max2 = 정수33;}
		if ( max2 < 정수34) { max2 = 정수34;}
		System.out.println(" 가장 큰 수 : "+ max2);
	
		// 문제 4 : 3개의 정수를 입력 받아서 가장 큰 수 출력  : 선택 정렬
		
		System.out.println(" 문제4) 정수41 입력 : "); 	int 정수41 = scanner.nextInt();
		System.out.println(" 문제4) 정수42 입력 : ");	int 정수42 = scanner.nextInt();
		System.out.println(" 문제4) 정수43 입력 : ");	int 정수43 = scanner.nextInt();
		
		if (정수41> 정수42)	{	//    > : 오름 차순  < : 내림 차순
			// 교체 [ 스왑 = 두 개 변수에 데이터 교환 방법 ]
			int temp = 정수41;	// 임시 변수 = 변수1 ;
			정수41=정수42;			// 변수 1 = 변수2 ;
			정수42=temp;			//	변수2 = 임시 변수2;
		}
		
		if (정수41>정수43)		{ int temp = 정수41; 정수41=정수43; 정수43 =temp;}
		if (정수42>정수43)		{ int temp = 정수41; 정수41=정수43; 정수43 =temp;}
		System.out.printf(" 입력한 값 오름 차순 : %d %d %d\n" , 정수41,정수42,정수43);
		System.out.println("입력한 값 오름 차순 : "+정수41+" "+정수42+" "+정수43);
			
		// 문제 5 : 4개의 정수를 입력 받아서 가장 큰 수 출력  : 선택 정렬


		System.out.println(" 문제5) 정수51 입력 : "); 	int 정수51 = scanner.nextInt();
		System.out.println(" 문제5) 정수52 입력 : ");	int 정수52 = scanner.nextInt();
		System.out.println(" 문제5) 정수53 입력 : ");	int 정수53 = scanner.nextInt();
		System.out.println(" 문제5) 정수54 입력 : ");	int 정수54 = scanner.nextInt();
		
		/* me
		 * if (정수51> 정수52) { int temp = 정수51; 정수51=정수52; 정수52=정수53; 정수54=temp;} if
		 * (정수51> 정수53) { int temp = 정수51; 정수51=정수52; 정수52=정수53; 정수54=temp;} if (정수51>
		 * 정수54) { int temp = 정수51; 정수51=정수53; 정수52=정수53; 정수54=temp;}
		 */	
		
		// 첫번째 값 기준으로 비교
		if (정수51> 정수52)	{ int temp = 정수51;	정수51=정수52;	정수52=temp;}
		if (정수51> 정수53)	{ int temp = 정수51;	정수51=정수53;	정수53=temp;}
		if (정수51> 정수54)	{ int temp = 정수51;	정수51=정수54;	정수54=temp;}
		
		// 두번째 값 기준으로 비교
		if (정수52> 정수53)	{ int temp = 정수52;	정수52=정수53;	정수53=temp;}
		if (정수52> 정수54)	{ int temp = 정수52;	정수52=정수54;	정수54=temp;}
		
		if (정수53> 정수54)	{ int temp = 정수53;	정수53=정수54;	정수54=temp;}

		System.out.printf(" 입력한 값 오름 차순 : %d %d %d %d\n" , 정수51,정수52,정수53,정수54);
		System.out.println("입력한 값 오름 차순 : "+정수51+" "+정수52+" "+정수53+" "+정수54);
	
		
		
		
		
		
	} // m e

} // c e
