package Day06;

public class Day06_02 { //cs
	
	public static void main(String[] args) { //ms
		
		// 1. Ŭ���� ���� �� -> ��ü ����
		Car	myCar = new Car();// ��ü ����
			// 1. Car : ���ǵ� Ŭ���� ��
			// 2. myCar : ��ü �̸� [�ƹ��ų�]
			// 3. new : �޸� �Ҵ� ������
			// 4. Car() : ������ ? ? ? ? ?
		
		// 2. ��ü �� �ʵ� ȣ�� [ . : ���� ������(��ü �� ��� ����) ]
		
		System.out.println("����ȸ�� : "+ myCar.company);
			// myCar ��ü �� �ʵ� ����
			// ��ü�̸�.����̸� (�ʵ��)
		System.out.println("�𵨸� : "+myCar.model);
			// myCar.model => model �ʵ� ȣ��
		System.out.println("���� : "+ myCar.color);
			// myCar.color => color �ʵ� ȣ��
		System.out.println("�ְ�ӵ� :"+ myCar.maxSpeed);
			// myCar.maxSpeed : maxSpeed �ʵ� ȣ��
		System.out.println("����ӵ� : "+myCar.speed);
			// myCar.speed : speed �ʵ� ȣ��
		
		// 3. ��ü �� �ʵ� �� ����
		myCar.speed = 60;
			// myCar ��ü �� speed �ʵ� ȣ�� 60������ ����
		System.out.println("������ �ӵ� :"+ myCar.speed);
		
		// ���ο� �ڵ��� ��ü ����
		Car yourcar = new Car();
		
		System.out.println("2�� �ڵ��� : "+yourcar.speed);
		// myCar.speed : speed �ʵ� ȣ��
		
	}//me
}//ce
