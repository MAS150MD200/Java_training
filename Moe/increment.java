package Moe;

/**
 * Created by atsvetkov on 30.03.2015.
 */


public class increment {

    public static void main(String[] args) {

        int a = 0, b = 0;

        for(int i = 0; i < 10; i++) {
            System.out.println("a++ " + a++);
            System.out.println("++b " + ++b);
            System.out.println();

        }
    }
}
