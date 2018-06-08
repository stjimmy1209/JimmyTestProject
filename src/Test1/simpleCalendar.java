package Test1;

import java.util.Scanner;

public class simpleCalendar {

    public static void main(String[] args)

    {
        Scanner input = new Scanner(System.in);
        //define year, month, noDays
        int year = -1, month = -1, noDays = -1;
        System.out.print("Please enter year:\t");
        year = input.nextInt();
        System.out.print("Please enter month:\t");
        month = input.nextInt();

        //output number of days based on the month

        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                noDays = 31;
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                {
                    noDays = 29;
                }
                else
                {
                    noDays = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                noDays = 30;
                break;
                default:
                    System.out.print("Only a number between 1 and 12 is valid!");
                    System.exit(0);
        }

        System.out.printf("The number of days is:\t%d", noDays);

        //if it is a leap year, number of days of Feb +1


    }

}
