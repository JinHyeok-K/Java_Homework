package Day11;

public class Cat implements Soundable{
		//  클래스명  구현     인터페이스
	// 추상메소드가 존재하고, 미 구현시 클래스명 오류
	// 그러므로 추상메소드가 존재 시 구현해야 함
	// --> override 사용
	@Override
	public String sound() {
		return "야옹";
	}
}
