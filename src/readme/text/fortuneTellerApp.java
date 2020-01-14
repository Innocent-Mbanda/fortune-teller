package readme.text;

import javax.print.DocFlavor;
import java.awt.*;
import java.util.Scanner;

public class fortuneTellerApp {

    public static void main(String[] args) {
        // Ask for the first name?
        System.out.println("What is your first name?");
        Scanner input;
        input = new Scanner(System.in);
        String firstName = input.nextLine();
        System.out.println(firstName);

        // Ask for the last name?
        System.out.println("What is your last name?");
        String LastName = input.nextLine();
        System.out.println(LastName);

        // Ask for the age?
        System.out.println("What is your age?");
        int age = input.nextInt();
        System.out.println(age);
        // ask for the birth month?
        System.out.println("What is your birth month?");
        int birthmonth = input.nextInt();
        System.out.println(birthmonth);

        //ask for favourite color
        input.nextLine();

        System.out.println("What is your favourite color? (Give me a ROYBGIV color or ask for help?)");
        String favouritecolor = input.nextLine();
        System.out.println(favouritecolor);

        if (favouritecolor.equalsIgnoreCase("HELP")) ;
        System.out.println("use RED, YELLOW, GREEN, BLUE, INDIGO or VIOLET");
        System.out.println("what is your favourite color? Give me a ROYGBI color");
        favouritecolor = input.nextLine();
        System.out.println(favouritecolor);

        //number of siblings?
        System.out.println("how many siblings do you have? Give me the integer value");
        int numberofsiblings = input.nextInt();
        System.out.println(numberofsiblings);

        // PART2
        // Determine the years until the retirement.
        int numberOfYearsUntilRetirement = 0;
        if (age % 2 == 0) {
            numberOfYearsUntilRetirement = 24;
        } else {
            numberOfYearsUntilRetirement = 17;
        }
        System.out.println(numberOfYearsUntilRetirement);

        String vacationHomeLocation = "";
        if (numberofsiblings == 0) {
            vacationHomeLocation = "Boca Raton";
        } else if (numberofsiblings == 1) {
            vacationHomeLocation = "Nassu";
        } else if (numberofsiblings == 2) {
            vacationHomeLocation = "Ponta Negra";
        } else if (numberofsiblings == 3) {
            vacationHomeLocation = "Portland";
        } else if (numberofsiblings <= 3) {
            vacationHomeLocation = "Baton Rouge";
        }
        System.out.println(vacationHomeLocation);

        // Mode of transportation
        String modeOfTransportation = " ";

        switch (favouritecolor) {
            case "Red":
                modeOfTransportation = "Maserati";
                break;
            case "Orange":
                modeOfTransportation = "stallion";
                break;
            case "green":
                modeOfTransportation = "taxi";
                break;
            case "blue":
                modeOfTransportation = "Rickshaw";
                break;
            case "indigo":
                modeOfTransportation = "motor scooter";
                break;
            case "violet":
                modeOfTransportation = "flying saucer";
                break;
            default:
                System.out.println("Learn your colors");
        }

        System.out.println(modeOfTransportation);
        // Bank Balance part
        double userBankBalance = 0.0;
        if (birthmonth >= 1 && birthmonth <= 4) {
            userBankBalance = 256000.76;

        } else if (birthmonth >= 5 && birthmonth >= 8) {
            userBankBalance = 3687105.42;
        } else if (birthmonth >= 9 && birthmonth >= 12) {
            userBankBalance = 8623;
        } else {
            userBankBalance = 0.00;
        }

        System.out.println(userBankBalance);
    }
    }





























