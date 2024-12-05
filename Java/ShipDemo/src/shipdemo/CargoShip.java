/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shipdemo;

/**
 *
 * @author josemoreno
 */
public class CargoShip extends Ship {
    
    private int capcaity;
    
    /**
     * Initializes values
     * @param shipName from super
     * @param yearBuilt from super
     * @param capacity initializes new value specific to cargo
     */
    public CargoShip(String shipName, String yearBuilt, int capacity) 
    {
        super(shipName, yearBuilt);
        this.capcaity = capacity;
    }

    public int getCapcaity() {
        return capcaity;
    }

    public void setCapcaity(int capcaity) {
        this.capcaity = capcaity;
    }

    @Override
    public String toString() {
        return "Name of Cargo: " + shipName + "\nCargo Capacity: " + capcaity + 
                " tons";
    }
    
}
