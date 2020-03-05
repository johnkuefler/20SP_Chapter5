
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
public class DrywallEstimator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter length and width of wall");
        
        double height = keyboard.nextDouble();
        double width = keyboard.nextDouble();
        
        double sqFootage = calculateSquareFootage(height, width);
        
        double costPerSqFoot = getCostPerSquareFoot();
        
        double totalCost = getTotalCost(sqFootage, costPerSqFoot);
        
        System.out.println(totalCost);
    }

    // step 1: calculate square footage from dimensions
    // get the width of the wall
    // get the height of the wall
    // multiply width * height to get sq footage
    public static double calculateSquareFootage(double height, double width) {
        double sqFootage = height * width;
        return sqFootage;
    }
    
    
    
    // step 2: get cost per square foot
    // 16 / 48 to get square feet cost
    public static double getCostPerSquareFoot() {
        return 16.0 / 48.0;
    }
    
    
    
    // step 3: calculate total cost with sales tax
    // we'll assume sales tax is 0.095
    // multiply cost of drywall per sq foot * sq footage
    // multiply that by 1+sales tax
    public static double getTotalCost(double sqFootage, double drywallCostPerSqFoot) {
        double cost = (sqFootage * drywallCostPerSqFoot) * (1+0.095);
        
        return cost;
    }
}
