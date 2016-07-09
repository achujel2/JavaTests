package main.modifier.types;

/**
 * Another class to play with modifiers
 * 
 * @author Roba
 *
 */
public class A extends AbstractA {

    // Just a private field
    private String valueA = "this is from class A";

    // Couple of getters/setters
    public String getValueA() {
	return valueA;
    }

    public void setValueA(String valueA) {
	this.valueA = valueA;
    }

    @Override
    public void print() {
	System.out.println("print method");
    }

}
