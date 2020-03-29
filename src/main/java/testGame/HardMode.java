package testGame;

import java.util.Random;
import java.util.Scanner;

public class HardMode {

	Scanner scan = new Scanner(System.in);
	Random random = new Random();

	public void getHardMode() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		char operator = '?';

		for (int i = 0; i < 5; i++) {

			switch (random.nextInt(4)) {
			case 0:
				operator = '+';
				plusMehod();
				continue;
			case 1:
				operator = '-';
				minusMehod();
				continue;
			case 2:
				operator = '*';
				mulMehod();
				continue;
			case 3:
				operator = '/';
				divMehod();
				continue;
			default:
				operator = '?';
			}
		}

	}

	public void plusMehod() {

		Integer num1 = random.nextInt(100);
		Integer num2 = random.nextInt(100);

		System.out.println(num1 + "+" + num2 + " = ?");

		int ans = scan.nextInt();

		if (num1 + num2 == ans) {
			System.out.println("Your answer is correct");
			System.out.println("\n");
		} else {
			System.out.println("you are wrong");
			System.out.println("\n");
		}
	}

	public void minusMehod() {

		Integer num1 = random.nextInt(10);
		Integer num2 = random.nextInt(10);

		System.out.println(num1 + "-" + num2 + " = ?");

		int ans = scan.nextInt();

		if (num1 - num2 == ans) {
			System.out.println("Your answer is correct");
			System.out.println("\n");
		} else {
			System.out.println("you are wrong");
			System.out.println("\n");
		}
	}

	public void divMehod() {

		Integer num1 = random.nextInt(10);
		Integer num2 = random.nextInt(10);

		System.out.println(num1 + "/" + num2 + " = ?");

		int ans = scan.nextInt();

		if (num1 / num2 == ans) {
			System.out.println("Your answer is correct");
			System.out.println("\n");
		} else {
			System.out.println("you are wrong");
			System.out.println("\n");
		}
	}

	public void mulMehod() {

		Integer num1 = random.nextInt(10);
		Integer num2 = random.nextInt(10);

		System.out.println(num1 + "*" + num2 + " = ?");

		int ans = scan.nextInt();

		if (num1 * num2 == ans) {
			System.out.println("Your answer is correct");
			System.out.println("\n");
		} else {
			System.out.println("you are wrong");
			System.out.println("\n");
		}
	}
}
