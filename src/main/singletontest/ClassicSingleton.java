package main.singletontest;

public class ClassicSingleton {

    private static ClassicSingleton instance = null;
    
    public ClassicSingleton() {
	// TODO Auto-generated constructor stub
    }
    
    public static ClassicSingleton getInstace() {
	if(instance == null) {
	    instance = new ClassicSingleton();
	}
	return instance;
    }
    
}
