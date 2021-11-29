import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BasicSoBasic {

	public static void main(String[] args) {
//		int num = 100;
//		int sum = 0;
//		int even = 0;
//		int odd = 0;
//		for(int i = 0; i<=num; i++) {
//			sum += i;
//			if(i%2==0) {
//				even +=i;
//			} else {
//				odd +=i;
//			}
//		
//		}
//		System.out.println(sum);
//		System.out.println(even);
//		System.out.println(odd);
//		
//		
//		System.out.println("   ");
//		
//		int divided = 68574;
//		System.out.println(divided+"의 1의 자리 수="+(divided%10));
//		System.out.println(divided+"의 10의 자리 수="+(divided%100/10));
//		System.out.println(divided+"의 10의 자리 이하 수="+(divided%100));
//		
//		
//		
//		System.out.println("   ");
//		
//		System.out.println("score를 입력하세요");
//		Scanner sc = new Scanner(System.in);
//		
//		int score = sc.nextInt();
//		
//		if(score >=95) {
//			System.out.println("학점:A");
//		} else if (score >= 90) {
//			System.out.println("학점:B");
//		} else if (score >= 85) {
//			System.out.println("학점 C");
//		} else {
//			System.out.println("탈락");
//		}
//		
//		sc.close();
//		
//		
//		
//		System.out.println(" ");
//		
//		Random rd = new Random();
//		int dice = rd.nextInt(6);
//		
//		dice = dice + 1;
//		
//		System.out.println("주사위값은 "+dice+"입니다");
//		
//		if(dice==6) {
//			System.out.println("멍멍6");
//		} else if (dice == 5) {
//			System.out.println("멍멍5");
//		}
//		
//		switch(dice) {
//		case 6: 
//			System.out.println("멍멍6");
//			break;
//		case 5: 
//			System.out.println("멍멍5");
//			break;
//		}
//		
		
		
//		Random r = new Random();
//		int narae = r.nextInt(3);
//		int mirae = r.nextInt(3);
//		
//		String scissors = "가위";
//		String rock = "바위";
//		String paper = "보";
//		
//		String nResult = "";
//		String mResult = "";
//		
//		if(narae == 0) {
//			nResult = rock;
//		} else if(narae==1) {
//			nResult = scissors;
//		} else {
//			nResult = paper;
//		}
//		
//		if(mirae == 0) {
//			mResult = rock;
//		} else if (mirae == 1) {
//			mResult = scissors;
//		} else { 
//			mResult = paper;
//		}
//		
//		System.out.println("나래는 "+nResult+"를 냈고");
//		System.out.println("미래는 "+mResult+"를 내서");
//		
//		if(mirae==narae) {
//			System.out.println("비겼습니다");
//		} else if(narae-mirae==-1 || narae-mirae==2) {
//			System.out.println("나래가 이겼습니다");
//		} else {
//			System.out.println("미래가 이겼습니다.");
//		}
//		
		
//		System.out.println("컴퓨터와 주사위 게임");
//		
//		Random r = new Random();
//		System.out.println("당신의 주사위를 굴립니다");
//		int userDice = r.nextInt(6);
//		System.out.println("당신의 주사위는 "+userDice+"가 나왔습니다");
//		System.out.println("컴퓨터의 주사위를 굴립니다");
//		int comDice = r.nextInt(6);
//		System.out.println("컴퓨터의 주사위는 "+comDice+"가 나왔습니다");
//		
//		if(userDice > comDice) {
//			System.out.println("You win");
//		} else if(userDice < comDice) {
//			System.out.println("Com win");
//		} else {
//			System.out.println("Draw");
//		}
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("정수 5개의 합을 구해드려여");
//		int arr[] = new int[5];
//		int sum = 0;
//		
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println(i+1+"번째 숫자를 입력해주세요");
//			arr[i] = s.nextInt();
//			sum += arr[i];
//		}
//		s.close();
//		System.out.println();
//		System.out.println("입력한 숫자는 다음과 같습니다");
//		System.out.println(Arrays.toString(arr));
//		System.out.println("입력한 정수 5개의 합은 "+sum+"입니다.");
//		
		
//		
//		Random r = new Random();
//		int arr[] = new int[10];
//		for(int i = 0; i<arr.length; i++) {
//			arr[i] = r.nextInt(101);
//		}
//		System.out.println("정렬 전: 숫자 10개: "+Arrays.toString(arr));
//		Arrays.sort(arr);
//		System.out.println("정렬 후: 숫자 10개: "+Arrays.toString(arr));
//		
		
		
		Scanner s = new Scanner(System.in);
		int num[][] = new int[3][3];
		
		System.out.println("숫자 9개를 입력하세요");
		for(int i = 0; i<num.length; i++ ) {
			for(int j = 0; j<num.length; j++) {
				System.out.println((i*3+j+1)+"번쨰 숫자를 입력해주세요");
				num[i][j] = s.nextInt();
			}
			Arrays.sort(num[i]);
		}
		s.close();
		
		int sum[][] = new int[4][4];
		for(int i =0; i<sum.length; i++) {
			for(int j =0; j<sum.length; j++) {
				if(i<3 && j<3) {
					sum[i][j] = num[i][j];
				} else if (j==3) {
					sum[i][j] = Arrays.stream(sum[i]).sum();
				} else if (i==3) {
					sum[i][j] = Arrays.stream(sum[j]).sum();
				}
			}
		}
		
		for(int i = 0; i<sum.length; i++) {
			System.out.println(Arrays.toString(sum[i]));
		}
		
		
		
		
		
	}
	 
}
