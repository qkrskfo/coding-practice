package programming;

import java.util.Stack;

public class DollCrain64061 {

	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		
		Stack<Integer> stack = new Stack<>(); //바구니만들기
		stack.push(0); //아무것도 없으면 에러나니까 0 넣어주기
		
		for(int move : moves) {
			for(int j=0; j<board.length; j++) {
				if(board[j][move-1]!=0) {
					if(stack.peek()==board[j][move-1]) { //stack.peek() 스택의 가장 위에 있는 항목 반환
						stack.pop(); //stack.pop() 스택의 가장 상위에 있는 항목을 삭제하고 해당 항목을 반환
						answer+=2;
					} else {
						stack.push(board[j][move-1]); //stack.push() 해당 항목을 stack의 상위에 삽입
					}
					board[j][move-1] = 0;
					break;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		DollCrain64061 doll = new DollCrain64061();
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		System.out.println(doll.solution(board, moves));
	}
	
}
