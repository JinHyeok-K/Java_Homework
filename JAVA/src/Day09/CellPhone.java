package Day09;

public class CellPhone { //클래스 선언
	//1.필드
	String model;
	String color;
	//2.생성자
	//3.메소드 [void : 반환타입 없다 [ return 생략가능 ]
	void powerOn() { // 반환타입 메소드명(인수) {실행 코드 }
						//--> 반환도 없고 인수도 없다.
		System.out.println(" 전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void sendVoice(String message) {
		// 반환 X 메소드명(인수 O) { } // 인수 O 반환 X
		System.out.println("자기 : "+ message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방 : "+ message);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
