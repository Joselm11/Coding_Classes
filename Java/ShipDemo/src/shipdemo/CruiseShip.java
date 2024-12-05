/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shipdemo;

/**
 *
 * @author josemoreno
 */
public class CruiseShip extends Ship {
    private int numPassengers;
    
    /**
     * Initializes values
     * @param shipName taken from super
     * @param yearBuilt taken from super
     * @param numPassengers new private value for cruise
     */
    public CruiseShip(String shipName, String yearBuilt, int numPassengers) 
    {
        super(shipName, yearBuilt);
        this.numPassengers = numPassengers;
    }

    public int getNumPassengers() 
    {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) 
    {
        this.numPassengers = numPassengers;
    }

    @Override
    public String toString() 
    {
        return "Name of Cruise: " + shipName +  "\nMaximum Passengers: " +
                numPassengers;
    }
    
}
