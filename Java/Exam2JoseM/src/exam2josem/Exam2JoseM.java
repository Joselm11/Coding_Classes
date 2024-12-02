/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam2josem;
import java.util.Scanner;
/**
 *
 * @author G00245513
 */
public class Exam2JoseM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;
        char choice;
        int numOfMin=0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter Customers Mobile package (A,B,C) : ");
        input = keyboard.nextLine();
        choice = input.charAt(0);
        
        MobileCharges plan = new MobileCharges(choice,numOfMin);
        
        switch (choice)
      {
         case 'A':
            plan.setCustomerPackage('A');
           
            break;
         case 'a':
            plan.setCustomerPackage('A');
            
            break;
         case 'B':
            plan.setCustomerPackage('B');
            
            break;
          case 'b':
            plan.setCustomerPackage('B');
            
            break;
         case 'C':
             plan.setCustomerPackage('C');
            
            break;
         case 'c':
            plan.setCustomerPackage('C');
            
            break;
         default:
            System.out.println("That's not A, B, or C!");
      }
        System.out.print("Enter Enter the number of minutes the cusomter used: ");
        numOfMin = keyboard.nextInt();
        while(numOfMin < 0){
            System.out.println("\nMinutes used must be greater than or equal to 0");
            System.out.print("Enter Enter the number of minutes the cusomter used: ");
            numOfMin = keyboard.nextInt();
        }
        plan.setNumberOfMinutesUsed(numOfMin);
        
        plan.totalCharges();
        System.out.println(plan);
        
    }
    
}
