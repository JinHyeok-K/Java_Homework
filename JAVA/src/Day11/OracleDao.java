package Day11;

public class OracleDao implements DataAccessObject {
	
	@Override
	public void delete() {
		System.out.println(" 오라클 DB에서 삭제 ");
		
	}
	@Override
	public void insert() {
		System.out.println( " 오라클 DB 에서 삽입");
		
	}@Override
	public void select() {
		System.out.println(" 오라클 DB를 검색");
		
	}
	@Override
	public void update() {
		System.out.println(" 오라클 DB에서 수정");
		
	}
	

}
