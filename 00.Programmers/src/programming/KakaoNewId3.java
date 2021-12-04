package programming;

public class KakaoNewId3 {

public static void main(String[] args) {
		
		String new_id = "AABBDDCCDDEFRZ....";
		
		KakaoNewId3 k3 = new KakaoNewId3();
		System.out.println(k3.solution(new_id));
	}
	
	//정규표현식

	public String solution(String new_id) {

		String answer = "";
		
		//1단계(소문자)
		answer = new_id.toLowerCase();
		
		//2단계(소문자, 숫자, -, _, .)
		answer = answer.replaceAll("[^-_.a-z0-9]", ""); //-,_,.,a~z, 0~9를 제외한 모두
		
		//3단계(연속된 .을 한개로 치환)
		answer = answer.replaceAll("[.]{2,}","."); // {2,} 2개 이상
		
		//4단계(처음이나 마지막에 .이 있으면 삭제)
		answer = answer.replaceAll("^[.]|[.]$", "");
		
		//5단계(빈 문자열이면 new_id에 a 대입)
		if(answer.equals("")) {
			answer = "a";
		}
		
		//6단계(16글자 이상이면 15자로 줄이고, 마지막 마침표 있으면 삭제)
		if(answer.length()>15) {
			answer = answer.substring(0, 15);
		}
		if(answer.charAt(answer.length()-1)=='.') {
			answer = answer.substring(0, answer.length()-1);
		}
		
		//7단계(3글자 미만이면 마지막글자로 3글자 이상으로 만들어)
		if(answer.length()<3) {
			while(answer.length()<3) {
				answer += answer.charAt(answer.length()-1);
			}
		}
		
		return answer;
	}
}
