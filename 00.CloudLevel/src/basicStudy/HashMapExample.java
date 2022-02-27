package basicStudy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); //key값 "홍길동"이 같기 때문에 마지막에 저장한 95로 저장됨
		
		//저장된 총 entry수 얻기
		System.out.println("총 Entry수: "+map.size());
		
		//객체찾기
		System.out.println("\t홍길동: "+map.get("홍길동")); //key로 value검색
		System.out.println();
		
		//객체 하나씩 처리
		Set<String> keySet = map.keySet(); //key set 얻기 //모든 키를 set객체에 담아서 리턴
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key); //key로 value검색
			System.out.println("\t"+key+": "+value);
		}
		
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 entry수: "+map.size());
		
		//객체 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); //map.entry set 얻기
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+": "+value);
		}
		
		System.out.println();
		
		map.clear(); //모든 map.entry 삭제
		System.out.println("총 entry수: "+map.size());
	}
}
