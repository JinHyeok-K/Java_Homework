package part2_05_09_5;

public class 처음처럼 extends 소주재고{

	public 처음처럼(int maxInventory, int sell_alchole, String refrigeator) {
		super(maxInventory, sell_alchole, refrigeator);
	}
	

//public KumhoTire( String location , int maxRotation) {
//	super(location, maxRotation);
//	// 슈퍼클래스내 생성자[ 코드 줄이기 ]
	
	@Override
	public boolean sell() {
		주점 store = new 주점();
		int add_sell_alchole =0;
		for(int i=0;i<=store.hour;i++) {
		sell_alchole = store.random.nextInt(10)+1; 
		add_sell_alchole = add_sell_alchole+sell_alchole;
			if(sell_alchole < maxInventory) {
				
				System.out.println(refrigeator + "남은재고 : "+ (maxInventory-sell_alchole));
				return true;
			}
		
		}
		System.out.println(" 처음처럼 재고부족 판매중지 ");
		
		return false;
	}
	
		
	
}
