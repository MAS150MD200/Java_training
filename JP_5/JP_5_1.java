package JP_5;

/**
 * Created by atsvetkov on 30.03.2015.
 */

import static net.mindview.util.Print.*;


class Moe {
    static String s;

    public static void myPrint() {
        print("Hello");
    }
}


public class JP_5_1 {

    String s;

    public static void main(String[] args) {

        JP_5_1 a = new JP_5_1();
        print(a.s);

        print(Moe.s);

        Moe.myPrint();

    }
}
