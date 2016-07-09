package main.loop.control;

/**
 * Class to work with loop control in Java
 * 
 * @author Roba
 *
 */
public class Loops {

    public static void main(String[] args) {
	Loops a = new Loops();
	// a.whileLoop();
	// a.forLoop();
	// a.doWhileLoop();
	// a.breakStatement();
	// a.continueStatement();
	a.traverseLoop();
    }

    /**
     * This is a method which is working with traverse loop statement
     */
    public void traverseLoop() {
	int[] numbers = { 10, 20, 30, 40, 50 };
	for (int x : numbers) {
	    System.out.println(x);
	}
	String[] names = { "James", "Larry", "Tom", "Lacy" };
	for (String name : names) {
	    System.out.println(name);
	}

    }

    /**
     * This is a method which is working with continue statement
     */
    public void continueStatement() {
	int[] numbers = { 10, 20, 30, 40, 50 };
	for (int x : numbers) {
	    if (x == 30) {
		continue;
	    }
	    System.out.println(x);
	}
    }

    /**
     * This is a method which is working with a break statement
     */
    public void breakStatement() {

	int[] numbers = { 10, 20, 30, 40, 50 };

	for (int x : numbers) {
	    if (x == 30) {
		break;
	    }
	    System.out.println(x);
	}

    }

    /**
     * This is a method which is working with do while loop
     */
    public void doWhileLoop() {
	int x = 10;
	do {
	    System.out.println("value of : " + x);
	    x++;
	} while (x < 20);
    }

    /**
     * This is a method which is working with for loop
     */
    public void forLoop() {
	System.out.println("For loop:");
	for (int x = 10; x < 20; x++) {
	    System.out.println("Value of x : " + x);
	}
    }

    /**
     * Method which is working with while loop
     */
    public void whileLoop() {
	System.out.println("While loop:");
	int x = 10;

	while (x < 20) {
	    System.out.println("Value of x : " + x);
	    x++;
	}
    }

}
