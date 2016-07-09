package main.basic.operators;

/**
 * This is a class which is testing how conditional and instaceof operators work
 * in java
 *
 * @author Roba
 *
 */
public class ConditionalAndInstance {

    public static void main(String[] args) {
	// Testing how conditional operator is working
	int a, b;
	a = 10;
	b = (a == 1) ? 20 : 30;
	System.out.println("Value of b is : " + b);

	b = (a == 10) ? 20 : 30;
	System.out.println("Value of b is : " + b);

	// Testing how instanceof operator is working
	String name = "Jones";
	boolean result = name instanceof String;
	System.out.println(result);
    }

}
