package cake_app;

import java.util.Scanner;

public class MyValidation
{
    // determine if the user wants to continue?
    // only accept Y/y or N/n from the user

    public static boolean getContinue()
    {
        String choice;
        boolean ok = true;
        boolean result = true;

        while (ok)
        {
            System.out.print("Continue? (y/n): ");
            Scanner sc = new Scanner(System.in);

            choice = sc.nextLine(); // NOTE nextLine()

            if (choice.equalsIgnoreCase("y"))
            {
                ok = false;
                result = true;
            }
            else if (choice.equalsIgnoreCase("n"))
            {
                ok = false;
                result = false;
            }
            else
            {
                System.out.println("\nError! Please enter Y or N.");
            }
        }
        return result;
    }

    public static double getDouble(Scanner sc, String prompt)
    {
        //Intialize double value that will be returned
        double numberValue = 0.0;

        //Create boolean variable to test for true/false user input
        boolean isValid = false;

        //While loop to control and return user input
        while (isValid == false)
        {
            //Print out prompt message
            System.out.println(prompt);

            //Use if else loop to test for valid input. use has next double
            //object which will automatically test variable

            if (sc.hasNextDouble())
            {
                numberValue = sc.nextDouble();

                //make isValid true which exits the loop
                isValid = true;
            }
            else
            {
                //Print out error message for invalid input
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            //use the sc.nextline object to discard any other data entered on 
            //the line
            sc.nextLine();
        }
        //return number value
        return numberValue;
    }

    /*
     * Get double within range method checks to see if the user enters a double
     * and also checks to see if the double is within the given range given by
     * the user
     */
    public static double getDoubleWithinRange(Scanner sc, String prompt,
            double min, double max)
    {
        //Create variable that will return the users input if it is true
        double numberValue = 0.0;

        //Use boolean to control while loop
        boolean isValid = false;

        //While loop
        while (isValid)
        {
            numberValue = getDouble(sc, prompt);

            //use if else loop to check for the number value to see if its in 
            //correct range
            if (numberValue <= min)
            {
                System.out.println("Error! Number must be greate than " + min + ".");

            }
            else if (numberValue >= max)
            {
                System.out.println("Error! Number must be less than " + max + ".");
            }
            else
            {
                isValid = true;
            }
        }
        return numberValue;

    }
    //Get int method checks to see if user entered correct value
    //If user enters the correct value program will continue flow
    //If not, user will be promt to re-enter correct value

    public static int getInt(Scanner sc, String prompt)
    {
        //Intialize double value that will be returned
        int numberValue = 0;

        //Create boolean variable to test for true/false user input
        boolean isValid = false;

        //While loop to control and return user input
        while (isValid == false)
        {
            //Print out prompt message
            System.out.println(prompt);

            //Use if else loop to test for valid input. use has next double
            //object which will automatically test variable

            if (sc.hasNextDouble())
            {
                numberValue = sc.nextInt();

                //make isValid true which exits the loop
                isValid = true;
            }
            else
            {
                //Print out error message for invalid input
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            //use the sc.nextline object to discard any other data entered on 
            //the line
            sc.nextLine();
        }
        //return number value
        return numberValue;
    }
    /*
     * Get int within range method checks to see if the user enters a int value
     * and also checks to see if the double is within the given range given by
     * the user
     */

    public static int getIntWithinRange(Scanner sc, String prompt,
            int min, int max)
    {
        //Create variable that will return the users input if it is true
        int numberValue = 0;

        //Use boolean to control while loop
        boolean isValid = false;

        //While loop
        while (isValid == false)
        {
            numberValue = getInt(sc, prompt);

            //use if else loop to check for the number value to see if its in 
            //correct range
            if (numberValue <= min)
            {
                System.out.println("Error! Number must be greate than " + min + ".");

            }
            else if (numberValue >= max)
            {
                System.out.println("Error! Number must be less than " + max + ".");
            }
            else
            {
                isValid = true;
            }
        }
        return numberValue;
    }

    //The get string method checks to see if the user enter a string
    //input that will process the classes methods
    public static String getString(Scanner sc, String prompt)
    {
        System.out.println(prompt);
        String s = sc.next();
        sc.nextLine();
        return s;           
    }
    
}
