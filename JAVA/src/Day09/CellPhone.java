package Day09;

public class CellPhone { //Ŭ���� ����
	//1.�ʵ�
	String model;
	String color;
	//2.������
	//3.�޼ҵ� [void : ��ȯŸ�� ���� [ return �������� ]
	void powerOn() { // ��ȯŸ�� �޼ҵ��(�μ�) {���� �ڵ� }
						//--> ��ȯ�� ���� �μ��� ����.
		System.out.println(" ������ �մϴ�.");
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	void sendVoice(String message) {
		// ��ȯ X �޼ҵ��(�μ� O) { } // �μ� O ��ȯ X
		System.out.println("�ڱ� : "+ message);
	}
	void receiveVoice(String message) {
		System.out.println("���� : "+ message);
	}
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}
