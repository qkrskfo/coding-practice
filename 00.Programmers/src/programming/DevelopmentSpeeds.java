package programming;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DevelopmentSpeeds {

	public int[] solution(int[] progresses, int[] speeds) { 
		Queue<Integer> workDate = new LinkedList<>(); //남은 작업시간 
		List<Integer> result = new ArrayList<Integer>(); //배포갯수
		
		 
		for(int i = 0; i < progresses.length; i++) { 
			workDate.add((int)Math.ceil(((double)(100 - progresses[i])) / speeds[i]));  
		} 
		int max = workDate.poll();  
		int stack = 1; 
		
		for(int i = 1; i < progresses.length; i++) { 
			if(max < workDate.peek()) { 
				max = workDate.peek(); 
				result.add(stack); 
				stack = 0; 
			} 
			workDate.poll(); 
			stack++; 
		} 
		result.add(stack); 
		
		//정답 제출 위해 리턴값 변경
		int []answer = new int[result.size()]; 
		for(int i=0; i<result.size(); i++) 
			answer[i] = result.get(i);
		return answer;

	}
}
