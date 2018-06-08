package Test1;//if the amount is above 50000, a Test1.discount of 30% would be given.
//else, a Test1.discount of 10% would be given.

import java.util.Scanner;

public class discount {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double price;
        int quantity;
        double totalPrice;

        System.out.print("Please enter the price of the first item:");
        price = input.nextDouble();
        System.out.print("Please enter the quantity of the first item:");
        quantity = input.nextInt();
        totalPrice = price * quantity;

        System.out.print("Please enter the price of the second item:");
        price = input.nextDouble();
        System.out.print("Please enter the quantity of the second item:");
        quantity = input.nextInt();
        totalPrice += price * quantity;

        System.out.print("Please enter the price of the third item:");
        price = input.nextDouble();
        System.out.print("Please enter the quantity of the third item:");
        quantity = input.nextInt();
        totalPrice += price * quantity;

        if (totalPrice > 50000)
        {
            totalPrice *= 0.7;
        }
        else
        {
            totalPrice *= 0.9;
        }

        System.out.printf("The final price is %.2f.", totalPrice);

    }

}
