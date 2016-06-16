package main.basic.variables;

/**
 * Class to access variables in VariableTests class
 * 
 * @author Roba
 *
 */
public class AccessTest {

    /**
     * Main method
     * 
     * @param args
     */
    public static void main(String[] args) {

	VariableTests variableTests = new VariableTests();
	variableTests.justSimpleMethod();
	System.out.println(variableTests.TESTING_STATIC);

    }

}
