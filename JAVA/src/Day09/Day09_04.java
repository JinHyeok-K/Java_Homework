package Day09;

public class Day09_04 {
	public static void main(String[] args) {
		// p.296~297
			// @override : 재 정의
			// 동일한 인수와 메소드명 불가능 
			// 목적 : 동일한 메소드를 재 정의[수정]
		int r = 10;
		// 1. super class 로 객체 생성
		Calculator  calculator = new Calculator();
		// 2. super class 로 만든 객체로 메소드 호출
		System.out.println("원 면적 : "+calculator.areaCircle(r));
		System.out.println();
		
		//1. sub class 로 객체 생성
		Computer computer = new Computer();
		// 2. sub class 로 만든 객체로 메소드 호출
		System.out.println("원 면적: "+computer.areaCircle(r));
		// * super class 와  sub class 내 메소드는 다르다.
		
	}
}
