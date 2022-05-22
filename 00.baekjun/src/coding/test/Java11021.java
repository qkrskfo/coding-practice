package coding.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Java11021 {

	public static void main(String[] args) throws IOException {

//		// 방법1 복습
//		Scanner sc1 = new Scanner(System.in);
//		int cnt = sc1.nextInt();
//
//		for (int i = 1; i <= cnt; i++) {
//			int a = sc1.nextInt();
//			int b = sc1.nextInt();
//
//			System.out.println("Case #" + i + ": " + (a + b));
//		}
//
//		sc1.close();

		// 방법2 복습
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

		int cnt2 = Integer.parseInt(br2.readLine());

		StringTokenizer st;
		/*
		 BuffereReader클래스의 메소드로 입력을 읽으면, 
		 라인 단위로 읽어들임 (br.readLine())
		 이 때 콤마나 스페이스를 기준으로 문자열을 분리한다던가 등을 할 때
		 StringTokenizer를 사용 
		  1) StringTokenizer st = new StringTokenizer(문자열); -> 띄어쓰기 기준 문자열 분리
		  2) StringTokenizer st = new StringTokenizer(문자열,구분자); -> 구분자 기준 문자열 분리
		  3) StringTokenizer st = new StringTokenizer(문자열,구분자,true/false); 
		  		-> 구분자를 기준으로 문자열을 분리할 때 
		  		   구분자도 토큰으로 넣을지(true), 
		  		   구분자는 분리된 문자열 토큰에 포함 안시킬지(false), 
		  		   디폴트는 false 
		  분리된 문자열(토큰) 확인 방법 : st.nextToken();
		  남아있는 토큰이 있으면 true를 리턴, 더 이상 토큰이 없으면 false 리턴
			  while(st.hasMoreTokens()) {
			  		System.out.println(st.nextToken());
			  }
		  여러개의 구분자로 구분할 경우
			  String str = "IT 블로그 추천 - 양햄찌 블로그 : jhnyang.tistory.com";
			  StringTokenizer st = new StringTokenizer(str, "-:");
			  while(st.hasMoreTokens()) {
			  	System.out.println(st.nextToken());
			  }
			  => IT 블로그 추천
			     양햄찌 블로그
			     jhnyang.tistory.com
		 */

		for (int i = 1; i <= cnt2; i++) {
			st = new StringTokenizer(br2.readLine() + " ");
			System.out.println(
				"Case #" + i + ": " 
					+ (Integer.parseInt(st.nextToken()) 
					+ Integer.parseInt(st.nextToken()))
			);
		}
		
		br2.close();

//		//방법3
//		BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
//		
//		int cnt3 = Integer.parseInt(br3.readLine());
//		
//		StringBuilder sb = new StringBuilder();
//		StringTokenizer st3;
//		
//		for(int i=0; i<cnt3; i++) {
//			st3 = new StringTokenizer(br3.readLine(), " ");
//			sb.append("Case #").append(i).append(": ")
//			.append(Integer.parseInt(st3.nextToken())
//					+Integer.parseInt(st3.nextToken())).append('\n');
//		}
//		
//		br3.close();
//		System.out.println(sb);
//		
//		
//		
//		
//		//방법2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int cnt2 = Integer.parseInt(br.readLine());
//		
//		StringTokenizer st;
//		
//		for(int i=1; i<=cnt2; i++) {
//			st = new StringTokenizer(br.readLine()+" ");
//			System.out.println("Case #"+i+": "
//					+(Integer.parseInt(st.nextToken())
//					+Integer.parseInt(st.nextToken())));
//			
//		}
//		
//		//방법1
//		Scanner sc = new Scanner(System.in);
//		int cnt1 = sc.nextInt();
//		
//		for(int i = 1; i <= cnt1; i++) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			
//			System.out.println("Cas+e #"+i+": "+(a+b));
//		}
//		
//		sc.close();

	}

}
