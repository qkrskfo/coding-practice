package codingTest;

import java.util.Scanner;

/**
 * 홀짝 판별
 * @author iampnr
 *
 */
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		
		if(input%2==0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}

}
