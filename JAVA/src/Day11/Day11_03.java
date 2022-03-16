package Day11;

public class Day11_03 {

	//p.422 예외 던지기 [throws Exception]
		// 목적 : 모든 메소드에서 try{}catch(){} 사용시 코드 복잡함 -> 한곳으로 예외 이동
	
	public static void main(String[] args) {
		try {	findclass();}
		catch(Exception e) { }
		try {withdraw(30000);}
		catch(Exception e) { System.out.println(e);}
	}
	public static void findclass() throws Exception{
//		1. 예외 던지기[메소드명() throws 예외클래스명] 예외가 발생 시 호출한 곳으로 리턴
		Class clazz = Class.forName("java.lang.String2");
		
//		2. try ~ catch
//		try { // 예외가 발생할 것 같은 코드[실행예외] 혹은 일반예외[무조건]
//				Class clazz = Class.forName("java.lang.String2");
//						//클래스 찾ㄱ ㅣ메소드
//		}catch(Exception e) { // 예외가 발생하면 실행되는 코드
//			// Exception : 예외 클래스중 슈퍼 클래스 이므로 모든 예외를 저장가능
//			System.out.println(e);
//		}
		
	}
	
	// p. 444~445 : 예외 만들기
	public static void withdraw( int money) throws Exception {
		if(20000 <money) {
			throw new Exception("잔고부족"); 
							//오류메세지 발생
		}
	}
	
	
}
