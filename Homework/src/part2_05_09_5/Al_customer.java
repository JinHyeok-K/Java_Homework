package part2_05_09_5;

public class Al_customer {
	
	
	������� �����1 = new �������(20,0,"�����1��");
	������� �����2 = new �������(20,0,"�����2��");
	������� �����3 = new �������(20,0,"�����3��");

	int sell_start() {
		 System.out.println("�Ǹ� ����");
		if(�����1.sell() == false) {ready(); return 1;}
		if(�����2.sell() == false) {ready(); return 2;} 
		if(�����3.sell() == false) {ready(); return 3;} 
		return 0;
	}
	
	void ready() {
		System.out.println(" �Ǹ����� ");
	}
}
