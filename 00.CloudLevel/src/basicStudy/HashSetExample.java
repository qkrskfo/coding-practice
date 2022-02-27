package basicStudy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.lang.model.element.Element;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("java");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: "+size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}

		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: "+set.size());
		
		iterator = set.iterator();
		for (String string : set) {
			System.out.println("\t"+string);
		}
		
		set.clear(); //모든 객체를 제거하고 비움
		
		if(set.isEmpty()) {System.out.println("다 비웠음");};
	}

}
