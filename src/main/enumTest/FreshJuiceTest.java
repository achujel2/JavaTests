package main.enumTest;

public class FreshJuiceTest {

    public static void main(String[] args) {
	FreshJuice freshJuice = new FreshJuice();
	freshJuice.size = FreshJuice.FreshJuiceSize.MEDIUM;
	System.out.println(freshJuice.size);
    }
    
}
