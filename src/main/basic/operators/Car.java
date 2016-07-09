package main.basic.operators;

/**
 * Class to see how instanceof operator is working with subclasses
 * 
 * @author Roba
 *
 */
public class Car extends Vehicle {

    public static void main(String[] args) {
	// Vehicle a = new Car();
	Vehicle a = new Car();
	boolean result = a instanceof Car;
	System.out.println(result);

    }
}
