package JP_5;

/**
 * Created by atsvetkov on 31.03.2015.
 */

import static net.mindview.util.Print.*;

public class JP_5_5_ext {

    boolean myMethod(int i) {
        print(i);
        return true;
    }

    long myMethod(char c) {
        print(c);
        return (long)10;
    }

    public static void main(String[] args) {
        JP_5_5_ext myInst = new JP_5_5_ext();

        myInst.myMethod(10);
        myInst.myMethod('a');
    }
}
