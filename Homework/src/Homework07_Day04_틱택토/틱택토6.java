package Homework07_Day04_틱택토;

import java.util.Random; //난수 발생 클래스 가져오기
import java.util.Scanner; // 스캐너(입력) 클래스 가져오기

public class 틱택토6 { // time: [09:41] |   // class 시작
	/*
	 * 삼목 게임 [ 틱택토 게임 ] [15]
			1. 게임판 9칸 생성 
				1. String[] 배열 = new String[9]
		
			2. 사용자에게 0~8 인덱스번호 입력받기
				1. 해당 인덱스에 O 표시
				2. 이미 둔 자리는 재 입력 
		
			3. 컴퓨터는 0~8 사이 난수 발생 
				1. 해당 인덱스에 X 표시
				2. 이미 둔 자리는 재 난수 생성  
		
			4. 승리판단 
				가로 인덱스들의 모양이 모두 동일하면
				012 345 678 
					첫번째 인덱스가 0부터 6까지 3씩증가
						두번쨰 : 첫번째+1
 						세번쨰 : 첫번째+2 
				세로 인덱스들의 모양이 모두 동일하면 
				036 147 258
					첫번째 인덱스가 0부터 2까지 1씩증가 
						두번째 : 첫번째+3
						세번째 : 첫번쨰+6
				대각선 인덱스들의 모양이 모두 동일하면 
				048 246
	 */
	// 문제점 : 난수 발생 범위값 자꾸 누락
	public static void main(String[] args) { // main thread 시작(반환 x)
		Scanner scanner =new Scanner(System.in); // 입력객체 생성
		String[] 게임판= { "[ ]","[ ]","[ ]", // 게임판 문자열 변수를  [9] 개 배열을  괄호로 생성
						"[ ]","[ ]","[ ]",
						"[ ]","[ ]","[ ]"};
	// Q) 게임판 선언 시 위 방식 이 아닌 하기방식이 더 많이 쓰일껏 같은데 맞는지? 
		String[] 게임판1= new String[9];
		for (int i =0;i<9;i++) {
			게임판1[i]= "[ ]";
		}
		
		
		int 게임수 =0; // 정수형 변수 게임수를 0으로 선언
		String 승리알=""; // 문자열 변수 승리알을 선언

		
		while(true) { // 무한반복 [종료조건 : 승리자 판별시]
//			Q)while 문을 총 3개를 사용하였는데 boolean 으로 사용하면 1개로도 충분한지? (or while문을 제외하고 돌릴수 있는 방법은?)
			for(int i=0;i<9;i++) { // 반복문  시작 :0~8까지 1씩 증가
				System.out.print(게임판1[i]); // 게임판의 i번째 배열 출력 (줄 안바뀜)
				if(i%3==2) {System.out.println();} // i를 3으로 나누고 난 나머지 값이 2일때 줄바꿈 처리
			}
			while(true) { // sub 무한루프1 시작 
				System.out.print("놓을 위치 선택 : "); int 위치선택=scanner.nextInt(); // 놓을 위치 출력 | 위치선택 변수에 입력 대입
				if(게임판1[위치선택].equals("[ ]")) { // 문자열 변수 게임판의 위치선택의 값에 해당되는 배열이 [ ] 와 같으면
					게임판1[위치선택] = "[O]"; // 게임판의 위치선택의 값에 해당되는 배열의 값은 [O]으로 대입
					게임수++; // 게임수 1씩 증가 
					break; // 위 조건이 만족시 sub 무한루프1 탈출 후 다음 코드로 진행
				}
				else {System.out.println(" 알림) 이미 놓은자리 놓을 수 없습니다.");} // [ ] 가 아닌곳을 선택하면 알림 출력				
				
				 
			}  // sub 무한루프1 끝
			
			while(true) { // sub 무한루프2 시작 
				Random random =new Random(); // 난수발생 객체 생성
				int 컴퓨터 = random.nextInt(9); // 정수형 변수 컴퓨터에 0~8까지의중 생성되는 난수를 대입
				if(게임판1[컴퓨터].equals("[ ]")) { // 게임판의 컴퓨터값에 해당되는 배열의 값이  [ ] 와 같다면
					게임판1[컴퓨터]= "[X]"; // 게임판의 컴퓨터값에 해당되는 배열의 값에 [X] 대입
					게임수++; // 게임수 +1 증가
					break; // 위 조건 만족 시 sub 무한루프 2 탈출
				}
				if(게임수==9) { break;} // 게임수가 9와 같으면 sub 무한루프2 탈출
			}
			
			for(int i = 0 ; i<9; i+=3) { // 반복문 시작 i는 0 부터 8까지 3씩 증가하면서 반복 수행
				if(게임판1[i].equals(게임판1[i+1])&&게임판1[i+1].equals(게임판1[i+2])) { // 게임판의 i번째 배열에 해당되는 값과 
					//게임판의 i+1번째 배열에 해당되는 값이 같고 게임판의 i+2번째 배열의 값이 같으면 
					
					승리알 = 게임판1[i]; // 문자열 변수 승리알에 게임판 i번째 배열의 값을 대입

				}
			}//반복문 끝
			for(int i = 0 ; i<=2; i++) {// 반복문 시작 i는 0 부터 2까지 1씩 증가하면서 반복 수행
				if(게임판1[i].equals(게임판1[i+3])&&게임판1[i+3].equals(게임판1[i+6])) {// 게임판의 i번째 배열에 해당되는 값과 
					//게임판의 i+3번째 배열에 해당되는 값이 같고 게임판의 i+6번째 배열의 값이 같으면 
					승리알 = 게임판1[i]; // 문자열 변수 승리알에 게임판 i번째 배열의 값을 대입

				}     
			}//반복문 끝
			
			if(게임판1[0].equals(게임판1[4])&&게임판1[4].equals(게임판1[8])) {// 게임판의 0번째 배열에 해당되는 값과 
				//게임판의 4번째 배열에 해당되는 값이 같고 게임판의 8번째 배열의 값이 같으면
				승리알 = 게임판1[0]; // 문자열 변수 승리알에 게임판 0번째 배열의 값을 대입

			}
			if(게임판1[2].equals(게임판1[4])&&게임판1[4].equals(게임판1[6])) {// 게임판의 2번째 배열에 해당되는 값과 
				//게임판의 4번째 배열에 해당되는 값이 같고 게임판의 6번째 배열의 값이 같으면
				승리알 = 게임판1[2];// 문자열 변수 승리알에 게임판 0번째 배열의 값을 대입
			}
			
			if (승리알=="[O]") { //문자열 변수 승리알의 값이 [O]와 같으면
				System.out.println("플레이어 승리"); // 플레이어 승리 출력
				break; // 무한반복문 탈출
			}
			if (승리알=="[X]") {//문자열 변수 승리알의 값이 [X]와 같으면
				System.out.println("컴퓨터 승리");// 플레이어 승리 출력
				break;// 무한반복문 탈출
			}
			if (게임수==9) { System.out.println("무승부");} // 게임수가 9와 같으면 무승부 출력
			
			
		}//무한반복문 끝
		for(int i=0;i<9;i++) { // 반복문  시작 :0~8까지 1씩 증가
			System.out.print(게임판1[i]);// 게임판의 i번째 배열 출력 (줄 안바뀜)
			if(i%3==2) {System.out.println();}// i를 3으로 나누고 난 나머지 값이 2일때 줄바꿈 처리
			 // ==> 돌 위치 표시 용					
		}
	}
	
}
