package main.modifier.types2.vol;

/**
 * Class to test how volatile modifier works
 * 
 * @author Roba
 *
 */
public class MyRunnable implements Runnable {

    private volatile boolean active;

    @Override
    public void run() {
	active = true;
	while (active) {

	}
    }

    public void stop() {
	active = false;
    }

}
