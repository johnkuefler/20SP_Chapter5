
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johnk
 */
public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();

        if (isHighNumber(number)) {
            System.out.println("That was a big number");
        } else {
            System.out.println("That was a small number");
        }

        double output = calculateSalesTax(10.50);
        System.out.println(output);

        displayIntegerValue(10);
        displayIntegerValue(5);
        int number2 = 50;
        displayIntegerValue(number2);

        displayMessage();
        displayMessage();
        displayMessage();
        displayMessage();
        displayMessage();

        displayCustomMessage("Hello world");

    }

    /**
     *
     * @param amount the amount to calculate sales tax against
     * @return the sales tax for the amount
     */
    public static double calculateSalesTax(double amount) {
        final double TAX_RATE = 0.095;

        double salesTax = amount * TAX_RATE;

        return salesTax;
    }

    /**
     * This is a demonstration method for class
     */
    public static void displayMessage() {
        System.out.println("This is a message!!");
    }

    /**
     *
     * @param messageToDisplay this is the message that will be displayed
     */
    public static void displayCustomMessage(String messageToDisplay) {
        System.out.println(messageToDisplay);
    }

    /**
     *
     * @param numberToDisplay
     */
    public static void displayIntegerValue(int numberToDisplay) {
        System.out.println("The number is " + numberToDisplay);
    }

    /**
     * A high number is a number greater than 1000
     *
     * @param numberToCheck
     * @return
     */
    public static boolean isHighNumber(int numberToCheck) {
        if (numberToCheck > 1000) {
            return true;
        } else {
            return false;
        }
    }

}
