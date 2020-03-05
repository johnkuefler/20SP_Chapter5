
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
public class RetailCalculator {
   
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        double wholesaleCost = keyboard.nextDouble();
        double markupPercent = keyboard.nextDouble();
        
        double finalCost = calculateRetail(wholesaleCost, markupPercent);
        
    }
    
    public static double calculateRetail(
            double wholesaleCost, 
            double markupPercent) {
        
        // multiply wholesale * (1 + markup percent)
        
        double retailCost = wholesaleCost*(1+markupPercent);
        
        return retailCost;
    }
}
