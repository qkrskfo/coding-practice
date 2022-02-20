package codingTest;

import java.util.Scanner;

/**
 * 369 게임
 * @author iampnr
 *
 */
public class Game369 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		
		int cnt = 0; //박수카운트
		for(int i=1; i<input; i++) {
			String str = String.valueOf(i);
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j)=='3' || str.charAt(j)=='6' || str.charAt(j)=='9') {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
}
