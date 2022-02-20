package codingTest;

import java.util.Scanner;

public class MirrorWordTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
		int n = sc.nextInt(); //몇개 단어 작성할건지
		
		String[] s = new String[n];
		for(int i=0;i<n;i++) {
			s[i] = sc.next();
			if(s[i].length()==1){
				if(s[i].charAt(0)=='a'||s[i].charAt(0)=='c'||s[i].charAt(0)=='e'||s[i].charAt(0)=='f'||
					s[i].charAt(0)=='g'||s[i].charAt(0)=='h'||s[i].charAt(0)=='j'||s[i].charAt(0)=='k'||
					s[i].charAt(0)=='r'||s[i].charAt(0)=='t'||s[i].charAt(0)=='y'){
					System.out.println("Normal");
				}else System.out.println("Mirror");
				continue;
			}
			String tmp="";
			for(int j=s[i].length()-1;j>=0;j--) {
				if(s[i].charAt(j)=='b')tmp+='d';
				else if(s[i].charAt(j)=='p')tmp+='q';
				else if(s[i].charAt(j)=='s')tmp+='z';
				else if(s[i].charAt(j)=='d')tmp+='b';
				else if(s[i].charAt(j)=='z')tmp+='s';
				else if(s[i].charAt(j)=='q')tmp+='p';
				else tmp+=s[i].charAt(j);
			}
			
			if(s[i].equals(tmp)) System.out.println("Mirror");
			else System.out.println("Normal");

		}

	}
}
