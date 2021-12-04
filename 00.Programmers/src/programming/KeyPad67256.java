package programming;

public class KeyPad67256 {

	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		KeyPad67256 kp = new KeyPad67256();
		
		System.out.println(kp.solution(numbers, hand));
	}
	public String solution(int[] numbers, String hand) { //포기
        String answer = "";

        for(int i=0; i<numbers.length; i++) {
        	if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7) {
        		answer+="L";
        	} else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9) {
        		answer+="R";
        	} else if(numbers[i]==2 || numbers[i]==5 || numbers[i]==8 || numbers[i]==0) {
        		if(numbers[i]-numbers[i-1]==1) {
        			answer+="L";
        		} else if(numbers[i]+1==numbers[i-1]) {
        			answer+="R";
        		} else {
        			if(hand.equals("left")) {
        				answer+="L";
        			} else {
        				answer+="R";
        			}
        		}
        	}
        	System.out.println(numbers[i]+"는"+answer);
        }
        
        return answer;
    }
	
	
}
