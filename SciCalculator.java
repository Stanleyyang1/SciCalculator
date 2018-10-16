import java.util.Scanner;
//This code is created to create a simple calculator. The scanner is included to read user input
public class SciCalculator
{
    public static void main(String[] args)
    {

        //This statement is included to make the variables num1 and num2 known and add identity to numbers
        double num1;
        double num2;

        Scanner scnr = new Scanner(System.in);

        System.out.println("\nCurrent Result: 0.0");

        // Offers user a calculator menu to choose operations from
        System.out.print("\n");
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("0. Exit Program");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Logarithm");
        System.out.println("7. Display Average\n");


        /*The following 2 lines of code is a set up for option 7 of the menu. The sumResults/count of calc makes the
        average*/
        double sumResults = 0;
        int count = 0;

        //This is a set up for the loop. If the user inputs 0, the truthValue would be false, and it would break loop
        boolean truthValue = true;

        //This is the beginning of the loop
        while (truthValue)
        {

            // The "\n" for printing a new empty line was a method taught to me by my friend Brad
            int usrInpt;
            System.out.print("Enter Menu Selection: ");
            usrInpt = scnr.nextInt();
            switch (usrInpt)
            {

                case 0:
                    truthValue = false;
                    break;

                case 1:
                    //Prompts user for both first and second operand
                    System.out.print("Enter first operand: ");
                    num1 = scnr.nextDouble();

                    System.out.print("Enter second operand: ");
                    num2 = scnr.nextDouble();

                    System.out.println("\nCurrent Result: " + (num1 + num2));

                    //After every calculation,  the sumResults keeps track of the result of all calculations before
                    sumResults = sumResults + (num1 + num2);
                    count++;

                    // Offers user a calculator menu to choose operations from
                    System.out.print("\n");
                    System.out.println("Calculator Menu");
                    System.out.println("---------------");
                    System.out.println("0. Exit Program");
                    System.out.println("1. Addition");
                    System.out.println("2. Subtraction");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Division");
                    System.out.println("5. Exponentiation");
                    System.out.println("6. Logarithm");
                    System.out.println("7. Display Average\n");
                    break;

                case 2:
                    //Prompts user for both first and second operand
                    System.out.print("Enter first operand: ");
                    num1 = scnr.nextDouble();

                    System.out.print("Enter second operand: ");
                    num2 = scnr.nextDouble();
                    System.out.println("\nCurrent Result: " + (num1 - num2));
                    sumResults = sumResults + (num1 - num2);
                    count++;

                    // Offers user a calculator menu to choose operations from
                    System.out.print("\n");
                    System.out.println("Calculator Menu");
                    System.out.println("---------------");
                    System.out.println("0. Exit Program");
                    System.out.println("1. Addition");
                    System.out.println("2. Subtraction");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Division");
                    System.out.println("5. Exponentiation");
                    System.out.println("6. Logarithm");
                    System.out.println("7. Display Average\n");
                    break;

                case 3:
                    //Prompts user for both first and second operand
                    System.out.print("Enter first operand: ");
                    num1 = scnr.nextDouble();

                    System.out.print("Enter second operand: ");
                    num2 = scnr.nextDouble();
                    System.out.println("\nCurrent Result: " + (num1 * num2));
                    sumResults = sumResults + (num1 * num2);
                    count++;

                    // Offers user a calculator menu to choose operations from
                    System.out.print("\n");
                    System.out.println("Calculator Menu");
                    System.out.println("---------------");
                    System.out.println("0. Exit Program");
                    System.out.println("1. Addition");
                    System.out.println("2. Subtraction");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Division");
                    System.out.println("5. Exponentiation");
                    System.out.println("6. Logarithm");
                    System.out.println("7. Display Average\n");
                    break;

                case 4:
                    //Prompts user for both first and second operand
                    System.out.print("Enter first operand: ");
                    num1 = scnr.nextDouble();

                    System.out.print("Enter second operand: ");
                    num2 = scnr.nextDouble();
                    System.out.println("\nCurrent Result: " + (num1 / num2));
                    sumResults = sumResults + (num1 / num2);
                    count++;

                    // Offers user a calculator menu to choose operations from
                    System.out.print("\n");
                    System.out.println("Calculator Menu");
                    System.out.println("---------------");
                    System.out.println("0. Exit Program");
                    System.out.println("1. Addition");
                    System.out.println("2. Subtraction");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Division");
                    System.out.println("5. Exponentiation");
                    System.out.println("6. Logarithm");
                    System.out.println("7. Display Average\n");
                    break;

                case 5:
                    //Prompts user for both first and second operand
                    System.out.print("Enter first operand: ");
                    num1 = scnr.nextDouble();

                    System.out.print("Enter second operand: ");
                    num2 = scnr.nextDouble();
                    System.out.println("\nCurrent Result: " + Math.pow(num1, num2));
                    sumResults = sumResults + Math.pow(num1, num2);
                    count++;

                    // Offers user a calculator menu to choose operations from
                    System.out.print("\n");
                    System.out.println("Calculator Menu");
                    System.out.println("---------------");
                    System.out.println("0. Exit Program");
                    System.out.println("1. Addition");
                    System.out.println("2. Subtraction");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Division");
                    System.out.println("5. Exponentiation");
                    System.out.println("6. Logarithm");
                    System.out.println("7. Display Average\n");
                    break;

                case 6:
                    //Prompts user for both first and second operand
                    System.out.print("Enter first operand: ");
                    num1 = scnr.nextDouble();

                    System.out.print("Enter second operand: ");
                    num2 = scnr.nextDouble();
                    System.out.println("\nCurrent Result: " + Math.log(num2) / Math.log(num1));
                    sumResults = sumResults + Math.log(num2) / Math.log(num1);
                    count++;

                    // Offers user a calculator menu to choose operations from
                    System.out.print("\n");
                    System.out.println("Calculator Menu");
                    System.out.println("---------------");
                    System.out.println("0. Exit Program");
                    System.out.println("1. Addition");
                    System.out.println("2. Subtraction");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Division");
                    System.out.println("5. Exponentiation");
                    System.out.println("6. Logarithm");
                    System.out.println("7. Display Average\n");
                    break;

                case 7:
                    if (count == 0)
                    {
                        System.out.println("\nError: No calculations yet to average!");

                    } else
                    {
                        System.out.println("\nSum of calculations: " + sumResults);
                        System.out.println("Number of calculations: " + count);
                        System.out.println("Average of calculations: " + (sumResults / count));
                        System.out.print("\n");
                    }

                    break;
                default:
                    System.out.println("\nError: Invalid selection!");
                    //The switch function offers the user to choose from a list of 4. If it was isn't the option listed than an error will show

            }
        }
        //Exit Dialogue
        System.out.println("\nThanks for using this calculator. Goodbye!");
        System.out.print("Bring me the VIRGIN SACRIFICE ");
    }
    //Cthulhu shall rise again
    //AND HE WILL WANT BLOOD

}