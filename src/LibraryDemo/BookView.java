package LibraryDemo;

import java.lang.invoke.SwitchPoint;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BookView {

    private Scanner input = null;
    private BookBiz bookbiz = null;

    public BookView() {
        input = new Scanner(System.in);
        bookbiz = new BookBiz();

        System.out.println("*******************");
        System.out.println("Welcome to the system.");
        System.out.println("*******************");
        System.out.println("1.Login");
        System.out.println("2.Quit");

        System.out.println("Please select:");

        String option = input.next();
        if (option.equals("1")) {

            //login to the system, if the user has been authenticated, display the main menu

        } else {
            System.out.println("System has been terminated. Bye!");
        }
    }
        public void showMainMenu(){

            System.out.println("\nSystem -----> Main Menu");
            System.out.println("1. Add Books\t2. Delete Books\t3. Check Books\t 4. Search by Book ID" +
                    "\t5.Add Count\t6. Sub Count\t7. Quit");
            System.out.print("Please select:");
            String option = input.next();
            switch(option) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "":

                    break;
                case "7":

                    break;
            }

        }

    }


