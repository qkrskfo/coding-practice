package programming;

public class Kakao72410 {
	public static void main(String[] args) {
		Kakao72410 kk = new Kakao72410();
		String new_id = "abcdefghijklmn.p";
		System.out.println("변경된 아이디는 "+kk.solution(new_id));
	}
	public String solution(String new_id) {
        String answer = "";
        
        //1단계(대문자->소문자)
        answer = new_id.toLowerCase();
        
        //2단계(소문자, 숫자, 하이픈, 언더바, 마침표를 제외한 문자 제거)
        char[] cArray = answer.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(char c : cArray) {
        	if((c>='a' && c<='z') || (c>='0' && c<='9') || c=='-' || c=='_' || c=='.') {
        		sb.append(c);
            }	
        }
        
        answer = String.valueOf(sb);
        
        //3단계 (마침표 2번이상 연속되면 하나로 치환)
        answer = answer.toString().replace("..", ".");
        while(answer.contains("..")) {
        	answer = answer.replace("..", ".");
        }
        
        //4단계 (마침표가 처음이나 끝에 있으면 제거)
        if(answer.length()>0) {
	        if(answer.charAt(0)=='.') {
	        	answer = answer.substring(1);
	        }
        }
        if(answer.length()>0) {
	        if(answer.charAt(answer.length()-1)=='.') {
	        	answer = answer.substring(0, answer.length()-1);
	        }
        }
        
        //5단계 (빈문자열이면 a대입)
        if(answer.equals("")) {
        	answer = "a";
        }
        
        //6단계 (16자 이상이면 15자로 줄이고, 끝에 마침표 삭제)
        if(answer.length()>15) {
        	answer = answer.substring(0, 15);
        }
        if(answer.charAt(answer.length()-1)=='.') {
        	answer = answer.substring(0, answer.length()-1);
        }
        
        //7단계 (길이가 2자 이하면 마지막 문자를 추가해서 3글자 이상으로 만들기)
        StringBuilder sb2 = new StringBuilder();
        sb2.append(answer);
        while(sb2.length() < 3) {
        	sb2.append(sb2.charAt(sb2.length()-1));
        }
        answer = String.valueOf(sb2);
        return answer;
    }
	
}
