package gitPractice;

import java.util.Scanner;

public class gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0;
		System.out.print("����� ��:");
		n = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", n, i, n * i);
		}
	}
}
