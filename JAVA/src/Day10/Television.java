package Day10;

public class Television implements RemoteControl, Searchable{ //class 가 구현 (인터페이스가 구현 X)
				// 클래스명  implements 인터페이스명
						// 구현하다 => 클래스가 인터페이스를 구현함
							// 인터페이스가 구현을안해서
		// ctrl+스페이스바
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("TV 를 켭니다");

		
	}
	@Override
	public void TurnOff() {
		System.out.println("TV를 끕니다.");

			
	}
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			//리모컨의 최대소음보다 크면 소음을 10으로 대입[제한]
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			// 리모컨의 최소소음보다 작으면 소음을 0으로대입[제한]
			this.volume=RemoteControl.MIN_VOLUME;			
		}else {
			this.volume=volume;
		}
		System.out.println("현재 TV 볼륨 :"+this.volume);
	}
	@Override
		public void serach(String url) {
			// TODO Auto-generated method stub
		System.out.println(url+" 을 검색합니다.");	
		}
	
	@Override // 디폴트 메소드도 재 정의 가능
		public void setMute(boolean mute) {
			RemoteControl.super.setMute(mute);
		}

	

}
