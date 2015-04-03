package JP_5;

/**
 * Created by atsvetkov on 31.03.2015.
 */

import static net.mindview.util.Print.*;

public class JP_5_6 {

    void myMethod(int i, char c) {
        print("INT + CHAR");
    }

    void myMethod(char c, int i) {
        print("CHAR + INT");
    }

    public static void main(String[] args) {
        JP_5_6 myInst = new JP_5_6();

        myInst.myMethod(10, 'a');
        myInst.myMethod('a', 10);
    }

}
