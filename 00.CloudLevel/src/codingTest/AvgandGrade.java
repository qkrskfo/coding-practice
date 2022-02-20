package codingTest;

import java.util.Scanner;

/**
 * 시험성적 평균과 등급 구하기
 * @author iampnr
 *
 */
public class AvgandGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = sc.nextLine().split(" ");
		
		int kor = Integer.parseInt(arr[0]);
		int eng = Integer.parseInt(arr[1]);
		int math = Integer.parseInt(arr[2]);
		
		int total = kor + eng + math;
		double avg = (double)total/arr.length;
		
		System.out.println(String.format("%.2f", avg));
		
		if(avg >= 90) {
			System.out.println("A");
		} else if(avg >= 80) {
			System.out.println("B");
		} else if(avg >= 70) {
			System.out.println("C");
		} else if(avg >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
