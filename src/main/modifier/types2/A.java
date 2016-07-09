package main.modifier.types2;

/**
 * I use this class to try working with modifiers from different packages
 * 
 * @author Roba
 *
 */
public class A {

    // Simple private variable
    private String valueA = "this is from another package";

    public String getValueA() {
	return valueA;
    }

    public void setValueA(String valueA) {
	this.valueA = valueA;
    }

    // Using protected modifier
    protected void printThisValue() {
	System.out.println("this is from another package as protected");
    }

}
