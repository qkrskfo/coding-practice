package basicStudy;

public class Parent {
	public String nation;
	
	public Parent() {
		this("한국");
		System.out.println("2번:"+nation);
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		this.nation = "대한민국";
		System.out.println("1번:"+nation);
		System.out.println("Parent(String nation) call");
	}
}
