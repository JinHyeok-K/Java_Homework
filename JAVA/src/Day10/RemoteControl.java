package Day10;

public interface RemoteControl { // 인터페이스 선언
			// 리모컨
	// 멤버 구성
		// 1. 상수 필드 : 고정된 데이터
		public int MAX_VOLUME = 10;  // 리모컨의 최대 소음
		public int MIN_VOLUME = 0;   // 리모컨의 최소 소음
		// 2. **추상 메소드** : 선언 O 구형X
			// abstract : 추상 [ 인터페이스에서는 생략 가능 ]
//		public abstract void turnOn();
//		public abstract void TurnOff();
//		public abstract void setVolume();
		public void turnOn();	// {} : 중괄호 생략 [구현 X]
		public void TurnOff(); // 구현 X
		public void setVolume( int volume); // 구현 X
		// 3. 디폴트 메소드 : 선언 O 구현O [ java 8이상]
		default void setMute(boolean mute) {
			if(mute) {
				System.out.println("무음 처리");
			}else {
				System.out.println("무음 해제");
			}
		}
		// 4. 정적 메소드 : 선언O 구현 O [ 객체없이 가능;static ]
		static void changeBattery() {
			System.out.println("건전지 교체 합니다.");
		}
}
