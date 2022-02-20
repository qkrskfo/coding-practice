package basicStudy;

public class SingletonExample {
	public static void main(String[] args) {
		
		/*
		컴파일 에러
		SingletonClass obj1 = new SingletonClass();
		SingletonClass obj2 = new SingletonClass();
		*/
		
		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 singleton 객체입니다.");
		} else {
			System.out.println("다른 singleton 객체입니다.");
		}
	}
}
