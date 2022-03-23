package Day07;

public class Car {
	// 클래스 선언
	
	//1. 필드
	int gas; // 가스 변수
	//2. 생성자
		// 생성자 없으면 기본 생성자
	//3. 메소드
		// 1. gas를 외부로부터 받아서 내부의 gas 에 저장하는 메소드 역할
	void setGas(int gas) { // 인수O 반환X
//  리턴X 메소드명(인수1) { 내부변수 = 외부변수}
		this.gas = gas;
// 내부변수와 외부변수와 이름이 동일할 때 구별하는 방법
		// this.필드명 :  내부(현클래스파일)변수
	}
	
		// 2. 내부 변수 gas 에 데이터 확인[0=가스없다 =false][1이상=가스없다 =true] 
	boolean isLeftGas() { // 인수 x 반환 O
//  논리 반환  메소드명()
		if (gas ==0) {
			System.out.println("gas 가 없습니다.");
			return false;
		}
		else {
			System.out.println("gas 가 있습니다.");
			return true;
		}
		
	}
		// 3. gas 0일 때 까지 실행하는데 실행 할 때마다 가스 1씩 감소 메소드
		// gas 0 이면 함수 종료
	void run()	{
		
		while(true) {// 무한루프 [종료 : 1. break 2.return 3. 스위치변수]
			if (gas>0) {
				System.out.println("달립니다. (gas 잔량 : "+gas+")");
				gas--; // gas 변수 1씩 차감
			}
			else {
				System.out.println("멈춥니다. (gas 잔량 : "+gas+")");
//				break; // 반복문 탈출 [종료]
				return; // 함수 탈출 [종료]
			}
		}
		
	}
	
	
}
