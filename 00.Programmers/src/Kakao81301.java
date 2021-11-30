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
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("zero", 0);
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		map.put("six", 6);
		map.put("seven", 7);
		map.put("eight", 8);
		map.put("nine", 9);
		
		for(String key : map.keySet()) {
			if(s.contains(key)) {
				System.out.println((key+","+map.get(key)));
			}
		}
		
		return answer;
	}
	
}
