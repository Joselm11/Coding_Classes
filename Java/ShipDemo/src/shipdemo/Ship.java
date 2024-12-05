/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shipdemo;

/**
 *
 * @author josemoreno
 */
public class Ship {
    String shipName;
    String yearBuilt;

    
    /**
     * Initializes the ship
     * @param shipName taking down name as string
     * @param yearBuilt year built as string
     */
    public Ship(String shipName, String yearBuilt) {
        this.shipName = shipName;
        this.yearBuilt = yearBuilt;
    }

    public String getShipName() {
        return shipName;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    @Override
    public String toString() {
        return "Name of Ship: " + shipName + "\nYear built: " + yearBuilt;
    }
    
    
}
