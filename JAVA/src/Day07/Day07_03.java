package Day07;

public class Day07_03 {
	// 메소드 호출시
		// 내부 호출 : 메소드가 선언된 클래스[파일] 내 메소드 호출
			// 메소드 명만 사용
			// avg(인수1,인수2)
		// 외부 호출 : 메소드가 선언된 다른 클래스[파일] 내 메소드 호출
			// 객체를 통해서 메소드명 호출
			// myCalc.avg(인수1,인수2);
	public static void main(String[] args) {
		// p.227
		Calculator2 myCalc = new Calculator2();
		myCalc.execute(); //외부에서 메소드 호출
	}
}
