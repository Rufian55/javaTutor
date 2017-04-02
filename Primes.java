package tutor;

import java.io.*;
import java.util.Scanner;

public class Primes {
	public static void main(String args[]) throws IOException {
		System.out.print("Enter an integer to print the prime numbers between 2 and your entry: ");
		Scanner in = new Scanner(System.in);
		int userNum;

		do {
			if(in.hasNextInt()) {
				userNum = in.nextInt();
				break;
			} else {
				System.out.println("An integer is the only acceptable input!");
				in.next();
			}
		} while (true);

		in.close();		

		if(userNum > 1000 || userNum < 2) {
			System.out.println("Range is from 2 to 1,000 inclusive.");
			System.exit(0);
		}
		else if (userNum == 2)
			System.out.print("2");
		else if (userNum <= 4)
			System.out.print("2\t3");
		else if (userNum <= 6)
			System.out.print("2\t3\t5");
		else {
			System.out.print("2\t3\t5\t7\t");
			int count = 3;
			for(int i = 2; i <= userNum; i++) {
				if( (i%2 != 0) && (i%3 != 0) && (i%5 != 0) && (i%7 != 0) ) {
					count++;
					if((count % 10) == 0)
						System.out.println();
					System.out.print(i + "\t");
				}
			}
		}
	}
}
