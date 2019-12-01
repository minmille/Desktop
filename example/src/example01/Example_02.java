package example01;

import java.util.Scanner;

public class Example_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("몇줄 ? >> ");
		int wantLines = sc.nextInt();
		for (int i = 1; i <= wantLines; i++) {
			for (int j = 0; j <= wantLines - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
