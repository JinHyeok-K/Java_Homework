package part2_05_09_5;

public class ���̽� extends �������  {
	
	public ���̽�(int maxInventory, int sell_alchole, String refrigeator) {
		super(maxInventory, sell_alchole, refrigeator);
	}
	

//public KumhoTire( String location , int maxRotation) {
//	super(location, maxRotation);
//	// ����Ŭ������ ������[ �ڵ� ���̱� ]
	
	@Override
	public boolean sell() {
		���� store = new ����();
		int add_sell_alchole =0;
		for(int i=0;i<=store.hour;i++) {
		sell_alchole = store.random.nextInt(10)+1; 
		add_sell_alchole = add_sell_alchole+sell_alchole;
			if(sell_alchole < maxInventory) {
				
				System.out.println(refrigeator + "������� : "+ (maxInventory-sell_alchole));
				return true;
			}
		
		}
		System.out.println(" ���̽� ������ �Ǹ����� ");
		
		return false;
	}
	
		
		
		
		
	
	
}
