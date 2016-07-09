package main.modifier.types2;

/**
 * Class to work with static fields
 * 
 * @author Roba
 *
 */
public class StaticA {

    public static final String NAME = "This is your name";

    private static int numInstances = 0;

    protected static int getCount() {
	return numInstances;
    }

    private static void addInstance() {
	numInstances++;
    }

    public StaticA() {
	StaticA.addInstance();
    }

}
