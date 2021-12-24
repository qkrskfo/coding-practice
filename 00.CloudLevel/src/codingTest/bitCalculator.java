package codingTest;
import java.util.Scanner;


/**
 * 비트연산 기본2
 * @author iampnr
 *
 */
public class bitCalculator {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String arr[] = input.split(" ");
		
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		
		System.out.println(a>>b);
		System.out.println(a<<b);
		
	}

}
