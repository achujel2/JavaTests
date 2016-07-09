package main.decision.making;

/**
 * This is a class to work with decision making in Java
 * 
 * @author Roba
 *
 */
public class DecisionMaking {

    public static void main(String[] args) {

	DecisionMaking a = new DecisionMaking();
	// a.ifStatement();
	// a.ifElseStatement();
	// a.ifElseIfStatement();
	// a.nestedStatements();
	a.switchCaseStatement();
    }

    /**
     * Method which is using switch statement
     */
    public void switchCaseStatement() {
	char grade = 'B';

	switch (grade) {
	case 'A':
	    System.out.println("Excellent!");
	    break;
	case 'B':
	case 'C':
	    System.out.println("Well done!");
	    break;
	case 'D':
	    System.out.println("You passed!");
	    break;
	case 'F':
	    System.out.println("Better try again");
	    break;
	default:
	    System.out.println("Invalid grade");
	}
	System.out.println("Your grade is : " + grade);
    }

    /**
     * Method which is using nested statements
     */
    public void nestedStatements() {
	int x = 30;
	int y = 10;

	if (x == 30) {
	    if (y == 10) {
		System.out.println("X = 30 and Y = 10");
	    }
	}
    }

    /**
     * Method which is testing if/else if/else statement
     */
    public void ifElseIfStatement() {

	int x = 30;

	if (x == 10) {
	    System.out.println("Value of x is 10");
	} else if (x == 20) {
	    System.out.println("Value of x is 20");
	} else if (x == 30) {
	    System.out.println("Value of x is 30");
	} else {
	    System.out.println("This is else statement");
	}

    }

    /**
     * Method which is testing if/else statement
     */
    public void ifElseStatement() {

	int x = 30;

	if (x < 20) {
	    System.out.println("This is if statement");
	} else {
	    System.out.println("This is else statement");
	}

    }

    /**
     * Method which is testing if statement
     */
    public void ifStatement() {

	int x = 10;

	if (x < 20) {
	    System.out.println("This is if statement");
	}

    }

}
