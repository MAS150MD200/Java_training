package JP_2;

/**
 * Created by Antonio on 08.03.2015.
 */

class StaticTest {
    static int i = 47;
}

class Incrementable {
    static void increment() {
        StaticTest.i++;
    }
}

public class JP_2_7 {
    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println(st1.i + " " + st2.i);

        Incrementable.increment();
        System.out.println(st1.i + " " + st2.i);
    }
}
