package Day10;

public class Child2 extends Parent2{
	
	private String name;
	
	public Child2() {
		this("ȫ�浿");
		System.out.println("Child() call");
	}
	
	public Child2(String name) {
		this.name=name;
		System.out.println("Child(String name) call");
	}

}
