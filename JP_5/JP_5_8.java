package JP_5;

/**
 * Created by atsvetkov on 31.03.2015.
 */

import static net.mindview.util.Print.*;

public class JP_5_8 {
    public static void main(String[] args) {
        TwoMethods myInst = new TwoMethods();

        myInst.methodOne("Hello World");

    }
}

class TwoMethods {
    int methodOne(String s) {
        print(s);

        methodTwo(true);
        this.methodTwo(false);

        return 10;
    }

    char methodTwo(boolean b) {
        print(b);
        return 'c';
    }
}
