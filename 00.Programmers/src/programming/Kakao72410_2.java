package programming;

public class Kakao72410_2 {
	public static void main(String[] args) {
		Kakao72410_2 kk = new Kakao72410_2();
		String new_id = "abcdefghijklmn.p";
		System.out.println("변경된 아이디는 "+kk.solution(new_id));
	}
	public String solution(String new_id) {
        String answer = "";
        
        //1단계(대문자->소문자)
        answer = new_id.toLowerCase();
        
        //2단계(소문자, 숫자, 하이픈, 언더바, 마침표를 제외한 문자 제거)
        answer = answer.replaceAll("[^-_.a-z0-9]", "");
        
        //3단계 (마침표 2번이상 연속되면 하나로 치환)
        answer = answer.replaceAll("[.]{2,}", ".");
        
        //4단계 (마침표가 처음이나 끝에 있으면 제거)
        answer = answer.replaceAll("^[.]|[.]$", "");
        
        //5단계 (빈문자열이면 a대입)
        if(answer.equals("")) {
        	answer = "a";
        }
        
        //6단계 (16자 이상이면 15자로 줄이고, 끝에 마침표 삭제)

        if(answer.length()>0) {
	        if(answer.length()>15) {
	        	answer = answer.substring(0, 15);
	        }
        }
        
        if(answer.length()>0) {
	        if(answer.charAt(answer.length()-1)=='.') {
	        	answer = answer.substring(0, answer.length()-1);
	        }
        }
        
        //7단계 (길이가 2자 이하면 마지막 문자를 추가해서 3글자 이상으로 만들기)
        
        while(answer.length()<3) {
        	answer += answer.charAt(answer.length()-1);
        }
        
        return answer;
    }
	
}
