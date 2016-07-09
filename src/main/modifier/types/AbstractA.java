package main.modifier.types;

/**
 * Simple abstract class to test abstract modifier
 * 
 * @author Roba
 *
 */
public abstract class AbstractA {

    private double price;

    private String model;

    private String year;

    // This method will HAVE implementation on its subclasses
    public abstract void print();

    // This method won't have its implementations in subclasses
    public void printing(String s) {
	System.out.println(s);
    }

}
