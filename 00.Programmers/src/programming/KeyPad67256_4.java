package programming;

public class KeyPad67256_4 {
	
	
	public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int leftIndex = 10; //첫 시작이 *이니까
        int rightIndex = 12; //첫 시작이 #이니까
        
        StringBuilder sb = new StringBuilder();
        
        for(int num : numbers) {
        	if(num==1 || num==4 || num==7) {
        		sb.append("L");
        		leftIndex = num;
        	} else if(num==3||num==6||num==9) {
        		sb.append("R");
        		rightIndex = num;
        	} else { //2,5,8,0일 때
        		int leftLength = getLength(leftIndex, num);
        		int rightLength = getLength(rightIndex, num);
        		
        		if(leftLength < rightLength) {
        			sb.append("L");
        			leftIndex = num;
        		} else if(rightLength < leftLength) {
        			sb.append("R");
        			rightIndex = num;
        		} else {
        			if(hand.equals("left")) {
        				sb.append("L");
        				leftIndex = num;
        			} else {
        				sb.append("R");
        				rightIndex = num;
        			}
        		}
        	}
        }
        
       answer = String.valueOf(sb);
       return answer;
    }
	
	public static int getLength(int index, int num) {
		
		index = (index==0) ? 11 : index;
		num = (num==0) ? 11:num;
		
		int x = (index-1)/3;
		int y = (index-1)%3;
		int numX = num/3;
		int numY = 1;
		
		int length = Math.abs(x-numX) + Math.abs(y-numY);
		return length;
	}

	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "left";
		KeyPad67256_4 k4 = new KeyPad67256_4();
		System.out.println(k4.solution(numbers, hand));
	}

}
