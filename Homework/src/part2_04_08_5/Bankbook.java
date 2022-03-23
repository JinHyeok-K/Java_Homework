package part2_04_08_5;

public class Bankbook {
	
	private int Bankbook_number;
	private int save_money;
	private String id;
	private String name;
	
	public Bankbook() {
	
	}	
	
	public Bankbook(int bankbook_number, int save_money, String id, String name) {
		super();
		Bankbook_number = bankbook_number;
		this.save_money = save_money;
		this.id = id;
		this.name = name;
	}

	public int getBankbook_number() {
		return Bankbook_number;
	}

	public void setBankbook_number(int bankbook_number) {
		Bankbook_number = bankbook_number;
	}

	public int getSave_money() {
		return save_money;
	}

	public void setSave_money(int save_money) {
		this.save_money = save_money;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
