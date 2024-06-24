

import java.util.Scanner;

public class LargestNumberCount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int count = 0;

        System.out.print("Enter numbers (end with 0): ");

        while (input.nextInt() != 0) {
            int number = input.nextInt();

            if (number > max) {
                max = number;
                count = 1;
            } else if (number == max) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Largest number: " + max);
            System.out.println("Occurrence count: " + count);
        } else {
            System.out.println("No numbers entered.");
        }
    }
}

