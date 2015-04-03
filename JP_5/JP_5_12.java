package JP_5;

/**
 * Created by atsvetkov on 31.03.2015.
 */

import static net.mindview.util.Print.*;

public class JP_5_12 {
    public static void main(String[] args) {
        Tank myTank = new Tank();

//        myTank.emptyTank();
//        myTank.fillTank();
//        myTank.emptyTank();


        new Tank().fillTank();
        System.gc();
        System.runFinalization();

        new Tank().emptyTank();
        System.gc();
        System.runFinalization();

    }
}

//1 - Tank is full.
//0 - Tank is empty.

class Tank {
    boolean is_empty = true;         //!!!

    void fillTank() {
        print("Tank has been filled");
        is_empty = false;
    }

    void emptyTank() {
        print("Tank has been emptied");
        is_empty = true;
    }

    public void finalize() {
        if (!is_empty) {
            print("(FINALIZE)Tank is not empty!");
        } else {
            print("(FINALIZE)Tank is emptied!");
        }
    }

}
