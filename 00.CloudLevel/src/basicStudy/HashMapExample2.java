package basicStudy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.management.openmbean.InvalidOpenTypeException;

public class HashMapExample2 {

	public static void main(String[] args) {

		//Map 컬렉션 생성
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		//객체 저장
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(2, "박나래"), 98);
		map.put(new Student(1, "홍길동"), 85);
		map.put(new Student(3, "박여름"), 96);
		
		System.out.println("총 entry수: "+map.size());
		
		//객체 찾기
		Student student2 = new Student(2, "박나래");
		System.out.println("\t박나래: "+map.get(student2));

		//객체 하나씩 처리
		Set<Student> keySet = map.keySet();
		Iterator<Student> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			Student student = keyIterator.next();
			Integer value = map.get(student);
			System.out.println(student.name +","+ value);
		}
		System.out.println();
		
		//객체 삭제
		Student student1 = new Student(1, "홍길동");
		map.remove(student1);
		System.out.println("총 entry수: "+map.size());
		
		//객체 하나씩 처리
		Set<Map.Entry<Student, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<Student, Integer>> entryIterator = entrySet.iterator();
	
		while(entryIterator.hasNext()) {
			Map.Entry<Student, Integer> entry = entryIterator.next();
			Student key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key.name+": "+value);
		}
		
		System.out.println();
		
		map.clear();
		
		System.out.println("총 entry수: "+map.size());
	}

}
