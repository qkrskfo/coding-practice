
/*
 * 프로그래머스 "로또의 최고 순위와 최저 순위"
 */
public class Lottos {

	public int[] solution(int[] lottos, int[] win_nums) {
		
		int[] answer = new int[2];
		
		int sameCnt = 0;
		int zeroCnt = 0;
		int total = 0;
		
		for(int i=0; i<lottos.length; i++) {
			for(int j=0; j<lottos.length; j++) {
				boolean isSame = lottos[i] == win_nums[j];
				if(isSame) {sameCnt++;}
			}
			
			if(lottos[i]==0) {zeroCnt++;}
		}
		
		total = zeroCnt + sameCnt;
		
		if(total >= 6) {
            answer[0] = 1;
        } else if(total==5) {
            answer[0] = 2;
        } else if(total==4) {
            answer[0] = 3;
        } else if(total==3) {
            answer[0] = 4;
        } else if(total==2) {
            answer[0] = 5;
        } else {
            answer[0] = 6;
        }
        
        if(sameCnt >= 6) {
            answer[1] = 1;
        } else if(sameCnt==5) {
            answer[1] = 2;
        } else if(sameCnt==4) {
            answer[1] = 3;
        } else if(sameCnt==3) {
            answer[1] = 4;
        } else if(sameCnt==2) {
            answer[1] = 5;
        } else {
            answer[1] = 6;
        }
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		int[] lotto_nums = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6 ,19};
		Lottos lottos = new Lottos();
		int[] answer = lottos.solution(lotto_nums, win_nums);
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
	}
}

