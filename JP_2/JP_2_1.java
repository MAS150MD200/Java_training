package JP_2;

/**
 * Created by Antonio on 08.03.2015.
 */


public class JP_2_1 {
    static int x;
    char y;
    boolean jp_bul;

    public static void main(String[] args){
        System.out.println("Hello");
        System.out.println(x);          //!!!
        System.out.println(JP_2_1.x);

        JP_2_1 jp_inst = new JP_2_1();
        System.out.println(jp_inst.x);
        System.out.println("one" + jp_inst.y + "two");
        System.out.println("one " + jp_inst.jp_bul + " two");

        MyClass my_inst = new MyClass();
        System.out.println(my_inst.a + " " + MyClass.b);
    }
}

class MyClass {
    int a = 10;
    static int b = 20;
}