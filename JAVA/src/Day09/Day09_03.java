package Day09;

public class Day09_03 {
	public static void main(String[] args) {
		// p294~295
			// ���� super() ������ �ڵ� �߰�
			// super() : �θ� Ŭ���� �� �� ������ ȣ��
			// super(�μ�1, �μ�2,...,�μ�n) �θ� Ŭ���� �� [n���μ�] ������ ȣ��
		// 1. ����Ŭ������ ��ü ����
		Student student = new Student("ȫ�浿", "1234-5678", 1);
		// 2. ���� Ŭ���ѷ� ���� ��ü�� ����Ŭ���� �� ��� ����
		System.out.println("name : "+student.name);
		System.out.println("ssn : "+student.ssn);
		// 3.
		System.out.println("studentNo :"+student.studentNo);
	}
}
