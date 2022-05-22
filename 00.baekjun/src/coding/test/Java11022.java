package coding.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java11022 {

	public static void main(String[] args) throws IOException {

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt1 = Integer.parseInt(br1.readLine());
		
		StringBuilder sb1 = new StringBuilder();
		StringTokenizer st1;
		
		for(int i=1; i<=cnt1; i++) {
			st1 = new StringTokenizer(br1.readLine()+" ");
			sb1.append("Case #").append(i).append(": ");
			
			int a = Integer.parseInt(st1.nextToken());
			int b = Integer.parseInt(st1.nextToken());
			
			sb1.append(a).append(" + ").append(b).append(" = ").append(a+b)
			.append("\n");
			
		}
		
		br1.close();
		System.out.println(sb1);

	}

}
