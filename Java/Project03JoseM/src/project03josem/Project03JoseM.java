/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project03josem;
import java.util.Scanner;
/** Project03
 * 
 * @author josemoreno
 */
public class Project03JoseM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Payroll payroll = new Payroll();
        Scanner scanner = new Scanner(System.in);
        
        //Loop for each part of the array
        for(int i = 0; i < 5; i++)
        {
            int eId = payroll.getEmployeeIdAt(i);
            
            //setting value to avoid using while true
            int inputHours=-1;
            
            while (inputHours < 0) 
            {
                System.out.print("Please enter the hours worked by"+
                        " employee number " + eId + ": ");
                inputHours = scanner.nextInt();
                if (inputHours < 0)
                {
                    System.out.println("enter 0 or greater for hours: ");
                    
                }
            }
            //setting hours for employee
            payroll.setHoursAt(i, inputHours);
            
            double inputPay = 0.0;
            
            while (inputPay < 5.00)
            {
                System.out.print("Please enter the hourly pay rate for "+
                        "employee number " + eId + ": ");
                inputPay = scanner.nextDouble();
                
                if(inputPay < 5.00) 
                {
                    System.out.print("Please enter 5.00 or greater" +
                            " for payrate: ");
                    inputPay = scanner.nextDouble();
                }
            }
            //setting pay for employee
            payroll.setPayRateAt(i,inputPay);
        }
        
        System.out.println(" ");
        
        payroll.calculateWages();
        
        payroll.display();
        
        
    }
    
}
