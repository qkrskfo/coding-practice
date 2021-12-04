package programming;

public class Lottos2 {
	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		Lottos2 lottos2 = new Lottos2();
		lottos2.solution(lottos, win_nums);
	}
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		
		int same = 0;
		int zeroCnt = 0;
		
		for(int i=0; i<lottos.length; i++) {
			for(int j=0; j<lottos.length; j++) {
				if(lottos[i] == win_nums[j]) {
					same++;
				}
			}
			if(lottos[i]==0) {
				zeroCnt++;
			}
		}
		
		switch(same) {
		case 6:
			answer[1] = 1;
			break;
		case 5:
			answer[1] = 2;
			break;
		case 4:
			answer[1] = 3;
			break;
		case 3:
			answer[1] = 4;
			break;
		case 2:
			answer[1] = 5;
			break;
		default :
			answer[1] = 6;
			break;
		
		}
		
		
		int total = same + zeroCnt;
		if(total>=6) {
			answer[0]=1;
		} else if(total == 5) {
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
		
		return answer;
	}
}
