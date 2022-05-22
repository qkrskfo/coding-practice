package codingTest;

import java.util.Scanner;

/**
 * 의좋은 형제
 * @author iampnr
 *
 */
public class brother {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = sc.nextLine().split(" ");
		Scanner sc2 = new Scanner(System.in);
		
		int jw = Integer.parseInt(arr[0]);
		int sw = Integer.parseInt(arr[1]);
		
		int dday = Integer.parseInt(sc2.next());
		
		int mealBox = 0; //식량 임시 저장 박스
		
		for(int i=1; i<=dday; i++) {
			if(i%2!=0) {
				if(jw%2!=0) {
					mealBox = jw/2;
					jw = mealBox;
					mealBox +=1;
					sw += mealBox;
				} else {
					mealBox = jw/2;
					jw = mealBox;
					sw += mealBox;
				} 
			} else {
				if(sw%2!=0) {
					mealBox = sw/2;
					sw = mealBox;
					mealBox +=1;
					jw += mealBox;
				} else {
					mealBox = sw/2;
					sw = mealBox;
					jw += mealBox;
				}
			}
		}
		
		System.out.println(jw+" "+sw);
	}
}
