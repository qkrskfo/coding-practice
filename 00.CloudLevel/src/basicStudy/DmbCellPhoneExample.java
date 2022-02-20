package basicStudy;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//DMBPhone 객체 생성
		DMBPhone dmb = new DMBPhone("자바폰", "검정색", 10);
		
		//CellPhone 클래스로부터 상속받은 필드
		System.out.println("모델: "+dmb.model);
		System.out.println("색상: "+dmb.color);
		
		//DMBPhone 클래스의 필드
		System.out.println("채널: "+dmb.channel);
		
		//CellPhone클래스로부터 상속받은 메소드 호출
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요");
		dmb.receiveVoice("안녕하세요 전ㄴ 홍길동인데요");
		dmb.sendVoice("예 반가워요");
		dmb.hangUp();
		
		//DMBPhone클래스의 메소드 호출
		dmb.turnOnDmb();
		dmb.changeChannelDmb(20);
		dmb.turnOffDmb();
	}
}
