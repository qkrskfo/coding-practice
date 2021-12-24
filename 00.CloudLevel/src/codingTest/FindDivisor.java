package codingTest;
import java.util.Scanner;

/**
 * 약수구하기
 * @author iampnr
 *
 */
public class FindDivisor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int i_input = Integer.parseInt(input);
		
		for(int i=1; i<=i_input; i++) {
			if(i_input%i==0) {
				System.out.print(i+" ");
			}
		}
		
	}
	
}
