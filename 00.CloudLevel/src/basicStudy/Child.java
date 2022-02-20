package basicStudy;

public class Child extends Parent {
	private String name;
	
	public Child() {
		this("바보");
		System.out.println("4번:"+name);
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = "야호";
		System.out.println("3번:"+name);
		System.out.println("Child(String name) call");
	}
}
