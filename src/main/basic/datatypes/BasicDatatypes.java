package main.basic.datatypes;

import java.math.BigDecimal;

/**
 * Class to test some of the basic data types in Java
 * 
 * @author Roba
 *
 */
public class BasicDatatypes {

    /**
     * Main class
     * 
     * @param args
     */
    public static void main(String[] args) {

	// Bad way to work with currency is to use float or double
	float currencyFloat = 0.2f;
	double currencyDouble = 0.2d;
	for (int i = 0; i < 10; i++) {
	    currencyFloat += 0.2f;
	    currencyDouble += 0.2d;
	}
	System.out.println(currencyFloat);
	System.out.println(currencyDouble);
	// The results is 2.2000003 and 2.1999999999999997 which is pretty
	// messed up and not something we want while working with currency.
	// Instead we should use BigDecimal
	BigDecimal currencyBigDecimal = new BigDecimal(Double.toString(currencyDouble));
	currencyBigDecimal = currencyBigDecimal.setScale(3, BigDecimal.ROUND_HALF_EVEN);
	String currencyBigDecimalToString = currencyBigDecimal.stripTrailingZeros().toPlainString();
	System.out.println(currencyBigDecimalToString);

	// Playing with char, String and int datatypes
	char exampleChar = '\u0000';
	String exampleString = "\u0000";
	int hexa = 0x64;
	System.out.println(exampleChar);
	System.out.println(hexa);
	System.out.println(exampleString);

    }

}
