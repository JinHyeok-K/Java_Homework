package Day15;

public class Calculator {
	//필드
	private int memory;
	//메소드
	public int getMemory() {
		return memory;		
	}
	//메소드
		// 문제점 : 스레드 1이 100넣고 (스레드2 가 50넣고 [값 변경] ) 100출력
		// 문제해결[ synchronized : 동기화)
				// 스레드 2는 스레드1이 메소드 종료가 될때까지 대기상태(waiting)
	public synchronized void setMemory(int memory) {
		this.memory=memory;
		try{Thread.sleep(2000);}
		catch(Exception e) {}
		
		
	System.out.println(Thread.currentThread().getName()+":"+this.memory);	
		
	}
}
