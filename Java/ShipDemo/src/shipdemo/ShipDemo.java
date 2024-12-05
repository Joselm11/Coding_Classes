/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shipdemo;

/**Project 04
 * Ships using inheritance
 * @author josemoreno
 */
public class ShipDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ship Array
        Ship [] ships = new Ship [3];
        
        //Values for array
        ships [0] = new Ship("Long Weekend","1978");
        ships [1] = new CruiseShip ("Princess Magical","2007", 2700);
        ships [2] = new CargoShip ("Air City","1993", 55000);
        
        /**For loop to print tostring
         * is there some other for loop we can use?
         * EX: for ships in Ship
        */
        for(int i = 0;i<ships.length; i++)
        {
            System.out.println(ships[i]);
            System.out.println("--------------------------");
        }
    }
    
}
