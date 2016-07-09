package main.modifier.types2.synchro;

/**
 * Class to show how synchronized modifier works with threads
 * 
 * @author Roba
 *
 */
public class TestThread extends Thread {

    String name;
    TheDemo theDemo;

    public TestThread(String name, TheDemo theDemo) {
	this.theDemo = theDemo;
	this.name = name;
	start();
    }

    @Override
    public void run() {
	theDemo.test(name);
    }
}
