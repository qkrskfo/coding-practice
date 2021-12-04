package programming;

public class KeyPad67256_3 {
	//왜 이렇게 나오는지 모르겠네....기댓값은 "LRLLLRLLRRL" 이건데..
	
	public String solution(int[] numbers, String hand) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        int leftIndex = 10; // *을 10으로
        int rightIndex = 12; // #은 12로
        
        for(int number : numbers) {
        	if(number==1|| number==4 || number==7) {
        		sb.append("L");
        		leftIndex = number;
        	} else if(number==3 || number==6 || number==9) {
        		sb.append("R");
        		rightIndex = number;
        	} else { // 2,5,8,0
        		int leftLength = getLength(leftIndex, number);
        		int rightLength = getLength(rightIndex, number);
        		
        		if(leftLength > rightLength) {
        			sb.append("R");
        			rightIndex = number;
        		} else if (rightLength > leftLength) {
        			sb.append("L"); 
        			leftIndex = number;
        		} else {
        			if(hand.equals("right")) {
        				sb.append("R");
        				rightIndex = number;
        			} else {
        				sb.append("L");
        				leftIndex = number;
        			}
        		}
        	}
        }
        
        answer = String.valueOf(sb);
        return answer;
    }

	public static int getLength(int index, int number) {
		index = (index ==0) ? 11 : index;
		number = (number ==0) ? 11 : number;
		
		int x = (index-1)/3;
		int y = (index-1)%3;
		int numberX = index/3;
		int numberY = 1; //2,5,8,0의 y좌표값은 항상 1임
		
		return Math.abs(x-numberX)+Math.abs(y-numberY);
		
		
	}
	
	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		
		KeyPad67256_3 kp3 = new KeyPad67256_3();
		System.out.println(kp3.solution(numbers, hand));
	}
	
}
