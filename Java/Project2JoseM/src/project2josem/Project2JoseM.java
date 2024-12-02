/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project2josem;

import java.util.Scanner;

/**
 * Project 02 
 * Software Sales calculator using if statements
 * @author Jose Moreno
 */
public class Project2JoseM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variables
        double quantity;
        final double PACKAGE_PRICE = 95;
        double discount = 0;
        double cost;
        double discountPrice;
        double costDiscount;

        //scanner
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the number of package purchased: ");
        quantity = keyboard.nextDouble();
        
        cost = quantity * PACKAGE_PRICE;

        //if statements
        if (quantity <= 9) 
        {
            discount = 0;
        } 
        
        else if (quantity >= 10 && quantity <= 19) 
        {
            discount = .22;
        } 
        
        else if (quantity >= 20 && quantity <= 49) 
        {
            discount = .32;
        } 
        
        else if (quantity >= 50 && quantity <= 99) 
        {
            discount = .42;
        } 
        
        else if (quantity >= 100) 
        {
            discount = .52;
        }
        discountPrice = cost * discount;
        costDiscount = cost - discountPrice;
        System.out.printf("Discount: $%,.2f\n", discountPrice);
        System.out.printf("cost: $%,.2f\n", costDiscount);

    }

}

