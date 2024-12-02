/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project03josem;

/**
 *
 * @author josemoreno
 */
public class Payroll {
    // Attributes (Private)
    private static final int NUM_EMPLOYEES = 5;
    private int[] employeeId = new int[NUM_EMPLOYEES];
    private int[] hours = new int[NUM_EMPLOYEES];
    private double[] payRate = new double[NUM_EMPLOYEES];
    private double[] wages = new double[NUM_EMPLOYEES];

    
    /**
     * setting values for array
     */
    public Payroll() {
        employeeId[0] = 5258845;
        employeeId[1] = 5420125;
        employeeId[2] = 8795122;
        employeeId[3] = 7877541;
        employeeId[4] = 5780489;
    }

    /**
     * 
     * @param index using index of array
     * @return data from array
     */
    public int getEmployeeIdAt(int index) {
        return employeeId[index];
    }
    
    /**
     * 
     * @param index using index of array
     * @return data from array
     */

    public int getHoursAt(int index) {
        return hours[index];
    }

    /**
     * 
     * @param index index of array
     * @return data from index
     */
    public double getPayRateAt(int index) {
        return payRate[index];
    }

    /**
     * 
     * @param index of array
     * @return data from index
     */
    public double getWagesAt(int index) {
        return wages[index];
    }

    /**
     * 
     * @param index index of array
     * @param empId setting eID at index of array
     */
    public void setEmployeeIdAt(int index, int empId) {
        employeeId[index] = empId;
    }

    /**
     * 
     * @param index of array
     * @param hoursWorked being set to index of array
     */
    public void setHoursAt(int index, int hoursWorked) {
        if (hoursWorked >= 0) {
            hours[index] = hoursWorked;
        }
    }

    /**
     * 
     * @param index of array
     * @param rate being set to index of array
     */
    public void setPayRateAt(int index, double rate) {
        if (rate >= 5.00) {
            payRate[index] = rate;
        }
    }

    /**
     * 
     * @param index of array
     * @param wage being set to array
     */
    
    public void setWagesAt(int index, double wage) {
        wages[index] = wage;
    }

    /**
     * Calculating wages
     */
    
    public void calculateWages() {
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            wages[i] = hours[i] * payRate[i];
        }
    }

    /**
     * 
     * @param empId array
     * @return wages at the index of employee array
     */
    public double getGrossPay(int empId) {
        int index = getEmployeeIndex(empId);
            return wages[index];
    }

    /**
     * 
     * @param empId array
     * @return checking index of array
     */
    private int getEmployeeIndex(int empId) {
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            if (employeeId[i] == empId) {
                return i;
            }
        }
        return -1; 
    }

    /**
     * Displays information for employees
     */
    public void display() {
        System.out.println("EMPLOYEE PAYROLL DATA:");
        System.out.println("..........................................");
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.printf("Employee ID: %d%n", employeeId[i]);
            System.out.printf("Gross Pay: $%.2f%n", wages[i]);
        }
    }
}

