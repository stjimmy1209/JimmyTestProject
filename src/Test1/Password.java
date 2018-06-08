package Test1;

import java.util.Scanner;

public class Password {
    public static void main(String[] args)

    {
        Scanner input = new Scanner(System.in);
        String password = null;

        int i = 0;
        while(i < 3){

            System.out.print("Please enter the password:");
            password = input.next();
        i++;
            if (!"19891209".equals(password))
        {
            if (i == 3)
            {
                System.out.print("too much wrong attempts");
                System.exit(0);
            }
        }
        else
            {
                i = Integer.MAX_VALUE;
                System.out.print("welcome!");
            }

    }
    }
}
