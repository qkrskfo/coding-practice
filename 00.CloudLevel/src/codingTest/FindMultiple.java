package codingTest;

import java.util.Scanner;

/**
 * 3과 5의 배수
 * @author iampnr
 *
 */
public class FindMultiple {

	public static void main(String[] args) {
		System.out.println("1000 이하의 자연수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int i_input = Integer.parseInt(input);
		
		int sum = 0;
		
		for(int i=i_input; i>0; i--) {
			if(i%3==0 || i%5==0) {
				sum += i;
			}
		}
		
		System.out.println("3의배수, 5의배수의 합: "+sum);
	}

}
