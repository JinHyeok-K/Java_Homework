package part2_05_09_5;

import java.util.Random;

public class 소주재고 {
	
	public int maxInventory; //최대재고
	public int sell_alchole; //누적판매
	
	public String refrigeator; // 장고 위치 
	
	 
	
	
	
	public 소주재고(int maxInventory, int sell_alchole, String refrigeator) {
		
		this.maxInventory = maxInventory;
		this.sell_alchole = sell_alchole;
		
		this.refrigeator = refrigeator;
		
	}


	public boolean sell() {
		주점 store = new 주점();
		int add_sell_alchole =0;
		for(int i=0;i<=store.hour*24;i++) {
		sell_alchole = store.random.nextInt(50)+45; 
		add_sell_alchole = add_sell_alchole+sell_alchole;
			if(sell_alchole < maxInventory) {
				
				System.out.println(refrigeator + "남은재고 : "+ (maxInventory-sell_alchole));
				return true;
			}
		
		}
		System.out.println(" 소주 재고부족 판매중지 ");
		
		return false;
	}
	
	
	
	
}
