package JP_5;

/**
 * Created by atsvetkov on 31.03.2015.
 */

import static net.mindview.util.Print.*;

public class JP_5_11 {

    public void finalize() {
        print("Hello World");
    }

    public static void main(String[] args) {
//        JP_5_11 myInst = new JP_5_11();

        new JP_5_11();

        System.gc();
        System.runFinalization();
    }
}
