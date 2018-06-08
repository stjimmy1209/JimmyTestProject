package Test1;

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        ArraySort test = new ArraySort();

        int[] numbers = test.getNumbers();

        test.printNumbers(numbers);
    }

    public int[] getNumbers() {
        Scanner input = new Scanner(System.in);// input 5 numbers

        int user[] = new int[5];
        int index = 0;

        while (index < 5 && input.hasNext()) {
            user[index] = input.nextInt();

            index++;
        }

        input.close();

        return user;
    }

    public void printNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " : " + numbers[i]);
        }
    }
}