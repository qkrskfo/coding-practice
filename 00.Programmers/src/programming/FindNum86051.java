package programming;

public class FindNum86051 {
	public int solution(int[] numbers) {
		int answer = -1;
		
		int sum = 0;
		for(int i=0; i<10; i++) {
			sum+=i;
		}

		answer = sum; 
		
		for(int num : numbers) {
			answer -= num;
		}
	
		return answer;
	}
	
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		FindNum86051 fn = new FindNum86051();
		System.out.println(fn.solution(numbers));
		
	}
}


