package Day15;

public class ThreadB extends Thread{
	public boolean stop=false; //종료 플래그
	public boolean work=true;	//작업 진행여부 (상태
	
	public void run() {
		while(!stop) { // stop 이 false 이면 무한루프
			if(work) { // work가 true이면
				System.out.println("ThreadB 작업내용");
			} 
			else { // work가 false 이면 다른 스레드에게 양보
				Thread.yield();
			}
		} //while end
		System.out.println("Thread 종료");
	}
	
}
 