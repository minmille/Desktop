package example01;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		/*
		 * 피라미드 Line = i, space = j , * = k
		 * i j k = i * 2 - 1 
		 * 1 3 1 
		 * 2 2 3 
		 * 3 1 5 
		 * 4 0 7
		 * 의 역순 = ((wantLines - i) * 2) + 1
		 * i j k
		 * 3 0 5
		 * 2 1 3
		 * 3 2 1
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("홀수로 입력해 주세요!!!");
		System.out.print("다이아몬드 몇줄? >> : ");
		int wantLines = sc.nextInt();
		int i = 0;
		int j = 0;
		int k = 0;
		int cal = 0;

		for (i = 1; i <= wantLines; i++) {
			for (j = wantLines - i; j >= 1; j--) {
				System.out.print(" ");
			}
			cal = i * 2 - 1; // 별의 갯수가 1,3,5,7,9 순서대로 되기 위한 식
			for (k = 1; k <= cal; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//
		for (i = 1; i <= wantLines; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			cal = ((wantLines - i) * 2) - 1; // 별의 갯수가 7,5,3,1 순대로 되기 위한 식(9는 제외)
			for (k = cal; k >= 1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
