package test;

public class App_Parking_Car {
	
	public static void main(String[] args) {
		
		App_Parking_Car app = new App_Parking_Car();
		app.menu();
	}
	
	
	void menu() {
		
		while(true) {
			System.out.println("---------------- �����ý��� ---------------");
			System.out.println(Controller.����������+"  "+  Controller.�����ú�);
			System.out.println("��¥\t\t������ȣ\t\t�����ð�\t\t�����ð�\t\t�ݾ�");
			for(Car temp : Controller.carlist) {
				if(temp!=null && temp.get�����ð�()==null) {
					System.out.printf("\n%s\t\t%s\t\t%s\t\t\t\t",temp.get��¥(),temp.get������ȣ(),
							temp.get�����ð�()+"������"+"���� ��");
					System.out.println("---------------------------------------");
				}
				if(temp!=null &&temp.get�����ð�()!=null){
					System.out.printf("\n%s\t\t%s\t\t%s\t\t%s\t\t%d",temp.get��¥(),temp.get������ȣ(),
							temp.get�����ð�(),temp.get�����ð�(),temp.get�ݾ�());
				}
			}
				System.out.println("\n----------------------------------------");
				System.out.println("\t\t\t 1. ���� \t 2 ���� "); int ch= Controller.scanner.nextInt();
				
			if(ch==1) {
				boolean result = Controller.����();
						if(result)
							System.out.println("���� �Ϸ�");
						else
							System.out.println("���� ����");
			}
			else if(ch==2) {
				boolean result = Controller.����();
						if(result)
							System.out.println("���� �Ϸ�");
						else
							System.out.println("���� ����");
				}
				
			}
			
			
			
			
			
	}
		
}
	
	

