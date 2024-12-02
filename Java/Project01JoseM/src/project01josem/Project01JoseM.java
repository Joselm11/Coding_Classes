/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project01josem;
import java.util.Scanner;
/** Project 1
 * Using
 * @author josemoreno
 */
public class Project01JoseM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        String name;
        int cookies;
        int serving;
        int calories;
        int cookiesEaten;
        double cookiesPerServing;
        double servingsEaten;
        double totalCal;
        
        //take inputs
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Which cookies did you eat? ");
        name = keyboard.nextLine();
        
        System.out.print("How many cookies are there in a bag? ");
        cookies = keyboard.nextInt();
        
        System.out.print("How many servings are there in a bag? ");
        serving = keyboard.nextInt();
        
        System.out.print("How many calories are in a serving? ");
        calories = keyboard.nextInt();
        
        System.out.print("\nHow many cookies did you eat? ");
        cookiesEaten = keyboard.nextInt();
       
        //create operators once inputs are gathered
        cookiesPerServing = cookies / serving;
        servingsEaten = cookiesEaten / cookiesPerServing;
        totalCal = servingsEaten * calories;
        
        System.out.println("\n" +cookiesEaten + " " + name + " cookies is " 
                + totalCal );
        
    }
    
}
