
public class KakaoNewId {
	public static void main(String[] args) {
		KakaoNewId kakao = new KakaoNewId();
		String new_id = "z-+.^.";
		kakao.solution(new_id);
	}
	
	public String solution(String new_id) {
		String answer ="";
		
		//1단계(소문자로)
		String step1 = new_id.toLowerCase();
		
		//2단계(허용되지 않은 문자 제거)
		char[] step1_arr = step1.toCharArray(); 
		/*
		 * toCharArray()
		 * 문자열을 char형 배열로 바꿔줌
		 * 문자열의 공백 또한 인덱스에 포함됨
		 */
		StringBuilder step2 = new StringBuilder();
		/*
		 * StringBuilder()는 변경 가능한 문자열을 만들어주어
		 * String을 합치는 작업 시 하나의 대안이 될 수 있음
		 * .append()의 인자로 연결하고자하는 문자열을 넣어야함.
		 * 출력시에는 .toString()을 해야함
		 * 
		 * String은 불변하기때문에 값을 변경할 수 없다.
		 * String + concat은 속도면에서 비효율적이기때문에
		 * StringBuffer나 StringBuilder를 사용하라는 것
		 * 
		 * StringBuffer나 StringBuilder는 .append(), .delete() 등 사용 가능
		 *
		 * StringBuffer는 공통 메소드가 동기화되므로 멀티쓰레드 환경에서 사용하는 것이 안전
		 * (값이 예상치 못하게 변경되는 것 방지)
		 * 
		 * 그 외에는 StringBuilder가 성능이 뛰어남
		 * sb.append(값) 뒤에 값 삽입
		 * sb.insert(인덱스, 값) 특정 인덱스부터 값 삽입
		 * sb.delete(인덱스, 인덱스) 특정 인덱스부터 인덱스까지 값 삭제
		 * sb.indexOf(값) 값이 어느 인덱스에 들어있는지 확인
		 * sb.substring(인덱스, 인덱스) 인덱스부터 인덱스까지 값 잘라옴
		 * sb.length() 길이 확인
		 * sb.replace(인덱스, 인덱스, 값) 인덱스부터 인덱스까지 값으로 변경
		 * sb.reverse() 글자 순서 뒤집기
		 */
		
		for(char c: step1_arr) {
			if((c>='a' && c<='z') || (c>='0' && c<='9') || c=='-' || c=='_' || c=='.') {
				step2.append(c);
			}
		}
		
		//3단계 (연속된 마침표 1개로 치환)
		String step3 = step2.toString().replace("..", ".");
		while(step3.contains("..")) {
			step3 = step3.replace("..", ".");
		}
		
		//4단계 (처음이나 끝에 마침표 있으면 제거)
		
		String step4 = step3;
		
		if(step4.length() > 0) {
			if(step4.charAt(0)=='.') {
				step4 = step4.substring(1, step4.length());
			}
		}
		
		if(step4.length() >0) {
			if(step4.charAt(step4.length()-1) == '.') {
				step4 = step4.substring(0, step4.length()-1);
			}
		}
		
		//5단계 (빈 문자열이면 'a' 대입)
		String step5 = step4;

		if(step5.equals("")) {
			step5 = "a";
		}
		
		
		//6단계 (16자 이상이면 15개 문자만 남기고 제거 & 끝에 마침표 있으면 제거)
		String step6 = step5;
		
		if(step6.length()>15) {
			step6 = step6.substring(0, 15);
		}
		if(step6.charAt(step6.length()-1)=='.') {
			step6 = step6.substring(0, step6.length()-1);
		}
		
		
		//7단계 (길이가 2자 이하이면 마지막문자로 3글자 이상이 되도록 변경)
		StringBuilder step7 = new StringBuilder();
		step7.append(step6);
		
		if(step7.length()<3) {
			while(step7.length()<3) {
				step7.append(step7.charAt(step7.length()-1));
			}
		}
		
		answer = String.valueOf(step7);
		
		/*
		 * toString()과 String.valueOf()의 차이점
		 * toString()은 nullPointerException 발생
		 * String.valueOf()는 null이라는 문자열로 처리
		 * 
		 * toString()은 모든 랩퍼 객체를 String타입으로 형변환 해주는 것
		 * String.valueOf()는 어떠한 값이라도 String 문자열로 바꿔줌
		 */
		
		
		return answer;
			
	}
}
