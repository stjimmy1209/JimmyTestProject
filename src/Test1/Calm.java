package Test1;//Calculate the sum of every single digit of the number that is entered.


import java.util.Scanner;

public class Calm {

    public static void main(String[] args)

    {
        Scanner input = new Scanner(System.in); //get the number
        int num = input.nextInt();


        int i = 0; //define necessary loop variants
        int sum = 0;

        while(num > 0) //loop

        {
            sum += num % 10;
            num /= 10;
        }

        System.out.println(sum);

    }

}
