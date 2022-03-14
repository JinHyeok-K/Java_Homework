package Day09;

public class DMBCellPhone extends CellPhone	{
	// sub class 가  super class 선택 -> extends
		// sub class 가 super class 내 멤버 사용 가능
	
	// 1. 필드
	int channel;
	// 2. 생성자
	public DMBCellPhone(String model, 
			String color, int channel) {
		this.model = model; // this.필드명
		this.color = color; // this.필드명
		// * 현재 클래스에 없는 필드 이므로 슈퍼 클래스 내 멤버 호출
		this.channel =  channel;
	}
	
	
	
	
	// 3. 메소드
	void turnOnDmb() {
		System.out.println("채널 : "+channel+"번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널 : "+channel+"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
