package java_ex100;

import java.util.Scanner;

public class ex100_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan. nextInt();
		int y = scan. nextInt();
		int z = scan. nextInt();
		
		int sum=x+y+z;
		float av=sum/3;

		System.out.print(sum+"\n");
		System.out.printf("%.1f", av);

	}
}
