package gitPractice;

import java.util.Scanner;

public class gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0;
		System.out.print("출력할 단:");
		n = sc.nextInt();

		if (n == 0) {
			for (int i = 1; i < 10; i++) {
				for (int j = 2; j < 10; j++) {
					System.out.printf("%d X %d = %d\t", j, i, j * i);
				}
				System.out.println("");
			}
		} else {
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d x %d = %d\n", n, i, n * i);
			}
		}
	}
}
