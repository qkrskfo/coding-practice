package programming;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
완주하지 못한 선수
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
*/

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        for(String player : participant) {
            map.put(player, map.getOrDefault(player,0)+1);
        } // 참석자 명단에 1넣기
        for(String player : completion) {
            map.put(player, map.get(player)-1);
        } // 완주자 명단에서 1 빼기
        
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            if(entry.getValue()!=0) {
                answer = entry.getKey();
                break;
            }
        }
        
        return answer;
    }


    public static void main(String[] args){
    	String[] part = {"leo", "kiki", "eden"};
    	String[] comp = {"kiki", "leo"};
    	Arrays.sort(part);
    	Arrays.sort(comp);
    	Solution sol = new Solution();
    	System.out.println("완주하지 못한 사람은 "+sol.solution(part, comp)+"입니다.");
    }	   
}
