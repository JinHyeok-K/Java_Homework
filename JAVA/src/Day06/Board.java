package Day06;

public class Board {
	// * Board Class ����
		// main �޼ҵ� ��� X
		// main �޼ҵ�� �ڵ� ���� �ÿ��� ��� Ŭ����(���赵) ���� ��� X
	
	// 1. �ʵ�
	String title;
	String contents;
	String writter;
	String password;
	
	// 2. ������ [ Ŭ���� �̸��� �����ϸ� ������ ��]
		// �ڵ� : ������ Ŭ��-> source-> Generator constructor ~
		// 1. �� ������
	Board(){}
		// 2. 1�� �ʵ带 �޴� ������
	Board(String title){ // �ܺκ���
		this.title = title;
		// this.�ʵ�� => ���� ����
		// * �ܺηκ��� ���� ������ ���� ������ ����
	}
		// 3. 2�� �ʵ带 �޴� ������
	Board(String title, String contents){
		this.title = title;
		this.contents = contents;
	}
		// 4. 3�� �ʵ带 �޴� ������
	Board(String title, String contents, 
			String writter){
		this.title = title;
		this.contents = contents;
		this.writter = writter;
	}
	
		// 5. 4�� �ʵ带 �޴� ������
	Board(String title, String contents, 
			String writter, String password){
		this.title = title;
		this.contents = contents;
		this.writter = writter;
		this.password = password;
	}
	
	
	
	// 3. �޼ҵ�
	
	

	
	
}
