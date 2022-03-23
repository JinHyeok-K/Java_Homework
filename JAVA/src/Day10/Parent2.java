package Day10;

public class Parent2 {
	public String nation;
	
	public Parent2() {
		this("대한민국");
		System.out.println("부모 빈 생성자 실행");
	}
	public Parent2(String nation) {
		this.nation=nation;
		System.out.println("부모 [1개인수]생성자 실행");
	}
}
