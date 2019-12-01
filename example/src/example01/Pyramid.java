package example01;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		/*
		 * 피라미드 Line = i, space = j , * = k 
		 * i j k 
		 * 1 3 1 
		 * 2 2 3 
		 * 3 1 5 
		 * 4 0 7
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("피라미드 몇줄? >> : ");
		int wantLines = sc.nextInt();

		for (int i = 1; i <= wantLines ; i++) {
			
			for (int j = wantLines - i; j >= 1; j--) {
				System.out.print(" ");
			}
			int cal = i * 2 - 1;
			for (int k = 1; k <= cal ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}