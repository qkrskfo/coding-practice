package programming;
import java.util.HashMap;

public class PhoneBook {

	public boolean Solution(String[] phone_book) {
		boolean answer = true;
		
		HashMap<String, Integer> map = new HashMap<>();
		for(int i=0; i<phone_book.length; i++) {
			map.put(phone_book[i], i);
		}
		
		for(int i =0; i<phone_book.length; i++) {
			for(int j=0; j<phone_book[i].length(); j++) {
				if(map.containsKey(phone_book[i].substring(0, j)))
					answer = false;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
		String[] pbook = {"119", "97674223", "1195524421"};
		
		
		System.out.println(pb.Solution(pbook));
	}
	
}
