package part2_05_09_5;

public class Al_customer {
	
	
	소주재고 냉장고1 = new 소주재고(20,0,"냉장고1번");
	소주재고 냉장고2 = new 소주재고(20,0,"냉장고2번");
	소주재고 냉장고3 = new 소주재고(20,0,"냉장고3번");

	int sell_start() {
		 System.out.println("판매 시작");
		if(냉장고1.sell() == false) {ready(); return 1;}
		if(냉장고2.sell() == false) {ready(); return 2;} 
		if(냉장고3.sell() == false) {ready(); return 3;} 
		return 0;
	}
	
	void ready() {
		System.out.println(" 판매중지 ");
	}
}
