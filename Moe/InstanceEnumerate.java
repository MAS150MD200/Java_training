package Moe;

/**
 * Created by atsvetkov on 31.03.2015.
 */

import static net.mindview.util.Print.*;

public class InstanceEnumerate {

    public static void main(String[] args) {

        Tank t1 = new Tank();
        Tank t2 = new Tank();
        new Tank();
        new Tank();

    }
}


class Tank {
    static int counter;
    int id = counter ++;    //not the same as int id = counter + 1;
//    int id = counter = counter + 1;

    Tank() {

        print("Tank " + id + " is created!");
        print("Tank " + id + " is created!");
    }
}
