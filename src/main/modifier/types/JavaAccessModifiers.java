package main.modifier.types;

/**
 * Class to work with access modifiers
 * 
 * @author Roba
 *
 */
public class JavaAccessModifiers {

    // Here we will declare some of the variables with no modifiers
    String value = "this value is protected";

    // Method which is declared with no modifiers
    void printingString(String s) {
	System.out.println(s);
    }

    // This is a private variable and can only be accessed through
    // protected/public methods (getters)
    private String valuePrivate = "this is private";

    // Another private method which is only accessed through protected/public
    // methods
    private void PrintSomeStuff() {
	System.out.println("printing a couple of values");
    }

    // Public method to get the variable 'valuePrivate'
    public String getPrivateValue() {
	PrintSomeStuff();
	return valuePrivate;
    }

}
