package test2;

import java.util.ArrayList;


public class ����1 {

	
	
	public static void main(String[] args) {
		
		 ����1 ���� = new ����1();
		 ����.menu();
		 
	}
		
	void menu() {
		
		Controller controller =new Controller();
		ArrayList<Car> carlist = Controller.carlist; 

		while(true) {
//		
			
				
				System.out.println("----------------------------- ���� ��Ȳ ǥ -----------------------------");
				System.out.println("\n\t\t\t"+controller.����������+"  "+controller.�����ð�);
			for(Car temp : controller.carlist)
				if(temp!=null) {
				System.out.println("\n   ��¥\t������ȣ\t\t�����ð�\t\t�����ð�\t\t���");
				System.out.printf("%s\t\t%s\t%s\t\t%s\t\t%d",temp.get��¥(),
						temp.get������ȣ(),temp.get�����ð�(),temp.get�����ð�(),temp.get�ݾ�());//				controller.carlist.get(1).get��¥());
				}
			System.out.println("\n---------------------------------------------------------------------");
			System.out.print("\t\t\t1.����\t\t2.����\t\t:"); int ch=Controller.scanner.nextInt();
			if(ch==1) {
				boolean result =Controller.����();
					if(result)
						System.out.println("���� �Ϸ� �Ǿ����ϴ�.");
					else
						System.out.println("���� ���� �Ͽ����ϴ�.");
			}
			else if(ch==2) {
				boolean result = Controller.����();
					if(result) {
						System.out.println("���� �Ϸ�. �ȳ��� ���ʽÿ�");
					}
					else
						System.out.println("���� ����");
			}
		}
	}
		
	
}
