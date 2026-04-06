/**
 *  Java program to implement interfaces.
 */

package com.myinterface;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] str) {

        // Creating an instance of the class.
        GasVehicle gv = new GasVehicle();

        // Setting variable instances.
        gv.milesCounter = 100;
        gv.fuelConsumed = 20;

        //Printing the efficiency of gv.
        System.out.println("The efficiency of gas vehicle is: " + gv.getMilleage());
        // Output: The efficiency of gas vehicle is: 5.0 miles per gallon.


        // Creating an object of ElectricVehicle.
        ElectricVehicle ev = new ElectricVehicle();
        ev.powerConsumed = 15;
        ev.milesCounter = 100;

        // Printing the efficiency of ev.
        System.out.println("The efficiency of electric vehicle is:" + ev.getMilleage());

        // Creating HybridVehicle object.
        HybridVehicle hv = new HybridVehicle();
        hv.milesCounter = 100;
        hv.powerConsumed = 10;
        hv.fuelConsumed = 10;

        // Printing the efficiency of hv.
        System.out.println("The efficiency of hybrid vehicle is:" + hv.getMilleage());
    }
}

/**
 *  Interface FuelEfficiency.
 */
interface FuelEfficiency {

    int testInterface = 10;
    public float getMilleage();

}

/**
 *  Interface HybridEfficiency.
 */
interface HybridEfficiency extends FuelEfficiency {

    float getFuelEfficiency();
    float getChargeEfficiency();

}

/**
 *  GasVehicle class.
 */
class GasVehicle implements FuelEfficiency {

    // Fields of the class.
    float milesCounter;
    float fuelConsumed;


    // Method getMilleage to count miles.
    @Override
    public float getMilleage() {

        // Return statement.
        return milesCounter / fuelConsumed;

    }
}

/**
 * ElectricVehicle class.
 */
class ElectricVehicle implements FuelEfficiency {

    // Fields of the class.
    float milesCounter;
    float powerConsumed;

    // Method getMilleage to count miles.
    @Override
    public float getMilleage() {

        // Return statement.
        return milesCounter / powerConsumed;

    }
}

/**
 *  HybridVehicle class.
 */
class HybridVehicle implements HybridEfficiency {

    // Fields of the class.
    float milesCounter;
    float fuelConsumed;
    float powerConsumed;


    @Override
    public float getFuelEfficiency() {
        return  milesCounter / fuelConsumed;
    }

    @Override
    public float getChargeEfficiency() {
        return milesCounter / powerConsumed;
    }

    @Override
    public float getMilleage() {
        return getFuelEfficiency() / 2f + getChargeEfficiency() / 2f;
    }
}