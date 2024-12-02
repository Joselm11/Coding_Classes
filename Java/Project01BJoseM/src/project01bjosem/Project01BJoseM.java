/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project01bjosem;

import java.util.Scanner;

/**
 *
 * @author josemoreno
 */
public class Project01BJoseM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // constants and variables
    final int COOKIES_PER_RECIPE = 24;
    final double SUGAR = 0.75;
    final double BUTTER = 0.50;
    final double FLOUR = 1.3752;
    int cookiesNeeded;
    double adjustedSugar, adjustedButter, adjustedFlour, batchMade;
    
    Scanner keyboard = new Scanner(System.in);
    
    //keyboard input
    System.out.print("How many cookies do you need? ");
    cookiesNeeded = keyboard.nextInt();
    
    //operations are incorrect
    batchMade = (double)cookiesNeeded / COOKIES_PER_RECIPE;
    adjustedSugar = SUGAR * batchMade;
    adjustedButter = BUTTER * batchMade;
    adjustedFlour = FLOUR * batchMade;
    
    //display
    System.out.println("To make " + cookiesNeeded + " cookies using this recipe"
            + " you will need: ");
    System.out.print("Sugar\t");
    System.out.printf("%.2f",adjustedSugar);
    System.out.println(" Cups");
    System.out.print("Butter\t");
    System.out.printf("%.2f",adjustedButter);
    System.out.println(" Cups");
    System.out.print("Flour\t");
    System.out.printf("%.2f",adjustedFlour);
    System.out.println(" Cups");
    
   
}
    
}
