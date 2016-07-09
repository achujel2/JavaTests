package main.modifier.types2;

import main.modifier.types.JavaAccessModifiers;

public class B extends A {

    public static void main(String[] args) {
	JavaAccessModifiers javaAccessModifiers = new JavaAccessModifiers();
	// Here we can't even see javaAccessModifiers' variable 'value' because
	// it's declared with no modifiers

	// Here we are trying to use protected access modifier
	A a = new A();
	a.printThisValue();
    }

}
