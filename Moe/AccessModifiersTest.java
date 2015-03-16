package Moe;

/**
 * Created by atsvetkov on 16.03.2015.
 */
class A {
    private int x;
    protected void f() {}
    protected static String name = "Ku-Ku";
}

public class AccessModifiersTest {
    public static void main(String[] args) {
        String bebe = A.name;
        System.out.println(bebe);

        A my_A = new A();
//        System.out.println(my_A.x);   //due to private.
        System.out.println(my_A.name);  //warning due to static.
    }

}