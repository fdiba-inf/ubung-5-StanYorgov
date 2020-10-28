package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        int[] uniqueNumbers = new int[numbers.length];
        int uniqueNumbersTemp;

        for (int index = 0; index < numbers.length - 1; index++) {
            for (int k = index + 1; k < numbers.length; k++) {
                if (numbers[index] == numbers[k]) {
                    numbers[k] = 0;
                }
            }
        }

        for (int index = 0; index < numbers.length; index++) {
            for (int j = index + 1; j < numbers.length; j++) {
                if (numbers[index] == 0) {
                    uniqueNumbersTemp = numbers[j];
                    numbers[index] = uniqueNumbersTemp;
                    numbers[j] = 0;
                }
            }

            uniqueNumbers[index] = numbers[index];
        }

        String uniqueNumbersAsString = Arrays.toString(uniqueNumbers);
        System.out.println("Unique numbers: " + uniqueNumbersAsString);
    }
}
