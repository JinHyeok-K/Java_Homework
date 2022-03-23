package Day10;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) { // super class 에 빈 생성자 생성 시 오류 제거
//		       ==> 생성자 수 오류
		this.name=name;
		this.studentNo=studentNo;
	}
//	public Child(String name, int studentNo) { // super 추가
//    		super(name);
//    		this.studentNo=studentNo;
//}

}
