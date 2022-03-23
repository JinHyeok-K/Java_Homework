package Day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Controller {
	// ��� �޼ҵ�� static 
	
	//0. �Խù� ����Ʈ
	
	public static ArrayList<Board> boardlist= new ArrayList<>();

	
	
	//2. ���� �޼ҵ�
	public static void write(String ����, String ����, String �ۼ���, String ��й�ȣ) {
		// 1. ��üȭ
		Board board  = new Board(����,����,�ۼ���,��й�ȣ);
		// 2. ����Ʈ�� ����
		boardlist.add(board);
		// 3. ���Ͽ� ����
		save();
	}

	//4. ���� �޼ҵ�
	public static boolean update(int index, String password, String title, String contents) {
		if(password.equals(boardlist.get(index).getPassword())) {
			
			boardlist.get(index).setTitle(title);
			boardlist.get(index).setContents(contents);
			save();
			return true;
		}else {
			return false;
		}
	}
	
	//5. ���� �޼ҵ�
	public static boolean delete(int index, String password) {
		
		if(password.equals(boardlist.get(index).getPassword())){
			// �Է¹��� �н������ �ش� �ε��� �Խù���ȣ�� �н����尡 ������
			boardlist.remove(index); // add(��ü):�߰� get(�ε���) : ȣ��  remove(�ε���or ��ü):����
			save();
			return true;
		}else {
			return false;
			
		}
		// �Է¹��� �н������ �ش� �ε��� �Խù���ȣ�� �н����尡 ������
	}
	//6. ��۾��� �޼ҵ�
	public static void replywrite() {}
	//7. �Խù����� �޼ҵ�
	public static void save() {
		// ����Ʈ �� ��� �Խù��� ���Ͽ� ����
		try {
			// 1. ���� ��� Ŭ����
			FileOutputStream outputStream = new FileOutputStream("D:/JAVA/�Խù�����.txt");
			// 2. ���Ͽ� �ۼ��� ���� [���پ� = �Խù� 1���� = ��ü 1����]
			for (Board board : boardlist) {

				String �ۼ����� = board.getTitle()+","+board.getContents()+","+
								board.getPassword()+","+board.getWritter()+","+
								board.getViewcount()+","+board.getDate()+"\n";
				// 3. ����[���ڿ�] => ����Ʈ�� ��ȯ [ �ܺ���� (��Ʈ�� ) : ��Ŵ��� byte]
				// 4  ��������[ write() ]
				outputStream.write(�ۼ�����.getBytes());
			}
		}catch(Exception e) {
			System.out.println("�˸�) ���� ���� ����[�����ڿ��� ����]");
		}
	}
	//8. �Խù��ҷ����� �޼ҵ� [ ���α׷� ���� �� ] ---> ����Ʈ
	public static void load() { 
		// 1. ���� �Է� Ŭ����
		try{
			FileInputStream inputStream = new FileInputStream("D:/JAVA/�Խù�����.txt");
				// 2. ����Ʈ�迭 ����
			byte[] bytes = new byte[1024];
				// 3. ��� ����Ʈ �о�ͼ� ����Ʈ�� ����
			inputStream.read(bytes);
				// 4. ����Ʈ -> ���ڿ� ��ȯ
			String file = new String (bytes);
			 	// 5. ���ڿ� �ڸ��� [ �� �پ�[ \n ]-> 1�� ��ü ]
			String[] boards = file.split("\n");
			int i=0;
			for(String temp : boards) { // �迭 �� ���ڿ� �ϳ� �� ������
				if(i+1==boards.length) break;
				String[] field = temp.split(",");
				Board board = new Board(field[0],field[1],
						field[2],field[3],Integer.parseInt(field[4]),field[5],null);
				boardlist.add(board);
			}
			// 6. ���ڿ� �ڸ��� [ ���� [,] -> �� �ʵ� ]
			// 7. ��üȭ
			// 8. ����Ʈ ���
		}catch(Exception c){System.err.println("�˸� ���Ϸε� ����");}
			
		
	}
	//9. ������� �޼ҵ�
//	public static void boardlist() {}
	//10. ��ۺҷ����� �޼ҵ�
//	public static void boardlist() {}
	
}
