package basicStudy;

public class SingletonClass {
	// 정적필드
	private static SingletonClass singleton = new SingletonClass();
	
	//생성자
	private SingletonClass() {
		
	}
	
	//정적 메소드
	static SingletonClass getInstance() {
		return singleton;
	}
	
	//외부에서 객체를 얻는 유일한 방법은 getInstance()를 호출하는 방법
	
}
