package coding.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
		
		System.out.println(sb);
		
		//Scanner sc = new Scanner(System.in);
		
		/*
		int a = sc.nextInt();
		
		int arr[] = new int[a];
		
		for(int i = 0; i <a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			arr[i] = b + c;
		}
		
		sc.close();
		
		for(int j : arr) {
			System.out.println(j);
		}
		*/
		
		
		/*
		h = h + (nm / 60);
		m = m + (nm % 60);
		
		if(m >= 60) {
			h += 1;
			m -= 60;
		}
		
		if(h >= 24) {
			h-=24;
		}
		
		System.out.println(h+" "+m);
	
		
		int alert = 45;
		int cal = alert - m;
		
		int minute = 60;
		
		if(m<45) {
			h = h - 1;
			if(h<0) {
				h = 23;
			}
			m = minute - cal;
			System.out.println(h+" "+m);
		} else {
			m = m - alert;
			System.out.println(h+" "+m);
		}
		
		
		
		
		
		if(a>=0 && b>=0) {
			System.out.println("1");
		} else if (a>=0 && b<0) {
			System.out.println("4");
		} else if (a<0 && b<0) {
			System.out.println("3");
		} else {
			System.out.println("2");
		}
			
		
		
		if(a%4==0 && a%100!=0 || a%400==0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		
		
		
		
		if(a <= 100 && a>=90) {
			System.out.println("A");
		} else if (a <= 89 && a>=80) {
			System.out.println("B");
		} else if (a <= 79 && a>=70) {
			System.out.println("C");
		} else if (a <= 69 && a>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		
		
		System.out.println("\\    /\\");
        System.out.println(" )  ( \')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");
        
        
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");
        
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println((double)a/b);
		
		
		Scanner sc = new Scanner(System.in);
		int intA = sc.nextInt();
		String strB = sc.next();
		String[] bArray = strB.split("");
		
		
		int firstLine = intA * Integer.parseInt(bArray[2]);
		
		System.out.println(firstLine);
		
		int secondLine = intA * Integer.parseInt(bArray[1]);
		System.out.println(secondLine);
		
		int thirdLine = intA * Integer.parseInt(bArray[0]);
		System.out.println(thirdLine);
		
		int tot = firstLine + (secondLine*10) + (thirdLine*100);
		System.out.println(tot);
		
		
		
		*/
	}

}
