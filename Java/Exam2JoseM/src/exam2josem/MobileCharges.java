/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2josem;

/**
 *
 * @author G00245513
 */
public class MobileCharges {
    private char customerPackage;
    private int numberOfMinutesUsed;
    private double total;
    
    /**Constructor initializes char and int
     * 
     * @param customerPackage Initialized
     * @param numberOfMinutesUsed Initialized
     */
    public MobileCharges(char customerPackage, int numberOfMinutesUsed) {
        this.customerPackage = customerPackage;
        this.numberOfMinutesUsed = numberOfMinutesUsed;
        total = 0;
    }

    /**
     * get customer package
     * @return customer package data
     */
    public char getCustomerPackage() {
        return customerPackage;
    }

    /**
     * gets number of minutes used
     * @return data in number of minutes used
     */
    public int getNumberOfMinutesUsed() {
        return numberOfMinutesUsed;
    }

    /**
     * sets data to customer package
     * @param customerPackage data from main set
     */
    public void setCustomerPackage(char customerPackage) {
        this.customerPackage = customerPackage;
    }

    /**
     * Sets number of min used
     * @param numberOfMinutesUsed data is set from the main
     */
    public void setNumberOfMinutesUsed(int numberOfMinutesUsed) {
        this.numberOfMinutesUsed = numberOfMinutesUsed;
    }
    
    /**
     * calculates what the total charges for the month will be
     * @return Total which holds value
     */
    public double totalCharges()
    {
        double monthly = 0;
        int minutes = 0;
        switch (customerPackage)
      {
         case 'A':
            monthly = 39.99;
            minutes = 450;
            if(numberOfMinutesUsed > 450)
            {
                total = monthly + ((numberOfMinutesUsed - 450)*0.45);
            }
            else
            {
                total+=monthly;
            }
            break;
         case 'B':
            monthly = 59.99;
            minutes = 900;
            if(numberOfMinutesUsed > 900)
            {
                total = monthly + ((numberOfMinutesUsed - 900)*0.40);
            }
            break;
         case 'C':
            monthly = 69.99;
            total+=monthly;
            break;
         default:
            System.out.println("That's not A, B, or C!");
      }
        return total;
    }
    
    @Override
    /**
     * To string method that prints data from MobileCharges
     */
    public String toString()
    {
      // Create a string describing the stock.
      String str = "\nMobile package: " + customerPackage + 
              "\nMinutes used: " + numberOfMinutesUsed + 
              "\nTotal Charges: " + total;
      
      // Return the string.
      return str;
    }
    
    
}
