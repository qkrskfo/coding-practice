package programming;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kakao81301 {

	public static void main(String[] args) {
		Kakao81301 k = new Kakao81301();
		String s = "one4seveneight";
		System.out.println(k.solution(s));
	}
	
	public int solution(String s) {
		int answer = 0;
		
		String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		for(int i=0; i<numbers.length; i++) {
			s = s.replaceAll(numbers[i], Integer.toString(i));
		}
		
		answer = Integer.parseInt(s);
		
		return answer;
	}
	
}
