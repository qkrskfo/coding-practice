
public class KakaoNewId2 {

	public static void main(String[] args) {
		
		String new_id = "AABBDDCCDDEFRZ....";
		
		KakaoNewId2 k2 = new KakaoNewId2();
		k2.solution(new_id);
	}
	
	public String solution(String new_id) {
		String answer = "";
		
		//1단계 (대문자->소문자)
		String step1 = new_id.toLowerCase();
		System.out.println("아이디가 변경되었습니다!! "+step1);
		
		//2단계 (허용되는 문자만)
		char[] step2Array = step1.toCharArray();
		StringBuilder step2 = new StringBuilder();
		for(char c : step2Array) {
			if((c>='a'&&c<='z') || (c>='0' && c<='9') || c=='-' || c=='_' || c=='.') {
				step2.append(c);
			}
		}
		System.out.println("아이디가 변경되었습니다!! "+step2);
		
		//3단계 (마침표가 2번 연속된 경우 1개로 치환)
		String step3 = step2.toString().replace("..", ".");
		while(step3.contains("..")) {
			step3 = step3.replace("..", ".");
		}
		System.out.println("아이디가 변경되었습니다!! "+step3);
		
		
		//4단계 (마침표가 처음이나 끝에 위치한다면 제거)
		String step4 = step3;
		if(step4.length()>0) {
			if(step4.charAt(0)=='.') {
				step4 = step4.substring(1, step4.length()-1);
			}
		}
		
		if(step4.length()>0) {
			if(step4.charAt(step4.length()-1)=='.') {
				step4 = step4.substring(0, step4.length()-1);
			} //연속된 마침표는 이미 3단계에서 지웠으니까 while로 할 필요없어
		}
		
		//5단계 (빈 문자열이면 new_id에 a 대입)
		String step5 = step4;
		if(step5.equals("")) {
			step5 = "a";
		}
		
		//6단계 (16자 이상이면 15개 문자로 짜르기, 마지막이 마침표면 마침표 제거)
		String step6 = step5;
		if(step6.length()>15) {
			step6 = step6.substring(0, 15);
		}
		
		if(step6.charAt(step6.length()-1)=='.') {
			step6 = step6.substring(0, step6.length()-1);
		}
		
		//7단계
		StringBuilder step7 = new StringBuilder();
		step7.append(step6);
		if(step7.length()<3) {
			step7.append(step7.charAt(step7.length()-1));
		}
		
		answer = String.valueOf(step7);
		
		return answer;
	}
	
}
