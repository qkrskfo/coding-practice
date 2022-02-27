package basicStudy;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체수: "+size);
		System.out.println();
		
		String skill = list.get(2); //2번 인덱스의 객체 갖고오기
		System.out.println("2번객체: "+skill);
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+"번: " + str);
		}
		
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+"번: "+str);
		}
		
	}

}
