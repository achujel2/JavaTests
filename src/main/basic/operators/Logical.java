package main.basic.operators;

/**
 * Class to work with logical operators in Java
 * 
 * @author Roba
 *
 */
public class Logical {

    public static void main(String[] args) {
	
	boolean a = true;
	boolean b = false;
	
	System.out.println("a && b = " + (a&&b));
	
	System.out.println("a || b = " + (a||b));
	
	System.out.println("!(a && b) = " + !(a&&b));
	
    }
    
}
