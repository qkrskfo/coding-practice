package basicStudy;
import java.util.Scanner;

public class ConsoleInput {

	public static void main(String[] args) {

		System.out.println("1000 이하의 자연수를 입력하세요");
		Scanner console = new Scanner(System.in);
		int num = console.nextInt();
		
		if(num>1000) {
			System.out.println("1000 이하로 입력하세요");
			console = new Scanner(System.in);
			num = console.nextInt();
		} 
		System.out.println("잘했어");
	}

}
