package JP_5;

/**
 * Created by atsvetkov on 31.03.2015.
 */

import static net.mindview.util.Print.*;

public class JP_5_4 {

    JP_5_4() {
        print("Hello");
    }

    JP_5_4(String s) {
        print("Hello" + " " + s);
    }

    public static void main(String[] args) {
        JP_5_4 myInst = new JP_5_4();
        JP_5_4 myInst2 = new JP_5_4("World");
    }
}
