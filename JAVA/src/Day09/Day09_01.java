package Day09;

public class Day09_01 {
	/*static this final
	 * p.277 
	 * 
	 *  5. 	1
	 *  	1. 객체는 생성자x 인스턴스 생성자O
	 *  	2. //this.멤버명
	 *  		this.필드명
	 *  		this.메소드명
	 *  		this(): 빈 생성자 호출
	 *  		this(데이터,데이터) 생성자	
	 *  					
	 *  			Scanner scanner ; //객체
 	 *				Scanner scanner = new Scanner(System.in) ;/인스턴스화
	 * 	6. void : 메소드가 종료되면서 반환값이 없다.
	 * 		4. Override: 동일한 메소드를 재 정의
	 *  8. static : 정적멤버 | 객체없이 클래스를 통해 접근 가능 <-----> static이 아닌 경우 new 객체로 접근	
	 *  9. final : 상수 <ㅡ 고정 [수정 불가 ]
	 *  
	 *  13. String name;
	 *  	String id;
	 *  	String password;
	 *  	int age
	 *  14.
	 *  	생성자 선언시 :클래스 이름 동일
	 *  	Member (String name , String id){
	 *  	 this.name=name;
	 *  	 this.id =id;
	 *  	}
	 *  15.   매개변수 : 인수 : 메소드 호출 시 메소드로 들어오는 데이터
	 *  	* login method
	 *  	boolean login(String id, String password){
	 *  	
	 *  	if(id.equals("hong") && password.equals("12345")) {
	 *  		// id 가 hong 이면서 패스워드가 12345 이면 true 반환
	 *  		return true;
	 *  	}
	 *  	return false;
	 *  	}
	 *  
	 *  	* logout method	[반환타입 메소드명(인수1,인수2,...,인수n){ }  ]
	 *  	void logout {
	 *  	system.out.print(" 로그아웃 되었습니다. ")
	 *  	}
	 *   
	 *   16.*** 객체를 생성하여 메소드를 호출     [new 사용하여 호출]
	 *   	** 동일한 이름으로 메소드를 선언 가능 [ 단 서로 다른인수 [매개변수] ]
	 *   	void println(int x) { // 외부로부터 int 형 변수를 인수로 받아 출력 메소드
	 *   		system.out.println(x);
	 *   	}
	 *   	void println(boolean x) { // 외부로부터 int 형 변수를 인수로 받아 출력 메소드
	 *   		system.out.println(x);
	 *   	}
	 *   	void println(double x) { // 외부로부터 int 형 변수를 인수로 받아 출력 메소드
	 *   		system.out.println(x);
	 *   	}
	 *   	void println(String x) { // 외부로부터 int 형 변수를 인수로 받아 출력 메소드
	 *   		system.out.println(x);
	 *   	}
	 *   
	 *   
	 *   17.  ** 객체를 생성하지 않고  메소드를 호출하는 방법 ==> Static  
	 *   	static void println(int x) { // 외부로부터 int 형 변수를 인수로 받아 출력 메소드
	 *   		system.out.println(x);
	 *   	}
	 *   	static void println(boolean x) { // 외부로부터 int 형 변수를 인수로 받아 출력 메소드
	 *   		system.out.println(x);
	 *   	}
	 *   	static void println(double x) { // 외부로부터 int 형 변수를 인수로 받아 출력 메소드
	 *   		system.out.println(x);
	 *   	}
	 *   	static void println(String x) { // 외부로부터 int 형 변수를 인수로 받아 출력 메소드
	 *   		system.out.println(x);
	 *   	}
	 *   
	 */	
}
