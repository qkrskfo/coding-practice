package basicStudy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class arrayPracticeTest {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,5,3,8,2};
		
		for (int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max는"+max);
		
		
		
		Arrays.sort(array);
		max = array[array.length-1];
		
		System.out.println("max="+max);
		
		System.out.println();
		
		int[][] arrays = {
				{95, 86},
				{83,92,96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		/*
		int length = 0;
		
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				sum += arrays[i][j];
			}
			length += arrays[i].length;
		}
		*/
		
		int length = 0;
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				sum += arrays[i][j];
				length++;
			}
		}
		
		avg = (double)sum / length;
		
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);
		
		System.out.println();
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------");
			System.out.println("1.학생수| 2.점수입력| 3.점수리스트| 4.분석| 5.종료");
			System.out.println("--------");
			
			System.out.println("선택>");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.println("학생수>");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores["+i+"] > ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if(selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores["+i+"]:"+scores[i]);
				}
			} else if(selectNo == 4 ) {
				int max2 = 0;
				int sum2 = 0;
				double avg2 = 0.0;
				for (int i = 0; i < scores.length; i++) {
					max2 = (max2 < scores[i]) ? scores[i] : max2;
					sum2 += scores[i];
				}
				avg2 = (double)sum2 / studentNum;
				
				System.out.println("최고점수:"+max2);
				System.out.println("평균점수:"+avg2);
			} else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
}










