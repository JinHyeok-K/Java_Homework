package Day10;

public class Day10_02 {
	
	public static void main(String[] args) {
		
		// 인터페이스 [ 추상 메소드 ]
			// 목적 : 동일한 목적하에 동일한 기능을 수행
				// 서로 다른 클래스간의 객체들을 동일한 목적으로 조작
			// 추상 : 선언[O] 정의[X]->구현 X
				// 인터페이스에서 선언하고 각 클래스들이 구현한다 . [ 다형성 ]
			// 예) 인터페이스 : 방향키 , A버튼, B버튼
			// 		철권게임 클래스
					// A버튼 : 공격
					// B버튼 : 방어
			//		축구게임 클래스
					// A버튼 : 슛
					// B버튼 : 방어
		
		// 1. 인터페이스 객체 선언
		RemoteControl rc;
		// 인터페이스명  객체명
		
		// 2. 인터페이스에 텔레비전클래스 메모리 할당 (implements 한것들만 가능)
		rc = new Television();
		
		// 3. 인터페이스 실행
		rc.turnOn(); // tv 실행 메소드
		rc.TurnOff(); // tv 실행 메소드
		rc.setVolume(-1);
		
		System.out.println("리모컨 연결 : TV -> Audio 교체");
		
		//4. 인터페이스 내 오디오클래스 메모리 할당[교체]
		rc = new Audio();
		// 5. 인터페이스 실행
		rc.turnOn();
		rc.TurnOff();
		rc.setVolume(5);
		
		// ** 익명구현객체 : 클래스 없이 추상메소드 정의 ****
		// 위에는 클래스 'impelents' 인터페이스 형식으로 구현
		//
		RemoteControl rc2 = new RemoteControl() {
		// 인터페이명   객체명  = new  인터페이스
			
			@Override
			public void turnOn() {
				System.out.println("리모콘 켭니다");
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("현재 소음 : 	"+volume);
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void TurnOff() {
				System.out.println("리모콘 켭니다");
				// TODO Auto-generated method stub
				
			}
		};
		rc2.turnOn();
		rc2.TurnOff();
		rc2.setVolume(0);
		
		// 디폴트 메소드 호출
		rc2.setMute(true);
		
		// 정적메소드 호출
		RemoteControl.changeBattery();

		// 메모리 할당 받는 방법
			//메모리 할당 해야되는 이유
				//외부 클래스 / 인터페이스내 필드)(저장기능),메소드(저장기능),연산
			// 1. new 연산자
			// 2. static 연산자
		
		
	}
}
