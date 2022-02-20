package codingTest;

import java.util.Scanner;

/**
 * 리그 경기 횟수 구하기
 * @author iampnr
 *
 */
public class LeagueCount {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int sum = 0;
		for(int i=n; i>0; i--) {
			if(i==n) {
				continue;
			} else {
				sum+=i;
			}
		}
		
		System.out.println(sum);
	}
	
}
