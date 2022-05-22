package coding.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Java2438 {

	public static void main(String[] args) throws IOException {

		/*
		 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		 * ★이 아니라 * 이다....
		 * '*'로 하면 출력초과 안나옴 ㅋㅋ
		 */
			
		//1번 - 출력초과
//		Scanner sc = new Scanner(System.in);
//		
//		int cnt = sc.nextInt();
//		
//		for(int i=0; i<cnt; i++) {
//			for(int j=0; j<cnt; j++) {
//				if(i>=j) {
//					System.out.print("★");
//				}
//			}
//			System.out.println();
//		}
//		sc.close();
//		
		
		
		//2번 - 출력초과
//		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
//		int cnt2 = Integer.parseInt(br2.readLine());
//		
//		StringBuilder sb = new StringBuilder();
//		for(int i=0; i<cnt2; i++) {
//			for(int j=0; j<cnt2; j++) {
//				if(i>=j) {
//					sb.append("★");
//				}
//			}
//			sb.append("\n");
//		}
//		
//		br2.close();
//		System.out.println(sb);
		
		
		
		
		//3번 - 출력초과
//		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
//		int cnt2 = Integer.parseInt(br2.readLine());
//		br2.close();
//		
//		StringBuilder sb = new StringBuilder();
//		
//		for(int i=0; i<cnt2; i++) {
//			for(int j=0; j<=i; j++) {
//					sb.append("★");
//			}
//			sb.append("\n");
//		}
//		
//		System.out.println(sb);
		
		//4번
		BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br4.readLine());
		
		br4.close();
		
		for(int i=0; i<cnt; i++) {
			for(int j=0; j<=i; j++) {
				bw.write("*");
			}
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}

}
