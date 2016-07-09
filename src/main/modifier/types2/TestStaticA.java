package main.modifier.types2;

/**
 * Class to test how another class called StaticA is working with static
 * variables and methods
 * 
 * @author Roba
 *
 */
public class TestStaticA {

    public static void main(String[] args) {
	// Calling static field without object creation:
	System.out.println(StaticA.NAME);

	// Accessing static (class) variables and working with them
	System.out.println("Starting with " + StaticA.getCount() + " instances");
	for (int i = 0; i < 10; i++) {
	    new StaticA();
	}
	System.out.println("Created " + StaticA.getCount() + " instances");
    
    }

}
