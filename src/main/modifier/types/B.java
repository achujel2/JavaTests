package main.modifier.types;

public class B {

    public static void main(String[] args) {
	JavaAccessModifiers javaAccessModifiers = new JavaAccessModifiers();
	// Calling value with no modifiers which is seen only in package:
	System.out.println(javaAccessModifiers.value);
	javaAccessModifiers.printingString("this is accessable because it's declared with no modifiers");

	// Accessing private field through public getter
	System.out.println(javaAccessModifiers.getPrivateValue());

	A a = new A();
	// Using public getters and setters
	System.out.println(a.getValueA());

    }

}
