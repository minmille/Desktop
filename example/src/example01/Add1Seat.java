package example01;

import java.util.Scanner;

public class Add1Seat {

	// 숫자의 각각의 자리를 더한 값을 나타내기
	// 756 이면 18이 나오도록

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >> ");
		int inputNum = scanner.nextInt();

		int rem = 0;
		int sum = 0;

		while (inputNum >= 0) {
			rem = inputNum % 10;
			inputNum = inputNum / 10;
			sum += rem;
			if (inputNum == 0) {
				break;
			}
		}
		System.out.println("숫의 각각의 숫자 값을 더한 값은 : " + sum);
		scanner.close();
	}
}
