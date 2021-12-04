package programming;

public class KeyPad67256_2 {

	int[][] board = {{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2},{3,0},{3,1},{3,2}};

	public int distance(int numbers, int Pos) {
		//right나 left입력받으면 numbers[i]와 Pos의 x좌표, y좌표 계산 후 더한값 반환
		int xx = Math.abs((board[Pos-1][0])-(board[numbers-1][0]));
		int yy = Math.abs((board[Pos-1][1])-(board[numbers-1][1]));

		return (xx+yy);
	}
	
	public String solution(int[] numbers, String hand) {
        String answer = "";
        
        //*은 10, 0은 11, #은 12
        int leftPos = 10;
        int rightPos = 12;
        for(int i=0; i<numbers.length; i++) {
        	if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7) {
        		answer += "L";
        		leftPos = numbers[i];
        	} else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9) {
        		answer += "R";
        		rightPos = numbers[i];
        	} else { //2580
        		//0인경우 11로 바꿔줘야 함
        		if(numbers[i]==0) numbers[i]=11;
        		
        		int le = distance(numbers[i], leftPos);
        		int ri = distance(numbers[i], rightPos);
        		
        		if(le > ri) { //right가 더 가까운 경우
        			answer +="R";
        			rightPos = numbers[i];
        		} else if(le < ri) {//left가 더 가까운 경우 
        			answer +="L";
        			leftPos = numbers[i];
        		} else { //거리가 같은 경우
        			if(hand.equals("right")) {
        				answer +="R";
        				rightPos = numbers[i];
        			} else {
        				answer +="L";
        				leftPos = numbers[i];
        			}
        		}
        	}
        }
        
        
        return answer;
    }

	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		
		KeyPad67256_2 kp2 = new KeyPad67256_2();
		kp2.solution(numbers, hand);
	}
	
}
