package Test1;

import java.util.Scanner;

public class Random {
    public static void  main(String[] args) {

        Scanner input = new Scanner(System.in);//input 5 numbers

        int user[] = new int [5];

        for (int i = 0; i < user.length; i++) {
             user[i] = input.nextInt();
        }


        int system[] = new int [5]; //generate 5 random numbers

        for (int i = 0; i < system.length; i++) {
            system[i] = (int)(Math.random()*100);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(system[i]);
        }

        int eq;

        eq = 0;

        for (int i = 0; i < 5 ; i++) { //compare elements of the arrays
            int a = user[i];
            int b = system[i];

            if (a == b)
            {
                eq += 1;
            }
            else {
                eq += 0;
            }
        }


        System.out.println(eq + " numbers matched.");

        switch(eq){
            case 5:
                System.out.println("Congratulations! You hit the jackpot!");
                break;
            case 4:
                System.out.println("Excellent! Second prize!");
                break;
            case 3:
                System.out.println("Good job! Third prize!");
                break;
            case 2:
            case 1:
            case 0:
                System.out.println("At least you tried.");
        }

    }
}

