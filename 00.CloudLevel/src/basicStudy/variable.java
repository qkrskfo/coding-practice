package basicStudy;

import java.util.Iterator;

public class variable {
	
	public static void main(String[] args) {
		int[][] scores = new int[2][3];
		System.out.println(scores.length); //행의 길이
 		System.out.println(scores[0].length); //열의 길이
		System.out.println(scores[1].length); //열의 길이
		System.out.println();
		int[][] scores2 = new int[2][];
		scores2[0] = new int[2]; // 0번째 행의 열의 길이는 2
		scores2[1] = new int[3]; // 1번째 행의 열의 길이는 3
		
		System.out.println(scores2.length); //행의 길이
 		System.out.println(scores2[0].length); //0번째 행의 열의 길이
		System.out.println(scores2[1].length); //1번째 행의 열의 길이
		System.out.println();
		
		int[][] scores3 = {{92,93,100,77}, {48, 89, 30}};
		System.out.println(scores3.length); //행의 길이
 		System.out.println(scores3[0].length); //0번째 행의 열의 길이
		System.out.println(scores3[1].length); //1번째 행의 열의 길이
		System.out.println();
	
		int[][] mathScores = new int[2][3];
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]="+mathScores[i][k]);
			}
		}
		
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for (int i = 0; i < englishScores.length; i++) {
			for (int j = 0; j < englishScores[i].length; j++) {
				System.out.println("englishScores["+i+"]["+j+"]="+englishScores[i][j]);
			}
		}
		
		System.out.println();
		
		int[][] javaScores = { {95,70}, {92,95,60} };
		for (int i = 0; i < javaScores.length; i++) {
			for (int j = 0; j < javaScores[i].length; j++) {
				System.out.println("javaScores["+i+"]["+j+"]="+javaScores[i][j]);
			}
		}
	}
}
