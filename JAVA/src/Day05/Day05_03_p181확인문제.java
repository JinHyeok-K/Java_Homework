package Day05;

import java.util.Scanner;

public class Day05_03_p181확인문제 {
		public static void main(String[] args) {
			
			//p. 181
			
				// 1.
				// 2.
				// 3. 2 : 객체 비교시 equals 메소드 사용
				// 4. 2 : 길이가 없을 경우 값 대입 불가
				// 5. 3 : boolean 초기값은 ㄹ민ㄷ
				// 6. 3, 5
				//		{1행},{2행},{3행} ==> 3
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
			
					int max =0; // 최댓값 저장하는 변수
					int[] array = {1,4,3,8,2}; // 선언+초기값 선언
					
					for (int i = 0 ; i<array.length;i++) {
						// * i 는 0부터 array 배열 의 길이 까지 1씩 증가, 실행 반복 처리 ==> 0~4까지
						if(max<array[i])max = array[i];
						// * 만약에 max 보다 i번 째 인덱스의 값이 더 크면 max 에 i번째 값 대입
						System.out.println("iteration : "+ max); // 진행 사항 확인
					}
					
					System.out.println("max : "+ max);
					
				// 8.
					int[][] array2 = {
							{95, 86}, // 1행
							{83, 92, 96}, // 2행
							{78, 83, 93, 87, 88} // 3행
					};
					

					
					int sum = 0;		// 합계
					double avg =0.0;	// 평균		
					// 풀이
					//===================================
					int count = 0; 		// 점수의 갯수 [칸 갯수]
					// 2차원 내 모든 데이터 호출
					for (int i=0;i<array2.length;i++) {
						// * 행 0부터 array2 배열이 행 길이까지 1씩 증가 ==> 3미만까지 (0,1,2)
						for (int j=0;j<array2[i].length;j++) {
							// * 열은 0부터 배열의 열 길이 [2, 3, 5] 미만까지 1씩 증가
							sum+= array2[i][j]; // 누적합계
						}
						count += array2[i].length;  // 열 길이의 누적합계
					}
					avg = (double)sum/count;
					//===================================
					
					System.out.println(" sum : "+ sum);
					System.out.println(" avg : "+ avg);
				
				// 9.
					boolean run = true; 	// while 문 스위치 변수
					int studentNum = 0; 	// 학생 수 변수
					int[ ] scores = null;	// 점수 배열 '선언' & 메모리 할당 x
					Scanner scanner = new Scanner(System.in); // 입력 객체
					
					// while(true) {}
					while(run) { // [종료 조건 : 5번 입력 시 종료]
						
						System.out.println("---------------------------------------------------");
						System.out.println("1. 학생 수 2. 점수 입력 3. 점수 리스트 4. 분석 5. 종료");
						System.out.println("---------------------------------------------------");
						System.out.println("선택 : ");
						
						int selectNo = scanner.nextInt();
						if (selectNo==1) { // 학생 수 입력 받기
							System.out.print("학생수>"); studentNum = scanner.nextInt(); // 학생 수 입력 받기
								// 입력 받은 학생 수 만큼 배열 길이 변경
							scores = new int[studentNum];  // scores 호출 | 입력 받은 학생 수 만큼 배열 길이 변경
						}
						else if(selectNo==2) { // 학생 점수 입력 받기
							for(int i = 0 ; i<scores.length;i++) { // 배열 내 모든 인덱스 만큼 반복 처리
								System.out.printf("scores[%d] :\n",i); 
								scores[i] = scanner.nextInt(); // 입력받아 i번째 인덱스에 저장
							}							
						}
						else if(selectNo==3) { // 학생 점수 출력 하기
							for(int i = 0 ; i<scores.length;i++) { // 배열 내 모든 인덱스 만큼 반복 처리
								System.out.printf("scores[%d] : %d \n",i,scores[i]); // i 번째 인덱스 출력
							}
							
						}
						else if(selectNo==4) {
							int 최고점수 = 0;
							int 총합계 = 0;
							double 평균점수 = 0.0;
							
							for (int i = 0 ; i<scores.length;i++) {
								// 최고 점수 구하기
								if(최고점수<scores[i]) 최고점수 =scores[i]; // i 번째 인덱스에 데이터 대입
								// 누적 합계
								총합계 += scores[i];
							}
					
							
							// 평균점수 구하기
							평균점수 = (double)총합계 / scores.length;
							
							System.out.println("최고 점수 : "+최고점수);
							System.out.println("평균 점수 : "+평균점수);
						}
						else if(selectNo==5) {
							break; // 반목문 탈출
//							run = false; //==> run 값을 false 로 변경하면 while 이 돌지 않음
						}
						else {System.err.println(" 잘못된 입력");}
						
						
						
					} //while end
					System.out.println(" 프로그램 종료 ");
		}// main end
}// class end
