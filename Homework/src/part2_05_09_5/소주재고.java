package part2_05_09_5;

import java.util.Random;

public class ������� {
	
	public int maxInventory; //�ִ����
	public int sell_alchole; //�����Ǹ�
	
	public String refrigeator; // ��� ��ġ 
	
	 
	
	
	
	public �������(int maxInventory, int sell_alchole, String refrigeator) {
		
		this.maxInventory = maxInventory;
		this.sell_alchole = sell_alchole;
		
		this.refrigeator = refrigeator;
		
	}


	public boolean sell() {
		���� store = new ����();
		int add_sell_alchole =0;
		for(int i=0;i<=store.hour*24;i++) {
		sell_alchole = store.random.nextInt(50)+45; 
		add_sell_alchole = add_sell_alchole+sell_alchole;
			if(sell_alchole < maxInventory) {
				
				System.out.println(refrigeator + "������� : "+ (maxInventory-sell_alchole));
				return true;
			}
		
		}
		System.out.println(" ���� ������ �Ǹ����� ");
		
		return false;
	}
	
	
	
	
}
