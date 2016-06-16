package main.basic.variables;

/**
 * Some tests with variables
 * 
 * @author Roba
 *
 */
public class VariableTests {

    // Testing instance variables
    private String name = "John";

    // Not initializing an integer variable:
    private int number;
    
    // Creating static variables:
    public static final String TESTING_STATIC = "This is a static string";

    void justSimpleMethod() {
	System.out.println("Accessing instance variables:");
	System.out.println(name);
	System.out.println("Variable value will be 0:" + number);

	// Some local varibales
	int a = 5;
	System.out.println("Printing local variables:");
	System.out.println(a);

    }

}
