package Day15;

public class StatePrintThread extends Thread{
	
	//필드
	private Thread targetThread;
	
	//생성자
	public StatePrintThread(Thread targetThread) {// 외부로 부터 받은 스레드 객체를 내부 저장
		this.targetThread =targetThread;
	}
//	public StatePrintThread(TargetThread TargetThread) {
//		this.targetThread =targetThread;
//	}
	//  병렬처리
	public void run() {
		while(true) {
			// 스레드 삿ㅇ태 호출
			Thread.State state= targetThread.getState(); // 현재 스레드 상태 호출
			System.out.println("타겟 스레드 상태 :"+state);
			// 스레드 상태 제어
			if(state==Thread.State.NEW) { // NEW : 스레드 생성상태 뜻
				targetThread.start();
			}
			if(state==Thread.State.TERMINATED) { // TERMINATED : 스레드 종료상태 뜻
				break;
			}
		}
		//0.5초간 일시 정지
		try {Thread.sleep(500);}catch(Exception e) {}
	}
	
}
