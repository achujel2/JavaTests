package main.basic.operators;

/**
 * This is a class which is working with bitwise operations in Java
 * 
 * @author Roba
 *
 */
public class Bitwise {

    public static void main(String[] args) {
	int a = 60;
	int b = 13;
	int c = 0;
	
	System.out.println(Integer.toBinaryString(a));
	System.out.println(Integer.toBinaryString(b));
	System.out.println(Integer.toBinaryString(c) + "\n");
	
	c = a & b;
	System.out.println("a & b = " + Integer.toBinaryString(c));

	c = a | b;
	System.out.println("a | b = " + Integer.toBinaryString(c));

	c = a ^ b;
	System.out.println("a ^ b = " + Integer.toBinaryString(c));

	c = ~a;
	System.out.println("~a = " + Integer.toBinaryString(c));

	c = a << 2;
	System.out.println("a << 2 = " + Integer.toBinaryString(c));

	c = a >> 2;
	System.out.println("a >> 2 = " + Integer.toBinaryString(c));

	c = a >>> 2;
	System.out.println("a >>> 2 = " + Integer.toBinaryString(c));
    }

}
