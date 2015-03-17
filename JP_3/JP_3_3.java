package JP_3;

/**
 * Created by atsvetkov on 17.03.2015.
 */

//: JP_3/JP_3_3.java


import static net.mindview.util.Print.*;

class Letter {
    float f;
}

public class JP_3_3 {
    static void f(Letter y) {
        y.f = 3.14f;
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.f = 10.0f;
        print("1: x.f: " + x.f);

        f(x);
        print("1: x.f: " + x.f);
    }
}
