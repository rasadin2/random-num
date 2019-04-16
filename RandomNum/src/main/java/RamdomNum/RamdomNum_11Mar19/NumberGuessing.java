package RamdomNum.RamdomNum_11Mar19;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);

		for (int i = 1; i < 6; i++) {
			int n = rand.nextInt(5);
			n = n + 1;
			System.out.print("Enter Number: ");
			int num = input.nextInt();
			if (num < n) {
				System.out.println("Input is lesser than Random number. Random number is: " + n);
			} else if (num > n) {
				System.out.println("Input is Larger than Random number. Random number is: " + n);
			} else {
				System.out.println("You Win");
				break;
			}
			// System.out.println(n);
		}
		System.exit(0);

	}
}
