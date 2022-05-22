package codingTest;

/**
 * 파손된 램
 * @author iampnr
 *
 */

import java.util.Scanner;

public class damagedRam {
	public static void main(String[] args) {
		
		System.out.println("램의 개수 입력");
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
				
		System.out.println("메모리 용량 입력");
		Scanner sc2 = new Scanner(System.in);
		
		String arr[] = sc2.nextLine().split(" ");
		
		int cnt = 0;
		String count = "";
		for (int i = 0; i < arr.length; i++) {
			int num = Integer.parseInt(arr[i]);
			if((num & (num-1)) != 0) {
				cnt++;
				count = count + (i+1) + " ";
			}
		}

		System.out.println("파손된 램의 개수는: "+cnt);
		System.out.println("파손된 램의 번호는: "+count);
		
		
	}
}
